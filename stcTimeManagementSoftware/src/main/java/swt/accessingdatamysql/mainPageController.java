package swt.accessingdatamysql;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainPageController {

	@GetMapping("/mainPage")
	public String user(@RequestParam(name="username", required=false, defaultValue="admin") String username, Model model) {
		model.addAttribute("username", username);   // attribut which will be adressed
		return "mainPage";  // return name of adressed html file in /templates
	}

}
