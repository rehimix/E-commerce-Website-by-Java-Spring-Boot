package muhaiminur_rahman_SE_JAVA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class AssessmentController {
	@GetMapping("/first")
	public String index() {
		return "index";
		
	}

}