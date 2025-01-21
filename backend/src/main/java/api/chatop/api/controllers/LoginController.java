package api.chatop.api.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

  @GetMapping("/user")
  public String GetUsers() {
    return "Hello Users";
  }

  @GetMapping("/admin")
  public String GetAdmin() {
    return "Hello Admin";
  }
}
