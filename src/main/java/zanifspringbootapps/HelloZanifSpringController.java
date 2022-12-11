package zanifspringbootapps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloZanifSpringController {

	@RequestMapping (value="/zanif")
	public String hello() {
		return "Hello Zanif Baba How are you?";
	}
}
