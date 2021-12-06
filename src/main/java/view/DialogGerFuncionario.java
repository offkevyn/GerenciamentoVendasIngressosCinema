package view;

import controller.Conexao;
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
import model.Funcionario;
import model.Sala;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

public class DialogGerFuncionario extends javax.swing.JDialog {

    private ArrayList<Funcionario> listFunc;
    private FuncionarioFichario fixFunc;

    private Border borderDefault;

    public DialogGerFuncionario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        borderDefault = tfCpf.getBorder();
        tfCpf.addKeyListener(listenerTfNumber);
        tfCtps.addKeyListener(listenerTfNumber);
        tfTelefone.addKeyListener(listenerTfNumber);

        cbxEscolher.setVisible(false);
        jiformativo.setVisible(false);

        pnIncluir.setVisible(false);

        try {
            fixFunc = new FuncionarioFichario();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro de conexão, ERRO: " + sqlex.getMessage(), "ERROR FUNCIONÁRIO", JOptionPane.ERROR_MESSAGE);
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

        GroupBtnCrudFuncionario = new javax.swing.ButtonGroup();
        lbTitulo = new javax.swing.JLabel();
        jiformativo1 = new javax.swing.JLabel();
        rbIncluir = new javax.swing.JRadioButton();
        rbExcluir = new javax.swing.JRadioButton();
        rbConsultar = new javax.swing.JRadioButton();
        rbAlterar = new javax.swing.JRadioButton();
        btnConcluido = new javax.swing.JButton();
        cbxEscolher = new javax.swing.JComboBox<>();
        jiformativo = new javax.swing.JLabel();
        pnIncluir = new javax.swing.JPanel();
        lbCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        lbNome = new javax.swing.JLabel();
        lbCtps = new javax.swing.JLabel();
        tfCtps = new javax.swing.JTextField();
        lbMatricula = new javax.swing.JLabel();
        tfMatricula = new javax.swing.JTextField();
        btnArquivo = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionário");

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Gerenciamento de Funcionário");

        jiformativo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jiformativo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jiformativo1.setText("MENU");

        GroupBtnCrudFuncionario.add(rbIncluir);
        rbIncluir.setText("INCLUIR");
        rbIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIncluirActionPerformed(evt);
            }
        });

        GroupBtnCrudFuncionario.add(rbExcluir);
        rbExcluir.setText("EXCLUIR");
        rbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbExcluirActionPerformed(evt);
            }
        });

        GroupBtnCrudFuncionario.add(rbConsultar);
        rbConsultar.setText("CONSULTAR");
        rbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConsultarActionPerformed(evt);
            }
        });

        GroupBtnCrudFuncionario.add(rbAlterar);
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

        cbxEscolher.setName(""); // NOI18N
        cbxEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEscolherActionPerformed(evt);
            }
        });

        jiformativo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jiformativo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jiformativo.setText("Escolha o nome do funcionário:");

        pnIncluir.setBackground(new java.awt.Color(250, 250, 250));

        lbCpf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCpf.setText("CPF:");

        tfCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCpfKeyTyped(evt);
            }
        });

        tfTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefoneKeyTyped(evt);
            }
        });

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

        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeKeyTyped(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNome.setText("Nome:");

        lbCtps.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCtps.setText("CTPS:");

        tfCtps.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCtpsKeyTyped(evt);
            }
        });

        lbMatricula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbMatricula.setText("Matrícula:");

        tfMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMatriculaKeyTyped(evt);
            }
        });

        btnArquivo.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        btnArquivo.setText("Arquivo");
        btnArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArquivoActionPerformed(evt);
            }
        });

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCtps)
                            .addComponent(tfCtps, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnIncluirLayout.createSequentialGroup()
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnIncluirLayout.createSequentialGroup()
                                    .addComponent(btnIncluir)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelar))
                                .addGroup(pnIncluirLayout.createSequentialGroup()
                                    .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lbMatricula)
                            .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnArquivo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                        .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTelefone)
                            .addComponent(lbCtps))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfCtps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnIncluirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnRelatorio.setText("Relatório");
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
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRelatorio)
                        .addGap(37, 37, 37)))
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
                        .addComponent(btnConcluido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRelatorio))
                    .addComponent(pnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIncluirActionPerformed
        cbxEscolher.setVisible(false);
        jiformativo.setVisible(false);
        configFunc();

        pnIncluir.setVisible(true);

        btnIncluir.setText("INCLUIR");
    }//GEN-LAST:event_rbIncluirActionPerformed

    private void rbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbExcluirActionPerformed
        if (qtdFunc() > 0) {
            restart();
            configFunc();
            cbxEscolher.setVisible(true);
            jiformativo.setVisible(true);
            popularJComboBox();
        } else
            JOptionPane.showMessageDialog(this, "A lista está VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbExcluirActionPerformed

    private void rbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConsultarActionPerformed
        if (qtdFunc() > 0) {
            cbxEscolher.setVisible(true);
            jiformativo.setVisible(true);

            btnIncluir.setVisible(false);
            btnCancelar.setVisible(false);

            popularJComboBox();
        } else
            JOptionPane.showMessageDialog(this, "A lista está VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbConsultarActionPerformed

    private void rbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlterarActionPerformed
        if (qtdFunc() > 0) {
            restart();
            configFunc();
            cbxEscolher.setVisible(true);
            jiformativo.setVisible(true);
            popularJComboBox();
            
            for (int i = 0; i < pnIncluir.getComponentCount(); i++) {
                Component c = pnIncluir.getComponent(i);

                if (c instanceof JTextField) {
                    JTextField field = (JTextField) c;

                    field.setBorder(borderDefault);
                }
            }
        } else
            JOptionPane.showMessageDialog(this, "A lista está VAZIA!!!", "VAZIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_rbAlterarActionPerformed

    private void btnConcluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluidoActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnConcluidoActionPerformed

    private void cbxEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEscolherActionPerformed
        if (cbxEscolher.getSelectedIndex() >= 0) {
            pnIncluir.setVisible(true);

            Funcionario employe = listFunc.get(cbxEscolher.getSelectedIndex());

            tfCpf.setText(employe.getCpf());
            tfNome.setText(employe.getNome());
            tfTelefone.setText(employe.getTelefone());
            tfCtps.setText(employe.getCtps());
            tfMatricula.setText(employe.getMatricula());

            if (rbAlterar.isSelected()) {
                btnIncluir.setText("ALTERAR");
                btnArquivo.setVisible(false);

                tfCpf.setEditable(true);
                tfNome.setEditable(true);
                tfTelefone.setEditable(true);
                tfCtps.setEditable(true);
                tfMatricula.setEditable(true);
            } else if (rbExcluir.isSelected()) {
                btnCancelar.setVisible(true);
                btnIncluir.setVisible(true);
                btnArquivo.setVisible(false);
                btnIncluir.setText("EXCLUIR");

                tfCpf.setEditable(false);
                tfNome.setEditable(false);
                tfTelefone.setEditable(false);
                tfCtps.setEditable(false);
                tfMatricula.setEditable(false);
            } else if (rbConsultar.isSelected()) {
                btnCancelar.setVisible(false);
                btnIncluir.setVisible(false);
                btnArquivo.setVisible(true);

                tfCpf.setEditable(false);
                tfNome.setEditable(false);
                tfTelefone.setEditable(false);
                tfCtps.setEditable(false);
                tfMatricula.setEditable(false);
            }
        }
    }//GEN-LAST:event_cbxEscolherActionPerformed

    private void tfCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCpfKeyTyped

    }//GEN-LAST:event_tfCpfKeyTyped

    private void tfTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefoneKeyTyped

    }//GEN-LAST:event_tfTelefoneKeyTyped

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Funcionario employe = new Funcionario();

        if ((tfCpf.getText().isEmpty() || tfNome.getText().isEmpty() || tfTelefone.getText().isEmpty() || tfCtps.getText().isEmpty() || tfMatricula.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios", "ERROR CAMPO VAZIO", JOptionPane.ERROR_MESSAGE);
            mostrarCamposObrigatorio();
            return;
        }

        if (!btnIncluir.getText().equals("INCLUIR")) {
            employe = listFunc.get(cbxEscolher.getSelectedIndex());
        }
        employe.setCpf(tfCpf.getText());
        employe.setNome(tfNome.getText());
        employe.setTelefone(tfTelefone.getText());
        employe.setCtps(tfCtps.getText());
        employe.setMatricula(tfMatricula.getText());

        switch (btnIncluir.getText()) {
            case "INCLUIR": {

                try {
                    fixFunc.incluir(employe);
                } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
                {
                    JOptionPane.showMessageDialog(null, "Erro na query [INCLUIR], ERRO: " + sqlex.getMessage(), "ERROR FUNCIONÁRIO", JOptionPane.ERROR_MESSAGE);
                    sqlex.printStackTrace();
                }

            }
            break;
            case "EXCLUIR": {
                int ConfirmDialog = JOptionPane.showConfirmDialog(this, "Deseja realamente EXCLUIR esse funcionário???", "EXCLUIR???", JOptionPane.INFORMATION_MESSAGE);
                if (ConfirmDialog == JOptionPane.YES_OPTION) {

                    try {
                        fixFunc.remove(employe);
                    } catch (SQLException sqlex)//Retorna um erro caso exista erro de query SQL
                    {
                        if (sqlex.getSQLState().equalsIgnoreCase("23503")) {
                            JOptionPane.showMessageDialog(null, "Não pode ser excluido, pois tem dependente(s): " + sqlex.getMessage(), "ERROR FUNCIONÁRIO", JOptionPane.ERROR_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro na query [REMOVER], ERRO: " + sqlex.getMessage(), "ERROR FUNCIONÁRIO", JOptionPane.ERROR_MESSAGE);
                        }
                        sqlex.printStackTrace();
                    }

                } else {
                    btnCancelarActionPerformed(evt);
                }
                break;
            }
            case "ALTERAR": {
                int ConfirmDialog = JOptionPane.showConfirmDialog(this, "Deseja realamente ALTERAR esse  funcionário???", "ALTERAR???", JOptionPane.INFORMATION_MESSAGE);
                if (ConfirmDialog == JOptionPane.YES_OPTION) {

                    try {
                        fixFunc.alteracao(employe);
                    } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
                    {
                        JOptionPane.showMessageDialog(null, "Erro na query [ALTERAÇÃO], ERRO: " + sqlex.getMessage(), "ERROR FUNCIONÁRIO", JOptionPane.ERROR_MESSAGE);
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

    private void tfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyTyped
        tfNome.setBorder(borderDefault);
    }//GEN-LAST:event_tfNomeKeyTyped

    private void tfCtpsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCtpsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCtpsKeyTyped

    private void tfMatriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMatriculaKeyTyped
        tfMatricula.setBorder(borderDefault);
    }//GEN-LAST:event_tfMatriculaKeyTyped

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        try {
            Connection conn = Conexao.getConexao();
            
            Map parameters = new HashMap();
            parameters.put("REPORT_CONNECTION", conn);

            JasperReport relCompilado = JasperCompileManager.compileReport("src/main/java/rel/Funcionario.jrxml");

            JasperPrint relPreenchido = JasperFillManager.fillReport(relCompilado, parameters, conn);

            JDialog tela = new JDialog(this, "Relatório Funcionário", true);
            tela.setSize(1000, 700);

            JRViewer painelRel = new JRViewer(relPreenchido);

            tela.getContentPane().add(painelRel);

            tela.setVisible(true);

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro gerar relatório [ JasperReport ] " + ex.getMessage(), "ERROR FUNCIONÁRIO", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELATÓRIO], ERRO: " + sqlex.getMessage(), "ERROR FUNCIONÁRIO", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArquivoActionPerformed
        try {
            Connection conn = Conexao.getConexao();

            Funcionario employe = listFunc.get(cbxEscolher.getSelectedIndex());

            Map parameters = new HashMap();
            parameters.put("REPORT_CONNECTION", conn);
            parameters.put("ID_FUNC", employe.getCodigo());

            JasperReport relCompilado = JasperCompileManager.compileReport("src/main/java/rel/FuncionarioPeloID.jrxml");

            JasperPrint relPreenchido = JasperFillManager.fillReport(relCompilado, parameters, conn);

            JDialog tela = new JDialog(this, "Relatório Funcionário", true);
            tela.setSize(1000, 700);

            JRViewer painelRel = new JRViewer(relPreenchido);

            tela.getContentPane().add(painelRel);

            tela.setVisible(true);

        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Erro gerar relatório [ JasperReport ] " + ex.getMessage(), "ERROR SEÇÃO", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELATÓRIO], ERRO: " + sqlex.getMessage(), "ERROR SEÇÃO", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }
    }//GEN-LAST:event_btnArquivoActionPerformed

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
        tfCtps.setText("");
        tfMatricula.setText("");
    }

    private void configFunc() {
        rbAlterar.setEnabled(false);
        rbConsultar.setEnabled(false);
        rbExcluir.setEnabled(false);
        rbIncluir.setEnabled(false);
        
        btnArquivo.setVisible(false);

        pnIncluir.setVisible(true);
        btnIncluir.setVisible(true);
        btnCancelar.setVisible(true);

//        
        tfCpf.setEditable(true);
//        tfNome.setEditable(true);
//        tfTelefone.setEditable(true);
//        tfCtps.setEditable(true);
//        tfMatricula.setEditable(true);
//
//        tfCpf.setText("");
//        tfNome.setText("");
//        tfTelefone.setText("");
//        tfCtps.setText("");
//        tfMatricula.setText("");
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

    private int qtdFunc() {
        int cont = 0;
        try {
            cont = fixFunc.qtdEntidade();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [QTD FUNCIONÁRIO], ERRO: " + sqlex.getMessage(), "ERROR FUNCIONÁRIO", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }
        return cont;
    }

    private void popularJComboBox() {
        cbxEscolher.setModel(new DefaultComboBoxModel());

        try {
            listFunc = fixFunc.relatorio();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELATÓRIO], ERRO: " + sqlex.getMessage(), "ERROR FUNCIONÁRIO", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }

        for (Funcionario employe : listFunc) {
            if (employe != null) {
                cbxEscolher.addItem(employe.getNome());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupBtnCrudFuncionario;
    private javax.swing.JButton btnArquivo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConcluido;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JComboBox<String> cbxEscolher;
    private javax.swing.JLabel jiformativo;
    private javax.swing.JLabel jiformativo1;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbCtps;
    private javax.swing.JLabel lbMatricula;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnIncluir;
    private javax.swing.JRadioButton rbAlterar;
    private javax.swing.JRadioButton rbConsultar;
    private javax.swing.JRadioButton rbExcluir;
    private javax.swing.JRadioButton rbIncluir;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfCtps;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
