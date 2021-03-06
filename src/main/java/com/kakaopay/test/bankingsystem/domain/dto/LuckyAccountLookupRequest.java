package com.kakaopay.test.bankingsystem.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class LuckyAccountLookupRequest {

    private String token;
    private Long userId;
    private LocalDateTime requestAt;

    @Builder
    public LuckyAccountLookupRequest(String token, Long userId, LocalDateTime requestAt) {
        this.token = token;
        this.userId = userId;
        this.requestAt = requestAt;
    }
}
