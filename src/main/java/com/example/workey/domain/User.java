package com.example.workey.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private LocalDateTime startTime;

    @Column
    private LocalDateTime endTime;

    @Column
    private int company;

    @Column
    private String picture;

    @Column
    private int goodStateCount;

    @Column
    @DateTimeFormat(pattern = "dd")
    private LocalDateTime payday;

    @Column
    @CreatedDate
    private LocalDateTime createdAt;

    @Column
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
