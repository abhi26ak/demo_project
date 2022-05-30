package spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/home")
    public String home() {
        return "Hello World!!";
    }

    // get the number of book
    @GetMapping("/count")
    public int getcount()
    {
        // we have to connect to data base to get the number of books right
        return 0;
    }

}
