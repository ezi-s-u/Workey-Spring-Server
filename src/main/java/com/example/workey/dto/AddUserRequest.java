package com.example.workey.dto;

// 회원가입 - post

import com.example.workey.domain.User;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddUserRequest {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int company;
    private String picture;
    private int goodStateCount;
    private LocalDateTime payday;

    public User toEntity() {
        return User.builder()
                .id(id)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .password(password)
                .startTime(startTime)
                .endTime(endTime)
                .company(company)
                .picture(picture)
                .goodStateCount(goodStateCount)
                .payday(payday)
                .build();
    }
}
