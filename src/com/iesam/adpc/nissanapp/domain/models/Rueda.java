package com.iesam.adpc.nissanapp.domain.models;

public class Rueda implements Chasis {
    private String codigo;
    private String marca;
    private String modelo;
    private String diametro;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }
}
