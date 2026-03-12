/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.spa.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.spa.backend.model.Plan;
/**
 *
 * @author Duoc
 */
public interface Planrepository extends JpaRepository<Plan, Long> {
    
}
