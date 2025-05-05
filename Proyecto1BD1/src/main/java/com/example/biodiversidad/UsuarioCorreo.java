/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biodiversidad;
import jakarta.persistence.*;

@Entity
@Table(name = "usuario_correo", schema = "biodiversidad")
public class UsuarioCorreo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_correo")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(nullable = false, unique = true)
    private String correo;
    
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

    public String getCorreo() {
    return correo;
    }

    public void setCorreo(String correo) {
    this.correo = correo;
    }
}
