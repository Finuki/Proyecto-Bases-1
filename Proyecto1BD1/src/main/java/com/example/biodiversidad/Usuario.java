/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biodiversidad;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario", schema = "biodiversidad")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;

    @Column(nullable = false)
    private String nombre;

    @Column(name = "apellido_1", nullable = false)
    private String apellido1;

    @Column(name = "apellido_2", nullable = false)
    private String apellido2;

    @ManyToOne
    @JoinColumn(name = "id_pais", nullable = false)
    private Pais pais;
    private String direccion;
    
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

    public String getApellido1() {
    return apellido1;
    }

    public void setApellido1(String apellido1) {
    this.apellido1 = apellido1;
    }

    public String getApellido2() {
    return apellido2;
    }

    public void setApellido2(String apellido2) {
    this.apellido2 = apellido2;
    }

    public Pais getPais() {
    return pais;
    }

    public void setPais(Pais pais) {
    this.pais = pais;
    }

    public String getDireccion() {
    return direccion;
    }

    public void setDireccion(String direccion) {
    this.direccion = direccion;
    }
}
