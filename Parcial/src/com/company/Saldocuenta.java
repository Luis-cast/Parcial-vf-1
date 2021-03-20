package com.company;
public class Saldocuenta {

    Credenciales sal = new  Credenciales();

    boolean ValidUser (double saldoCuenta){

         if(saldoCuenta >= 1500){

                return true;
            } else{
            return  false;
         }
    }
}
