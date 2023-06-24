package com.pftracker.pftrackerApplication.service;

import com.pftracker.pftrackerApplication.model.Users;
import com.pftracker.pftrackerApplication.repository.UsersRepository;
import org.webjars.NotFoundException;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UsersService {

    UsersRepository usersRepository;

    public UsersService (UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public Optional<Users> getUser(Long userId){
        return usersRepository.findById(userId);
    }

    public Users createUser(Users user){
        return usersRepository.save(user);
    }

    public Users updateUser(Long userId, Users newUser){
        Optional<Users> optionalUser = getUser(userId);
        if (optionalUser.isPresent()){
            Users existingUser = optionalUser.get();

            if(newUser.getEmail() != null){
                existingUser.setEmail(newUser.getEmail());
            }

            if(newUser.getPasscode() != null){
                existingUser.setPasscode(newUser.getPasscode());
            }
            return usersRepository.save(existingUser);
        }

        throw new NotFoundException("User does not exist");
    }

    public void deleteUser(Long userId){
        usersRepository.deleteById(userId);
    }
}