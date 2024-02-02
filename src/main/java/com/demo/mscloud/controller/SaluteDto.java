package com.demo.mscloud.controller;


import lombok.Data;

@Data
public class SaluteDto {

    private String nombre;
    private String apellido;
    private boolean saludo;

  /*  public boolean isSaludo() {
        return saludo;
    }

    public void setSaludo(boolean saludo) {
        this.saludo = saludo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
*/
}
