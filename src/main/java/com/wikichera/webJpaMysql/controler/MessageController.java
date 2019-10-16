package com.wikichera.webJpaMysql.controler;

import com.wikichera.webJpaMysql.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/first")
    public Message send() {
        return new Message("This is a message!");
    }

    @PostMapping("/first")
    public Message receive(@RequestBody Message message) {

        return message;
    }
}