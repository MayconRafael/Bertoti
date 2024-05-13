/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
import java.util.ArrayList;

public class Guerreiro implements Component{   
    ArrayList<Component> components = new ArrayList<Component>();
    private String nome;   
    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public void add(Component component){
        components.add(component);
    }
    
    public void remove(Component component){
        components.remove(component);
    }
    
    public void mostrarEquipamento(){
        components.forEach(Component::mostrarEquipamento);
    }
    
}
