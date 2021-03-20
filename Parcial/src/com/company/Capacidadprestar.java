package com.company;

public class Capacidadprestar

{
    double cash[]  = new double[200];
     double  moneyMax(int row, double cash[]){
            double Capprestamo= 0;
            double CapBanco = 0;
            for (int i = 0; i < row; i++)
            {
                 Capprestamo =  (cash[i]*0.90)+ Capprestamo;
            }
             Capprestamo +=  CapBanco;
                return Capprestamo ;
        }
}


