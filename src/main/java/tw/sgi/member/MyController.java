package tw.sgi.member;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/")
    public String user() {
        return "Hello Twsgi member gradle";
    }
}
