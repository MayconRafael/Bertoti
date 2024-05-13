
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
public class Idade {   
    private ArrayList<String> idade = new ArrayList<String>(){
            {
                add("jovem");
                add("velho");
            }
    }; 
    
    int random = (int) (Math.random() * idade.size());    
    
    public void getIdade(){   
        System.out.print(idade.get(random)+ " ");
    }
}
