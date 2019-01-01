/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Listeners;

import Model.Teste;
import View.Frame.FrameCRUD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Drew
 */
public class ListenersCRUDTeste {
    //atributo que mantém referencia ao objeto da camada model
    private Teste teste;
    //Atributo que mantem referencia a camada view
    private FrameCRUD tela;
    
    public ListenersCRUDTeste(Teste teste, FrameCRUD tela) {
        //define o objeto teste
        this.teste = teste;
        //define a tela do cadastro
        this.tela = tela;
        //adiciona os listeners para os botoes
        adicionaCRUDListener();
    }
    
    private void adicionaCRUDListener() {
        JButton botao;
        
        //carrega e define o comportamento do botao novo
        botao = tela.getPainelBotoesCRUD().getBtnNovo();
        botao.addActionListener(new btnNovoActionListener());
        
        //carrega e define o comportamento do botao cancelar
        botao = tela.getPainelBotoesCRUD().getBtnCancela();
        botao.addActionListener(new btnCancelaActionListener());
        
        //carrega e define o comportamento do botao exclui
        botao = tela.getPainelBotoesCRUD().getBtnExclui();
        botao.addActionListener(new btnExcluirActionListener());
        
        //carrega e define o comportamento do botao novo
        botao = tela.getPainelBotoesCRUD().getBtnGrava();
        botao.addActionListener(new btnGravarActionLister());
    }
    
    /**
     * Classe interna que define o listener para o botao novo 
     */
    private class btnNovoActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            tela.limparCampos();
        }

    }
    
    /**
     * Classe interna que define o listener para o botao cancelar
     */
    private class btnCancelaActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            tela.dispose();
        }
        
    }
    
    private class btnExcluirActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int resposta = JOptionPane.showConfirmDialog(tela, "Deseja excluir este este teste?", "confirmar Exclusão",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
            
            if(resposta == JOptionPane.YES_NO_OPTION) {
                //chama classe conttroller que faz exclusão do objeto
                tela.limparCampos();
            }
        }
    }
    
    private class btnGravarActionLister implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //chama a classe que faz a inserção do objeto
            //fazer a classe que faz conexao com o banco
            
//            try {
//                // parte da  classe que faz conexao com o banco para inserir
//            } catch (Exception e) {
//                //apresenta o erro em uma mensagem para o usuário 
//                JOptionPane.showMessageDialog(tela, e.getMessage());
//                Logger.getLogger(ListenersCRUDTeste.class.getName()).log(Level.SEVERE, null, e);
//            }
            tela.limparCampos();
        }
        
    }
}
