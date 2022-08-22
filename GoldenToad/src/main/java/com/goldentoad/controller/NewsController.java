package com.goldentoad.controller;
//Oscar Sanchez Boza

import com.goldentoad.entity.News;
import com.goldentoad.service.INewsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewsController {
    @Autowired
    private INewsService newsService;
    
    //==========================================================================
    //===============================NEWS=======================================
    //==========================================================================
    @GetMapping("/newsN")
    public String newsN(Model model) {
        List<News> listNews = newsService.getAllNews();
        model.addAttribute("titulo", "News Table");
        model.addAttribute("news", listNews);
        return "newsN";
    }

    //Crear una persona nueva CRUD
    @GetMapping("/crearNews")
    public String crearNews(Model model) {
        model.addAttribute("news", new News());
        return "crearNews";
    }

    @PostMapping("/guardarNews")
    public String guardarNews(@ModelAttribute News news) {
        newsService.saveNews(news);
        return "redirect:/newsN";
    }

    @GetMapping("/editNews/{id_news}")
    public String editarNews(@PathVariable("id_news") Integer idNews, Model model) {
        News news = newsService.getNewsById(idNews);
        model.addAttribute("news", news);
        return "crearNews";
    }

    @GetMapping("/eliminarNews/{id_news}")
    public String eliminarNews(@PathVariable("id_news") Integer idNews) {
        newsService.delete(idNews);
        return "redirect:/newsN";
    }
    
    @GetMapping("/news")
    public String login() {

        return "news";
    }
}
