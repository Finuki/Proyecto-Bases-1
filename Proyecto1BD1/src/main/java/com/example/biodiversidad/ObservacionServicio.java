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
public class ObservacionServicio {
    @Autowired private ObservacionRepositorio repo;

    public List<Observacion> listar() { return repo.findAll(); }
    public Optional<Observacion> buscarPorId(Integer id) { return repo.findById(id); }
    public Observacion guardar(Observacion obs) { return repo.save(obs); }
    public void eliminar(Integer id) { repo.deleteById(id); }

}
