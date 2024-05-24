package com.example.workey.domain.question.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Builder
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quesId", nullable = false, updatable = false)
    private long id;

    @Column(nullable = false)
    private String question;
}
