package swt.accessingdatamysql.thirdTry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import swt.accessingdatamysql.UserRepository;

@Controller
public class HomeController {

    //private MySessionInfo mySessionInfo;
    @Autowired
    private UserRepository userRepository;

	@GetMapping("/mainPage")
	public String user(Model model) {
		//model.addAttribute("username", mySessionInfo.getCurrentUser().getUsername());   // attribut which will be adressed
		
        model.addAttribute("username", userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName()).getForname());
        return "mainPage";  // return name of adressed html file in /templates
	}
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/home")
    public String home() {
        return "home";
    }
    // Employee
    @GetMapping("/workHours")
    public String workHours() {
        return "workHours";
    }
    @GetMapping("/applyForVacation")
    public String applyForVacation() {
        return "applyForVacation";
    }
    @GetMapping("/applyForSickness")
    public String applyForSickness() {
        return "applyForSickness";
    }
    // Supervisor

    @GetMapping("/monthWorkHours")
    public String monthWorkHours() {
        return "monthWorkHours";
    }
    @GetMapping("/vacationRequests")
    public String vacationRequests() {
        return "vacationRequests";
    }

    // HR
    public String userManagement() {
        return "userManagement";
    }
    @GetMapping("/sickEmployees")
    public String sickEmployees() {
        return "sickEmployees";
    }
}
