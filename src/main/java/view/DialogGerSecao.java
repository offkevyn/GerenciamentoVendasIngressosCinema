/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.fichario.FilmeFichario;
import controller.fichario.SalaFichario;
import controller.fichario.SecaoFichario;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Filme;
import model.Sala;
import model.Secao;

/**
 *
 * @author Win10 x64
 */
public class DialogGerSecao extends javax.swing.JDialog {

    private ArrayList<Secao> listSecao;
    private ArrayList<Filme> listFilme;
    private ArrayList<Sala> listSala;
    private FilmeFichario fixFilme;
    private SalaFichario fixSala;
    private SecaoFichario fixSecao;

    /**
     * Creates new form DialogGerSecao
     */
    public DialogGerSecao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        cbxEscolher.setVisible(false);
        jiformativo.setVisible(false);

        pnIncluir.setVisible(false);
        
        try {
            fixFilme = new FilmeFichario();
            fixSala = new SalaFichario();
            fixSecao = new SecaoFichario();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "[Erro na Instância] Erro de conexão, ERRO: " + sqlex.getMessage(), "ERROR SEÇÃO", JOptionPane.ERROR_MESSAGE);
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

        GroupBtnCrudSecao = new javax.swing.ButtonGroup();
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
        btnIncluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbxSala = new javax.swing.JComboBox<>();
        lbSala = new javax.swing.JLabel();
        lbFilme = new javax.swing.JLabel();
        cbxFilme = new javax.swing.JComboBox<>();
        tfHora = new javax.swing.JTextField();
        lbHora = new javax.swing.JLabel();
        tfMinutos = new javax.swing.JTextField();
        lbMinutos = new javax.swing.JLabel();
        tfAno = new javax.swing.JTextField();
        lbAno = new javax.swing.JLabel();
        lbDiaSecao = new javax.swing.JLabel();
        lbHoraSecao = new javax.swing.JLabel();
        tfDia = new javax.swing.JTextField();
        lbDia = new javax.swing.JLabel();
        tfMes = new javax.swing.JTextField();
        lbMes = new javax.swing.JLabel();
        lbqtdPoltronasOuculpadas = new javax.swing.JLabel();
        tflbqtdPoltronasOuculpadas = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Gerenciamento de Seção");

        jiformativo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jiformativo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jiformativo1.setText("MENU");

        GroupBtnCrudSecao.add(rbIncluir);
        rbIncluir.setText("INCLUIR");
        rbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIncluirActionPerformed(evt);
            }
        });

        GroupBtnCrudSecao.add(rbExcluir);
        rbExcluir.setText("EXCLUIR");
        rbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbExcluirActionPerformed(evt);
            }
        });

        GroupBtnCrudSecao.add(rbAlterar);
        rbAlterar.setText("ALTERAR");
        rbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlterarActionPerformed(evt);
            }
        });

        GroupBtnCrudSecao.add(rbConsultar);
        rbConsultar.setText("CONSULTAR");
        rbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConsultarActionPerformed(evt);
            }
        });

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

        jiformativo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jiformativo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jiformativo.setText("Escolha o código da seção");

        pnIncluir.setBackground(new java.awt.Color(250, 250, 250));

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

        cbxSala.setName(""); // NOI18N
        cbxSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSalaActionPerformed(evt);
            }
        });

        lbSala.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbSala.setText("Sala");

        lbFilme.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbFilme.setText("Filme:");

        cbxFilme.setName(""); // NOI18N
        cbxFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFilmeActionPerformed(evt);
            }
        });

        lbHora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHora.setText("Hora:");

        tfMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMinutosActionPerformed(evt);
            }
        });

        lbMinutos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMinutos.setText("Minutos:");

        lbAno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAno.setText("Ano:");

        lbDiaSecao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDiaSecao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDiaSecao.setText("Data");

        lbHoraSecao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHoraSecao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHoraSecao.setText("Hora");

        tfDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiaActionPerformed(evt);
            }
        });

        lbDia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDia.setText("Dia:");

        lbMes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMes.setText("Mês:");

        lbqtdPoltronasOuculpadas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbqtdPoltronasOuculpadas.setText("Quantidade Poltronas oucupadas:");

        tflbqtdPoltronasOuculpadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tflbqtdPoltronasOuculpadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnIncluirLayout = new javax.swing.GroupLayout(pnIncluir);
        pnIncluir.setLayout(pnIncluirLayout);
        pnIncluirLayout.setHorizontalGroup(
            pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIncluirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIncluirLayout.createSequentialGroup()
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMinutos)
                            .addComponent(tfMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIncluirLayout.createSequentialGroup()
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDia)
                            .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAno)
                            .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
            .addGroup(pnIncluirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIncluirLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnIncluirLayout.createSequentialGroup()
                                .addComponent(btnIncluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar))
                            .addGroup(pnIncluirLayout.createSequentialGroup()
                                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnIncluirLayout.createSequentialGroup()
                                        .addComponent(lbSala, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(98, 98, 98))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnIncluirLayout.createSequentialGroup()
                                        .addComponent(cbxSala, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addComponent(lbDiaSecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbHoraSecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbqtdPoltronasOuculpadas)
                            .addComponent(tflbqtdPoltronasOuculpadas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnIncluirLayout.setVerticalGroup(
            pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIncluirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFilme)
                    .addComponent(lbSala))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbqtdPoltronasOuculpadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tflbqtdPoltronasOuculpadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDiaSecao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAno)
                    .addComponent(lbMes)
                    .addComponent(lbDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbHoraSecao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addComponent(lbHora)
                        .addGap(1, 1, 1)
                        .addComponent(tfHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addComponent(lbMinutos)
                        .addGap(1, 1, 1)
                        .addComponent(tfMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jiformativo1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbConsultar)
                    .addComponent(btnConcluido)
                    .addComponent(rbIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jiformativo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxEscolher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jiformativo1)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbIncluir)
                                .addGap(1, 1, 1)
                                .addComponent(rbExcluir))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jiformativo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxEscolher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(rbAlterar)
                        .addGap(0, 0, 0)
                        .addComponent(rbConsultar)
                        .addGap(7, 7, 7)
                        .addComponent(btnConcluido)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIncluirActionPerformed
        cbxEscolher.setVisible(false);
        jiformativo.setVisible(false);

        configSecao();

        popularJComboBoxSala();
        popularJComboBoxFilme();

        pnIncluir.setVisible(true);

        btnIncluir.setText("INCLUIR");
    }//GEN-LAST:event_rbIncluirActionPerformed

    private void rbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbExcluirActionPerformed
        if (qtdSecao() > 0) {
            restart();
            configSecao();
            cbxEscolher.setVisible(true);
            jiformativo.setVisible(true);
            popularJComboBox();
        } else
            JOptionPane.showMessageDialog(this, "A lista está VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbExcluirActionPerformed

    private void rbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlterarActionPerformed
        if (qtdSecao() > 0) {
            restart();
            configSecao();
            cbxEscolher.setVisible(true);
            jiformativo.setVisible(true);
            popularJComboBox();
        } else
            JOptionPane.showMessageDialog(this, "A lista está VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbAlterarActionPerformed

    private void rbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConsultarActionPerformed
        if (qtdSecao() > 0) {
            cbxEscolher.setVisible(true);
            jiformativo.setVisible(true);

            btnIncluir.setVisible(false);
            btnCancelar.setVisible(false);

            popularJComboBoxSala();
            popularJComboBoxFilme();
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

            Secao session = listSecao.get(cbxEscolher.getSelectedIndex());

            tfAno.setText(session.getDataHora().getYear() + "");
            tfDia.setText(session.getDataHora().getDayOfMonth() + "");
            tfMes.setText(session.getDataHora().getMonthValue() + "");
            tfHora.setText(session.getDataHora().getHour() + "");
            tfMinutos.setText(session.getDataHora().getMinute() + "");
            tflbqtdPoltronasOuculpadas.setText(session.getPoltronasOucupadas() + "");
            
            cbxFilme.setSelectedIndex(posicaoFilmeNoArray(session.getFilme()));
            cbxSala.setSelectedIndex(posicaoSalaNoArray(session.getSala()));

            
            tflbqtdPoltronasOuculpadas.setEditable(false);
            tflbqtdPoltronasOuculpadas.setVisible(false);
            lbqtdPoltronasOuculpadas.setVisible(false);
            if (rbAlterar.isSelected()) {
                btnIncluir.setText("ALTERAR");

                cbxSala.setEnabled(true);
                cbxFilme.setEnabled(true);
                tfAno.setEditable(true);
                tfDia.setEditable(true);
                tfHora.setEditable(true);
                tfMes.setEditable(true);
                tfMinutos.setEditable(true);
            } else if (rbExcluir.isSelected()) {
                btnCancelar.setVisible(true);
                btnIncluir.setVisible(true);
                btnIncluir.setText("EXCLUIR");

                cbxSala.setEnabled(false);
                cbxFilme.setEnabled(false);
                tfAno.setEditable(false);
                tfDia.setEditable(false);
                tfHora.setEditable(false);
                tfMes.setEditable(false);
                tfMinutos.setEditable(false);
                
                tflbqtdPoltronasOuculpadas.setVisible(true);
                lbqtdPoltronasOuculpadas.setVisible(true);
            } else if (rbConsultar.isSelected()) {
                btnCancelar.setVisible(false);
                btnIncluir.setVisible(false);

                cbxSala.setEnabled(false);
                cbxFilme.setEnabled(false);
                tfAno.setEditable(false);
                tfDia.setEditable(false);
                tfHora.setEditable(false);
                tfMes.setEditable(false);
                tfMinutos.setEditable(false);
                
                tflbqtdPoltronasOuculpadas.setVisible(true);
                lbqtdPoltronasOuculpadas.setVisible(true);
            }
        }
    }//GEN-LAST:event_cbxEscolherActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Secao session = new Secao();
        Filme filme = listFilme.get(cbxFilme.getSelectedIndex());
        Sala sala = listSala.get(cbxSala.getSelectedIndex());

        if(!btnIncluir.getText().equals("INCLUIR"))
            session = listSecao.get(cbxEscolher.getSelectedIndex());
        
        int dia = Integer.parseInt(tfDia.getText()),
                mes = Integer.parseInt(tfMes.getText()),
                ano = Integer.parseInt(tfAno.getText()),
                hora = Integer.parseInt(tfHora.getText()),
                min = Integer.parseInt(tfMinutos.getText());

        session.setFilme(filme);
        session.setSala(sala);
        session.setDataHora(LocalDateTime.of(ano, mes, dia, hora, min));

        switch (btnIncluir.getText()) {
            case "INCLUIR": {

                try {
                    fixSecao.incluir(session);
                } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
                {
                    JOptionPane.showMessageDialog(null, "Erro na query [INCLUIR], ERRO: " + sqlex.getMessage(), "ERROR SEÇÃO", JOptionPane.ERROR_MESSAGE);
                    sqlex.printStackTrace();
                }

            }
            break;
            case "EXCLUIR": {
                int ConfirmDialog = JOptionPane.showConfirmDialog(this, "Deseja realamente EXCLUIR essa seção???", "EXCLUIR???", JOptionPane.INFORMATION_MESSAGE);
                if (ConfirmDialog == JOptionPane.YES_OPTION) {

                    try {
                        fixSecao.remove(session);
                    } catch (SQLException sqlex)//Retorna um erro caso exista erro de query SQL
                    {
                        if (sqlex.getSQLState().equalsIgnoreCase("23503")) {
                            JOptionPane.showMessageDialog(null, "Não pode ser excluido, pois tem dependente(s): " + sqlex.getMessage(), "ERROR SEÇÃO", JOptionPane.ERROR_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro na query [REMOVER], ERRO: " + sqlex.getMessage(), "ERROR SEÇÃO", JOptionPane.ERROR_MESSAGE);
                        }
                        sqlex.printStackTrace();
                    }

                } else {
                    btnCancelarActionPerformed(evt);
                }
                break;
            }
            case "ALTERAR": {
                int ConfirmDialog = JOptionPane.showConfirmDialog(this, "Deseja realamente ALTERAR essa seção???", "ALTERAR???", JOptionPane.INFORMATION_MESSAGE);
                if (ConfirmDialog == JOptionPane.YES_OPTION) {

                    try {
                        fixSecao.alteracao(session);
                    } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
                    {
                        JOptionPane.showMessageDialog(null, "Erro na query [ALTERAÇÃO], ERRO: " + sqlex.getMessage(), "ERROR SEÇÃO", JOptionPane.ERROR_MESSAGE);
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

    private void cbxSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxSalaActionPerformed

    private void cbxFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFilmeActionPerformed

    private void tfMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMinutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMinutosActionPerformed

    private void tfDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDiaActionPerformed

    private void tflbqtdPoltronasOuculpadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tflbqtdPoltronasOuculpadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tflbqtdPoltronasOuculpadasActionPerformed

    private int qtdSecao() {
        int cont = 0;
        try {
            cont = fixSecao.qtdEntidade();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [QTD SEÇÃO], ERRO: " + sqlex.getMessage(), "ERROR SEÇÃO", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }
        return cont;
    }

    private void restart() {
        rbAlterar.setEnabled(true);
        rbConsultar.setEnabled(true);
        rbExcluir.setEnabled(true);
        rbIncluir.setEnabled(true);

        pnIncluir.setVisible(false);
        cbxEscolher.setVisible(false);
        jiformativo.setVisible(false);

        cbxSala.setSelectedIndex(-1);
        cbxFilme.setSelectedIndex(-1);
        tfAno.setText("");
        tfDia.setText("");
        tfHora.setText("");
        tfMes.setText("");
        tfMinutos.setText("");
    }

    private void configSecao() {
        rbAlterar.setEnabled(false);
        rbConsultar.setEnabled(false);
        rbExcluir.setEnabled(false);
        rbIncluir.setEnabled(false);

        pnIncluir.setVisible(true);
        btnIncluir.setVisible(true);
        btnCancelar.setVisible(true);

        cbxSala.setEnabled(true);
        cbxFilme.setEnabled(true);
        tfAno.setEditable(true);
        tfDia.setEditable(true);
        tfHora.setEditable(true);
        tfMes.setEditable(true);
        tfMinutos.setEditable(true);

        cbxSala.setSelectedIndex(-1);
        cbxFilme.setSelectedIndex(-1);
        tfAno.setText("");
        tfDia.setText("");
        tfHora.setText("");
        tfMes.setText("");
        tfMinutos.setText("");
        
        tflbqtdPoltronasOuculpadas.setEditable(false);
        tflbqtdPoltronasOuculpadas.setVisible(false);
        lbqtdPoltronasOuculpadas.setVisible(false);
    }

    private int posicaoSalaNoArray(Sala sala) {
        try {
            listSala = fixSala.relatorio();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELATÓRIO - Sala], ERRO: " + sqlex.getMessage(), "ERROR SEÇÃO", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }

        for (Sala room : listSala) {
            if (room.getCodigo() == sala.getCodigo()) {
                return listSala.indexOf(room);
            }
        }

        return -1;
    }

    private int posicaoFilmeNoArray(Filme filme) {
        try {
            listFilme = fixFilme.relatorio();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELATÓRIO - Filme], ERRO: " + sqlex.getMessage(), "ERROR SEÇÃO", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }

        for (Filme movie : listFilme) {
            if (movie.getCodigo() == filme.getCodigo()) {
                return listFilme.indexOf(movie);
            }
        }

        return -1;
    }

    private void popularJComboBoxFilme() {
        cbxFilme.setModel(new DefaultComboBoxModel());

        try {
            listFilme = fixFilme.relatorio();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELATÓRIO - Filme], ERRO: " + sqlex.getMessage(), "ERROR SEÇÃO", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }

        for (Filme filme : listFilme) {
            if (filme != null) {
                cbxFilme.addItem(filme.getTitulo());
            }
        }
    }

    private void popularJComboBoxSala() {
        cbxSala.setModel(new DefaultComboBoxModel());

        try {
            listSala = fixSala.relatorio();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELATÓRIO - Sala], ERRO: " + sqlex.getMessage(), "ERROR SEÇÃO", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }

        for (Sala sala : listSala) {
            if (sala != null) {
                cbxSala.addItem(Integer.toString(sala.getNumero()));
            }
        }
    }

    private void popularJComboBox() {
        cbxEscolher.setModel(new DefaultComboBoxModel());

        try {
            listSecao = fixSecao.relatorio();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELATÓRIO], ERRO: " + sqlex.getMessage(), "ERROR SEÇÃO", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }

        for (Secao session : listSecao) {
            if (session != null) {
                cbxEscolher.addItem(Integer.toString(session.getCodigo()));
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupBtnCrudSecao;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcluido;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JComboBox<String> cbxEscolher;
    private javax.swing.JComboBox<String> cbxFilme;
    private javax.swing.JComboBox<String> cbxSala;
    private javax.swing.JLabel jiformativo;
    private javax.swing.JLabel jiformativo1;
    private javax.swing.JLabel lbAno;
    private javax.swing.JLabel lbDia;
    private javax.swing.JLabel lbDiaSecao;
    private javax.swing.JLabel lbFilme;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbHoraSecao;
    private javax.swing.JLabel lbMes;
    private javax.swing.JLabel lbMinutos;
    private javax.swing.JLabel lbSala;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbqtdPoltronasOuculpadas;
    private javax.swing.JPanel pnIncluir;
    private javax.swing.JRadioButton rbAlterar;
    private javax.swing.JRadioButton rbConsultar;
    private javax.swing.JRadioButton rbExcluir;
    private javax.swing.JRadioButton rbIncluir;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfDia;
    private javax.swing.JTextField tfHora;
    private javax.swing.JTextField tfMes;
    private javax.swing.JTextField tfMinutos;
    private javax.swing.JTextField tflbqtdPoltronasOuculpadas;
    // End of variables declaration//GEN-END:variables
}
