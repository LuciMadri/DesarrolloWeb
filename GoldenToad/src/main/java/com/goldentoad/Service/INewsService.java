package com.goldentoad.service;
//Oscar Sanchez Boza

import com.goldentoad.entity.News;
import java.util.List;


public interface INewsService {
    public List<News>getAllNews();
    public News getNewsById (int id_news);
    public void saveNews(News news);
    public void delete(int id_news);
    public News findByTitle(String title);
}






    