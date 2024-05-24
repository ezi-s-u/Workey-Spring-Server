package com.example.workey.domain.diary.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Builder
@Table(name = "diaries")
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diaryId", updatable = false, nullable = false)
    private long id;

    @Column(name = "userId", nullable = false)
    private long userId;

    @Column(name = "quesId", nullable = false)
    private long quesId;

    @Column(nullable = false)
    private String answer;

    @Column
    private boolean star;

    @Column(nullable = false)
    private int score;

    @Column(nullable = false)
    private boolean state;

    @Column(name = "companyId", nullable = false)
    private long companyId;
}
