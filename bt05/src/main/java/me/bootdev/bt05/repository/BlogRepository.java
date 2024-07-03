package me.bootdev.bt05.repository;

import me.bootdev.bt05.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
