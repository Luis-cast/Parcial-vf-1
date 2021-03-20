package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.lang.String;
public class Usuarios {

    // ya creado los usuarios, se procedio con la entrega, esta parte contempla los el área que manejaran los usuarios.
    Credenciales cred = new Credenciales();
    Scanner sc = new Scanner(System.in);

    int contPw = 0;
    int index = 0;
    int C = 0;
    public void login( int row,String name[],String pw[], double cash[] ) {
        System.out.println("\u001B[31m ################################ BIENVENIDO AL BANCO XYZ m################################");
        while (contPw <= 3) {
            System.out.println("\u001B[31m POR FAVOR INTRODUZCA SUS DATOS DE ACCESO");
            System.out.println("\u001B[31m USUARIO");
            String username = sc.nextLine();
            System.out.println("\u001B[31m CONTRASEÑA");
            String password = sc.nextLine();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
           //get index user
                    for (int i = 0; i < row; i++)
                    {
                        if (username.equals(name[i]))
                        {
                            index = i;
                        }
                        else {
                            index = -1;
                        }
                    }
              //validar saldo
            if ( cash[index] < 1500 )
            {
                System.out.println("\u001B[31m Saldo insuficiente, no es posible brindarle acceso a la plataforma");
                System.exit(0);
            }
        while (C < 4)
        {
            if (username.equals(name[index]) && password.equals(pw[index]))
             {
                 System.out.println("\u001B[31m Por favor actualizar su contraseña");
                 pw[index]= sc.nextLine();
                 System.out.println("\u001B[31m su nueva contraseña es:  "+ pw[index] ); //este imprimir solamente lo coloco para validar un cambio
                 System.out.println("\u001B[32m Hora de inicio de sesión "+ dtf.format(LocalDateTime.now()) );

                 C= 5;
             } else
                   {
                    System.out.println("\u001B[31m Datos incorrectos");
                    C++;
                  }
               if (C==4)
               {
                   System.out.println("\u001B[31m Número de intentos máximos superados, la aplicación finalizara automaticamente");
                   System.exit(0);
               }
        }
           Menu op = new  Menu();
           op.Option(index,name, pw,cash,row);
        }
    }
}