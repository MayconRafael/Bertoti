/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
public class Equipamento implements Component{
    private String nome;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public void mostrarEquipamento(){
        System.out.println(nome);
    }
}
