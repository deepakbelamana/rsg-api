package com.RepSetGo.RepSetGo.controllers;

import com.RepSetGo.RepSetGo.Services.UserService;
import com.RepSetGo.RepSetGo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins="*")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/signUp")
    public ResponseEntity<User> userSignUp(@RequestBody User user){
        return  ResponseEntity.ok(userService.SignUpUser(user));
    }
}
