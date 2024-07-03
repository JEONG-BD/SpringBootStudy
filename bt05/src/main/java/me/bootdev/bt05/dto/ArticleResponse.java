package me.bootdev.bt05.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.bootdev.bt05.domain.Article;

@Getter
public class ArticleResponse {

    private String title;
    private String content;

    public ArticleResponse(Article article){
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}
