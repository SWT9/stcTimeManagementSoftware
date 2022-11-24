package swt.accessingdatamysql;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@EnableWebSecurity
public class JdbcSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(passwordEncoder())
                .usersByUsernameQuery(
                "SELECT username, password, enabled from user where username = ?")
                .authoritiesByUsernameQuery(
                "SELECT username, authority from user where username = ?" 
                
            );

    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin();

        http.authorizeRequests()
                .antMatchers("/home").hasAnyAuthority("hr", "supervisor", "admin", "employee", "superhr")
                .antMatchers("/demo/*").hasAuthority("admin")
                .antMatchers("/workHours").hasAnyAuthority("hr", "supervisor", "admin", "employee", "superhr")
                .antMatchers("/applyVacation").hasAnyAuthority("hr", "supervisor", "admin", "employee", "superhr")
                .antMatchers("/applySickness").hasAnyAuthority("hr", "supervisor", "admin", "employee", "superhr")
                .antMatchers("/monthWorkHours").hasAnyAuthority("supervisor", "admin", "superhr")
                .antMatchers("/vacationRequests").hasAnyAuthority("supervisor", "admin", "superhr")
                .antMatchers("/userInfo").hasAnyAuthority("hr", "supervisor", "admin", "employee", "superhr")
                .antMatchers("/").permitAll();
        
        http.csrf().disable();
    }
}


