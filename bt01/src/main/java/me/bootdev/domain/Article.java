package me.bootdev.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
// @AllArgsConstructor
@Getter

public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Builder
    public Article(String title, String content){
        this.title = title;
        this.content = content;

    }
//
//    protected Article(){
//
//    }
//
//    public Long getId(){
//        return id;
//    }
//
//    public String getTitle(){
//        return title;
//    }
//
//    public String getContent(){
//        return content;
//    }
}
