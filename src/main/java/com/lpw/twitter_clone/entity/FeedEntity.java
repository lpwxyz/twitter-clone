package com.lpw.twitter_clone.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "feeds")
public class FeedEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;

    @Column(name = "updated_at", nullable = false, updatable = false)
    private LocalDateTime updated_at;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToMany
    @JoinTable(
   name = "feeds_tweets",
   joinColumns  = @JoinColumn(name = "feed_id"),
   inverseJoinColumns = @JoinColumn(name = "tweet_id"))
    List<TweetEntity> tweets;
}
