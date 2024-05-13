/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fatec
 */
import java.util.*;

public class Observador{
    
    private List<Observer> observers;
    private int mes = 1;
    private String est;     
    
    public Observador(){
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
        this.mes = m;
        notifyObservers();
    }   
    
    public int getMes() {
	return mes;
    }
    
    public String getEstacao() {
	return est;
    }
    
}
