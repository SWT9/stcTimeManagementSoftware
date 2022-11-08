package swt.accessingdatamysql.thirdTry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import swt.accessingdatamysql.SicknessTime;
import swt.accessingdatamysql.SicknessTimeRepository;
import swt.accessingdatamysql.User;
import swt.accessingdatamysql.UserRepository;
import swt.accessingdatamysql.VacationTime;
import swt.accessingdatamysql.WorkHoursRepository;

@Controller
public class HomeController {

    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private WorkHoursRepository workHoursRepository;

    @Autowired
    private VacationTimeRepository vacationTimeRepository;

    @Autowired
    private SicknessTimeRepository sicknessTimeRepository;

	@GetMapping("/mainPage")
	public String user(Model model) {
		
        model.addAttribute("username", userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName()).getForname());
        return "mainPage";  // return name of adressed html file in /templates
	}
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("authority", userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName()).getAuthority());
        return "home";
    }
    // Employee
    @GetMapping("/workHours")
    public String workHours(Model model) {
        model.addAttribute("work", new WorkHours());
        model.addAttribute("authority", userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName()).getAuthority());
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

    @GetMapping("/applyVacation")
    public String applyVacation(Model model) {
        model.addAttribute("time", new VacationTime());
        model.addAttribute("authority", userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName()).getAuthority());
        return "applyVacation";
    }
    @PostMapping("/applyVacation")
    public String vacationSubmit(@ModelAttribute VacationTime time, Model model) {
        User user = userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
        time.setUserId(user.getId());
        
        model.addAttribute("time", time);
        vacationTimeRepository.save(time);
        return "applyVacation";
    }

    @GetMapping("/applySickness")
    public String applySickness(Model model) {
        model.addAttribute("day", new SicknessTime());
        model.addAttribute("authority", userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName()).getAuthority());
        return "applySickness";
    }
    @PostMapping("/applySickness")
    public String sicknessSubmit(@ModelAttribute SicknessTime day, Model model) {
        User user = userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
        day.setUserId(user.getId());
        
        model.addAttribute("day", day);
        sicknessTimeRepository.save(day);
        return "applySickness";
    }

    // Supervisor
    @GetMapping("/monthWorkHours")
    public String monthWorkHours(Model model) {
        model.addAttribute("authority", userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName()).getAuthority());
        return "monthWorkHours";
    }
    @GetMapping("/vacationRequests")
    public String vacationRequests(Model model) {
        model.addAttribute("authority", userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName()).getAuthority());
        return "vacationRequests";
    }

    // HR
    @GetMapping("/userManagement")
    public String userManagement(Model model) {
        model.addAttribute("authority", userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName()).getAuthority());
        return "userManagement";
    }
    @GetMapping("/sickEmployees")
    public String sickEmployees(Model model) {
        model.addAttribute("authority", userRepository.findByUsername(SecurityContextHolder.getContext().getAuthentication().getName()).getAuthority());
        return "sickEmployees";
    }

}
