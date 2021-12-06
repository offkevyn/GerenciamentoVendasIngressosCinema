/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Secao;

public class DialogTabelaSecao extends javax.swing.JDialog {

    private String[] columnNames = {"Número Sala",
        "Data - Hora",
        "Nome Filme",
        "Poltronas oucupadas"};

    private Object[][] data;

    private ArrayList<Secao> listSecao;

    /**
     * Creates new form DialogTabelaSecao
     */
    public DialogTabelaSecao(java.awt.Frame parent, boolean modal, ArrayList<Secao> listSecao) {
        super(parent, modal);
        initComponents();

        this.listSecao = listSecao;
        data = new Object[listSecao.size()][5];
        setData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableSecao = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableSecao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableSecao.setToolTipText("");
        tableSecao.setName("Relatorio Seções"); // NOI18N
        tableSecao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tableSecao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

         
        Secao secao;
        for (int i = 0; i < listSecao.size() ; i++) {
            secao = listSecao.get(i);
            data[i][0] = secao.getSala().getNumero();
            data[i][1] = secao.getDataHora().format(formatter);
            data[i][2] = secao.getFilme().getTitulo();
            data[i][3] = secao.getPoltronasOucupadas();
        }
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        tableSecao.setModel(model);
        //tableSecao.setModel(model);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSecao;
    // End of variables declaration//GEN-END:variables
}
