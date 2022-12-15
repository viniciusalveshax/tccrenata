/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import com.jtattoo.plaf.smart.*;
import java.util.Properties;
import javax.swing.UIManager;
import javax.swing.JFrame;
import static view.configtestes.app;

/**
 *
 * @author renatarodriguespintos
 */
public class configtestes extends javax.swing.JFrame {
public static configtestes app = null;
    /**
     * Creates new form configtestes
     */
    public configtestes() {
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

        bgaluno = new javax.swing.ButtonGroup();
        configgeral = new javax.swing.JButton();
        editarid = new javax.swing.JButton();
        editdisc = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("configuração de testes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        configgeral.setText("configuaracao geral");
        configgeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configgeralActionPerformed(evt);
            }
        });

        editarid.setText("editar testes de identificacao ");
        editarid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaridActionPerformed(evt);
            }
        });

        editdisc.setText("editar testes de discriminacao ");
        editdisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editdiscActionPerformed(evt);
            }
        });

        jButton1.setText("salvar teste");

        jButton2.setText("importar teste");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editarid, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(editdisc, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(configgeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(configgeral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editarid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editdisc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void configgeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configgeralActionPerformed
        // TODO add your handling code here:
     configuracaogeral config = new configuracaogeral();
        config.setLocationRelativeTo(null);
        config.setVisible(true);
        
        
    }//GEN-LAST:event_configgeralActionPerformed

    private void editaridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editaridActionPerformed

    private void editdiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editdiscActionPerformed
        // TODO add your handling code here:
        configtestesdisc config = new configtestesdisc();
        config.setLocationRelativeTo(null);
        config.setVisible(true);
    }//GEN-LAST:event_editdiscActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      try {
            //for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               // if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                  //  break;
               // }
                // set your theme
                 Properties props = new Properties();
            
            props.put("logoString", "my company"); 
            props.put("licenseKey", "INSERT YOUR LICENSE KEY HERE");
            
            props.put("selectionBackgroundColor", "180 240 197"); 
            props.put("menuSelectionBackgroundColor", "180 240 197"); 
            
            props.put("controlColor", "218 254 230");
            props.put("controlColorLight", "218 254 230");
            props.put("controlColorDark", "180 240 197"); 

            props.put("buttonColor", "218 230 254");
            props.put("buttonColorLight", "255 255 255");
            props.put("buttonColorDark", "244 242 232");

            props.put("rolloverColor", "218 254 230"); 
            props.put("rolloverColorLight", "218 254 230"); 
            props.put("rolloverColorDark", "180 240 197"); 

            props.put("windowTitleForegroundColor", "0 0 0");
            props.put("windowTitleBackgroundColor", "180 240 197"); 
            props.put("windowTitleColorLight", "218 254 230"); 
            props.put("windowTitleColorDark", "180 240 197"); 
            props.put("windowBorderColor", "218 254 230");
            
            SmartLookAndFeel.setCurrentTheme(props);
            // select the Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");

            app = new configtestes();
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new configtestes().setVisible(true);
               // configtestes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgaluno;
    private javax.swing.JButton configgeral;
    private javax.swing.JButton editarid;
    private javax.swing.JButton editdisc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
