package com.sahilkule.realtime_notification_websocket.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Channel {
    @Id
    private Long id;
    private String name;
}
