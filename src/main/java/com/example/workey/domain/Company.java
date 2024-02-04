package com.example.workey.domain;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
@Getter
@Builder
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "companyId", nullable = false, updatable = false)
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private String image;

    @Column
    private long totalGoodStateCount;

}
