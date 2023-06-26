package com.pftracker.pftrackerApplication.repository;

import com.pftracker.pftrackerApplication.model.Budgets;
import com.pftracker.pftrackerApplication.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BudgetsRepository extends JpaRepository<Budgets,Long>{
}

