/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author danie
 */
public class Visual extends javax.swing.JFrame {
    Tigo tigo;
    public Visual(Tigo tigo) {
        initComponents();
        this.tigo=tigo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        btnagregarplan = new javax.swing.JButton();
        btnpagoplan = new javax.swing.JButton();
        btnagregaramigo = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema de cobros por servicios");

        btnsalir.setBackground(new java.awt.Color(0, 51, 153));
        btnsalir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btnagregarplan.setBackground(new java.awt.Color(0, 51, 153));
        btnagregarplan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnagregarplan.setForeground(new java.awt.Color(255, 255, 255));
        btnagregarplan.setText("Agregar plan");
        btnagregarplan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarplanActionPerformed(evt);
            }
        });

        btnpagoplan.setBackground(new java.awt.Color(0, 51, 153));
        btnpagoplan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnpagoplan.setForeground(new java.awt.Color(255, 255, 255));
        btnpagoplan.setText("Pago plan");
        btnpagoplan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagoplanActionPerformed(evt);
            }
        });

        btnagregaramigo.setBackground(new java.awt.Color(0, 51, 153));
        btnagregaramigo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnagregaramigo.setForeground(new java.awt.Color(255, 255, 255));
        btnagregaramigo.setText("Agregar Amigo");
        btnagregaramigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregaramigoActionPerformed(evt);
            }
        });

        btnlistar.setBackground(new java.awt.Color(0, 51, 153));
        btnlistar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnlistar.setForeground(new java.awt.Color(255, 255, 255));
        btnlistar.setText("Listar");
        btnlistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnagregarplan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnpagoplan, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnagregaramigo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnagregarplan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnpagoplan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnagregaramigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnlistar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnagregarplanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarplanActionPerformed
        AgregarPlan agregarplan = new AgregarPlan(tigo);
        agregarplan.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnagregarplanActionPerformed
    
    private void btnpagoplanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagoplanActionPerformed
        PagoPlan pagoplan = new PagoPlan(tigo);
        pagoplan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnpagoplanActionPerformed

    private void btnagregaramigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregaramigoActionPerformed
        AgregarAmigo agregaramigo = new AgregarAmigo(tigo);
        agregaramigo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnagregaramigoActionPerformed

    private void btnlistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistarActionPerformed
        Listar listar = new Listar(tigo);
        listar.setVisible(true);
        this.dispose();
        
        
        
    }//GEN-LAST:event_btnlistarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregaramigo;
    private javax.swing.JButton btnagregarplan;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnpagoplan;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
