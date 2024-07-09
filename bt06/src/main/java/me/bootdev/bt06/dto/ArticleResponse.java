package me.bootdev.bt06.dto;

import lombok.Getter;
import me.bootdev.bt06.domain.Article;

@Getter
public class ArticleResponse {

    private String title;
    private String content;

    public ArticleResponse(Article article){
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
