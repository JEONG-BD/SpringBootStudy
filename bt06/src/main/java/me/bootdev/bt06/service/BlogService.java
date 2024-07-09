package me.bootdev.bt06.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import me.bootdev.bt06.domain.Article;
import me.bootdev.bt06.dto.AddArticleRequest;
import me.bootdev.bt06.dto.UpdateArticle;
import me.bootdev.bt06.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final ArticleRepository articleRepository;

    public Article save(AddArticleRequest request){
        return articleRepository.save(request.toEntity());
    }

    public List<Article> finaAll(){

        return articleRepository.findAll();
    }

    public Article findById(Long id){
        return articleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not fount" + id));

    }

    public void delete(Long id){
        articleRepository.deleteById(id);
    }


    @Transactional
    public Article update(long id, UpdateArticle request){
        Article article =  articleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found" + id));

        article.update(request.getTitle(), request.getContent());

        return article;


    }

}
