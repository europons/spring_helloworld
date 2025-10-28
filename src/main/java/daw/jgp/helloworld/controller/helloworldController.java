package daw.jgp.helloworld.controller;

import daw.jgp.helloworld.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloworldController {
    @GetMapping("/helloworld")
    public String greeting (@RequestParam(required = false) String name1,
                            @RequestParam(required = false) String name2,
                            Model model){
        model.addAttribute("message", "Bienvenidos "+name1+" y "+name2);

        return "greeting";
    }
}
