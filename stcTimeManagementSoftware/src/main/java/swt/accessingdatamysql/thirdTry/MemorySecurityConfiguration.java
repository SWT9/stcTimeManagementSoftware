/*package swt.accessingdatamysql.thirdTry;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class MemorySecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
            .username("emma")
            .password("emma")
            .roles("boss")
            .build();
        return new InMemoryUserDetailsManager(user);
    }


    @Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.formLogin();
            
            
        http.authorizeRequests()
                .antMatchers("/home").hasAnyRole("boss", "dev")
                .antMatchers("/hello").hasRole("dev")
                .antMatchers("/").permitAll();
			

		return http.build();
	}
}*/
