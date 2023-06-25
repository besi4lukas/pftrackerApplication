package com.pftracker.pftrackerApplication.controller;

import com.pftracker.pftrackerApplication.model.Users;
import com.pftracker.pftrackerApplication.service.UsersService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.util.Optional;

@RestController
@RequestMapping("/v1/users")
@Tag(name = "Users", description = "CRUD API for Users")
public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService){
        this.usersService = usersService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Users> getUser(@PathVariable Long userId){
        Optional<Users> optionalUser = usersService.getUser(userId);
        if (optionalUser.isPresent()){
            return ResponseEntity.ok(optionalUser.get());
        }
        throw new NotFoundException("User does not exist");
    }

    @PostMapping
    public ResponseEntity<Users> createUser(@RequestBody Users user){
        Users createdUser = usersService.createUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<Users> updateUser(@PathVariable Long userId,  @RequestBody Users user){
        Users updatedUser = usersService.updateUser(userId, user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId){
        usersService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }
}
