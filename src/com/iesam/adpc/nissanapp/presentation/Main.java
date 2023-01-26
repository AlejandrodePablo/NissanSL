package com.iesam.adpc.nissanapp.presentation;

import com.iesam.adpc.nissanapp.domain.models.CuadroMando;
import com.iesam.adpc.nissanapp.domain.models.Motor;
import com.iesam.adpc.nissanapp.domain.models.Rueda;

public class Main {
    public static void main(String[] args) {
        Rueda ruedaA1 = new Rueda();
        Rueda ruedaA2 = new Rueda();
        Rueda ruedaA3 = new Rueda();
        Rueda ruedaA4 = new Rueda();
        Rueda ruedaA5 = new Rueda();

        Rueda ruedaB1 = new Rueda();
        Rueda ruedaB2 = new Rueda();
        Rueda ruedaB3 = new Rueda();


        Motor motorA1 = new Motor();
        Motor motorA2 = new Motor();

        Motor motorB1 = new Motor();
        Motor motorB2 = new Motor();


        CuadroMando cuadroMandoA1 = new CuadroMando();
        CuadroMando cuadroMandoA2 = new CuadroMando();
        CuadroMando cuadroMandoA3 = new CuadroMando();
        CuadroMando cuadroMandoA4 = new CuadroMando();

        CuadroMando cuadroMandoB1 = new CuadroMando();
        CuadroMando cuadroMandoB2 = new CuadroMando();


        ruedaA1.setCodigo("1");
        ruedaA2.setCodigo("2");
        ruedaA3.setCodigo("3");
        ruedaA4.setCodigo("4");
        ruedaA5.setCodigo("5");

        ruedaB1.setCodigo("1");
        ruedaB2.setCodigo("2");
        ruedaB3.setCodigo("3");

        ruedaA1.setDiametro("13");
        ruedaA2.setDiametro("22");
        ruedaA3.setDiametro("17");
        ruedaA4.setDiametro("16");
        ruedaA5.setDiametro("15");

        ruedaB1.setDiametro("21");
        ruedaB2.setDiametro("16");
        ruedaB3.setDiametro("19");

        ruedaA1.setMarca("Michelin");
        ruedaA2.setMarca("Continental");
        ruedaA3.setMarca("Pirelli");
        ruedaA4.setMarca("Michelin");
        ruedaA5.setMarca("Pirelli");

        ruedaB1.setMarca("Pirelli");
        ruedaB2.setMarca("Continental");
        ruedaB3.setMarca("Michelin");

        ruedaA1.setModelo("Pilot");
        ruedaA2.setModelo("Alpine");
        ruedaA3.setModelo("Crossclimate");
        ruedaA4.setModelo("Alpine");
        ruedaA5.setModelo("Pilot");

        ruedaB1.setModelo("Pilot");
        ruedaB2.setModelo("Crossclimate");
        ruedaB3.setModelo("Alpine");


        motorA1.setCodigo("1");
        motorA2.setCodigo("2");

        motorB1.setCodigo("1");
        motorB2.setCodigo("2");

        motorA1.setModelo("V6");
        motorA2.setModelo("V8");

        motorB1.setModelo("V8");
        motorB2.setModelo("V6");

        motorA1.setCaballos(150);
        motorA2.setCaballos(80);

        motorB1.setCaballos(120);
        motorB2.setCaballos(180);

        motorA1.setCilindrada(200);
        motorA2.setCilindrada(100);

        motorB1.setCilindrada(150);
        motorB2.setCilindrada(300);


        cuadroMandoA1.setCodigo("1");
        cuadroMandoA2.setCodigo("2");
        cuadroMandoA3.setCodigo("3");
        cuadroMandoA4.setCodigo("4");

        cuadroMandoB1.setCodigo("1");
        cuadroMandoB2.setCodigo("2");

        cuadroMandoA1.setModelo("Estandar");
        cuadroMandoA2.setModelo("Estandar");
        cuadroMandoA3.setModelo("Clasico");
        cuadroMandoA4.setModelo("Clasico");

        cuadroMandoB1.setModelo("Estandar");
        cuadroMandoB2.setModelo("Clasico");

        //Introduzco los chasis que se han montado por código

        System.out.println("Chasis 1: "+ "Rueda: " +ruedaA1.getCodigo() + " ;Motor: "+motorA1.getCodigo() + " ;Cuadro de mandos: " +cuadroMandoA1.getCodigo());
        System.out.println("Chasis 2: "+ "Rueda: "+ruedaA2.getCodigo() + " ;Motor: "+motorB1.getCodigo() + " ;Cuadro de mandos: "+cuadroMandoA4.getCodigo() );
        System.out.println("Chasis 3: "+ "Rueda: "+ruedaA5.getCodigo() + " ;Motor: "+motorB2.getCodigo() + " ;Cuadro de mandos: "+cuadroMandoB1.getCodigo());
        System.out.println("Chasis 4: "+ "Rueda: "+ruedaB2.getCodigo() + " ;Motor: "+motorA2.getCodigo() + " ;Cuadro de mandos: "+cuadroMandoB2.getCodigo());


        System.out.println("Materiales que no se han utilizado a final del dia");
        System.out.println("Ruedas (Código): "+ ruedaA3.getCodigo()+" / "+ruedaA4.getCodigo()+" / "+ruedaB1.getCodigo());
        System.out.println("Motores: se utilizan todos");
        System.out.println("Cuadros de mandos (Código): "+ cuadroMandoA2.getCodigo()+" / "+cuadroMandoA3.getCodigo());

    }
}