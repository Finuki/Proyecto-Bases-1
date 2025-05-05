/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.biodiversidad;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface ObservacionRepositorio extends JpaRepository<Observacion, Integer>{
    @Query("SELECT o FROM Observacion o LEFT JOIN FETCH o.usuario LEFT JOIN FETCH o.taxon")
    List<Observacion> findAll();
    
    @Query("SELECT o FROM Observacion o LEFT JOIN FETCH o.usuario LEFT JOIN FETCH o.taxon WHERE o.id = ?1")
    Observacion findById(int id);
}
