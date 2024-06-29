package me.bootdev.controller;


import lombok.RequiredArgsConstructor;
import me.bootdev.domain.Article;
import me.bootdev.dto.AddArticleRequest;
import me.bootdev.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BlogApiController {
    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request){
        Article savedArticle = blogService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);
    }



}
