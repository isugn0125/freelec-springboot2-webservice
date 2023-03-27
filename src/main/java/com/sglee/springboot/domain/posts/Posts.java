package com.sglee.springboot.domain.posts;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor // 기본 생성자 자동 추가
@Entity  //테이블과 링크될 클래스
public class Posts {

    @Id // PK 값
    @GeneratedValue(strategy = GenerationType.IDENTITY) //GenerationType.IDENTITY 추가 해야 AutoIncrement * 버전마다 상이
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
