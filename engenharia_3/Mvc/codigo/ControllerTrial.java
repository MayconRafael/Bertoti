/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
import java.util.Timer;
import java.util.TimerTask;

public class ControllerTrial implements ControllerInterface{
    View view;
    Subject model;
    
    public ControllerTrial(Subject mo){
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
        
        final Timer timerCancela = new Timer();
            timerCancela.schedule(new TimerTask() {
	    public void run() {
                cancelar();
	    }
	}, 17000);                
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
