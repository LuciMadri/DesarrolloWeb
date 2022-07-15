package com.goldentoad.Service;
//Oscar Sanchez Boza

import com.goldentoad.entity.News;
import com.goldentoad.repository.NewsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsService implements INewsService{
    @Autowired
    private NewsRepository newsRepository;
    @Override
    public List<News> listAbout() {
        return (List<News>)newsRepository.findAll();
    }

    @Override
    public News getAboutById(int id_news) {
        return newsRepository.findById(id_news).orElse(null);
    }

    @Override
    public void saveAbout(News news) {
        newsRepository.save(news);
    }

    @Override
    public void delete(int id_news) {
        newsRepository.deleteById(id_news);
    }

    @Override
    public News findByTitle(String title) {
        return newsRepository.findByTitle(title);
    }
    
}
