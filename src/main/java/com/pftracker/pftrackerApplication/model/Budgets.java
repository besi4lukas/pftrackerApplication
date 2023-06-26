package com.pftracker.pftrackerApplication.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;

import java.time.LocalDateTime;

@Entity
@Table(name = "budgets")
public class Budgets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "budgetId")
    private Long budgetId;

    @Column(name = "userId", nullable = false)
    private Long userId;

    @Column(name = "budgettype", nullable = false)
    private String budgettype;

    @Column(name = "budgedata", nullable = false)
    private Long budgetdata;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime created_at;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updated_at;


}
