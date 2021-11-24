/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.boutique.controlador;


import com.mintic.boutique.modelo.empleadosModelo;
import com.mintic.boutique.vista.empleadosVista;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author FAMILIA1
 */
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/empleados")
public class empleadosControlador {
    
    @Autowired
    private empleadosVista Repository;
    
        //// INSERTAR INFORMACION
    @PostMapping("/registrar")
    public empleadosModelo crear(@RequestBody @Validated empleadosModelo U) {
        return Repository.insert(U);
    }
    
     //// CONSULTAR INFORMACION
    @GetMapping("/consulta")
    public List<empleadosModelo> consultar() {
        return Repository.findAll();
    }
        
             //// CONSULTAR INFORMACION INDIVIDUAL
    @GetMapping("/consulta/{id}")
    public Optional<empleadosModelo> consultarInd (@PathVariable Integer id) {
        return Repository.findById(id);
    }
    
    //// ACTUALIZAR O MODIFICAR INFORMACION
    @PutMapping("/actualizar/{id}")
    public empleadosModelo actualizar(@PathVariable Integer id, @RequestBody @Validated empleadosModelo U) {

        return Repository.save(U);
    }
    
    //// ELIMINAR DATOS
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Integer id) {
        Repository.deleteById(id);
    }

    
}
