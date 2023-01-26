package com.iesam.adpc.nissanapp.domain.models;

public class Motor implements Chasis {
    private String codigo;
    private String modelo;
    private Integer cilindrada;
    private Integer caballos;


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Integer getCaballos() {
        return caballos;
    }

    public void setCaballos(Integer caballos) {
        this.caballos = caballos;
    }
}
