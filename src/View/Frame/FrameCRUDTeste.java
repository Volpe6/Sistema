/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Frame;

import Model.Teste;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Drew
 */
public class FrameCRUDTeste extends FrameCRUD {
    private static final Dimension dimension = new Dimension(400, 200);

    private Teste teste;
    
    private Label lblCampo1;
    private Label lblCampo2;
    private Label lblCampo3;
    private Label lblCampo4;
    private Label lblCampo5;
    
    private JTextField tfCampo1;
    private JTextField tfCampo2;
    private JTextField tfCampo3;
    private JTextField tfCampo4;
    private JTextField tfCampo5;
    
    private JPanel formulario;
    private LayoutManager layout;
    private GridBagConstraints cons;
    
    public FrameCRUDTeste(Teste teste) {
        super("Teste", dimension);
        this.teste = teste;
        inicializaComponentes();
        adicionaComponentes();
    }
    
    public void setTeste(Teste teste) {
        this.teste = teste;
        carregaCampos();
    }

    private void inicializaComponentes() {
        lblCampo1 = new Label("campo 1");
        lblCampo2 = new Label("campo 2");
        lblCampo3 = new Label("campo 3");
        lblCampo4 = new Label("campo 4");
        lblCampo5 = new Label("campo 5");
        
        tfCampo1 = new JTextField();
        tfCampo2 = new JTextField();
        tfCampo3 = new JTextField();
        tfCampo4 = new JTextField();
        tfCampo5 = new JTextField();
        
        layout = new GridBagLayout();
        formulario = new JPanel(layout);
        formulario.setBorder(BorderFactory.createTitledBorder("teste"));
    }
    @Override
    public void carregaCampos() {
        tfCampo1.setText("tesr");
        tfCampo2.setText("tesr");
        tfCampo3.setText("tesr");
        tfCampo4.setText("tesr");
        tfCampo5.setText("tesr");
    }

    @Override
    public void limparCampos() {
        this.teste = new Teste();
        carregaCampos();
        super.repaint();
    }
    
    private void adicionaComponentes() {
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        formulario.add(lblCampo1, cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 50;
        formulario.add(tfCampo1, cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 2;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        formulario.add(lblCampo2, cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 3;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 50;
        formulario.add(tfCampo2, cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        formulario.add(lblCampo3, cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 50;
        formulario.add(tfCampo3, cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 2;
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        formulario.add(lblCampo4, cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 3;
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 50;
        formulario.add(tfCampo4, cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 0;
        cons.gridy = 2;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        formulario.add(lblCampo5, cons);
        
        cons = new GridBagConstraints();
        cons.gridx = 1;
        cons.gridy = 2;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.HORIZONTAL;
        cons.ipadx = 50;
        formulario.add(tfCampo5, cons);
        
        super.adicionaFornulario(formulario);
    }
    
    
    
}
