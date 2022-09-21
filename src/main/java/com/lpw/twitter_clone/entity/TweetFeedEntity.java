package com.lpw.twitter_clone.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tweets_feeds")
public class TweetFeedEntity {
    @Id
    Long id;

    @ManyToOne
    @JoinColumn(name = "tweet_id")
    TweetEntity tweet;

    @ManyToOne
    @JoinColumn(name = "feed_id")
    FeedEntity feed;
}
