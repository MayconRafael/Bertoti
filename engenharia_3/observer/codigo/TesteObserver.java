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
        Estacao e = new Estacao();
        Observador o1 = new Observador();
        Observador o2 = new Observador();
        e.addObserver(o1);
        e.addObserver(o2);
        e.setMes(1);
        e.removeObserver(o2);
        e.setMes(8);
    }
}
