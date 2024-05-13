/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Manhã
 */
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class View implements ActionListener, Observer{
    private Subject model;
    private ControllerInterface controller;
    private String noticia = "";
    
    JFrame frame;
    JPanel panelBotoes;
    JPanel panelDados;
    JPanel panelNoticia;
    JLabel labelNoticia;
    JLabel noticiaText;
    JButton assinar;
    JButton cancelar;
    JButton sair;
    
    public View(Subject mo, ControllerInterface co){
        this.model = mo;
        this.controller = co;
    }
    
    public void createView(){
        frame = new JFrame("Jornal");
        panelBotoes = new JPanel();
        panelDados = new JPanel();
        panelNoticia = new JPanel();
        labelNoticia = new JLabel();        
        noticiaText = new JLabel("Noticia");
        assinar = new JButton("Assinar jornal");
        cancelar = new JButton("Cancelar assinatura");      
        sair = new JButton("Sair"); 
        
        assinar.addActionListener(this);
        cancelar.addActionListener(this);
        sair.addActionListener(this);
        
        panelBotoes.add(assinar);
        panelBotoes.add(cancelar);
        panelBotoes.add(sair);
        panelNoticia.add(noticiaText);
        panelNoticia.add(labelNoticia);
        panelDados.add(panelNoticia);
        frame.getContentPane().add(BorderLayout.SOUTH, panelBotoes);
        frame.getContentPane().add(BorderLayout.CENTER, panelDados);
        
        labelNoticia.setText(noticia);
        
        frame.setSize(350, 200);
        frame.setVisible(true);
    }    
    
    public void update(String n){
        noticia = n;
        display();
    }
    
    public void display(){
        labelNoticia.setText(noticia);
    }
    
    public void habilitarBotaoAssinar(){
        assinar.setEnabled(true);
    }
    
    public void desabilitarBotaoAssinar(){
        assinar.setEnabled(false);
    }
    
    public void habilitarBotaoCancelar(){
        cancelar.setEnabled(true);
    }
    
    public void desabilitarBotaoCancelar(){
        cancelar.setEnabled(false);
    }
    
    public void actionPerformed(ActionEvent event){
        if(event.getSource() == assinar){
            controller.assinar();
            noticiaText.setText("");
        }        
        if(event.getSource() == cancelar){
            controller.cancelar();   
            labelNoticia.setText("");
            labelNoticia.setText("Noticia");
        }
        if(event.getSource() == sair){
            controller.sair();
        }
    }
}
