package com.mymonkmindset.health.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    public long id;
    public long parentId;
    public String content;
    public LocalDateTime time;
    public long byUser;
    public ArrayList <Long> likes = new ArrayList<>();
}
