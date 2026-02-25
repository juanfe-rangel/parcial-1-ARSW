package edu.eci.arsw.math;


import static edu.eci.arsw.math.Main.bytesToHex;

public class CounterThread extends Thread{
    private int inicio;
    private int fin;

    public CounterThread(){
    }

    @Override
    public void run(){
        contar();
    }
    public void contar(){
        System.out.println(bytesToHex(PiDigits.getDigits(inicio, fin)));
    }
    public void setInicio(int inicio){
        this.inicio = inicio;
    }
    public void setFin(int fin) {
        this.fin = fin;
    }
}
