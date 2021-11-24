/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mintic.boutique.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author OMAR.MORENOB
 */
@Document(collection="clientes")
public class clientesModelo {

    @Id
    private int identificacionCle;
    private String nombresCle;
    private String apellidosCle;
    private String emailCle;
    private String direccionCle;
    private String celularCle;
    private String contrasenaCle;
    private String fechaRegistroCle;

    public int getIdentificacionCle() {
        return identificacionCle;
    }

    public void setIdentificacionCle(int identificacionCle) {
        this.identificacionCle = identificacionCle;
    }

    public String getNombresCle() {
        return nombresCle;
    }

    public void setNombresCle(String nombresCle) {
        this.nombresCle = nombresCle;
    }

    public String getApellidosCle() {
        return apellidosCle;
    }

    public void setApellidosCle(String apellidosCle) {
        this.apellidosCle = apellidosCle;
    }

    public String getEmailCle() {
        return emailCle;
    }

    public void setEmailCle(String emailCle) {
        this.emailCle = emailCle;
    }

    public String getDireccionCle() {
        return direccionCle;
    }

    public void setDireccionCle(String direccionCle) {
        this.direccionCle = direccionCle;
    }

    public String getCelularCle() {
        return celularCle;
    }

    public void setCelularCle(String celularCle) {
        this.celularCle = celularCle;
    }

    public String getContrasenaCle() {
        return contrasenaCle;
    }

    public void setContraseñaCle(String contraseñaCle) {
        this.contrasenaCle = contrasenaCle;
    }

    public String getFechaRegistroCle() {
        return fechaRegistroCle;
    }

    public void setFechaRegistroCle(String fechaRegistroCle) {
        this.fechaRegistroCle = fechaRegistroCle;
    }

    
    
}
