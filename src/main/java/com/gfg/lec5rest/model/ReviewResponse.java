package com.gfg.lec5rest.model;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class ReviewResponse {
    private Integer rating;

    private String comment;

    private String userId;
}