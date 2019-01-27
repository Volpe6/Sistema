/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import View.Listeners.MenuPrincipal;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;

/**
 *
 * @author Drew
 */
public class FrameSistema extends JFrame {
    //Dimensão da tela principal
    private static Dimension dimensaoTelaPrincipal;
    //Painel para adicionar as telas internas (JInternalFrame)
    private JDesktopPane desktop;
    // Container da tela principal
    private Container containerPrincipal;
    // Barra de menu da aplicação
    private JMenuBar menuPrincipal;
    
    public FrameSistema() {
        //define titulo da area principal
        super.setTitle("Teste");
        //Define a dimensão da tela principal
        dimensaoTelaPrincipal = new Dimension(800, 600);
        super.setSize(dimensaoTelaPrincipal);
        //Métodos reponsáveis pelas construção da GUI da tela principal
        inicializaDesktopPane();
        adicionaMenuPrincipal();
        //define alguns parametros para a gui 
        super.setResizable(false);
        super.setLocationRelativeTo(null);
        //Encerra a thread da aplicação quando a tela principal for fechada
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * Método responsavel por criar o desktopPanel da aplicação, onde serão inseridas as telas internas da aplicação 
     */
    private void inicializaDesktopPane() {
        //instancia painel principal da aplicação, onde as telas internas serão exibidas
        desktop            = new JDesktopPane();
        //pega o panel da jframe
        containerPrincipal = super.getContentPane();
        // Adiciona o desktopPanel no container da JFrame
        containerPrincipal.add(desktop, BorderLayout.CENTER);
        //Permite arrastar as telas dentro do container
        desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
    }
    
    /**
     * Método responsavel por adicionar o menu principal da aplicação
     */
    public void adicionaMenuPrincipal() {
        menuPrincipal = new MenuPrincipal(this);
        //adiciona a barra de menu na tela principal
        super.setJMenuBar(menuPrincipal);
    }
    
    /**
     * Método que Adiciona um JInternarFrame na tela principal da aplicação
     */
    public void adicionaFrameInterno(JInternalFrame  frame) {
        // Insere a instancia de um JInternalFrame no DesktopPanel da aplicação
        desktop.add(frame);
    }
    
    public void abre(JInternalFrame janela) {
        boolean bExiste = false;
        for(JInternalFrame frame : desktop.getAllFrames()) {
            if(janela.getTitle().equals(frame.getTitle())) {
                bExiste = true;
            }
        }
        
        if(!bExiste) {
            adicionaFrameInterno(janela);
            janela.setVisible(true);
        }
    }
}
