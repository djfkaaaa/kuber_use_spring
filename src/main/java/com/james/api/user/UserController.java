package com.james.api.user;

import com.james.api.common.component.MessengerVo;
import com.james.api.common.component.PageRequestVo;
import com.james.api.user.model.UserDto;
import com.james.api.user.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.*;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/users")
@Slf4j
public class UserController {

    private final UserServiceImpl service;

    @GetMapping("/findAll")
    public ResponseEntity<List<UserDto>> findAll(Pageable pageable){
        log.info("입력된 정보: {}",pageable);
        return ResponseEntity.ok(new ArrayList<UserDto>());
    }

    @GetMapping("/findById")
    public ResponseEntity<MessengerVo> findById(PageRequestVo vo){
        service.findById(0L);
        return ResponseEntity.ok(new MessengerVo());
    }
//Map(String, UserDto)
    @GetMapping("/count")
    public ResponseEntity<MessengerVo> count(PageRequestVo vo){
        service.count();
        return ResponseEntity.ok(new MessengerVo());
    }

    @GetMapping("/exists/{id}")
    public ResponseEntity<MessengerVo> existsById(@PathVariable long id){
        service.existsById(0L);
        return ResponseEntity.ok(new MessengerVo());
    }

    @PostMapping("/save")
    public ResponseEntity<MessengerVo> save(@RequestBody UserDto param){
        log.info("입력받은 정보 : {}",param);
        return ResponseEntity.ok(new MessengerVo());
    }

    @GetMapping("/delete")
    public ResponseEntity<MessengerVo> deleteById(@PathVariable long id){
        service.deleteById(0L);
        return ResponseEntity.ok(new MessengerVo());
    }

}
