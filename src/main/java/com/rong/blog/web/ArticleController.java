package com.rong.blog.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rong.blog.mapper.ArticleMapper;
import com.rong.blog.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ArticleController {
    @Autowired
    ArticleMapper articleMapper;

    @RequestMapping("/listArticle")
    public String listArticle(Model m, @RequestParam(value="start", defaultValue ="0") int start, @RequestParam(value="size", defaultValue="5") int size) throws Exception {
        PageHelper.startPage(start, size, "id asc");
        List<Article> as = articleMapper.findAll();
        PageInfo<Article> page = new PageInfo<>(as);
        m.addAttribute("page", page);
        return "listArticle";
    }
    @RequestMapping("/addArticle")
    public String listArticle(Article a) throws Exception {
        articleMapper.save(a);
        return "redirect:listArticle";
    }
    @RequestMapping("/deleteArticle")
    public String deleteCategory(Article a) throws Exception {
        articleMapper.delete(a.getId());
        return "redirect:listArticle";
    }
    @RequestMapping("/updateArticle")
    public String updateCategory(Article a) throws Exception {
        articleMapper.update(a);
        return "redirect:listArticle";
    }
    @RequestMapping("/editArticle")
    public String listCategory(int id, Model m) throws Exception {
        Article a= articleMapper.get(id);
        m.addAttribute("a", a);
        return "editArticle";
    }
}
