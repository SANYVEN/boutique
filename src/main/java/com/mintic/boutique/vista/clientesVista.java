/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.boutique.vista;

import com.mintic.boutique.modelo.clientesModelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author OMAR.MORENOB
 */
@Repository
public interface clientesVista extends MongoRepository<clientesModelo,Integer>{
  
}
