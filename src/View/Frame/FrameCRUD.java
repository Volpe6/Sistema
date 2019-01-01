/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Frame;

import View.Panel.CRUDActionPanel;
import com.sun.xml.internal.ws.handler.HandlerException;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

/**
 *
 * @author Drew
 */
public abstract class FrameCRUD extends JInternalFrame{
    
    /* JPanel pricipal do JInternalFrame, que sera utilizado como container nos 
       demais componentes*/
    private JPanel          panelPrincipal;
    
    // Painel contendo os botões de funcionalidade da tela do tipo crud
    private CRUDActionPanel painelBotoesCrud;
    
    // Dimensao para JInternalFrame
    private Dimension       dimensao;
    
    /* Gerenciador de layout que definirá a disposição dos objetos adicionados
       no panel*/
    private LayoutManager   layout;
    
    public FrameCRUD(String titulo, Dimension dimensao) throws HandlerException {
        // define o atributo dimensao
        this.dimensao = dimensao;
        
        // Constrói o JInternalFrame
        inicializaComponentes();
        adicionaComponentes();
        
        //Parametrização da GUI 
        super.setSize(dimensao);
        super.setTitle(titulo);
        super.setLayout(layout);
        
        //Encerra a thread quando o frame é encerrado, isto serve nos casos onde a JFrame e/ou JInternalFrame roda uma Thread exclusiva
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * Método que instancia os objetos que serão utilizados na JInternalFrame
     */
    private void inicializaComponentes() {
        definePainelPrincipal();
        definePanelCrud();
        defineLayout();
    }
    
    /**
     * Método que adiciona os componenetes no container da JInternalFrame
     */
    private void adicionaComponentes() {
        //define container
        this.setContentPane(panelPrincipal);
        
        //adciona o painel com os botoes crud na JInternalFrame
        panelPrincipal.add(painelBotoesCrud, BorderLayout.SOUTH);
    }
    
    /**
     * Define o painel principal da tela
     */
    private void definePainelPrincipal() {
        panelPrincipal = new JPanel();
        panelPrincipal.setSize(dimensao);
    }
    
    /**
     * Definel o panel com os botões de funcionamento do crud
     */
    private void definePanelCrud() {
        painelBotoesCrud = new CRUDActionPanel(this);
    }
    
    /**
     * Define o gerenciador de layout
     */
    private void defineLayout() {
        layout = new BorderLayout();
        panelPrincipal.setLayout(layout);
    }
    
    /**
     * Método que permite inserir um painel contendo os campos do fornulario na JInternalFrame
     * 
     * @param container - Panel que deverá ser adicionado
     */
    public void adicionaFornulario(Container container) {
        // Adiciona o container na posição central do formulário
        panelPrincipal.add(container, BorderLayout.CENTER);
    }
    
    /**
     * Método que permite pegar o paninel com os botões crud
     * 
     * @return CRUDAcitionPanel contendo os botões para as funcionalidades do tipo crud
     */
    public CRUDActionPanel getPainelBotoesCRUD() {
        return painelBotoesCrud;
    }
    
    /**
     * Método abstrato que deverá ser implementado nas classes filhas para limpar os campos do formulário
     */
    public abstract void limparCampos();
    
    /**
     * Método abstrato que deverá ser implementado  nas classes filhas para carregar os campos do formulário
     */
    public abstract void carregaCampos();
}
