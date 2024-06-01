package example.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model) {
//        model.addAttribute("message",  "Hello, Spring MVC!");
        final java.lang.String fuck = "fuck";
        return fuck;
    }
}
