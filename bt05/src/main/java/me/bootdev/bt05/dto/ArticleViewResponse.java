package me.bootdev.bt05.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.bootdev.bt05.domain.Article;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class ArticleViewResponse {

    private Long id;
    private String content;
    private String title;
    private LocalDateTime createdAt;

    public ArticleViewResponse(Article article) {
        this.id = article.getId();
        this.content = article.getContent();
        this.title = article.getTitle();
        this.createdAt = article.getCreatedAt();
    }
}
