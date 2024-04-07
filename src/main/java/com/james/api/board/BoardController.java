package com.james.api.board;


import com.james.api.board.model.BoardDto;
import com.james.api.board.service.BoardServiceImpl;
import com.james.api.common.component.MessengerVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/boards")
@Slf4j
public class BoardController {
    private final BoardServiceImpl service;

    @GetMapping("/findAll")
    public ResponseEntity<List<BoardDto>> findAll(Pageable pageable){
        log.info("입력 된 정보 : {}",pageable);
        return ResponseEntity.ok(new ArrayList<BoardDto>());
    }
    @GetMapping("/findById")
    public ResponseEntity<MessengerVo> findById(){
        service.findById(0L);
        return ResponseEntity.ok(new MessengerVo());
    }
    @GetMapping("/count")
    public ResponseEntity<MessengerVo> count(){
        service.count();
        return ResponseEntity.ok(new MessengerVo());
    }
    @GetMapping("/existById")
    public ResponseEntity<MessengerVo> existById(){
        service.existsById(0L);
        return ResponseEntity.ok(new MessengerVo());
    }
    @PostMapping("/save")
    public ResponseEntity<MessengerVo> save(@RequestBody BoardDto dto){
        log.info("입력받은 정보 : {}",dto);
        return ResponseEntity.ok(new MessengerVo());
    }
    @GetMapping("/deleteById")
    public ResponseEntity<MessengerVo> deleteById(){
        service.deleteById(0L);
        return ResponseEntity.ok(new MessengerVo());
    }
}
