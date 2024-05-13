/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
public class TesteObserver {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Observador estacao1 = new Observador();
        
        Estacao observer1 = new Estacao(estacao1);
        Estacao observer2 = new Estacao(estacao1);        
        
        estacao1.setMes(1);
        
        estacao1.removeObserver(observer2);
        
        estacao1.setMes(6);
    }
}
