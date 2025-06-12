package com.mymonkmindset.health.User;

import com.mymonkmindset.health.weightlog.WeightLog;
import jakarta.persistence.*;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
@Entity
@Table(name = "users")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private long id;
    private int age;
    private int weight;
    private ArrayList<WeightLog> wl_list = new ArrayList<>();


    public String getDatelog() {
        return datelog;
    }

    public void setDatelog(String datelog) {
        this.datelog = datelog;
    }

    private String datelog;

    public User(long id, int age , int weight){
        this.id = id;
        this.age = age;
        this.weight = weight;
    }

    public User( int age , int weight){
        this.age = age;
        this.weight = weight;
    }

    public User(){
        this.age = 0;
        this.weight = 0;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    };

    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ArrayList<WeightLog> getWl_list() {
        return wl_list;
    }

    public void setWl_list(ArrayList<WeightLog> wl_list) {
        this.wl_list = wl_list;
    }
}
