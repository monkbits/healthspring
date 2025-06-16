package com.mymonkmindset.health.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.mymonkmindset.health.weightlog.WeightLog;
import com.mymonkmindset.health.weightlog.WeightLogService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "/")
public class UserController {
    private  final UserService userService;
    private  final WeightLogService weightLogService;
    @Autowired
    public UserController(UserService userService , WeightLogService weightLogService ){
        this.weightLogService =weightLogService;
        this.userService = userService;
    }

    @GetMapping(path = "/getusers")
    public List<User> getusers(){
        return this.userService.getUsers();
    }

    @GetMapping(path = "/a")
    public List<User> first(){
        List <User> list = new ArrayList<>();
        User first = new User();
        first.setAge(43);
        list.add(first);
        return list;
    }

    @PostMapping
    public WeightLog addWeight(@RequestParam String date , @RequestParam String weight){
        String[] dr = date.split("-");
        LocalDate d = LocalDate.of(Integer.parseInt(dr[2]),Integer.parseInt(dr[1]) ,Integer.parseInt(dr[0]));
        WeightLog w = new WeightLog(d,Float.parseFloat(weight));
        return weightLogService.addWeightLog(w);
    }


}
