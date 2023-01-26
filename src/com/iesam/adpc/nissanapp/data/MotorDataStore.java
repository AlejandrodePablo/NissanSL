package com.iesam.adpc.nissanapp.data;

import com.iesam.adpc.nissanapp.domain.models.Motor;

import java.util.List;
import java.util.TreeMap;

public class MotorDataStore{

    private static MotorDataStore instance = null;

    private TreeMap<String, Motor> dataStore = new TreeMap<>();

    public void recibir(Motor motor) {
        dataStore.put(motor.getCodigo(),motor);
    }

    public void montar(Motor motor){
        dataStore.remove(motor.getCodigo());
    }
    public List<Motor> getAll(){
        return dataStore.values().stream().toList();
    }

    public static MotorDataStore getInstance(){
        if (instance == null){
            instance = new MotorDataStore();
        }
        return instance;
    }
}
