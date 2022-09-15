package com.lpw.twitter_clone.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class User {
    UUID id;
    String email;
    LocalDate dob;
    LocalDateTime createdAt;
//    private List<TweetEntity> tweets;
//    private List<FeedEntity> feeds;
//    private List<FavoriteEntity> favorites;
}