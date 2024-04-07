package com.james.api.article;

import com.james.api.article.model.ArticleDto;
import com.james.api.article.service.ArticleServiceImpl;
import com.james.api.common.component.MessengerVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.*;

@CrossOrigin(origins = "*",allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/articles")
@Slf4j
public class ArticleController {
    private final ArticleServiceImpl service;

    @GetMapping("/findAll")
    public ResponseEntity<List<ArticleDto>> findAll(Pageable pageable){
        log.info("입력된 정보 : {}",pageable);
        return ResponseEntity.ok(new ArrayList<ArticleDto>());
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
    public ResponseEntity<MessengerVo> save(@RequestBody ArticleDto dto){
        log.info("입력받은 정보 : {}",dto);
        return ResponseEntity.ok(new MessengerVo());
    }
    @GetMapping("/deleteById")
    public ResponseEntity<MessengerVo> deleteById(){
        service.deleteById(0L);
        return ResponseEntity.ok(new MessengerVo());
    }
}
