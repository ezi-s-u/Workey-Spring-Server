package com.example.workey.domain.user.service;

import com.example.workey.domain.user.dto.CreateUserReq;
import com.example.workey.domain.user.entity.User;
import com.example.workey.domain.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    @Autowired
    UserRepository userRepository;

//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;

//    public void join(CreateUserReq createUserReq) {
//        try {
//            User user = createUserReq.toEntity();
//            // TODO : 이메일 중복 처리
//            userRepository.save(user);
//        } catch (Exception e) {
//            log.error("Error during user join", e);
//            throw new RuntimeException("Error during user join", e);
//        }
//    }

    public User join(CreateUserReq createUserReq) {
//        if (userRepository.existsByEmail(createUserReq.getEmail())) {
//            throw new IllegalStateException("Email already in use");
//        }
//
//        String encodedPassword = passwordEncoder.encode(createUserReq.getPassword());
        User user = createUserReq.toEntity();
//        user.setPassword(encodedPassword);

        try {
            return userRepository.save(user);
        } catch (Exception e) {
            log.error("Error during user join", e);
            throw new RuntimeException("Error during user join", e);
        }
    }


}
