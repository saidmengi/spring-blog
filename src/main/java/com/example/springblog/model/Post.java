package com.example.springblog.model;


import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table
@Data
public class Post {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private String title;
    private String content;
    private Instant createdOn;
    private Instant updatedOn;
    private String username;


}
