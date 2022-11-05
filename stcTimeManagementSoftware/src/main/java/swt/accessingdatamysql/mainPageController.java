/*package swt.accessingdatamysql;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import swt.accessingdatamysql.thirdTry.MySessionInfo;

@Controller
public class mainPageController {


	private MySessionInfo mySessionInfo;

	@GetMapping("/mainPage")
	public String user(@RequestParam(name="username", required=false, defaultValue="admin") String username, Model model) {
		model.addAttribute("username", mySessionInfo.getCurrentUser().getUsername());   // attribut which will be adressed
		return "mainPage";  // return name of adressed html file in /templates
	}

}*/
