
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
public class Sentimento {  
    
    private ArrayList<String> sentimento = new ArrayList<String>(){
            {
                add("feliz");
                add("triste");
            }
    };  
    
    int random = (int) (Math.random() * sentimento.size());    
    
    public void getSentimento(){   
        System.out.print(sentimento.get(random)+ " ");
    }
}
