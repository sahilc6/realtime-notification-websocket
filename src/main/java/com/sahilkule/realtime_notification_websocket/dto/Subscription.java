package com.sahilkule.realtime_notification_websocket.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Subscription {
    @Id
    private Long id;

    private Long userId;
    private Long channelId;
}
