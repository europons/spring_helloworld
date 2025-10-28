package daw.jgp.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloworldController {
    @GetMapping("/helloworld")
    public String greeting (@RequestParam(required = false) String username, Model model){
        if (username != null){
            model.addAttribute("message", "Bienvenido "+ username);
        }else{
            model.addAttribute("message", "'username' no recibido. Usa ?username=TuNombre en la URL");
        }
        return "greeting";
    }
}
