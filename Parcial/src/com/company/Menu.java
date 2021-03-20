package com.company;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Menu {
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
   double Deuda =0;

  Scanner sc = new Scanner(System.in);
    Capacidadprestar cp = new  Capacidadprestar();


    public String Option (int index, String name[],String pw[], double cash[] , int row ) {
        double cap;
        cap =  cp.moneyMax(row,cash);;
        while (true) {
            System.out.println("\u001B[0m################################ Menu m################################");
            System.out.println("\u001B[0m Nota: Ingrese el numero de la acción que desea realizar");
            System.out.println("\u001B[0m 1.) Movimientos de saldo");
            System.out.println("\u001B[0m 2.) Solicitar un Crédito");
            System.out.println("\u001B[0m 3.) Cambiar Contraseña");
            System.out.println("\u001B[0m 4.) Salir");
            System.out.println("\u001B[0m Ingrese la opción de menu a la que desea ingresar: ");
           String menu = sc.nextLine();
           switch (menu) {
               case "1":
                  MovimientoCuenta.MovimientoCuentaUser1();
                   System.out.println("\u001B[31m Su saldo actual es de "+  cash[index]);
                    break;
               case "2":
                    System.out.println("\u001B[31m ###################Solicitud de prestamos###################");
                   System.out.println("\u001B[31m Todas las transacciones seran recibidas y revisadas en un plazo de  96 Horas");
                    System.out.println("\u001B[31m Ingrese el monto que desea que desea recibir");
                    double monto = sc.nextInt();
                   sc.nextLine();
                    Deuda = (monto * 0.30) + monto +  Deuda;
                 if ( cap >= monto){
                     cap=  cap - monto;
                     cash[index] +=monto;
                     System.out.println("\u001B[31m Su saldo tras el prestamo realizado es de:  "+  cash[index]);
                     System.out.println("\u001B[31m Le correspondera pagar para saldar la deuda un total de "+ Deuda);
                    } else {
                       System.out.println("\u001B[31m IMPOSIBLE REALIZAR TRANSACCIÓN");
                    }
                    break;
                case "3":
                        System.out.println("\u001B[31m Por favor actualizar su contraseña");
                         pw[index]= sc.nextLine();
                        System.out.println("\u001B[31m La contraseña actualizada es: " + pw[index] );
                break;
                case "4":
                    System.out.println("\u001B[0m######## Salir ########");
                    System.out.println("\u001B[32m Gracias por preferir al banco xyz ");
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                    System.out.println("\u001B[32m Sesión cerrada a las "+ dtf.format(LocalDateTime.now()) );
                   System.exit(0);
                    break;
                default:
                    System.out.println("\u001B[31m La opción seleccionada es invalida ");
           }
        }
    }
}
