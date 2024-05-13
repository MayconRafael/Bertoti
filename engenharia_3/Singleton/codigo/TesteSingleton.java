/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
public class TesteSingleton {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Porta porta1 = Porta.getInstance();
        porta1.abrir();        
        Porta porta2 = Porta.getInstance();     
    }
}
