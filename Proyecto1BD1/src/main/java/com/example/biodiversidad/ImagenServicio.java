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
public class ImagenServicio {
    @Autowired private ImagenRepositorio repo;

    public List<Imagen> listar() { return repo.findAll(); }
    public List<Imagen> listarPorObservacion(Integer observacionId) {
    return repo.findByObservacionId(observacionId);
    }
    public Optional<Imagen> buscarPorId(Integer id) { return repo.findById(id); }
    public Imagen guardar(Imagen img) { return repo.save(img); }
    public void eliminar(Integer id) { repo.deleteById(id); }
}
