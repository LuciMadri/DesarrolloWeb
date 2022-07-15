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
    private String firstname;
    private String lastname;
    private String descrip;

    public int getId_about() {
        return id_about;
    }

    public void setId_about(int id_about) {
        this.id_about = id_about;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    
    
}
