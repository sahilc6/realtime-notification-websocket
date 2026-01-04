package com.sahilkule.realtime_notification_websocket.repository;

import com.sahilkule.realtime_notification_websocket.dto.Subscription;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Collection;
import java.util.List;

public interface SubscriptionRepo extends MongoRepository<Subscription, Long> {

    List<Subscription> findByChannelId(Long channelId);
}
