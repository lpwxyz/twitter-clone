package com.lpw.twitter_clone.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "favorites")
public class FavoriteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "tweet_id", nullable = false)
    private TweetEntity tweet;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;
}
