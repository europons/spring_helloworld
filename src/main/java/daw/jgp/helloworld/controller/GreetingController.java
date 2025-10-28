package daw.jgp.helloworld.controller;

import daw.jgp.helloworld.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    // Cuando accedamos a esta URL, accederemos a este controlador.
    @GetMapping("/greeting")
    public String userGreeting(@RequestParam(required = false) String name1,
                               @RequestParam(required = false) String name2,
                               Model model) { // Nombre del controlador
        if (name1 != null || name2 != null) {
            model.addAttribute("message", "¡Bienvenidos!"); // Envíamos un String message a la plantilla
            User userObject = new User(name1, name1 + "@example.com"); // Accedemos al modelo para crear un objeto
            model.addAttribute("userObject", userObject); // Envíamos un objeto a la plantilla
            User userObject2 = new User(name2, name2 + "@example.com"); // Accedemos al modelo para crear un objeto
            model.addAttribute("userObject2", userObject2); // Envíamos un objeto a la plantilla
        }else{
            model.addAttribute("message", "¡Bienvenido!"); // Envíamos un String message a la plantilla
            User userObject3 = new User("Javi", "javi@example.com"); // Accedemos al modelo para crear un objeto
            model.addAttribute("userObject3", userObject3); // Envíamos un objeto a la plantilla
        }
        return "user-greeting"; // Plantilla que utilizará este controlador
    }
}