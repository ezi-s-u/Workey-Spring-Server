package com.example.workey.domain.user;

import com.example.workey.domain.user.dto.CreateUserReq;
import com.example.workey.domain.user.entity.User;
import com.example.workey.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/join")
    public ResponseEntity<User> createUser(@RequestBody CreateUserReq createUserReq) {
        User user = userService.join(createUserReq);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
