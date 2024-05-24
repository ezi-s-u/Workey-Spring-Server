package com.example.workey.domain.user.dto;

// 회원가입 - post

import com.example.workey.domain.user.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
public class CreateUserReq {

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime startTime;

    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime endTime;

    private int company;
    private String picture;
    private int goodStateCount;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate payday;

    public User toEntity() {
        return User.builder()
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
