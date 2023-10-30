package payroll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class masterController {


    @GetMapping("/")
    public String index(){
        return "index.html";
    }
}
