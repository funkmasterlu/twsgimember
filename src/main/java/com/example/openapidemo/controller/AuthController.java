package com.example.openapidemo.controller;

import com.example.openapidemo.auth.AuthRequest;
import com.example.openapidemo.auth.JWTService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@Api(tags="auth token")
@RestController
@RequestMapping(value = "/v1/auth", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthController {
    @Autowired
    private JWTService jwtService;

    @ApiOperation("Get JWT Token")
    @PostMapping
    public ResponseEntity<Map<String, String>> issueToken(@RequestBody AuthRequest request) {
        System.out.println("Auth request :" + request.getUsername() + ", " + request.getPassword());
        String token = jwtService.generateToken(request);
        System.out.println("token :" + token);


        Map<String, String> response = Collections.singletonMap("token", token);

        return ResponseEntity.ok(response);
    }

    @ApiOperation("Parse JWT Token")
    @PostMapping("/parse")
    public ResponseEntity<Map<String, Object>> parseToken(@RequestBody Map<String, String> request) {
        String token = request.get("token");
        Map<String, Object> response = jwtService.parseToken(token);

        return ResponseEntity.ok(response);
    }
}
