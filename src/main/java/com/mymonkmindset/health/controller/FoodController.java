package com.mymonkmindset.health.controller;

import com.mymonkmindset.health.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/food")
public class FoodController {
    public FoodService foodService;
    @Autowired
    public FoodController(FoodService foodService){
        this.foodService = foodService;
    }

    @GetMapping
    public List<Integer> getFood(){
        return List.of(0,5,4,8,9);
    }
}
