package com.adelmonsouza.day23.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/graphql")
public class GraphQLController {

    @GetMapping
    public ResponseEntity<Map<String, String>> getInfo() {
        return ResponseEntity.ok(Map.of(
            "status", "success",
            "message", "GraphQL endpoint - Day 23",
            "day", "23"
        ));
    }
}
