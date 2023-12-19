package com.example;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    @GetMapping("/test")
    public ResponseEntity<Void> get(@RequestParam Integer userId) {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/test")
    public ResponseEntity<Void> post(@RequestParam Integer userId) {
        return ResponseEntity.ok(null);
    }

    @GetMapping("/test2")
    public ResponseEntity<Void> get2(@RequestPart User user) {
        return ResponseEntity.ok(null);
    }

    @PostMapping("/test2")
    public ResponseEntity<Void> post2(@RequestPart User user) {
        return ResponseEntity.ok(null);
    }


}
