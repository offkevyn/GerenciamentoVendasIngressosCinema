/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.fichario.ClienteFichario;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author Win10 x64
 */
public class DialogGerCliente extends javax.swing.JDialog {

    private ArrayList<Cliente> listCliente;
    private ClienteFichario fixCliente;

    /**
     * Creates new form DialogGerCliente
     */
    public DialogGerCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        cbxEscolher.setVisible(false);
        jiformativo.setVisible(false);

        pnIncluir.setVisible(false);

        try {
            fixCliente = new ClienteFichario();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro de conexão, ERRO: " + sqlex.getMessage(), "ERROR CLIENTE", JOptionPane.ERROR_MESSAGE);
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

        GroupBtnCrudCliente = new javax.swing.ButtonGroup();
        lbTitulo = new javax.swing.JLabel();
        jiformativo = new javax.swing.JLabel();
        cbxEscolher = new javax.swing.JComboBox<>();
        jiformativo1 = new javax.swing.JLabel();
        rbIncluir = new javax.swing.JRadioButton();
        rbExcluir = new javax.swing.JRadioButton();
        rbConsultar = new javax.swing.JRadioButton();
        rbAlterar = new javax.swing.JRadioButton();
        btnConcluido = new javax.swing.JButton();
        pnIncluir = new javax.swing.JPanel();
        lbCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        CheckBoxVipSim = new javax.swing.JCheckBox();
        lbVip = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Gerenciamento de Cliente");

        jiformativo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jiformativo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jiformativo.setText("Escolha o nome do cliente:");

        cbxEscolher.setName(""); // NOI18N
        cbxEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEscolherActionPerformed(evt);
            }
        });

        jiformativo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jiformativo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jiformativo1.setText("MENU");

        GroupBtnCrudCliente.add(rbIncluir);
        rbIncluir.setText("INCLUIR");
        rbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIncluirActionPerformed(evt);
            }
        });

        GroupBtnCrudCliente.add(rbExcluir);
        rbExcluir.setText("EXCLUIR");
        rbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbExcluirActionPerformed(evt);
            }
        });

        GroupBtnCrudCliente.add(rbConsultar);
        rbConsultar.setText("CONSULTAR");
        rbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConsultarActionPerformed(evt);
            }
        });

        GroupBtnCrudCliente.add(rbAlterar);
        rbAlterar.setText("ALTERAR");
        rbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlterarActionPerformed(evt);
            }
        });

        btnConcluido.setText("Concluído");
        btnConcluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluidoActionPerformed(evt);
            }
        });

        pnIncluir.setBackground(new java.awt.Color(250, 250, 250));

        lbCpf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCpf.setText("CPF:");

        lbTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbTelefone.setText("Telefone:");

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

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNome.setText("Nome:");

        CheckBoxVipSim.setText("Sim");

        lbVip.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbVip.setText("VIP?");

        javax.swing.GroupLayout pnIncluirLayout = new javax.swing.GroupLayout(pnIncluir);
        pnIncluir.setLayout(pnIncluirLayout);
        pnIncluirLayout.setHorizontalGroup(
            pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIncluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTelefone)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnIncluirLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lbVip, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CheckBoxVipSim)))
                    .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnIncluirLayout.createSequentialGroup()
                            .addComponent(btnIncluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar))
                        .addGroup(pnIncluirLayout.createSequentialGroup()
                            .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnIncluirLayout.setVerticalGroup(
            pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIncluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addComponent(lbCpf)
                        .addGap(6, 6, 6)
                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addGap(6, 6, 6)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addComponent(lbTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addComponent(lbVip)
                        .addGap(5, 5, 5)
                        .addComponent(CheckBoxVipSim)))
                .addGap(18, 18, 18)
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
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
                .addComponent(pnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEscolherActionPerformed
        if (cbxEscolher.getSelectedIndex() >= 0) {
            pnIncluir.setVisible(true);

            Cliente client = listCliente.get(cbxEscolher.getSelectedIndex());

            tfCpf.setText(client.getCpf());
            tfNome.setText(client.getNome());
            tfTelefone.setText(client.getTelefone());
            CheckBoxVipSim.setSelected(client.isVip());

            if (rbAlterar.isSelected()) {
                btnIncluir.setText("ALTERAR");

                tfCpf.setEditable(true);
                tfNome.setEditable(true);
                tfTelefone.setEditable(true);
                CheckBoxVipSim.setEnabled(true);
            } else if (rbExcluir.isSelected()) {
                btnCancelar.setVisible(true);
                btnIncluir.setVisible(true);
                btnIncluir.setText("EXCLUIR");

                tfCpf.setEditable(false);
                tfNome.setEditable(false);
                tfTelefone.setEditable(false);
                CheckBoxVipSim.setEnabled(false);
            } else if (rbConsultar.isSelected()) {
                btnCancelar.setVisible(false);
                btnIncluir.setVisible(false);

                tfCpf.setEditable(false);
                tfNome.setEditable(false);
                tfTelefone.setEditable(false);
                CheckBoxVipSim.setEnabled(false);
            }
        }
    }//GEN-LAST:event_cbxEscolherActionPerformed

    private void rbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIncluirActionPerformed
        cbxEscolher.setVisible(false);
        jiformativo.setVisible(false);
        configCliente();

        pnIncluir.setVisible(true);

        btnIncluir.setText("INCLUIR");
    }//GEN-LAST:event_rbIncluirActionPerformed

    private void rbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbExcluirActionPerformed
        if (qtdCliente() > 0) {
            restart();
            configCliente();
            cbxEscolher.setVisible(true);
            jiformativo.setVisible(true);
            popularJComboBox();
        } else
            JOptionPane.showMessageDialog(this, "A lista está VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbExcluirActionPerformed

    private void rbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConsultarActionPerformed
        if (qtdCliente() > 0) {
            cbxEscolher.setVisible(true);
            jiformativo.setVisible(true);

            btnIncluir.setVisible(false);
            btnCancelar.setVisible(false);

            popularJComboBox();
        } else
            JOptionPane.showMessageDialog(this, "A lista está VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbConsultarActionPerformed

    private void rbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlterarActionPerformed
        if (qtdCliente() > 0) {
            restart();
            configCliente();
            cbxEscolher.setVisible(true);
            jiformativo.setVisible(true);
            popularJComboBox();
        } else
            JOptionPane.showMessageDialog(this, "A lista está VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbAlterarActionPerformed

    private void btnConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluidoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnConcluidoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        restart();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Cliente client = new Cliente();

        if (!btnIncluir.getText().equals("INCLUIR")) {
            client = listCliente.get(cbxEscolher.getSelectedIndex());
        }

        client.setCpf(tfCpf.getText());
        client.setNome(tfNome.getText());
        client.setTelefone(tfTelefone.getText());
        client.setVip(CheckBoxVipSim.isSelected());

        switch (btnIncluir.getText()) {
            case "INCLUIR": {

                try {
                    fixCliente.incluir(client);
                } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
                {
                    JOptionPane.showMessageDialog(null, "Erro na query [INCLUIR], ERRO: " + sqlex.getMessage(), "ERROR CLIENTE", JOptionPane.ERROR_MESSAGE);
                    sqlex.printStackTrace();
                }

            }
            break;
            case "EXCLUIR": {
                int ConfirmDialog = JOptionPane.showConfirmDialog(this, "Deseja realamente EXCLUIR esse cliente???", "EXCLUIR???", JOptionPane.INFORMATION_MESSAGE);
                if (ConfirmDialog == JOptionPane.YES_OPTION) {

                    try {
                        fixCliente.remove(client);
                    } catch (SQLException sqlex)//Retorna um erro caso exista erro de query SQL
                    {
                        if (sqlex.getSQLState().equalsIgnoreCase("23503")) {
                            JOptionPane.showMessageDialog(null, "Não pode ser excluido, pois tem dependente(s): " + sqlex.getMessage(), "ERROR CLIENTE", JOptionPane.ERROR_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro na query [REMOVER], ERRO: " + sqlex.getMessage(), "ERROR CLIENTE", JOptionPane.ERROR_MESSAGE);
                        }
                        sqlex.printStackTrace();
                    }

                } else {
                    btnCancelarActionPerformed(evt);
                }
                break;
            }
            case "ALTERAR": {
                int ConfirmDialog = JOptionPane.showConfirmDialog(this, "Deseja realamente ALTERAR esse  cliente???", "ALTERAR???", JOptionPane.INFORMATION_MESSAGE);
                if (ConfirmDialog == JOptionPane.YES_OPTION) {

                    try {
                        fixCliente.alteracao(client);
                    } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
                    {
                        JOptionPane.showMessageDialog(null, "Erro na query [ALTERAÇÃO], ERRO: " + sqlex.getMessage(), "ERROR CLIENTE", JOptionPane.ERROR_MESSAGE);
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

    private void restart() {
        rbAlterar.setEnabled(true);
        rbConsultar.setEnabled(true);
        rbExcluir.setEnabled(true);
        rbIncluir.setEnabled(true);

        pnIncluir.setVisible(false);
        cbxEscolher.setVisible(false);
        jiformativo.setVisible(false);

        tfCpf.setText("");
        tfNome.setText("");
        tfTelefone.setText("");
        CheckBoxVipSim.setSelected(false);
    }

    private void configCliente() {
        rbAlterar.setEnabled(false);
        rbConsultar.setEnabled(false);
        rbExcluir.setEnabled(false);
        rbIncluir.setEnabled(false);

        pnIncluir.setVisible(true);
        btnIncluir.setVisible(true);
        btnCancelar.setVisible(true);

        tfCpf.setEditable(true);
        tfNome.setEditable(true);
        tfTelefone.setEditable(true);
        CheckBoxVipSim.setEnabled(true);

        tfCpf.setText("");
        tfNome.setText("");
        tfTelefone.setText("");
        CheckBoxVipSim.setSelected(false);
    }

    private int qtdCliente() {
        int cont = 0;
        try {
            cont = fixCliente.qtdEntidade();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [QTD CLIENTE], ERRO: " + sqlex.getMessage(), "ERROR CLIENTE", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }
        return cont;
    }

    private void popularJComboBox() {
        cbxEscolher.setModel(new DefaultComboBoxModel());

        try {
            listCliente = fixCliente.relatorio();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELATÓRIO], ERRO: " + sqlex.getMessage(), "ERROR CLIENTE", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }

        for (Cliente client : listCliente) {
            if (client != null) {
                cbxEscolher.addItem(client.getNome());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxVipSim;
    private javax.swing.ButtonGroup GroupBtnCrudCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcluido;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JComboBox<String> cbxEscolher;
    private javax.swing.JLabel jiformativo;
    private javax.swing.JLabel jiformativo1;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbVip;
    private javax.swing.JPanel pnIncluir;
    private javax.swing.JRadioButton rbAlterar;
    private javax.swing.JRadioButton rbConsultar;
    private javax.swing.JRadioButton rbExcluir;
    private javax.swing.JRadioButton rbIncluir;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
