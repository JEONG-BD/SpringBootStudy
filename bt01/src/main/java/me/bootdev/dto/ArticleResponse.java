package me.bootdev.dto;

import lombok.Getter;
import me.bootdev.domain.Article;

@Getter
public class ArticleResponse {

    private String title;
    private String content;

    public ArticleResponse(Article article){
        this.title = article.getTitle();
        this.content = article.getContent();
        this.content = article.getContent();
    }
}
