package koi_gitTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	public String hello() {
		return "home";
	}
	//second commit - stached 파일 불러오는지?

}
