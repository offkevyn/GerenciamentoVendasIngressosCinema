/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import logic.SalaLogic;
import model.Sala;

/**
 *
 * @author Win10 x64
 */
public class DialogGerSala extends javax.swing.JDialog {

    private ArrayList<Sala> listSala;
    private Border borderDefalt;
    private SalaLogic salaLogic;

    /**
     * Creates new form DialogGerSala
     */
    public DialogGerSala(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        borderDefalt = tfQtdPoltronas.getBorder();

        cbxEscolher.setVisible(false);
        jiformativo2.setVisible(false);

        pnIncluir.setVisible(false);

        salaLogic = new SalaLogic();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupBtnCrudSala = new javax.swing.ButtonGroup();
        lbTitulo = new javax.swing.JLabel();
        rbIncluir = new javax.swing.JRadioButton();
        rbExcluir = new javax.swing.JRadioButton();
        rbAlterar = new javax.swing.JRadioButton();
        rbConsultar = new javax.swing.JRadioButton();
        jiformativo1 = new javax.swing.JLabel();
        btnConcluido = new javax.swing.JButton();
        cbxEscolher = new javax.swing.JComboBox<>();
        jiformativo2 = new javax.swing.JLabel();
        pnIncluir = new javax.swing.JPanel();
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        tfQtdPoltronas = new javax.swing.JTextField();
        lbQtdPoltronas = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        CheckBoxVipSim = new javax.swing.JCheckBox();
        lbCrm1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Gerenciamento de Sala");

        GroupBtnCrudSala.add(rbIncluir);
        rbIncluir.setText("INCLUIR");
        rbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIncluirActionPerformed(evt);
            }
        });

        GroupBtnCrudSala.add(rbExcluir);
        rbExcluir.setText("EXCLUIR");
        rbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbExcluirActionPerformed(evt);
            }
        });

        GroupBtnCrudSala.add(rbAlterar);
        rbAlterar.setText("ALTERAR");
        rbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlterarActionPerformed(evt);
            }
        });

        GroupBtnCrudSala.add(rbConsultar);
        rbConsultar.setText("CONSULTAR");
        rbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConsultarActionPerformed(evt);
            }
        });

        jiformativo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jiformativo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jiformativo1.setText("MENU");

        btnConcluido.setText("Concluído");
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

        jiformativo2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jiformativo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jiformativo2.setText("Escolha o nome do Medico:");

        pnIncluir.setBackground(new java.awt.Color(250, 250, 250));

        lbNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNumero.setText("Número:");

        tfNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumeroKeyTyped(evt);
            }
        });

        tfQtdPoltronas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfQtdPoltronasKeyTyped(evt);
            }
        });

        lbQtdPoltronas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbQtdPoltronas.setText("Quantidade de poltronas:");

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

        CheckBoxVipSim.setText("Sim");

        lbCrm1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCrm1.setText("VIP?");

        javax.swing.GroupLayout pnIncluirLayout = new javax.swing.GroupLayout(pnIncluir);
        pnIncluir.setLayout(pnIncluirLayout);
        pnIncluirLayout.setHorizontalGroup(
            pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIncluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addComponent(btnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addContainerGap())
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbQtdPoltronas)
                            .addComponent(tfQtdPoltronas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addComponent(lbNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbCrm1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CheckBoxVipSim)
                        .addGap(85, 85, 85))))
        );
        pnIncluirLayout.setVerticalGroup(
            pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIncluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumero)
                    .addComponent(lbCrm1))
                .addGap(5, 5, 5)
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBoxVipSim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbQtdPoltronas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfQtdPoltronas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jiformativo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbConsultar))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jiformativo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnConcluido))
                .addGap(18, 18, 18)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jiformativo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbConsultar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jiformativo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConcluido))
                    .addComponent(pnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIncluirActionPerformed
        cbxEscolher.setVisible(false);
        jiformativo2.setVisible(false);
        configSala();

        pnIncluir.setVisible(true);

        btnIncluir.setText("INCLUIR");
    }//GEN-LAST:event_rbIncluirActionPerformed

    private void rbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbExcluirActionPerformed
        if (salaLogic.qtdSala() > 0) {
            restart();
            configSala();
            cbxEscolher.setVisible(true);
            jiformativo2.setVisible(true);
            popularJComboBox();
        } else
            JOptionPane.showMessageDialog(this, "A lista está VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbExcluirActionPerformed

    private void rbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlterarActionPerformed
        if (salaLogic.qtdSala() > 0) {
            restart();
            configSala();
            cbxEscolher.setVisible(true);
            jiformativo2.setVisible(true);
            popularJComboBox();
        } else
            JOptionPane.showMessageDialog(this, "A lista está VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbAlterarActionPerformed

    private void rbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConsultarActionPerformed
        if (salaLogic.qtdSala() > 0) {
            cbxEscolher.setVisible(true);
            jiformativo2.setVisible(true);

            btnIncluir.setVisible(false);
            btnCancelar.setVisible(false);

            popularJComboBox();
        } else
            JOptionPane.showMessageDialog(this, "A lista está VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbConsultarActionPerformed

    private void btnConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluidoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnConcluidoActionPerformed

    private void cbxEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEscolherActionPerformed
        if (cbxEscolher.getSelectedIndex() >= 0) {
            pnIncluir.setVisible(true);

            Sala room = listSala.get(cbxEscolher.getSelectedIndex());

            tfNumero.setText(room.getNumero() + "");
            tfQtdPoltronas.setText(room.getQtdPoltronas() + "");
            CheckBoxVipSim.setSelected(room.isVip());

            if (rbAlterar.isSelected()) {
                btnIncluir.setText("ALTERAR");

                tfNumero.setEditable(true);
                tfQtdPoltronas.setEditable(true);
            } else if (rbExcluir.isSelected()) {
                btnCancelar.setVisible(true);
                btnIncluir.setVisible(true);
                btnIncluir.setText("EXCLUIR");

                tfNumero.setEditable(false);
                tfQtdPoltronas.setEditable(false);
            } else if (rbConsultar.isSelected()) {
                btnCancelar.setVisible(false);
                btnIncluir.setVisible(false);

                tfNumero.setEditable(false);
                tfQtdPoltronas.setEditable(false);
            }
        }
    }//GEN-LAST:event_cbxEscolherActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Sala room = listSala.get(cbxEscolher.getSelectedIndex());

        room.setNumero(Integer.parseInt(tfNumero.getText()));
        room.setQtdPoltronas(Integer.parseInt(tfQtdPoltronas.getText()));
        room.setVip(CheckBoxVipSim.isSelected());

        switch (btnIncluir.getText()) {
            case "INCLUIR": {

                salaLogic.incluir(room);
            }
            break;
            case "EXCLUIR": {
                int ConfirmDialog = JOptionPane.showConfirmDialog(this, "Deseja realamente EXCLUIR essa sala???", "EXCLUIR???", JOptionPane.INFORMATION_MESSAGE);
                if (ConfirmDialog == JOptionPane.YES_OPTION) {
                    salaLogic.remove(listSala.get(cbxEscolher.getSelectedIndex()));
                } else {
                    btnCancelarActionPerformed(evt);
                }
                break;
            }
            case "ALTERAR": {
                int ConfirmDialog = JOptionPane.showConfirmDialog(this, "Deseja realamente ALTERAR essa sala???", "ALTERAR???", JOptionPane.INFORMATION_MESSAGE);
                if (ConfirmDialog == JOptionPane.YES_OPTION) {
                    salaLogic.alteracao(room);
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

    private void tfQtdPoltronasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQtdPoltronasKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();

            Border lineBorder = BorderFactory.createLineBorder(Color.getColor(caracteres, 0XEC2E2E));
            tfQtdPoltronas.setBorder(lineBorder);
        } else {
            Border lineBorder = BorderFactory.createLineBorder(Color.GRAY);
            tfQtdPoltronas.setBorder(borderDefalt);
        }

    }//GEN-LAST:event_tfQtdPoltronasKeyTyped

    private void tfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();

            Border lineBorder = BorderFactory.createLineBorder(Color.getColor(caracteres, 0XEC2E2E));
            tfNumero.setBorder(lineBorder);

        } else {
            tfNumero.setBorder(borderDefalt);
        }

    }//GEN-LAST:event_tfNumeroKeyTyped

    private void configSala() {
        rbAlterar.setEnabled(false);
        rbConsultar.setEnabled(false);
        rbExcluir.setEnabled(false);
        rbIncluir.setEnabled(false);

        pnIncluir.setVisible(true);
        btnIncluir.setVisible(true);
        btnCancelar.setVisible(true);

        tfNumero.setEditable(true);
        tfQtdPoltronas.setEditable(true);

        tfNumero.setText("");
        tfQtdPoltronas.setText("");
        CheckBoxVipSim.setSelected(false);
    }

    private void restart() {
        rbAlterar.setEnabled(true);
        rbConsultar.setEnabled(true);
        rbExcluir.setEnabled(true);
        rbIncluir.setEnabled(true);

        pnIncluir.setVisible(false);
        cbxEscolher.setVisible(false);
        jiformativo2.setVisible(false);

        tfNumero.setText("");
        tfQtdPoltronas.setText("");
        CheckBoxVipSim.setSelected(false);
    }

    private void popularJComboBox() {
        cbxEscolher.setModel(new DefaultComboBoxModel());

        listSala = salaLogic.relatorio();
        for (Sala room : listSala) {
            if (room != null) {
                cbxEscolher.addItem(Integer.toString(room.getNumero()));
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxVipSim;
    private javax.swing.ButtonGroup GroupBtnCrudSala;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcluido;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JComboBox<String> cbxEscolher;
    private javax.swing.JLabel jiformativo1;
    private javax.swing.JLabel jiformativo2;
    private javax.swing.JLabel lbCrm1;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbQtdPoltronas;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnIncluir;
    private javax.swing.JRadioButton rbAlterar;
    private javax.swing.JRadioButton rbConsultar;
    private javax.swing.JRadioButton rbExcluir;
    private javax.swing.JRadioButton rbIncluir;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfQtdPoltronas;
    // End of variables declaration//GEN-END:variables
}
