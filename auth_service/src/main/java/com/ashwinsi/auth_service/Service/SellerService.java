package com.ashwinsi.auth_service.Service;

import com.ashwinsi.auth_service.Domain.Seller;
import com.ashwinsi.auth_service.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public boolean isSellerExists(Integer id){
        return sellerRepository.findById(id).isPresent();
    }

    public boolean isSellerExists(String email){
        return sellerRepository.findByEmail(email).isPresent();
    }

    public Seller getSeller(Integer id){
        return sellerRepository.findById(id).get();
    }

    public Seller getSeller(String email){
        return sellerRepository.findByEmail(email).get();
    }


}
