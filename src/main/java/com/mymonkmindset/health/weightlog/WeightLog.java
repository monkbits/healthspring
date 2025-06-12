package com.mymonkmindset.health.weightlog;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table
public class WeightLog {
    @Id
    @SequenceGenerator(
            name = "weightlog_sequence",
            sequenceName = "weightlog_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "weightlog_sequence"
    )
    private long id;
    private LocalDate dateTime;
    private float weight_kg;

    public WeightLog(LocalDate dateTime, float weight_kg) {
        this.dateTime = dateTime;
        this.weight_kg = weight_kg;
    }

    public WeightLog(float weight_kg, LocalDate dateTime, long id) {
        this.weight_kg = weight_kg;
        this.dateTime = dateTime;
        this.id = id;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public float getWeight_kg() {
        return weight_kg;
    }

    public void setWeight_kg(float weight_kg) {
        this.weight_kg = weight_kg;
    }


}
