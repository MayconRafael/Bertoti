/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fatec
 */
import java.util.*;

public class Estacao{    
    
    private int mes;
  
    private List<Observer> observers;
    
    public Estacao(){
        observers = new ArrayList<Observer>();
    }
    
    public void addObserver(Observer o){
        observers.add(o);
    }
    
    public void removeObserver(Observer o){
        observers.remove(o);
    }
   
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(mes);
        }
    }
    
    public void setMes(int m){
        mes = m;
        notifyObservers();
    }
}
