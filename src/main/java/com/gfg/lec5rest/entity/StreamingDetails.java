package com.gfg.lec5rest.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StreamingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String downloadLink;

    @OneToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id") // referencedColumnName is used when we have named our
    private Movie movie;                                                            // primary key to some other name.

}
