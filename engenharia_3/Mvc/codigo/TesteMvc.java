/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
public class TesteMvc {
    
    public static void main(String[] args) throws InterruptedException{ 
        final Model model = new Model();
        ControllerTrial controller = new ControllerTrial(model);
        
        String[] palavras = {
        "A selecao brasileira venceu!",
        "A selecao brasileira perdeu!",
        "Chuva forte no oeste!",
        "Chuva forte no leste!",
        "Chuva forte no sul!",
        "Chuva forte no norte!",
        "Aumento na producao de algodao",
        "São Paulo sofre com alagamentos!",
        "Putin visitara o Brasil!"
        };         
       
        while(true){
            int random = (int) (Math.random() * palavras.length);
            model.setNews("");
            model.setNews(palavras[random]);
            Thread.sleep(3000);            
        }             
    }
    
}
