package com.ashwinsi.auth_service.Service;

import com.ashwinsi.auth_service.DTO.CustomError;
import com.ashwinsi.auth_service.Domain.Seller;
import com.ashwinsi.auth_service.Domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private SellerService sellerService;
    private UserService userService;


    public void userLogin(String email, String password) {
        if(!userService.isUserExists(email)){
            throw  new CustomError("User Not Found", HttpStatus.NOT_FOUND);
        }

        User user = userService.getUser(email);

    }

    public void sellerLogin(String email, String password) {
        if(!userService.isUserExists(email)){
            throw  new CustomError("Seller Not Found", HttpStatus.NOT_FOUND);
        }

        Seller seller = sellerService.getSeller(email);

    }
}
