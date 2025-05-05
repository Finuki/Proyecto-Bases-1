/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.biodiversidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxonRepositorio extends JpaRepository<Taxon, Integer>{
    
}
