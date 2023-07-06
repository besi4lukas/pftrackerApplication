package com.pftracker.pftrackerApplication.service;

import com.pftracker.pftrackerApplication.model.Budgets;
import com.pftracker.pftrackerApplication.repository.BudgetsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BudgetsService {
    private final BudgetsRepository budgetsRepository;
    public BudgetsService(BudgetsRepository budgetsRepository){
        this.budgetsRepository = budgetsRepository;
    }

    public Optional<Budgets> getBudget(Long budgetId){
        return budgetsRepository.findById(budgetId);
    }

    public Budgets createBudget(Budgets budget){
        return budgetsRepository.save(budget);
    }



    public void deleteBudget(Long budgetId){
        budgetsRepository.deleteById(budgetId);
    }


}
