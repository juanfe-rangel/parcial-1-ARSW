package edu.eci.arsw.math;

import java.util.ArrayList;

public class GestorHilos {
    private ArrayList<CounterThread> listaHilos;
    private int intervalo;
    private int inicio;
    private int fin;

    public GestorHilos(){

    }
    public void dividirHilos(){
        intervalo = fin/listaHilos.size();
        inicio =0;
        fin = intervalo;
        for(CounterThread t : listaHilos){
            t.setInicio(inicio);
            t.setFin(fin);
            inicio = inicio + intervalo;
            fin = intervalo + fin;
        }
    }

    public void CorrerHilos(){
        for(CounterThread t: listaHilos){
            t.start();
        }
    }

    public void SetHilos(int i){
        for(int t = 0;t<i;t++){
            CounterThread r = new CounterThread();
            listaHilos.add(r);
        }

    }

    public void setFin(int fin) {
        this.fin = fin;
    }
}
