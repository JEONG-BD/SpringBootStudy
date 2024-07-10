package me.bootdev.bt06.controller;

import lombok.RequiredArgsConstructor;
import me.bootdev.bt06.domain.Article;
import me.bootdev.bt06.dto.ArticleListViewResponse;
import me.bootdev.bt06.dto.ArticleViewResponse;
import me.bootdev.bt06.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ArticleViewController {

    private final BlogService blogService;
    @GetMapping("/articles")
    public String getArticles(Model model){
        List<ArticleListViewResponse> articles = blogService.finaAll().stream()
                .map(ArticleListViewResponse::new)
                .toList();
        model.addAttribute("articles", articles);
        return "articleList";
    }

    @GetMapping("/articles/{id}")
    public String getArtile(@PathVariable("id") Long id, Model model){
       Article article = blogService.findById(id);
       model.addAttribute("article", new ArticleViewResponse(article));

       return "article";

    }

    @GetMapping("/new-article")
    public String newArticle(@RequestParam(name = "id", required = false) Long id, Model model ){

        if (id == null ){
            model.addAttribute("artocle", new ArticleViewResponse());
        }else {
            Article article = blogService.findById(id);
            model.addAttribute("article", new ArticleViewResponse(article));
        }

        return "newArticle";
    }


}
