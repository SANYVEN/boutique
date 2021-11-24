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
 * @author FAMILIA1
 */
@Document(collection = "empleados") // motodo para crear la tabla o la coleccion.
public class empleadosModelo {

    @Id    
    private int identificacionEmp;
    private String nombresEmp;
    private String apellidosEmp;
    private String emailEmp;
    private String direccionEmp;
    private String celularEmp;
    private String contrasenaEmp;
    private String fechaNacimientoEmp;
    private String fechaContratoEmp;
    private String numeroContratoEmp;
    private String areaEmp;
    private String cargoEmp;
    private String permisosEmp;
    private String anotacionesEmp;

    public int getIdentificacionEmp() {
        return identificacionEmp;
    }

    public void setIdentificacionEmp(int identificacionEmp) {
        this.identificacionEmp = identificacionEmp;
    }

    public String getNombresEmp() {
        return nombresEmp;
    }

    public void setNombresEmp(String nombresEmp) {
        this.nombresEmp = nombresEmp;
    }

    public String getApellidosEmp() {
        return apellidosEmp;
    }

    public void setApellidosEmp(String apellidosEmp) {
        this.apellidosEmp = apellidosEmp;
    }

    public String getEmailEmp() {
        return emailEmp;
    }

    public void setEmailEmp(String emailEmp) {
        this.emailEmp = emailEmp;
    }

    public String getDireccionEmp() {
        return direccionEmp;
    }

    public void setDireccionEmp(String direccionEmp) {
        this.direccionEmp = direccionEmp;
    }

    public String getCelularEmp() {
        return celularEmp;
    }

    public void setCelularEmp(String celularEmp) {
        this.celularEmp = celularEmp;
    }

    public String getContrasenaEmp() {
        return contrasenaEmp;
    }

    public void setContraseñaEmp(String contrasenaEmp) {
        this.contrasenaEmp = contrasenaEmp;
    }

    public String getFechaNacimientoEmp() {
        return fechaNacimientoEmp;
    }

    public void setFechaNacimientoEmp(String fechaNacimientoEmp) {
        this.fechaNacimientoEmp = fechaNacimientoEmp;
    }

    public String getFechaContratoEmp() {
        return fechaContratoEmp;
    }

    public void setFechaContratoEmp(String fechaContratoEmp) {
        this.fechaContratoEmp = fechaContratoEmp;
    }

    public String getNumeroContratoEmp() {
        return numeroContratoEmp;
    }

    public void setNumeroContratoEmp(String numeroContratoEmp) {
        this.numeroContratoEmp = numeroContratoEmp;
    }

    public String getAreaEmp() {
        return areaEmp;
    }

    public void setAreaEmp(String areaEmp) {
        this.areaEmp = areaEmp;
    }

    public String getCargoEmp() {
        return cargoEmp;
    }

    public void setCargoEmp(String cargoEmp) {
        this.cargoEmp = cargoEmp;
    }

    public String getPermisosEmp() {
        return permisosEmp;
    }

    public void setPermisosEmp(String permisosEmp) {
        this.permisosEmp = permisosEmp;
    }

    public String getAnotacionesEmp() {
        return anotacionesEmp;
    }

    public void setAnotacionesEmp(String anotacionesEmp) {
        this.anotacionesEmp = anotacionesEmp;
    }

}
