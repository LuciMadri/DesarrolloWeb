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
    private long id_helpform;
    
    
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String descrip;


    //Creamos getters y setters

    public long getId_helpform() {
        return id_helpform;
    }

    public void setId_helpform(long id_helpform) {
        this.id_helpform = id_helpform;
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

}