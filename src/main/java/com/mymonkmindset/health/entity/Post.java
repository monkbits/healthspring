package com.mymonkmindset.health.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post")
public class Post {
    @SequenceGenerator(
            name = "post_sequence",
            sequenceName = "post_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "post_sequence"
    )
    @Id
    public long id;
    public String content;
    public ArrayList<Long> likes = new ArrayList<>();
    public ArrayList<Comment> comments =  new ArrayList<>();
    public Boolean status = true;

    public void setContent(String content) {
        this.content = content;
    }
}
