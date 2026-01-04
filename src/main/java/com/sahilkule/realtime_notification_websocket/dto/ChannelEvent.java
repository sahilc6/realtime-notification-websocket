package com.sahilkule.realtime_notification_websocket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChannelEvent {
    private Long channelId;
    private String videoId;
    private String videoTitle;
}
