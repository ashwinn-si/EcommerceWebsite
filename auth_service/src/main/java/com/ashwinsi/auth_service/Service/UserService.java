package com.ashwinsi.auth_service.Service;

import com.ashwinsi.auth_service.Domain.User;
import com.ashwinsi.auth_service.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean isUserExists(Integer id){
        return userRepository.findById(id).isPresent();
    }

    public boolean isUserExists(String email){
        return userRepository.findByEmail(email).isPresent();
    }

    public User getUser(Integer id){
        return userRepository.findById(id).get();
    }

    public User getUser(String email){
        return userRepository.findByEmail(email).get();
    }


}
