package com.ashwinsi.auth_service.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Data
@AllArgsConstructor
class LoginDTO{
    private String email;
    private String password;
}

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping("/user")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO){

    }
}
