/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.biodiversidad;

import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/observaciones")
public class ObservacionControlador {
    @Autowired private ObservacionServicio service;

    @GetMapping public List<Observacion> listar() { return service.listar(); }
    @GetMapping("/{id}") public ResponseEntity<Observacion> obtener(@PathVariable Integer id) {
        return service.buscarPorId(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping public Observacion crear(@RequestBody Observacion obs) { return service.guardar(obs); }
    @PutMapping("/{id}")
    public ResponseEntity<Observacion> actualizar(@PathVariable Integer id, @RequestBody Observacion nueva) {
        return service.buscarPorId(id).map(o -> {
            nueva.setId(id);
            return ResponseEntity.ok(service.guardar(nueva));
        }).orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}") public void eliminar(@PathVariable Integer id) { service.eliminar(id); }
}
