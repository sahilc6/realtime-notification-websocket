package com.sahilkule.realtime_notification_websocket.repository;

import com.sahilkule.realtime_notification_websocket.dto.Nofitication;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Nofitication, Long> {
}
