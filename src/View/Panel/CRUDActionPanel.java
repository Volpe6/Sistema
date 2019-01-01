/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Panel;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Drew
 */
public class CRUDActionPanel extends JPanel{
    
    // Botoes para as funcionalidades
    private JButton btnNovo;
    private JButton btnGrava;
    private JButton btnExclui;
    private JButton btnCancela;
    
    // gerenciador de layout
    private LayoutManager layout;
    
    // dimensão do botao
    private Dimension dimensaoBotao;
    // dimensao do panel
    private Dimension dimensaoPanel;
    
    /**
     * Container onde onde o penel sera adicionado 
     */
    private Container container;
    
    /**
     * Construtor do panel para o funcionamento dos formularios tipo crud
     * 
     * @param container - Container onde o paniel de botões devera ser inseridos
     */
    public CRUDActionPanel(Container container) {
        // Define container
        this.container = container;
        
        //constrói o panel com os botoes
        InicializaComponentes();
        adicionaComponentes();
        
        //Parametrização do JPanel
        super.setVisible(true);
        super.setSize(dimensaoPanel);       
    }
    
    /**
     * Inicializa os componentes    
     */
    private void InicializaComponentes() {
        defineTamanhoPadraoBotaoPanel();
        defineLayout();
        defineBotoes();
        defineDimensaoPadraoBotoes();
    }
    
    /**
     * Define layout padrao do painel de ações
     */
    private void defineLayout() {
        layout = new FlowLayout(FlowLayout.CENTER);
    }
    
    /**
     * Define a dimensão padrao dos botoes, e do panel com base na largura definida no container
     */
    private void defineTamanhoPadraoBotaoPanel() {
        dimensaoBotao = new Dimension(100, 20);
        dimensaoPanel = new Dimension(container.getWidth(), 30);
    }
    
    /**
     * Define os botoes padrao
     */
    private void defineBotoes() {
        btnCancela = new JButton("Cancelar");
        btnExclui  = new JButton("Exclui");
        btnGrava   = new JButton("Grava");
        btnNovo    = new JButton("Novo");
    }
    
    /**
     * Define a dimensão padrao dos botoes
     */
    private void defineDimensaoPadraoBotoes() {
        btnCancela.setSize(dimensaoBotao);
        btnExclui.setSize(dimensaoBotao);
        btnGrava.setSize(dimensaoBotao);
        btnNovo.setSize(dimensaoBotao);
    }
    
    /**
     * Adiciona componentes no JPanel
     */
    private void adicionaComponentes() {
        // Define o gerenciador de layout
        this.setLayout(layout);
        
        //adiciona os botoes no JPanel
        this.add(btnCancela);
        this.add(btnExclui);
        this.add(btnGrava);
        this.add(btnNovo);
    }
    
    /**
     * Método que retorna o botão cancelar do painel crud
     * 
     * @return JButton para funcionalidade cancelar 
     */
    public JButton getBtnCancela() {
        return btnCancela;
    }
    
    /**
     * Método que retorna o botão exclui do painel crud
     * 
     * @return JButton para funcionalidade excluir
     */
    public JButton getBtnExclui() {
        return btnExclui;
    }
    
    /**
     * Método que retorna o botão gravar do painel crud
     * 
     * @return JButton para funcionalidade gravar
     */
    public JButton getBtnGrava() {
        return btnGrava;
    }
    
    /**
     * Método que retorna o botão novo do painel crud
     * 
     * @return JButton para funcionalidade novo
     */
    public JButton getBtnNovo() {
        return btnNovo;
    }
}