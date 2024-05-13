/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
public class TesteComposite {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Equipamento equip1 = new Equipamento();
        equip1.setNome("Espada");
        
        Equipamento equip2 = new Equipamento();
        equip2.setNome("Machado");
        
        Equipamento equip3 = new Equipamento();
        equip3.setNome("Escudo");
        
        Guerreiro guerreiro1 = new Guerreiro();
        guerreiro1.add(equip1);
        guerreiro1.add(equip3);
        guerreiro1.mostrarEquipamento();
        
        Guerreiro guerreiro2 = new Guerreiro();
        guerreiro2.add(equip2);
        guerreiro2.add(equip3);
        guerreiro2.mostrarEquipamento();              
       
    }
}
