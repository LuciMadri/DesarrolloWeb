package com.goldentoad.entity;

//Definimos de que tipo es nuestra clase, en este caso una entidad.

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
//Definir la tabla que hay en la bd en este caso se llama personas.
@Table(name = "merch")

public class Merch implements Serializable {
    
    
    //Creamos los atributos que asemejen la tabla (persona).
    //Definimos la llame primaria con @id
    @Id
    //Con esta valor decimos que nuestra id va a obtener un valor autoincremental.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_merch;
    
    
    private String title;
    private String descrip;
    
    //Definomos la relacion  de una a muchas
    @ManyToOne
    
    //Foreign key
    @JoinColumn (name="id_inventory")
    
    private Inventory inventory;
    

    public long getId_merch() {
        return id_merch;
    }

    public void setId_merch(long id_merch) {
        this.id_merch = id_merch;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    
    
    
    
}
