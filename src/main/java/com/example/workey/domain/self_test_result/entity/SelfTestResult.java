package com.example.workey.domain.self_test_result.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Builder
@Table(name = "self_test_results")
public class SelfTestResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "selfTestResultId", nullable = false, updatable = false)
    private long id;

    @Column(name = "diaryId", nullable = false)
    private long diaryId;

    @Column(nullable = false)
    private int st_answer1;

    @Column(nullable = false)
    private int st_answer2;

    @Column(nullable = false)
    private int st_answer3;

    @Column(nullable = false)
    private int st_answer4;
}
