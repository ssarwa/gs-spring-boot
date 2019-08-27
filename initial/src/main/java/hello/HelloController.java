package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Simple Spring boot App source : https://github.com/spring-guides/gs-spring-boot, with Added Azure App Service deployments";
    }
    
}
