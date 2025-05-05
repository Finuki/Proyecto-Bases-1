/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.biodiversidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IdentificacionRepositorio extends JpaRepository<Identificacion, Integer>{
    List<Identificacion> findByObservacionId(Integer idObservacion);
}
