/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Conexao;
import controller.fichario.CaixaFichario;
import controller.fichario.FuncionarioFichario;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import model.Caixa;
import model.Funcionario;
import model.Sala;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Win10 x64
 */
public class DialogGerCaixa extends javax.swing.JDialog {
    private ArrayList<Caixa> listCaixa;
    private ArrayList<Funcionario> listFunc;

    private CaixaFichario fixCaixa;
    private FuncionarioFichario fixFunc;
    
    private Border borderDefault;


    /**
     * Creates new form DialogGerCaixa
     */
    public DialogGerCaixa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        borderDefault = tfNumero.getBorder();
        tfNumero.addKeyListener(listenerTfNumber);
        
        cbxEscolher.setVisible(false);
        jiformativo.setVisible(false);

        pnIncluir.setVisible(false);

        try {
            fixCaixa = new CaixaFichario();
            fixFunc = new FuncionarioFichario();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro de conex??o, ERRO: " + sqlex.getMessage(), "ERROR CAIXA", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupBtnCrudCaixa = new javax.swing.ButtonGroup();
        lbTitulo = new javax.swing.JLabel();
        jiformativo1 = new javax.swing.JLabel();
        rbIncluir = new javax.swing.JRadioButton();
        rbExcluir = new javax.swing.JRadioButton();
        rbAlterar = new javax.swing.JRadioButton();
        rbConsultar = new javax.swing.JRadioButton();
        btnConcluido = new javax.swing.JButton();
        cbxEscolher = new javax.swing.JComboBox<>();
        jiformativo = new javax.swing.JLabel();
        pnIncluir = new javax.swing.JPanel();
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbxFunc = new javax.swing.JComboBox<>();
        lbFuncionario = new javax.swing.JLabel();
        btnRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Caixa");

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Gerenciamento de Caixa");

        jiformativo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jiformativo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jiformativo1.setText("MENU");

        GroupBtnCrudCaixa.add(rbIncluir);
        rbIncluir.setText("INCLUIR");
        rbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIncluirActionPerformed(evt);
            }
        });

        GroupBtnCrudCaixa.add(rbExcluir);
        rbExcluir.setText("EXCLUIR");
        rbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbExcluirActionPerformed(evt);
            }
        });

        GroupBtnCrudCaixa.add(rbAlterar);
        rbAlterar.setText("ALTERAR");
        rbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlterarActionPerformed(evt);
            }
        });

        GroupBtnCrudCaixa.add(rbConsultar);
        rbConsultar.setText("CONSULTAR");
        rbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConsultarActionPerformed(evt);
            }
        });

        btnConcluido.setText("Conclu??do");
        btnConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluidoActionPerformed(evt);
            }
        });

        cbxEscolher.setName(""); // NOI18N
        cbxEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEscolherActionPerformed(evt);
            }
        });

        jiformativo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jiformativo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jiformativo.setText("Escolha o n??mero do caixa:");

        pnIncluir.setBackground(new java.awt.Color(250, 250, 250));

        lbNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNumero.setText("N??mero:");

        tfNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumeroKeyTyped(evt);
            }
        });

        btnIncluir.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnIncluir.setText("INCLUIR");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cbxFunc.setName(""); // NOI18N
        cbxFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFuncActionPerformed(evt);
            }
        });

        lbFuncionario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbFuncionario.setText("Funcion??rio:");

        javax.swing.GroupLayout pnIncluirLayout = new javax.swing.GroupLayout(pnIncluir);
        pnIncluir.setLayout(pnIncluirLayout);
        pnIncluirLayout.setHorizontalGroup(
            pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIncluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(tfNumero))
                        .addGap(18, 18, 18)
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxFunc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnIncluirLayout.setVerticalGroup(
            pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIncluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addComponent(lbNumero)
                        .addGap(6, 6, 6)
                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addComponent(lbFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnRelatorio.setText("Relat??rio");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRelatorio)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConcluido)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rbIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jiformativo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbConsultar))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jiformativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxEscolher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(25, 25, 25)
                        .addComponent(pnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jiformativo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbExcluir))
                            .addComponent(jiformativo, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbxEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addComponent(rbAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConcluido))
                    .addComponent(pnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRelatorio)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIncluirActionPerformed
        cbxEscolher.setVisible(false);
        jiformativo.setVisible(false);
        configCaixa();
        
        popularJComboBoxFunc();

        pnIncluir.setVisible(true);

        btnIncluir.setText("INCLUIR");
    }//GEN-LAST:event_rbIncluirActionPerformed

    private void rbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbExcluirActionPerformed
        if (qtdCaixa() > 0) {
            restart();
            configCaixa();
            cbxEscolher.setVisible(true);
            jiformativo.setVisible(true);
            popularJComboBox();
        } else
        JOptionPane.showMessageDialog(this, "A lista est?? VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbExcluirActionPerformed

    private void rbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlterarActionPerformed
        if (qtdCaixa() > 0) {
            restart();
            configCaixa();
            cbxEscolher.setVisible(true);
            jiformativo.setVisible(true);
            popularJComboBox();
        } else
        JOptionPane.showMessageDialog(this, "A lista est?? VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbAlterarActionPerformed

    private void rbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConsultarActionPerformed
        if (qtdCaixa() > 0) {
            cbxEscolher.setVisible(true);
            jiformativo.setVisible(true);

            btnIncluir.setVisible(false);
            btnCancelar.setVisible(false);

            popularJComboBoxFunc();
            popularJComboBox();
            
            for (int i = 0; i < pnIncluir.getComponentCount(); i++) {
                Component c = pnIncluir.getComponent(i);

                if (c instanceof JTextField) {
                    JTextField field = (JTextField) c;

                    field.setBorder(borderDefault);
                }
            }
        } else
        JOptionPane.showMessageDialog(this, "A lista est?? VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbConsultarActionPerformed

    private void btnConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluidoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnConcluidoActionPerformed

    private void cbxEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEscolherActionPerformed
        if (cbxEscolher.getSelectedIndex() >= 0) {
            pnIncluir.setVisible(true);

            Caixa cashier = listCaixa.get(cbxEscolher.getSelectedIndex());

            tfNumero.setText(cashier.getNumero() + "");
            cbxFunc.setSelectedIndex(posicaoFuncNoArray(cashier.getFuncionario()));


            if (rbAlterar.isSelected()) {
                btnIncluir.setText("ALTERAR");

                tfNumero.setEditable(true);
                cbxFunc.setEnabled(true);
                //CheckBoxVipSim.setEditable(true);
            } else if (rbExcluir.isSelected()) {
                btnCancelar.setVisible(true);
                btnIncluir.setVisible(true);
                btnIncluir.setText("EXCLUIR");

                tfNumero.setEditable(false);
                cbxFunc.setEnabled(false);
            } else if (rbConsultar.isSelected()) {
                btnCancelar.setVisible(false);
                btnIncluir.setVisible(false);

                tfNumero.setEditable(false);
                cbxFunc.setEnabled(false);
            }
        }
    }//GEN-LAST:event_cbxEscolherActionPerformed

    private void tfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroKeyTyped
//        String caracteres = "0987654321";
//        if (!caracteres.contains(evt.getKeyChar() + "")) {
//            evt.consume();
//
//            Border lineBorder = BorderFactory.createLineBorder(Color.getColor(caracteres, 0XEC2E2E));
//            tfNumero.setBorder(lineBorder);
//
//        } else {
//            tfNumero.setBorder(borderDefault);
//        }
    }//GEN-LAST:event_tfNumeroKeyTyped

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Caixa cashier = new Caixa();
        Funcionario func = listFunc.get(cbxFunc.getSelectedIndex());
        
        if ((tfNumero.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigat??rios", "ERROR CAMPO VAZIO", JOptionPane.ERROR_MESSAGE);
            mostrarCamposObrigatorio();
            return;
        }

        if(!btnIncluir.getText().equals("INCLUIR"))
            cashier = listCaixa.get(cbxEscolher.getSelectedIndex());

        cashier.setNumero(Integer.parseInt(tfNumero.getText()));
        cashier.setFuncionario(func);
        
        switch (btnIncluir.getText()) {
            case "INCLUIR": {

                try {
                    fixCaixa.incluir(cashier);
                } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
                {
                    JOptionPane.showMessageDialog(null, "Erro na query [INCLUIR], ERRO: " + sqlex.getMessage(), "ERROR CAIXA", JOptionPane.ERROR_MESSAGE);
                    sqlex.printStackTrace();
                }

            }
            break;
            case "EXCLUIR": {
                int ConfirmDialog = JOptionPane.showConfirmDialog(this, "Deseja realamente EXCLUIR esse caixa???", "EXCLUIR???", JOptionPane.INFORMATION_MESSAGE);
                if (ConfirmDialog == JOptionPane.YES_OPTION) {

                    try {
                        fixCaixa.remove(cashier);
                    } catch (SQLException sqlex)//Retorna um erro caso exista erro de query SQL
                    {
                        if (sqlex.getSQLState().equalsIgnoreCase("23503")) {
                            JOptionPane.showMessageDialog(null, "N??o pode ser excluido, pois tem dependente(s): " + sqlex.getMessage(), "ERROR CAIXA", JOptionPane.ERROR_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro na query [REMOVER], ERRO: " + sqlex.getMessage(), "ERROR CAIXA", JOptionPane.ERROR_MESSAGE);
                        }
                        sqlex.printStackTrace();
                    }

                } else {
                    btnCancelarActionPerformed(evt);
                }
                break;
            }
            case "ALTERAR": {
                int ConfirmDialog = JOptionPane.showConfirmDialog(this, "Deseja realamente ALTERAR esse caixa???", "ALTERAR???", JOptionPane.INFORMATION_MESSAGE);
                if (ConfirmDialog == JOptionPane.YES_OPTION) {

                    try {
                        fixCaixa.alteracao(cashier);
                    } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
                    {
                        JOptionPane.showMessageDialog(null, "Erro na query [ALTERA????O], ERRO: " + sqlex.getMessage(), "ERROR CAIXA", JOptionPane.ERROR_MESSAGE);
                        sqlex.printStackTrace();
                    }

                } else {
                    btnCancelarActionPerformed(evt);
                }
                break;
            }
        }
        restart();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        restart();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbxFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFuncActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        try {
            Connection conn = Conexao.getConexao();
            
            Map parameters = new HashMap();
            parameters.put("REPORT_CONNECTION", conn);

            JasperReport relCompilado = JasperCompileManager.compileReport("src/main/java/rel/Caixa.jrxml");

            JasperPrint relPreenchido = JasperFillManager.fillReport(relCompilado, parameters, conn);

            JDialog tela = new JDialog(this, "Relat??rio Caixa", true);
            tela.setSize(1000, 700);

            JRViewer painelRel = new JRViewer(relPreenchido);

            tela.getContentPane().add(painelRel);

            tela.setVisible(true);

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro gerar relat??rio [ JasperReport ] " + ex.getMessage(), "ERROR CAIXAE", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELAT??RIO], ERRO: " + sqlex.getMessage(), "ERROR CAIXA", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }
    }//GEN-LAST:event_btnRelatorioActionPerformed

    KeyListener listenerTfNumber = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            JTextField field = (JTextField) e.getSource();

            String caracteres = "0987654321";
            if (!caracteres.contains(e.getKeyChar() + "")) {
                e.consume();

                Border lineBorder = BorderFactory.createLineBorder(Color.getColor(caracteres, 0XEC2E2E));
                field.setBorder(lineBorder);
            } else {
                Border lineBorder = BorderFactory.createLineBorder(Color.GRAY);
                field.setBorder(borderDefault);
            }

        }

        @Override
        public void keyPressed(KeyEvent arg0) {
        }

        @Override
        public void keyReleased(KeyEvent arg0) {
        }
    };
    
    private void mostrarCamposObrigatorio() {
        Border lineBorder = BorderFactory.createLineBorder(Color.getColor(null, 0XEC2E2E));

        for (int i = 0; i < pnIncluir.getComponentCount(); i++) {
            Component c = pnIncluir.getComponent(i);

            if (c instanceof JTextField) {
                JTextField field = (JTextField) c;
                if (field.getText().isEmpty()) {
                    field.setBorder(lineBorder);
                }

            }
        }
    }
    
    private void configCaixa() {
        rbAlterar.setEnabled(false);
        rbConsultar.setEnabled(false);
        rbExcluir.setEnabled(false);
        rbIncluir.setEnabled(false);

        pnIncluir.setVisible(true);
        btnIncluir.setVisible(true);
        btnCancelar.setVisible(true);

        //tfNumero.setEditable(true);
        cbxFunc.setEnabled(true);


        cbxFunc.setSelectedIndex(-1);
        //tfNumero.setText("");
        
        for (int i = 0; i < pnIncluir.getComponentCount(); i++) {
            Component c = pnIncluir.getComponent(i);

            if (c instanceof JTextField) {
                JTextField field = (JTextField) c;

                field.setBorder(borderDefault);
                field.setText("");
                field.setEditable(true);
            }
        }
    }
    
    private void restart() {
        rbAlterar.setEnabled(true);
        rbConsultar.setEnabled(true);
        rbExcluir.setEnabled(true);
        rbIncluir.setEnabled(true);

        pnIncluir.setVisible(false);
        cbxEscolher.setVisible(false);
        jiformativo.setVisible(false);

        cbxFunc.setSelectedIndex(-1);
        tfNumero.setText("");
    }
    
    private int qtdCaixa() {
        int cont = 0;
        try {
            cont = fixCaixa.qtdEntidade();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [QTD CAIXA], ERRO: " + sqlex.getMessage(), "ERROR CAIXA", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }
        return cont;
    }
    
    private int posicaoFuncNoArray(Funcionario func) {
        try {
            listFunc = fixFunc.relatorio();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELAT??RIO - Funcion??rio], ERRO: " + sqlex.getMessage(), "ERROR CAIXA", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }

        for (Funcionario employe : listFunc) {
            if (employe.getCodigo() == func.getCodigo()) {
                return listFunc.indexOf(employe);
            }
        }

        return -1;
    }
    
    private void popularJComboBoxFunc() {
        cbxFunc.setModel(new DefaultComboBoxModel());

        try {
            listFunc = fixFunc.relatorio();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELAT??RIO - Funcion??rio], ERRO: " + sqlex.getMessage(), "ERROR CAIXA", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }

        for (Funcionario employe : listFunc) {
            if (employe != null) {
                cbxFunc.addItem(employe.getNome());
            }
        }
    }
    
    private void popularJComboBox() {
        cbxEscolher.setModel(new DefaultComboBoxModel());

        try {
            listCaixa = fixCaixa.relatorio();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELAT??RIO], ERRO: " + sqlex.getMessage(), "ERROR CAIXA", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }
        
        for (Caixa cashier : listCaixa) {
            if (cashier != null) {
                cbxEscolher.addItem(Integer.toString(cashier.getNumero()));
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupBtnCrudCaixa;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcluido;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JComboBox<String> cbxEscolher;
    private javax.swing.JComboBox<String> cbxFunc;
    private javax.swing.JLabel jiformativo;
    private javax.swing.JLabel jiformativo1;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnIncluir;
    private javax.swing.JRadioButton rbAlterar;
    private javax.swing.JRadioButton rbConsultar;
    private javax.swing.JRadioButton rbExcluir;
    private javax.swing.JRadioButton rbIncluir;
    private javax.swing.JTextField tfNumero;
    // End of variables declaration//GEN-END:variables
}
