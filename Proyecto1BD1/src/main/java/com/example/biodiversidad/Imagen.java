/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biodiversidad;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "imagen", schema = "biodiversidad")
public class Imagen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_imagen")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_observacion", nullable = false)
    private Observacion observacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_taxon")
    private Taxon taxon;

    @ManyToOne
    @JoinColumn(name = "id_licencia", nullable = false)
    private LicenciaImagen licencia;

    @Column(name = "fecha_toma", nullable = false)
    private Date fechaToma;

    @Column(name = "propietario_imagen", nullable = false)
    private String propietarioImagen;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Observacion getObservacion() {
        return observacion;
    }

    public void setObservacion(Observacion observacion) {
        this.observacion = observacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Taxon getTaxon() {
        return taxon;
    }

    public void setTaxon(Taxon taxon) {
        this.taxon = taxon;
    }

    public LicenciaImagen getLicencia() {
        return licencia;
    }

    public void setLicencia(LicenciaImagen licencia) {
        this.licencia = licencia;
    }

    public Date getFechaToma() {
        return fechaToma;
    }

    public void setFechaToma(Date fechaToma) {
        this.fechaToma = fechaToma;
    }

    public String getPropietarioImagen() {
        return propietarioImagen;
    }

    public void setPropietarioImagen(String propietarioImagen) {
        this.propietarioImagen = propietarioImagen;
    }
}
