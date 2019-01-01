/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Listeners;

import Principal.FrameSistema;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Drew
 */
public class MenuPrincipal extends JMenuBar {
    //Menus
    private JMenu     teste;// menu que aparece na barra de menus
    private JMenuItem teste1;// item dentro do menu
    
    //container onde o menu será adicionado
    private FrameSistema tela;
    
    public MenuPrincipal(FrameSistema frame) {
        super();
        this.tela = frame;
        
        //instancia os objetos
        inicializaComponentes();
        //constrói o menuBar
        construirMenu();
        
        //adiciona os Listeners aos menus
        adicionaListenersMenu();
    }
    
    private void inicializaComponentes() {
        criaMenus();
    }
    
    /**
     * Método responsavel pela instanciação dos objetos que compõe o menubar da aplicação 
     */
    private void criaMenus() {
        teste  = new JMenu("Teste");
        teste1 = new JMenuItem("Teste Item");
    }
    
    private void construirMenu() {
        teste.add(teste1);
        super.add(teste);
    }
    
    /**
     * Método responsavel por adicionar os listeners para os menus
     */
    private void adicionaListenersMenu() {
        menuTeste();
        
    }
    
    private void menuTeste() {
        ActionListener listener = new MenuTesteActionListener(tela);
        //Adiciona listener para o item 
        teste1.addActionListener(listener);
            
    }
}
