package com.pftracker.pftrackerApplication.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import lombok.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "budgets")
public class Budgets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "budgetId")
    private Long budgetId;

    @Column(name = "userid", nullable = false)
    private Long userId;

    @Column(name = "budgettype", nullable = false)
    private String budgettype;

    @Column(name = "budgetdata", nullable = false)
    private String budgetdata;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime created_at;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updated_at;


}
