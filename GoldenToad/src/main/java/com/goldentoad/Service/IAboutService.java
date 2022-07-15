package com.goldentoad.Service;
//Oscar Sanchez Boza

import com.goldentoad.entity.About;
import java.util.List;


public interface IAboutService {
    public List<About>listAbout();
    public About getAboutById (int id_about);
    public void saveAbout(About about);
    public void delete(int id_about);
    public About findByFirstName(String firstname);
}
