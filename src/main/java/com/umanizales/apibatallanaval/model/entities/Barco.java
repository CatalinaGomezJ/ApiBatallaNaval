package com.umanizales.apibatallanaval.model.entities;

import javax.persistence.*;

@Entity
public class Barco {
    private int id;
    private String nombre;
    private short numeroCasillas;

    @Id
    @Column(name = "id", nullable = false)
    //Anotacion para que la maneje autonumerica
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 30)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "numero_casillas", nullable = false)
    public short getNumeroCasillas() {
        return numeroCasillas;
    }

    public void setNumeroCasillas(short numeroCasillas) {
        this.numeroCasillas = numeroCasillas;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", numeroCasillas=" + numeroCasillas +
                '}';
    }
}
