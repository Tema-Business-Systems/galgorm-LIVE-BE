package com.transport.tracking.k.controller;

import com.transport.tracking.k.annotation.Anonymous;
import com.transport.tracking.k.service.UserService;
import com.transport.tracking.response.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@CrossOrigin(origins={"http://localhost:3000","http://localhost:8084","http://localhost:8083","https://10.254.26.108:8083","https://10.254.26.108:8084","http://10.254.26.108:8083","http://10.254.26.108:8084","http://routeplanner-galgorm.cpio.cloud:8083","http://routeplanner-galgorm.cpio.cloud:8084"})
@RequestMapping("/api/v1/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping ("/login")
    @Anonymous
    public @ResponseBody ResponseEntity<Object> login(@RequestBody UserVO userVO, HttpServletResponse response) {
        log.info("UserVO  ======== ", userVO);
        userVO = userService.login(userVO, response);
        if(Objects.isNull(userVO)) {            Map<String, String> map = new HashMap<>();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map.put("message", "error"));
        }
        return ResponseEntity.status(HttpStatus.OK).body(userVO);
    }

    @GetMapping ("/logout")
    @Anonymous
    public @ResponseBody ResponseEntity<Object> logout(HttpServletResponse response) {
        userService.logOut(response);
        return ResponseEntity.status(HttpStatus.OK).body("sucess");
    }
}
