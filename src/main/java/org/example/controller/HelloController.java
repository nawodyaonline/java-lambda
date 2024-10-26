package org.example.controller;

import org.example.dto.MessageDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hi")
    public ResponseEntity<MessageDTO> hi(){
        return ResponseEntity.ok(new MessageDTO("Hello Lambda"));
    }
}
