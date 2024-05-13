/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
public class Facade {
    Idade idade = new Idade();   
    Tamanho tam = new Tamanho();
    Sentimento sent = new Sentimento();    
    
    public void funcTamanho(){
        idade.getIdade();
        tam.getTamanho();
    }
    
    public void funcAlegria(){
        idade.getIdade();
        sent.getSentimento();
    }
}
