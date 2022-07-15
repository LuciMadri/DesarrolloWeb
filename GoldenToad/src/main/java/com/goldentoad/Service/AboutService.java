package com.goldentoad.Service;
//Oscar Sanchez Boza

import com.goldentoad.entity.About;
import com.goldentoad.repository.AboutRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService implements IAboutService{
   @Autowired
    private AboutRepository aboutRepository;

    @Override
    public List<About> listAbout() {
        return (List<About>)aboutRepository.findAll();
    }

    @Override
    public About getAboutById(int id_about) {
        return aboutRepository.findById(id_about).orElse(null);
    }

    @Override
    public void saveAbout(About about) {
        aboutRepository.save(about);
    }

    @Override
    public void delete(int id_about) {
        aboutRepository.deleteById(id_about);
    }

    @Override
    public About findByFirstName(String firstname) {
        return aboutRepository.findByFirstName(firstname);
    }
   
}