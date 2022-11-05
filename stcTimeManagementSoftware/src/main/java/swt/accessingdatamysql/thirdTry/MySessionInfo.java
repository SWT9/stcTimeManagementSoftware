package swt.accessingdatamysql.thirdTry;

import org.springframework.context.annotation.Scope;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class MySessionInfo {

    private User user;

    public User getCurrentUser() {
        if (user == null) {
            user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }
        return user;
    }
}