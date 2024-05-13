/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
public class Porta {
    private static Porta instance;
    
    private Porta(){
    }
    
    public static Porta getInstance(){
        if(instance == null){
            System.out.println("Criando uma instancia de Porta");
            instance = new Porta();
        }
        System.out.println("Retornado a instancia da Porta");
        return instance;
    }
    
    public void abrir(){
        System.out.println("Aberto!");
    }
    
    public void fechar(){
        System.out.println("Fechado!");
    }
}
