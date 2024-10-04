package com.example.bt07.controller;

import com.example.bt07.domain.Article;
import com.example.bt07.dto.AddArticleRequest;
import com.example.bt07.service.BlogService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Slf4j
public class BlogApiController {

    private final BlogService blogService;


    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestParam AddArticleRequest request){
        Article savedArticle = blogService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
    }

}
