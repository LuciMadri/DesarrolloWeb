package com.goldentoad.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Definimos de que tipo es nuestra clase, en este caso una entidad.
@Entity
//Definir la tabla que hay en la bd en este caso se llama personas.
@Table(name = "helpform")

//implementamos una interfaz "Serializable"
public class Helpform implements Serializable {

    //Creamos los atributos que asemejen la tabla (persona).
    //Definimos la llame primaria con @id
    @Id

    //Con esta valor decimos que nuestra id va a obtener un valor autoincremental.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_help;

    private String username;
    private String email;
    private String phone;
    private String descrip;

    //Definomos la relacion  de una a muchas
    @ManyToOne

    //Foreign key
    @JoinColumn(name = "id_user")
    private Userform userform;

    //Creamos getters y setters
    public long getId_help() {
        return id_help;
    }

    public void setId_help(long id_help) {
        this.id_help = id_help;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Userform getUserform() {
        return userform;
    }

    public void setUserform(Userform userform) {
        this.userform = userform;
    }

}