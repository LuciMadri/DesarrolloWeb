package com.goldentoad.Service;
//Oscar Sanchez Boza

import com.goldentoad.entity.News;
import java.util.List;


public interface INewsService {
    public List<News>listAbout();
    public News getAboutById (int id_news);
    public void saveAbout(News news);
    public void delete(int id_news);
    public News findByTitle(String title);
}
