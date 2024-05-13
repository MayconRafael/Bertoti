/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
public class Controller implements ControllerInterface{
    View view;
    Subject model;
    
    public Controller(Subject mo){
        this.model = mo;
        view = new View(model, this);
        view.createView();
        view.desabilitarBotaoCancelar();
    }
    
    public void assinar(){
        model.registerObserver(view);
        System.out.println("Assinatura do Jornal realizada");
        view.desabilitarBotaoAssinar();
        view.habilitarBotaoCancelar();
    }
    
    public void cancelar(){
        model.removeObserver(view);
        System.out.println("Assinatura cancelada");      
        view.desabilitarBotaoCancelar();
        view.habilitarBotaoAssinar(); 
    }
    
    public void sair(){       
        System.exit(0);        
    }
}
