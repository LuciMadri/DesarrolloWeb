package com.goldentoad.entity;
//Oscar Sanche Boza

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "about")
public class About {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id_about;
    private String firstname_a;
    private String lastname_a;
    private String descrip;

    public int getId_about() {
        return id_about;
    }

    public void setId_about(int id_about) {
        this.id_about = id_about;
    }

    public String getFirstname_a() {
        return firstname_a;
    }

    public void setFirstname_a(String firstname_a) {
        this.firstname_a = firstname_a;
    }

    public String getLastname_a() {
        return lastname_a;
    }

    public void setLastname_a(String lastname_a) {
        this.lastname_a = lastname_a;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    
    
    
    
}
