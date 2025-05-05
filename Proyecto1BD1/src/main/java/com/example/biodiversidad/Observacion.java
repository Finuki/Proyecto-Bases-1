/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biodiversidad;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "observacion", schema = "biodiversidad")
public class Observacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_observacion")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_taxon", nullable = false)
    private Taxon taxon;

    @Column(name = "url_imagen", nullable = false)
    private String urlImagen;

    @Column(name = "fecha_observacion", nullable = false)
    private Date fechaObservacion;

    @Column(nullable = false)
    private BigDecimal latitud;

    @Column(nullable = false)
    private BigDecimal longitud;

    private String notas;

    @Column(name = "fecha_registro", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    
    public Integer getId() {
    return id;
    }

    public void setId(Integer id) {
    this.id = id;
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

    public String getUrlImagen() {
    return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
    this.urlImagen = urlImagen;
    }

    public Date getFechaObservacion() {
    return fechaObservacion;
    }

    public void setFechaObservacion(Date fechaObservacion) {
    this.fechaObservacion = fechaObservacion;
    }
    
    public String getNotas() {
    return notas;
    }

    public void setNotas(String notas) {
    this.notas = notas;
    }
    public BigDecimal getLatitud() {
        return latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }
    
    public void setLatitud(BigDecimal latitud) {
    this.latitud = latitud;
    }
    
    public void setLongitud(BigDecimal longitud) {
    this.longitud = longitud;
    }
    
    public Date getFechaRegistro() {
    return fechaRegistro;
    }
}
