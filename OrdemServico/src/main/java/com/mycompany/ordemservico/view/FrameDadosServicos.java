/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ordemservico.view;

import com.mycompany.ordemservico.controller.Controller;
import com.mycompany.ordemservico.model.Servicos;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class FrameDadosServicos extends javax.swing.JFrame {

    /**
     * Creates new form FrameDadosServicos
     */
    public FrameDadosServicos() {
        initComponents();
        setLocationRelativeTo(this);
        Controller.listaServicos = new ArrayList<>();
    }
   
            

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbServicos = new javax.swing.JLabel();
        cbFreios = new javax.swing.JCheckBox();
        cbAguaRadiador = new javax.swing.JCheckBox();
        cbTrocaOleo = new javax.swing.JCheckBox();
        cbAlinhamento = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpDescricaoRadiador = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpDescricaoFreio = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tpDescricaoAlinhamento = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tpDescricaoTrocaOleo1 = new javax.swing.JTextPane();
        cbEmbreagem = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        tpDescricaoEmbreagem = new javax.swing.JTextPane();
        lbPrecoFreio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbPrecoRadiador = new javax.swing.JLabel();
        lbPrecoOleo = new javax.swing.JLabel();
        lbPrecoAlinhamento = new javax.swing.JLabel();
        lbPrecoEmbreagem = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btAcessarPecas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbServicos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbServicos.setText("SERVIÇOS:");

        cbFreios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbFreios.setText("Revisão dos componentes de freio");
        cbFreios.setName("100"); // NOI18N

        cbAguaRadiador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbAguaRadiador.setText("Checagem do nível de água no radiador");
        cbAguaRadiador.setName("50"); // NOI18N
        cbAguaRadiador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAguaRadiadorActionPerformed(evt);
            }
        });

        cbTrocaOleo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbTrocaOleo.setText("Troca de óleo");
        cbTrocaOleo.setName("280"); // NOI18N

        cbAlinhamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbAlinhamento.setText("Alinhamento e Balanceamento");
        cbAlinhamento.setName("120"); // NOI18N

        tpDescricaoRadiador.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tpDescricaoRadiador.setText("Serviço consiste em inspecionar o sistema de arrefecimento do veículo para garantir que o nível de líquido de arrefecimento no radiador esteja adequado.");
        jScrollPane1.setViewportView(tpDescricaoRadiador);

        tpDescricaoFreio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tpDescricaoFreio.setText("Avaliação de forma preventiva de todos os componentes e peças do sistema de freio do veículo.");
        jScrollPane2.setViewportView(tpDescricaoFreio);

        tpDescricaoAlinhamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tpDescricaoAlinhamento.setText("O alinhamento e balanceamento são serviços vitais para manter a estabilidade, segurança e eficiência do veículo.");
        jScrollPane3.setViewportView(tpDescricaoAlinhamento);

        tpDescricaoTrocaOleo1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tpDescricaoTrocaOleo1.setText("A troca de óleo é um serviço essencial de manutenção automotiva para garantir o bom funcionamento do motor e prolongar a vida útil do veículo.");
        jScrollPane4.setViewportView(tpDescricaoTrocaOleo1);

        cbEmbreagem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbEmbreagem.setText("Manutenção de embreagem");
        cbEmbreagem.setName("500"); // NOI18N
        cbEmbreagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmbreagemActionPerformed(evt);
            }
        });

        tpDescricaoEmbreagem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tpDescricaoEmbreagem.setText("A embreagem desempenha um papel fundamental na transmissão de potência do motor para as rodas. A manutenção regular da embreagem é essencial para garantir um funcionamento suave e eficiente do veículo. ");
        jScrollPane5.setViewportView(tpDescricaoEmbreagem);

        lbPrecoFreio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbPrecoFreio.setText("R$ 100.00");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Custo do Serviço");

        lbPrecoRadiador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbPrecoRadiador.setText("R$ 50.00");

        lbPrecoOleo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbPrecoOleo.setText("R$ 280.00");

        lbPrecoAlinhamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbPrecoAlinhamento.setText("R$ 120.00");

        lbPrecoEmbreagem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbPrecoEmbreagem.setText("R$ 500.00");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btAcessarPecas.setText("Peças Utilizadas");
        btAcessarPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcessarPecasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbFreios)
                                .addComponent(cbAguaRadiador)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(21, 21, 21)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addComponent(cbAlinhamento)
                                .addComponent(cbTrocaOleo)
                                .addComponent(cbEmbreagem))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPrecoRadiador)
                                    .addComponent(lbPrecoOleo)
                                    .addComponent(lbPrecoAlinhamento)
                                    .addComponent(lbPrecoFreio)
                                    .addComponent(lbPrecoEmbreagem))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbServicos)
                                .addGap(317, 317, 317))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btCancelar)
                                .addGap(29, 29, 29)
                                .addComponent(btAcessarPecas)
                                .addGap(28, 28, 28))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbServicos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbFreios)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrecoFreio))
                .addGap(35, 35, 35)
                .addComponent(cbAguaRadiador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrecoRadiador))
                .addGap(35, 35, 35)
                .addComponent(cbTrocaOleo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrecoOleo))
                .addGap(29, 29, 29)
                .addComponent(cbAlinhamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrecoAlinhamento))
                .addGap(35, 35, 35)
                .addComponent(cbEmbreagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrecoEmbreagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btAcessarPecas))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAguaRadiadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAguaRadiadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAguaRadiadorActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        dispose();

        FrameAcessoTelas acessoTela = new FrameAcessoTelas();
        acessoTela.setVisible(true);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btAcessarPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcessarPecasActionPerformed
        double valorRadiador = Double.parseDouble(cbAguaRadiador.getName());
        double valorFreio = Double.parseDouble(cbFreios.getName());
        double valorAlinhamento = Double.parseDouble(cbAlinhamento.getName());
        double valorEmbreagem = Double.parseDouble(cbEmbreagem.getName());
        double valorOleo = Double.parseDouble(cbTrocaOleo.getName());
        
        if(cbAguaRadiador.isSelected()) {
            Servicos servico = new Servicos();
            
            servico.setServico(cbAguaRadiador.getText());
            servico.setValor(BigDecimal.valueOf(valorRadiador));
            Controller.listaServicos.add(servico);
        }
        
        if(cbFreios.isSelected()) {
            Servicos servico2 = new Servicos();
            
            servico2.setServico(cbFreios.getText());
            servico2.setValor(BigDecimal.valueOf(valorFreio));
            Controller.listaServicos.add(servico2);
        }
        
        if(cbAlinhamento.isSelected()) {
            Servicos servico3 = new Servicos();
            
            servico3.setServico(cbAlinhamento.getText());
            servico3.setValor(BigDecimal.valueOf(valorAlinhamento));
            Controller.listaServicos.add(servico3);
        }
        
        
        if(cbEmbreagem.isSelected()) {
            Servicos servico4 = new Servicos();
            
            servico4.setServico(cbEmbreagem.getText());
            servico4.setValor(BigDecimal.valueOf(valorEmbreagem));
            Controller.listaServicos.add(servico4);
        }
        
        if(cbTrocaOleo.isSelected()) {
            Servicos servico5 = new Servicos();
            
            servico5.setServico(cbTrocaOleo.getText());
            servico5.setValor(BigDecimal.valueOf(valorOleo));
            Controller.listaServicos.add(servico5);
        }
        
        if (Controller.listaServicos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você precisa selecionar um Serviço", "ERRO!", JOptionPane.ERROR_MESSAGE);
        } else {
            
            JOptionPane.showMessageDialog(null, "Serviços cadastrados com Sucesso!");
            
            FrameDadosPecas dadosPecasTelas = new FrameDadosPecas();
            dadosPecasTelas.setVisible(true);
            
            dispose();
        }        
    }//GEN-LAST:event_btAcessarPecasActionPerformed

    private void cbEmbreagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmbreagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEmbreagemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcessarPecas;
    private javax.swing.JButton btCancelar;
    private javax.swing.JCheckBox cbAguaRadiador;
    private javax.swing.JCheckBox cbAlinhamento;
    private javax.swing.JCheckBox cbEmbreagem;
    private javax.swing.JCheckBox cbFreios;
    private javax.swing.JCheckBox cbTrocaOleo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbPrecoAlinhamento;
    private javax.swing.JLabel lbPrecoEmbreagem;
    private javax.swing.JLabel lbPrecoFreio;
    private javax.swing.JLabel lbPrecoOleo;
    private javax.swing.JLabel lbPrecoRadiador;
    private javax.swing.JLabel lbServicos;
    private javax.swing.JTextPane tpDescricaoAlinhamento;
    private javax.swing.JTextPane tpDescricaoEmbreagem;
    private javax.swing.JTextPane tpDescricaoFreio;
    private javax.swing.JTextPane tpDescricaoRadiador;
    private javax.swing.JTextPane tpDescricaoTrocaOleo1;
    // End of variables declaration//GEN-END:variables
}
