package swt.accessingdatamysql.thirdTry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import swt.accessingdatamysql.User;
import swt.accessingdatamysql.UserRepository;
import swt.accessingdatamysql.WorkHoursRepository;

@Controller
public class HomeController {

    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private WorkHoursRepository workHoursRepository;

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
    @GetMapping("/workHours")
    public String workHours(Model model) {
        model.addAttribute("work", new WorkHours());
        return "workHours";
    }

    @PostMapping("/workHours")
    public String workHoursSubmit(@ModelAttribute WorkHours work, Model model) {
        User user = userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
        work.setUserId(user.getId());
        
        model.addAttribute("work", work);
        workHoursRepository.save(work);
        return "workHours";
    }

    
    
}
