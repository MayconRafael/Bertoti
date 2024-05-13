/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fatec
 */
import java.util.*;

public class Estacao implements Observer{  
    private int mes = 1;
    private String est; 
    private Observador observador;
    
    public Estacao(Observador observador){
        this.observador = observador;
        observador.addObserver(this);
    }
    
    public void calcEstacao(){
        if(mes >= 1 &&  mes <= 3){
            est = "Verao"; 
            System.out.print(est);
        } else if(mes >= 4 &&  mes <= 6){
            est = "Inverno"; 
            System.out.print(est);
        } else if(mes >= 7 &&  mes <= 9){            
            est = "Outono";   
            System.out.print(est);
        } else {
            est = "Primavera";   
            System.out.print(est);
        }
    }
    
    public void update(int m){
        this.mes = m;
        mostrarEstacao();        
    }
    
    public void mostrarEstacao(){
       System.out.print("A estacao e ");
       calcEstacao(); 
       System.out.println();
    }
}
