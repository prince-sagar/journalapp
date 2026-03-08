package net.engineeringdigest.journalApp.Controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import net.engineeringdigest.journalApp.Entity.User;
import net.engineeringdigest.journalApp.dto.UserDTO;
import net.engineeringdigest.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public")
@Tag(name = "Public APIs")
public class PublicController {
    @Autowired
    private UserService userService;

    @GetMapping("/health-check")
    public String HealthCheck(){
        return "Ok";
    }

    @PostMapping("/create-user")
    public void createUser(@RequestBody User user){
        userService.saveNewUser(user);
    }
}
