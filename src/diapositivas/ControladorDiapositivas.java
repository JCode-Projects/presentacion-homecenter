package diapositivas;

import com.sun.j3d.utils.applet.MainFrame;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author JCode
 */
public class ControladorDiapositivas extends javax.swing.JFrame {

    private boolean presentando = false;
    private int diapositiva = 1;
    private MainFrame pantalla = new MainFrame(new Balon(null),0,0);
    
    public ControladorDiapositivas() {
        initComponents();
        pantalla.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bgIniciar = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnSSiguiente = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAnterior = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control Presentación");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PRESENTACIÓN HOMECENTER");

        bgIniciar.setBackground(new java.awt.Color(0, 153, 51));

        btnIniciar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIniciar.setText("INICIAR PRESENTACIÓN");
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgIniciarLayout = new javax.swing.GroupLayout(bgIniciar);
        bgIniciar.setLayout(bgIniciarLayout);
        bgIniciarLayout.setHorizontalGroup(
            bgIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgIniciarLayout.setVerticalGroup(
            bgIniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        btnSSiguiente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSSiguiente.setText(">");
        btnSSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSSiguienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));

        btnAnterior.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAnterior.setText("<");
        btnAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnteriorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bgIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bgIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
        if(!presentando) {
            cambiarEstiloBotonDetener();
            controlarDiapositivas(diapositiva);
            presentando = true;
        } else {
            cambiarEstiloBotonIniciar();
            controlarDiapositivas(0);
            presentando = false;
        }
    }//GEN-LAST:event_btnIniciarMouseClicked

    private void btnSSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSSiguienteMouseClicked
        if(diapositiva == 5) {
            showMessageDialog(pantalla, "Ésta es la última diapositiva", "Error", 0);
        } else {
            diapositiva += 1;
            controlarDiapositivas(diapositiva);
        }
    }//GEN-LAST:event_btnSSiguienteMouseClicked

    private void btnAnteriorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnteriorMouseClicked
        if(diapositiva == 1) {
            showMessageDialog(pantalla, "Ésta es la primer diapositiva", "Error", 0);
        } else {
            diapositiva -= 1;
            controlarDiapositivas(diapositiva);
        }
    }//GEN-LAST:event_btnAnteriorMouseClicked

    private void controlarDiapositivas(int valor) {
        pantalla.setVisible(false);
        
        if(valor == 1) {
            pantalla = new MainFrame(new Balon(null),820,461);
            pantalla.setTitle("Producto: Balón Baloncesto");
            pantalla.setLocation(10, 10);
        } else if(valor == 2) {
            pantalla = new MainFrame(new Portatil(null),820,461);
            pantalla.setTitle("Producto: Computador Portatil");
            pantalla.setLocation(10, 10);
        } else if(valor == 3) {
            pantalla = new MainFrame(new Camara(null),820,461);
            pantalla.setTitle("Producto: Cámara Fotográfica");
            pantalla.setLocation(10, 10);
        } else if(valor == 4) {
            pantalla = new MainFrame(new Dispensador(null),820,461);
            pantalla.setTitle("Producto: Dispensador De Agua");
            pantalla.setLocation(10, 10);
        } else if(valor == 5) {
            pantalla = new MainFrame(new Banana(null),820,461);
            pantalla.setTitle("Producto: Banana Madura");
            pantalla.setLocation(10, 10);
        }
    }
    
    private void cambiarEstiloBotonDetener() {
        btnIniciar.setText("DETENER PRESENTACIÓN");
        bgIniciar.setBackground(new java.awt.Color(255, 0, 51));
    
    }
    
    private void cambiarEstiloBotonIniciar() {
        btnIniciar.setText("INICIAR PRESENTACIÓN");
        bgIniciar.setBackground(new java.awt.Color(0, 153, 51));
    }
    
    public static void main(String args[]) {
        new ControladorDiapositivas().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgIniciar;
    private javax.swing.JLabel btnAnterior;
    private javax.swing.JLabel btnIniciar;
    private javax.swing.JLabel btnSSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
