package com.gfg.lec5rest.model;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class MovieResponse {
    private String title;
    private String genre;
    private Integer duration;
    private String language;
    private List<CastResponse> castResponses;
    private List<ReviewResponse> reviewResponses;
    private StreamingDetailsResponse streamingDetails;
}