package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Credenciales {


  String name[]  = new String[200];
      String pw[]  = new String[200];
      double cash[]  = new double[200];

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getPw() {
        return pw;
    }

    public void setPw(String[] pw) {
        this.pw = pw;
    }

    public double[] getCash() {
        return cash;
    }

    public void setCash(double[] cash) {
        this.cash = cash;
    }
}
