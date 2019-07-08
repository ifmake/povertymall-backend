package ifmake.povertymallbackend.app.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping("/hello")
	public String printHelloWorld(){
		return "Hello world";
	}
}
