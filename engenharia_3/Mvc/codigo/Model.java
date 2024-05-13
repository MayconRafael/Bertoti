/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */

import java.util.*;

public class Model implements Subject{
    private ArrayList observers;
    private String noticia;    
    
    public Model(){
        observers = new ArrayList();
    }
    
    public void registerObserver(Observer o){
        observers.add(o);
    }
    
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    
    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(noticia);
        }
    }
    
    public void newsChanged(){
        notifyObservers();
    }
    
    public void setNews(String noticia){
        this.noticia = noticia;
        newsChanged();
    }
    
    public String getNoticia(){
        return noticia;
    }    
}
