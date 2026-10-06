package com.mymonkmindset.health.weightlog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeightLogService {
    private final WeightLogRepository weightLogRepository;

    @Autowired
    public WeightLogService(WeightLogRepository weightLogRepository){
        this.weightLogRepository = weightLogRepository;
    }


    public List<WeightLog> getwls(){
        return weightLogRepository.findAll();
    }
    public WeightLog addWeightLog(WeightLog weightLog){
        return this.weightLogRepository.save(weightLog);
    }
}
