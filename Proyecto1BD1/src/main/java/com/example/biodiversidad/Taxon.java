/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biodiversidad;
import jakarta.persistence.*;

@Entity
@Table(name = "taxon", schema = "biodiversidad")
public class Taxon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_taxon")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_padre")
    private Taxon padre;

    @Column(nullable = false)
    private String nivel;

    @Column(name = "nombre_cientifico", nullable = false, unique = true)
    private String nombreCientifico;

    @Column(name = "nombre_comun")
    private String nombreComun;
    
    public Integer getId() {
    return id;
    }

    public void setId(Integer id) {
    this.id = id;
    }

    public Taxon getPadre() {
    return padre;
    }

    public void setPadre(Taxon padre) {
    this.padre = padre;
    }

    public String getNivel() {
    return nivel;
    }

    public void setNivel(String nivel) {
    this.nivel = nivel;
    }

    public String getNombreCientifico() {
    return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
    this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
    return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
    this.nombreComun = nombreComun;
    }
}
