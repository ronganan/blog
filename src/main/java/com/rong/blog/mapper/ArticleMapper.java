package com.rong.blog.mapper;

import com.rong.blog.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {

    List<Article> findAll();

    public int save(Article article);

    public void delete(int id);

    public Article get(int id);

    public int update(Article article);
}
