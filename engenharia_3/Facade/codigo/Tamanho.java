
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
public class Tamanho {
    private ArrayList<String> tamanho = new ArrayList<String>(){
            {
                add("baixo");
                add("alto");
            }
    }; 
    
    int random = (int) (Math.random() * tamanho.size());    
    
    public void getTamanho(){   
        System.out.print(tamanho.get(random)+ " ");
    }
}
