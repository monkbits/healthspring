package com.mymonkmindset.health.service;

import com.mymonkmindset.health.model.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    public final FoodRepository foodRepository;
    @Autowired
    public FoodService(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }
}
