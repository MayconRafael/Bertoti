/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fatec
 */
public class Livro {
    
    private Leitura leitura;
    
    public void setLeitura(Leitura leitura){
        this.leitura = leitura;
    }
    
    public void realizarLeitura(){
        leitura.ler();
    }
    
}
