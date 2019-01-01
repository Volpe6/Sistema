/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Listeners;

import Model.Teste;
import Principal.FrameSistema;
import View.Frame.FrameCRUDTeste;
import java.awt.event.ActionEvent;

/**
 *
 * @author Drew
 */
public class MenuTesteActionListener extends MenuActionListener {
     
    public MenuTesteActionListener(FrameSistema tela) {
        super(tela);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //define objeto da camada de modelo
        Teste teste = new Teste();
        //define o  objeto da camada view (JInternalFrame)
        frame = new FrameCRUDTeste(teste);
        ((FrameCRUDTeste) frame).setTeste(teste);
        //define o controller para um cadastro crudteste
        ListenersCRUDTeste listenerTeste = new ListenersCRUDTeste(teste, frame);
        //insere 
        tela.adicionaFrameInterno(frame);
        frame.setVisible(true);
    }
}
