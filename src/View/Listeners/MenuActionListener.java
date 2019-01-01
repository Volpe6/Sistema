/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Listeners;

import Principal.FrameSistema;
import View.Frame.FrameCRUD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Drew
 */
public abstract class MenuActionListener implements ActionListener {
    //JInternalFrame que devera ser construida
    protected FrameCRUD frame;
    //(Tela principal da aplicação) onde as JInternalFrame deverão ser exibidas
    protected final FrameSistema tela;
    
    /**
     * Construtor do menuActionListener
     * 
     * @param tela parent na qual a JInternalFrame deverá ser construida
     */
    public MenuActionListener(FrameSistema tela) {
        this.tela = tela;
    }
}
