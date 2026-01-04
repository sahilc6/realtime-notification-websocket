package com.sahilkule.realtime_notification_websocket.dto;

import lombok.Data;

@Data
public class SubscriptionRequest {
    private Long userId;
    private Long channelId;
}
