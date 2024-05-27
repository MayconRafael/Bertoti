/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fatec
 */

public class Observador implements Observer{   

    private int mes;
    
    public void update(int m){
        mes = m;
        display();        
    }

    public void display(){
        if(mes >= 1 &&  mes <= 3){      
            System.out.println("A estacao e verao");          
        } else if(mes >= 4 &&  mes <= 6){
            System.out.println("A estacao e inverno"); 
        } else if(mes >= 7 &&  mes <= 9){            
            System.out.println("A estacao e outono"); 
        } else {
            System.out.println("A estacao e primavera"); 
        }          
    }
}
