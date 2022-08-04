package com.goldentoad.service;
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
    public void deleteAbout(int id_about) {
        aboutRepository.deleteById(id_about);
    }

    /*@Override
    public About findByFirstname(String firstname_a) {
        return aboutRepository.findByFirstname(firstname_a);
    }*/
   
}
