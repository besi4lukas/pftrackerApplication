package com.pftracker.pftrackerApplication.repository;

import com.pftracker.pftrackerApplication.model.Budgets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetsRepository extends JpaRepository<Budgets,Long>{
}

