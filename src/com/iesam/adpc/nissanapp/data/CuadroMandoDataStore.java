package com.iesam.adpc.nissanapp.data;

import com.iesam.adpc.nissanapp.domain.models.CuadroMando;


import java.util.List;
import java.util.TreeMap;

public class CuadroMandoDataStore {

    private static CuadroMandoDataStore instance = null;

    private TreeMap<String, CuadroMando> dataStore = new TreeMap<>();

    public void recibir(CuadroMando cuadroMando) {
        dataStore.put(cuadroMando.getCodigo(),cuadroMando);
    }

    public void montar(CuadroMando cuadroMando){
        dataStore.remove(cuadroMando.getCodigo());
    }
    public List<CuadroMando> getAll(){
        return dataStore.values().stream().toList();
    }

    public static CuadroMandoDataStore getInstance(){
        if (instance == null){
            instance = new CuadroMandoDataStore();
        }
        return instance;
    }
}
