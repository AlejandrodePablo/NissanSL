package com.iesam.adpc.nissanapp.data;

import com.iesam.adpc.nissanapp.domain.models.Rueda;

import java.util.List;
import java.util.TreeMap;

public class RuedaDataStore {

    private static RuedaDataStore instance = null;

    private TreeMap<String, Rueda> dataStore = new TreeMap<>();

    public void recibir(Rueda rueda) {
        dataStore.put(rueda.getCodigo(), rueda);
    }

    public void montar(Rueda rueda){
        dataStore.remove(rueda.getCodigo());
    }
    public List<Rueda> getAll(){
        return dataStore.values().stream().toList();
    }

    public static RuedaDataStore getInstance(){
        if (instance == null){
            instance = new RuedaDataStore();
        }
        return instance;
    }
}
