/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biodiversidad;

import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, 
             RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
@RestController
@RequestMapping("/api/identificaciones")
public class IdentificacionControlador {
    @Autowired private IdentificacionServicio service;

    @GetMapping
    public List<Identificacion> listar() { return service.listar(); }
    
    @GetMapping("/{id}")
    public ResponseEntity<Identificacion> obtenerPorId(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @GetMapping("/por-observacion/{idObservacion}")
    public List<Identificacion> listarPorObservacion(@PathVariable Integer idObservacion) {
        return service.buscarPorObservacion(idObservacion);
    }
    
    @PostMapping
    public Identificacion crear(@RequestBody Identificacion ident) { 
        return service.guardar(ident); 
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Identificacion> actualizar(
            @PathVariable Integer id, 
            @RequestBody Identificacion identificacion) {
        identificacion.setId(id);
        return ResponseEntity.ok(service.guardar(identificacion));
    }
    
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) { 
        service.eliminar(id); 
    }
}