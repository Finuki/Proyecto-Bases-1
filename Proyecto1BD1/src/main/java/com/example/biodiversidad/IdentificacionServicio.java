/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biodiversidad;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentificacionServicio {
    @Autowired private IdentificacionRepositorio repo;

    public List<Identificacion> listar() { return repo.findAll(); }
    public List<Identificacion> buscarPorObservacion(Integer idObservacion) {
    return repo.findByObservacionId(idObservacion);}
    public Optional<Identificacion> buscarPorId(Integer id) { return repo.findById(id); }
    public Identificacion guardar(Identificacion ident) { return repo.save(ident); }
    public void eliminar(Integer id) { repo.deleteById(id); }
}
