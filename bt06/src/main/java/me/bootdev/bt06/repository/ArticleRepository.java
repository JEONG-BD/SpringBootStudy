package me.bootdev.bt06.repository;

import me.bootdev.bt06.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
