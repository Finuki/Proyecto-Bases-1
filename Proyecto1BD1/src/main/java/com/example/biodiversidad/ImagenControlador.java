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
@RequestMapping("/api/imagenes")
public class ImagenControlador {
    @Autowired private ImagenServicio service;

    @GetMapping
    public List<Imagen> listar() { 
        return service.listar(); 
    }
    
    @GetMapping("/por-observacion/{observacionId}")
    public ResponseEntity<?> getImagenPorObservacion(@PathVariable Integer observacionId) {
    List<Imagen> imagenes = service.listarPorObservacion(observacionId);
    if (imagenes.isEmpty()) {
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(imagenes.get(0));
    }
    
    @PutMapping("/{id}")
    public Imagen actualizar(@PathVariable Integer id, @RequestBody Imagen img) {
        img.setId(id);
        return service.guardar(img);
    }
    
    @PostMapping
    public Imagen crear(@RequestBody Imagen img) { 
        return service.guardar(img); 
    }
    
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) { 
        service.eliminar(id); 
    }
}
