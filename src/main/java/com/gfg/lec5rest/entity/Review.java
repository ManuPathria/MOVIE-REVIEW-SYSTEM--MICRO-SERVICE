package com.gfg.lec5rest.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer rating;

    private String comment;

    private String userId;

    @ManyToOne
    @JoinColumn(name="movie_id")  // used to keep reference of movie  (foreign key)
    private Movie movies;
}
