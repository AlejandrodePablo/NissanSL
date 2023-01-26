package com.iesam.adpc.nissanapp.domain.models;

public class CuadroMando implements Chasis {
    private String codigo;
    private String modelo;


    @Override
    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
