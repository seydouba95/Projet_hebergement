/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

/**
 *
 * @author seydou
 */
public class Attribuer_lits extends javax.swing.JFrame {

    /**
     * Creates new form Attribuer_lits
     */
    public Attribuer_lits() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_ajouter2 = new javax.swing.JButton();
        btn_modier = new javax.swing.JButton();
        btn_supprimer1 = new javax.swing.JButton();
        btn_actualiser1 = new javax.swing.JButton();
        btn_retour = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 48)); // NOI18N
        jLabel2.setText("ATTRIBUTION DES LITS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 600, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outils/wallpaper7.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 1080, 600));

        btn_ajouter2.setBackground(java.awt.Color.white);
        btn_ajouter2.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btn_ajouter2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outils/icons8-plus-30.png"))); // NOI18N
        btn_ajouter2.setText("Ajouter");
        btn_ajouter2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_ajouter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajouter2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ajouter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 150, 40));

        btn_modier.setBackground(java.awt.Color.white);
        btn_modier.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btn_modier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outils/icons8-pencil-30.png"))); // NOI18N
        btn_modier.setText("Modifer");
        btn_modier.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_modier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modierActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modier, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 150, 40));

        btn_supprimer1.setBackground(java.awt.Color.white);
        btn_supprimer1.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btn_supprimer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outils/icons8-remove-30.png"))); // NOI18N
        btn_supprimer1.setText("Supprimer");
        btn_supprimer1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_supprimer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_supprimer1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_supprimer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, 150, 40));

        btn_actualiser1.setBackground(java.awt.Color.white);
        btn_actualiser1.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btn_actualiser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outils/icons8-synchronize-30.png"))); // NOI18N
        btn_actualiser1.setText("Actualiser");
        btn_actualiser1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_actualiser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualiser1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualiser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 150, 40));

        btn_retour.setBackground(java.awt.Color.white);
        btn_retour.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        btn_retour.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outils/icons8-undo-30.png"))); // NOI18N
        btn_retour.setText("Retour");
        btn_retour.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_retourActionPerformed(evt);
            }
        });
        getContentPane().add(btn_retour, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 570, 150, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/outils/wallpaper7.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 1080, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ajouter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajouter2ActionPerformed

    }//GEN-LAST:event_btn_ajouter2ActionPerformed

    private void btn_modierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modierActionPerformed

    private void btn_supprimer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_supprimer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_supprimer1ActionPerformed

    private void btn_actualiser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualiser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualiser1ActionPerformed

    private void btn_retourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_retourActionPerformed
        Pcs_accueil ad = new Pcs_accueil();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_retourActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Attribuer_lits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attribuer_lits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attribuer_lits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attribuer_lits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attribuer_lits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualiser1;
    private javax.swing.JButton btn_ajouter2;
    private javax.swing.JButton btn_modier;
    private javax.swing.JButton btn_retour;
    private javax.swing.JButton btn_supprimer1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
