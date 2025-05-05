/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.biodiversidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ImagenRepositorio extends JpaRepository<Imagen, Integer>{
    @Query("SELECT i FROM Imagen i WHERE i.observacion.id = :observacionId")
    List<Imagen> findByObservacionId(Integer observacionId);
}
