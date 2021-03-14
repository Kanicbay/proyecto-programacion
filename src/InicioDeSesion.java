
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class InicioDeSesion extends javax.swing.JFrame{
    public static Usuario user2;
    /**
     * Creates new form InicioDeSecion
     */
    FondoPanel fondo = new FondoPanel();
    public InicioDeSesion() {
        this.setContentPane(fondo);
        initComponents();
        this.setTitle("The House of the Future Store");
        this.setLocationRelativeTo(InicioDeSesion.this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        pswContrasenia = new javax.swing.JPasswordField();
        btnAceptar = new javax.swing.JButton();
        lblInicioSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inicio de sesión");

        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblUsuario.setText("Usuario");

        lblContraseña.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblContraseña.setText("Contraseña");

        btnAceptar.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblInicioSesion.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        lblInicioSesion.setText("Inicio de sesión");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblInicioSesion)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblContraseña))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario)
                            .addComponent(pswContrasenia))))
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblInicioSesion)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContraseña)
                    .addComponent(pswContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnAceptar)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        String usuario;
        String contrasenia;
        
        try{
            if(txtUsuario.getText().isEmpty() || pswContrasenia.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Existen Campos Vacíos!","Error!",JOptionPane.ERROR_MESSAGE);
            }else{
                usuario = txtUsuario.getText();
                contrasenia = pswContrasenia.getText();

                // Se evitar que se intente iniciar Sesion si no existen datos agregados por primera vez
                if(Bienvenida.users.isEmpty()){
                    JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrectos","Error!",JOptionPane.ERROR_MESSAGE);
                    txtUsuario.setText(null);
                    pswContrasenia.setText(null);
                }
                else{
                    // Se busca en el arreglo de usuarios con sus datos cual coincide con los datos ingresados en iniciar sesion
                    for(int i=0;i<Bienvenida.users.size();i++){
                        if((Bienvenida.users.get(i).iniciarSesion(usuario, contrasenia))==true){
                            user2 = Bienvenida.users.get(i);
                            JOptionPane.showMessageDialog(rootPane,"Ingreso Exitoso!");
                            Tienda nuevaT = new Tienda();
                            nuevaT.setVisible(true);
                            nuevaT.setTitle("Disfruta tu Compra! " + usuario);
                            i=Bienvenida.users.size();
                            this.dispose();

                        }
                        else{
                            JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrectos","Error!",JOptionPane.ERROR_MESSAGE);
                            txtUsuario.setText(null);
                            pswContrasenia.setText(null);
                        }
                    }

                } 
            }
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Ingrese los datos correctamente","Error!",JOptionPane.ERROR_MESSAGE);
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(rootPane,"Ingrese los datos correctamente","Error!",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioDeSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pswContrasenia;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
          imagen= new ImageIcon(getClass().getResource("/imagenes/Fondo.jpeg")).getImage(); 
          g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
          setOpaque(false);
          super.paint(g);
        }
    }
}
