
package view;

import java.util.Arrays;
import javax.swing.DefaultListModel;


public class TelaDeListagem extends javax.swing.JFrame {
    
    int vetor[] = new int[7];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;

    
    public TelaDeListagem() {
        initComponents();
        // Centraliza a tela de listagem na tela do usuario
        setLocationRelativeTo(null);
        listagem();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumero = new javax.swing.JSpinner();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnOrdem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSelecionado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ltsVetor = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnOrdem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOrdem.setText("Ordernar");
        btnOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Vetor");

        lblSelecionado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSelecionado.setText("[0]");

        ltsVetor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ltsVetor.setModel(lista);
        ltsVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ltsVetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ltsVetor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOrdem)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRemover)
                            .addComponent(btnAdicionar))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(lblSelecionado)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar)
                    .addComponent(jLabel1)
                    .addComponent(lblSelecionado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdem)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void listagem() {
        
        // Looping para listar todos os valores do vetor 
        for (int contador = 0; contador < vetor.length; contador++) {
            lista.addElement(vetor[contador]);
        }
        
    }
    
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // Converte o valor recebido da tela em String e depois para inteiro e adiciona no vetor
        vetor[selecionado] = Integer.parseInt(txtNumero.getValue().toString());
        
        // Remove todos os elementos da lista para poder encher de novo
        lista.removeAllElements();

        listagem();
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void ltsVetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ltsVetorMouseClicked
        // Pega o objeto que foi selecionado pelo usuario e atribui o valor para a variavel selecionado
        selecionado = ltsVetor.getSelectedIndex();
        lblSelecionado.setText("[" + selecionado + "]");
    }//GEN-LAST:event_ltsVetorMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // A posição que for removida recebe o valor de 0
        vetor[selecionado] = 0;
        
        // Remove todos os elementos da lista para poder encher de novo
        lista.removeAllElements();
        
        listagem();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdemActionPerformed
        
        // Coloca a lista em ordem
        Arrays.sort(vetor);
        
        // Remove todos os elementos da lista para poder encher de novo
        lista.removeAllElements();
        
        listagem();
    }//GEN-LAST:event_btnOrdemActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeListagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnOrdem;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSelecionado;
    private javax.swing.JList<String> ltsVetor;
    private javax.swing.JSpinner txtNumero;
    // End of variables declaration//GEN-END:variables
}
