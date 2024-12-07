package com.example.kubo.daichi.menuchooser.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
    @GetMapping("/api/v1/hello")
    public HelloMessage getHello() {
        return new HelloMessage("HelloWorld!!!!");
    }

    // レスポンス用の DTO クラス
    @Getter
    @Setter
    @AllArgsConstructor
    public static class HelloMessage {
        private String message;
    }
}