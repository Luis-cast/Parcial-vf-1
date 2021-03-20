package com.company;
import java.util.Scanner;
import java.util.Arrays;
// Suponiendo que somos un banco esta sección se encarga de crear los usuarios que registraremos y probaran el programa
    public class  Register {

        public void DataInsert  (){
            Scanner sc = new Scanner(System.in);
            Usuarios us = new Usuarios();
            System.out.println("\u001B[31m Bienvenido al sistema de gestión del banco xyz");
            System.out.println("\u001B[31m Por favor introduzca los registros a la base de datos de nuestros clientes ");
            System.out.println("\u001B[31m Ingrese el número de registros que desea trabajar");
            Credenciales cre = new Credenciales();
            int row=sc.nextInt() ;
            sc.nextLine();
            for (int i = 0; i < row; i++)
            {
                System.out.println("\u001B[31m Ingrese Nombre  "+ (i+1));
                cre.name[i] = sc.nextLine();
                System.out.println("\u001B[31m Ingrese la contraseña del usuario:" + (i+1));
                cre.pw[i] = sc.nextLine();
                System.out.println("\u001B[31m Ingrese la cantidad de dinero de la cuenta "+ (i+1) );
                cre.cash[i] = sc.nextInt();
                sc.nextLine();
            }
            us.login(row, cre.name,cre.pw,cre.cash);

        }
    }


