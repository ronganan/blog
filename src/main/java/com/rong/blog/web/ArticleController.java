package com.rong.blog.web;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rong.blog.mapper.ArticleMapper;
import com.rong.blog.pojo.Article;
import com.rong.blog.pojo.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/article")
public class ArticleController {
    @Autowired
    ArticleMapper articleMapper;

    @RequestMapping(value = "/pageListArticles", method = RequestMethod.POST)
    public Pager<Article> pageListArticles(@RequestParam(value="pageNumber", defaultValue ="0") int pageNumber, @RequestParam(value="size", defaultValue="5") int size) throws Exception {
        PageHelper.startPage(pageNumber, size, "id asc");
        List<Article> as = articleMapper.findAll();
        int count = (int)((Page)as).getTotal();
        Pager<Article> articlePager = new Pager<>(pageNumber, size, count);
        articlePager.setList(as);
        return articlePager;
    }
    @RequestMapping(value = "/addArticle", method = RequestMethod.POST)
    public JSONObject listArticle(Article a) throws Exception {
        JSONObject jo = new JSONObject();
        articleMapper.save(a);
        jo.put("status", "success");
        return jo;
    }
    @RequestMapping(value = "/deleteArticle", method = RequestMethod.POST)
    public String deleteCategory(Article a) throws Exception {
        articleMapper.delete(a.getId());
        return "redirect:listArticle";
    }
    @RequestMapping(value = "/updateArticle", method = RequestMethod.POST)
    public String updateCategory(Article a) throws Exception {
        articleMapper.update(a);
        return "redirect:listArticle";
    }
    @RequestMapping(value = "/editArticle", method = RequestMethod.POST)
    public String listCategory(int id, Model m) throws Exception {
        Article a= articleMapper.get(id);
        m.addAttribute("a", a);
        return "editArticle";
    }
}
