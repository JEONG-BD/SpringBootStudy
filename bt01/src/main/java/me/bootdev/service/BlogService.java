package me.bootdev.service;


import lombok.RequiredArgsConstructor;
import me.bootdev.domain.Article;
import me.bootdev.dto.AddArticleRequest;
import me.bootdev.repository.BlogRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}
