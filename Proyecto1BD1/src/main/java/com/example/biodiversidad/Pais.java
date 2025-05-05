/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biodiversidad;
import jakarta.persistence.*;

@Entity
@Table(name = "pais", schema = "biodiversidad")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pais")
    private Integer id;

    @Column(nullable = false, unique = true)
    private String nombre;
    
    public Integer getId() {
    return id;
    }

    public void setId(Integer id) {
    this.id = id;
    }

    public String getNombre() {
    return nombre;
    }

    public void setNombre(String nombre) {
    this.nombre = nombre;
    }
}
