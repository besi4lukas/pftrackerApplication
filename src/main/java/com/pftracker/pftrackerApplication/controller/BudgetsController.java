package com.pftracker.pftrackerApplication.controller;


import com.pftracker.pftrackerApplication.model.Budgets;
import com.pftracker.pftrackerApplication.service.BudgetsService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.webjars.NotFoundException;


import java.util.Optional;

@RestController
@RequestMapping("/v1/budgets")
@Tag(name="budgets", description = "CRUD API for budgets")
public class BudgetsController {
    private final BudgetsService budgetsService;

    public BudgetsController(BudgetsService budgetsService){
        this.budgetsService = budgetsService;
    }

    @GetMapping("/{budgetId}")
    public ResponseEntity<Budgets> getBudget(@PathVariable Long budgetId){
        Optional<Budgets>optionalBudget = budgetsService.getBudget(budgetId);
        if(optionalBudget.isPresent()){
            return ResponseEntity.ok(optionalBudget.get());
        }
        throw new NotFoundException("Budget does not exist");
    }


}
