package me.bootdev.bt05.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.bootdev.bt05.domain.Article;
import me.bootdev.bt05.dto.AddArticleRequest;
import me.bootdev.bt05.dto.UpdateArticleRequest;
import me.bootdev.bt05.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest addArticleRequest){
        return blogRepository.save(addArticleRequest.toEntity());
    }

    public Article findById(long id){

        return blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not found" + id));
    }
    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    @Transactional
    public Article update(long id, UpdateArticleRequest updateArticleRequest){
        Article article = blogRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("not fount" + id));

        article.update(updateArticleRequest.getTitle(), updateArticleRequest.getContent());

        return article;
    }

    public void delete(long id){
        blogRepository.deleteById(id);
    }
}
