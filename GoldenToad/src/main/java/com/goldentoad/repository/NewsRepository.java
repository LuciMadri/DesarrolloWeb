package com.goldentoad.repository;
//Oscar Sanchez Boza

import com.goldentoad.entity.News;
import org.springframework.data.repository.CrudRepository;


public interface NewsRepository extends CrudRepository<News,Integer>{
    News findByTitle(String title);
}
