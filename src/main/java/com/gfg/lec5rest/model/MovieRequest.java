package com.gfg.lec5rest.model;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder  // used to create object (similar to new MovieRequest();)
public class MovieRequest {
    private String title;
    private String genre;
    private Integer duration;
    private String language;
    private List<CastRequest> castRequests;
    private List<ReviewRequest> reviewRequests;
    private StreamingDetailsRequest streamingDetails;
}
