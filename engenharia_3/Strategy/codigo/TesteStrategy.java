/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
public class TesteStrategy {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro leitura = new Livro();
        leitura.setLeitura(new Aventura());
        leitura.realizarLeitura();
        leitura.setLeitura(new Drama());
        leitura.realizarLeitura();
        leitura.setLeitura(new Comedia());
        leitura.realizarLeitura();
    }
}
