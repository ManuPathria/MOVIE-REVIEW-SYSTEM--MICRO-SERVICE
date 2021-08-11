package com.gfg.lec5rest.entity;

import lombok.*;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie")
@Builder
public class Movie {  // map this to review using movie object reference
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String title;

    @Column(length = 16)
    private String genre;

    // Movie can have many reviews
    @OneToMany(mappedBy = "movies",cascade = CascadeType.ALL)
    private List<Review> review;

    // Movie can have many casts and a cast(actor) can be part of more than 1 movie
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "movie_cast",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "cast_id"))
    private Set<Cast> casts;

    // Movie will have only 1 download link for it
    @OneToOne(mappedBy = "movie",cascade = CascadeType.ALL)
    private StreamingDetails streamingDetails;

    private Integer duration;
    private String language;
}

