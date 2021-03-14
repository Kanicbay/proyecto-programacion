
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
public class Tienda extends javax.swing.JFrame {
    
    //Asistentes Virtuales
    public static ArrayList<ProductoInteligente> productosInteligentes = new ArrayList<>();
    ProductoInteligente alexa = new ProductoInteligente("Asistente Virtual Alexa","Asistentes Virtuales","Alexa",46.00,25);
    ProductoInteligente googleHome = new ProductoInteligente("Asistente Virtual Google Home","Asistentes Virtuales","Google",55.00,25);
    
    //Productos Habitacion
    ProductoInteligente lucesLed = new ProductoInteligente("Luces LED","Productos de Habitación","Alexa, Google",25.00,25);
    ProductoInteligente lampara = new ProductoInteligente("Lampara Inteligente","Productos de Habitación","Alexa, Google",25.00,20);
    ProductoInteligente smartTv = new ProductoInteligente("Smart TV","Productos de Habitación","Alexa, Google",800.00,15);
    ProductoInteligente playStation = new ProductoInteligente("PlayStation 5","Productos de Habitación","Alexa, Google",1200.00,15);
    ProductoInteligente xboxX = new ProductoInteligente("Xbox X","Productos de Habitación","Alexa, Google",1200.00,15);
    
    //Productos Sala de Estar
    ProductoInteligente muebles = new ProductoInteligente("Muebles","Productos Sala de Estar","Google",1200,20);
    ProductoInteligente mesa = new ProductoInteligente("Mesas","Productos Sala de Estar","Google",400,20);
    ProductoInteligente silla = new ProductoInteligente("Sillas","Productos Sala de Estar","Google",400,20);
    
    //Productos Cocina
    ProductoInteligente cafetera = new ProductoInteligente("Cafetera con WiFi","Productos Cocina","Alexa, Google",250,15);
    ProductoInteligente cocina = new ProductoInteligente("Cocina con WiFi","Productos Cocina","Google",900,10);
    ProductoInteligente microondas = new ProductoInteligente("Microondas con WiFi","Productos Cocina","Alexa, Google",200,15);
    ProductoInteligente refrigeradora = new ProductoInteligente("Refrigeradora con WiFi","Productos Cocina","Alexa, Google",900,5);
    
    public static Factura fct1 = new Factura(productosInteligentes);
    /**
     * Creates new form Tienda
     */
    FondoPanel fondo;
    
    
    public Tienda() {
        this.fondo = new FondoPanel();
        
        this.setContentPane(fondo);
        initComponents();
        productosInteligentes.add(alexa);       //0
        productosInteligentes.add(googleHome);  //1
        productosInteligentes.add(lucesLed);    //2
        productosInteligentes.add(lampara);     //3
        productosInteligentes.add(smartTv);     //4
        productosInteligentes.add(playStation); //5
        productosInteligentes.add(xboxX);       //6
        productosInteligentes.add(muebles);     //7
        productosInteligentes.add(mesa);        //8
        productosInteligentes.add(silla);       //9
        productosInteligentes.add(cafetera);    //10
        productosInteligentes.add(cocina);      //11
        productosInteligentes.add(microondas);  //12
        productosInteligentes.add(refrigeradora); //13
        
        this.setTitle("The House of the Future Store");
        this.setLocationRelativeTo(Tienda.this);
        
        
        ImageIcon alexa =new ImageIcon(getClass().getResource("/imagenes/Alexa.png"));
        ImageIcon icono1 =new ImageIcon(alexa.getImage().getScaledInstance(lblImagenAlexa.getWidth(),lblImagenAlexa.getHeight(),Image.SCALE_DEFAULT));
        lblImagenAlexa.setIcon(icono1);
        
        ImageIcon luces =new ImageIcon(getClass().getResource("/imagenes/Led.png"));
        ImageIcon icono2 =new ImageIcon(luces.getImage().getScaledInstance(lblImagenLuces.getWidth(),lblImagenLuces.getHeight(),Image.SCALE_DEFAULT));
        lblImagenLuces.setIcon(icono2);
        
        ImageIcon consolas =new ImageIcon(getClass().getResource("/imagenes/PS5.png"));
        ImageIcon icono3 =new ImageIcon(consolas.getImage().getScaledInstance(lblImagenConsolas.getWidth(),lblImagenConsolas.getHeight(),Image.SCALE_DEFAULT));
        lblImagenConsolas.setIcon(icono3);
        
        ImageIcon cafeteras =new ImageIcon(getClass().getResource("/imagenes/Cafetera.png"));
        ImageIcon icono4 =new ImageIcon(cafeteras.getImage().getScaledInstance(lblImagenCafeteras.getWidth(),lblImagenCafeteras.getHeight(),Image.SCALE_DEFAULT));
        lblImagenCafeteras.setIcon(icono4);
        
        AsistentesVirtuales.setLocationRelativeTo(null);
        ProductosHabitacion.setLocationRelativeTo(null);
        ProductosSalaEstar.setLocationRelativeTo(null);
        ProductosCocina.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AsistentesVirtuales = new javax.swing.JFrame();
        jPanel9 = new FondoPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new FondoPanel();
        lblAlexa = new javax.swing.JLabel();
        cmbAlexa = new javax.swing.JComboBox<>();
        lblImagenAlexa2 = new javax.swing.JLabel();
        lblPrecioAlexa = new javax.swing.JLabel();
        jPanel8 = new FondoPanel();
        bntGuardarSeccionAsistentes = new javax.swing.JButton();
        jPanel7 = new FondoPanel();
        lblGoogleHome = new javax.swing.JLabel();
        cmbGoogleHome = new javax.swing.JComboBox<>();
        lblImagenGoogle = new javax.swing.JLabel();
        lblPrecioGoogleHome = new javax.swing.JLabel();
        ProductosHabitacion = new javax.swing.JFrame();
        jPanel10 = new FondoPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new FondoPanel();
        cmbLED = new javax.swing.JComboBox<>();
        lblLED = new javax.swing.JLabel();
        lblImagenLuces2 = new javax.swing.JLabel();
        lblPrecioLuces = new javax.swing.JLabel();
        jPanel12 = new FondoPanel();
        lblLamparas = new javax.swing.JLabel();
        cmbLamparas = new javax.swing.JComboBox<>();
        lblImagenLamparas = new javax.swing.JLabel();
        lblPrecioLamparas = new javax.swing.JLabel();
        jPanel13 = new FondoPanel();
        lblTV = new javax.swing.JLabel();
        cmbTV = new javax.swing.JComboBox<>();
        lblImagenTv = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel14 = new FondoPanel();
        lblConsola = new javax.swing.JLabel();
        cmbConsolas = new javax.swing.JComboBox<>();
        lblImagenConsolas2 = new javax.swing.JLabel();
        lblPrecioXboxX = new javax.swing.JLabel();
        jPanel15 = new FondoPanel();
        bntGuardarSeccionHabitacion = new javax.swing.JButton();
        ProductosSalaEstar = new javax.swing.JFrame();
        jPanel26 = new javax.swing.JPanel();
        jPanel18 = new FondoPanel();
        lblSillas = new javax.swing.JLabel();
        cmbSillas = new javax.swing.JComboBox<>();
        lblImagenSillas = new javax.swing.JLabel();
        lblPrecioSillas = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel16 = new FondoPanel();
        lblMuebles = new javax.swing.JLabel();
        cmbMuebles = new javax.swing.JComboBox<>();
        lblImagenMuebles = new javax.swing.JLabel();
        lblPrecioMuebles = new javax.swing.JLabel();
        jPanel19 = new FondoPanel();
        bntGuardarSeleccionSala = new javax.swing.JButton();
        jPanel17 = new FondoPanel();
        lblMesas = new javax.swing.JLabel();
        cmbMesas = new javax.swing.JComboBox<>();
        lblImagenMesas = new javax.swing.JLabel();
        lblPrecioMesas = new javax.swing.JLabel();
        ProductosCocina = new javax.swing.JFrame();
        jPanel20 = new FondoPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel21 = new FondoPanel();
        lblCafeteras = new javax.swing.JLabel();
        cmbCafeteras = new javax.swing.JComboBox<>();
        lblImagenCafeteras2 = new javax.swing.JLabel();
        lblPrecioCafeteras = new javax.swing.JLabel();
        jPanel22 = new FondoPanel();
        lblRefrigeradoras = new javax.swing.JLabel();
        cmbRefrigeradoras = new javax.swing.JComboBox<>();
        lblImagenRefrigerador = new javax.swing.JLabel();
        lblPrecioRefrigerador = new javax.swing.JLabel();
        jPanel23 = new FondoPanel();
        lblCocinas = new javax.swing.JLabel();
        cmbCocinas = new javax.swing.JComboBox<>();
        lblImagenCocinas = new javax.swing.JLabel();
        lblPrecioCocina = new javax.swing.JLabel();
        jPanel24 = new FondoPanel();
        lblMicroondas = new javax.swing.JLabel();
        cmbMicroondas = new javax.swing.JComboBox<>();
        lblImagenMicroondas = new javax.swing.JLabel();
        lblPrecioMicroondas = new javax.swing.JLabel();
        jPanel25 = new FondoPanel();
        bntGuardarSeleccionCocina = new javax.swing.JButton();
        pnlAsistentesV = new FondoPanel();
        jPanel1 = new FondoPanel();
        lblAlexa1 = new javax.swing.JLabel();
        cmbAlexa1 = new javax.swing.JComboBox<>();
        lblImagenAlexa = new javax.swing.JLabel();
        lblPrecioAlexa1 = new javax.swing.JLabel();
        jPanel2 = new FondoPanel();
        lblLED1 = new javax.swing.JLabel();
        cmbLED1 = new javax.swing.JComboBox<>();
        lblImagenLuces = new javax.swing.JLabel();
        lblPrecioLEDLuces = new javax.swing.JLabel();
        jPanel3 = new FondoPanel();
        lblConsola1 = new javax.swing.JLabel();
        cmbConsolas1 = new javax.swing.JComboBox<>();
        lblImagenConsolas = new javax.swing.JLabel();
        lblPrecioPS5 = new javax.swing.JLabel();
        jPanel4 = new FondoPanel();
        lblCafeteras1 = new javax.swing.JLabel();
        cmbCafeteras1 = new javax.swing.JComboBox<>();
        lblImagenCafeteras = new javax.swing.JLabel();
        lblPrecioCafetera = new javax.swing.JLabel();
        jPanel5 = new FondoPanel();
        bntComprar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mntAsistentesV = new javax.swing.JMenuItem();
        mnProductosH = new javax.swing.JMenu();
        mntHabitacion = new javax.swing.JMenuItem();
        mntSalaEstar = new javax.swing.JMenuItem();
        mntCocina = new javax.swing.JMenuItem();

        AsistentesVirtuales.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        AsistentesVirtuales.setTitle("AsistentesVirtuales");
        AsistentesVirtuales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AsistentesVirtuales.setFocusable(false);
        AsistentesVirtuales.setLocation(new java.awt.Point(0, 0));
        AsistentesVirtuales.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        AsistentesVirtuales.setResizable(false);
        AsistentesVirtuales.setSize(new java.awt.Dimension(543, 520));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel1.setText("Asistentes Virtuales");

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblAlexa.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblAlexa.setText("Alexa");

        cmbAlexa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "19", "19", "20", "21", "22", "23", "24", "25" }));

        lblPrecioAlexa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioAlexa.setText("$55");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblImagenAlexa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lblAlexa)
                        .addGap(28, 28, 28)
                        .addComponent(cmbAlexa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(lblPrecioAlexa)
                        .addGap(26, 26, 26))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAlexa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlexa)
                    .addComponent(lblPrecioAlexa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagenAlexa2, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        bntGuardarSeccionAsistentes.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        bntGuardarSeccionAsistentes.setText("Guardar Selección");
        bntGuardarSeccionAsistentes.setActionCommand("Guardar");
        bntGuardarSeccionAsistentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarSeccionAsistentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(bntGuardarSeccionAsistentes, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(bntGuardarSeccionAsistentes)
                .addGap(32, 32, 32))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblGoogleHome.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblGoogleHome.setText("Google Home");

        cmbGoogleHome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "19", "19", "20", "21", "22", "23", "24", "25" }));

        lblPrecioGoogleHome.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioGoogleHome.setText("$55");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lblGoogleHome)
                        .addGap(18, 18, 18)
                        .addComponent(cmbGoogleHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(lblPrecioGoogleHome))
                    .addComponent(lblImagenGoogle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGoogleHome)
                    .addComponent(cmbGoogleHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioGoogleHome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblImagenGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout AsistentesVirtualesLayout = new javax.swing.GroupLayout(AsistentesVirtuales.getContentPane());
        AsistentesVirtuales.getContentPane().setLayout(AsistentesVirtualesLayout);
        AsistentesVirtualesLayout.setHorizontalGroup(
            AsistentesVirtualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        AsistentesVirtualesLayout.setVerticalGroup(
            AsistentesVirtualesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AsistentesVirtualesLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ProductosHabitacion.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ProductosHabitacion.setTitle("Productos Habitacion");
        ProductosHabitacion.setSize(new java.awt.Dimension(514, 750));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel2.setText("Productos de Habitacion");

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        cmbLED.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        lblLED.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblLED.setText("Luces LED (2 m)");

        lblPrecioLuces.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioLuces.setText("$25");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagenLuces2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(lblLED)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(cmbLED, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecioLuces)
                        .addGap(61, 61, 61))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLED, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioLuces))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImagenLuces2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblLamparas.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblLamparas.setText("Lamparas");

        cmbLamparas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "19", "19", "20" }));

        lblPrecioLamparas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioLamparas.setText("$20");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(lblImagenLamparas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(lblLamparas)
                                .addGap(118, 118, 118))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(cmbLamparas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPrecioLamparas)
                                .addGap(44, 44, 44))))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLamparas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLamparas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioLamparas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImagenLamparas, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblTV.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblTV.setText("TV");

        cmbTV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("$800");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTV)
                .addGap(28, 28, 28)
                .addComponent(cmbTV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(40, 40, 40))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenTv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTV)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(12, 12, 12)
                .addComponent(lblImagenTv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblConsola.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblConsola.setText("Xbox X");

        cmbConsolas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        lblPrecioXboxX.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioXboxX.setText("$1200");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagenConsolas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(lblConsola)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(cmbConsolas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecioXboxX)
                        .addGap(41, 41, 41))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConsola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbConsolas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioXboxX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImagenConsolas2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        bntGuardarSeccionHabitacion.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        bntGuardarSeccionHabitacion.setText("Guardar Selección");
        bntGuardarSeccionHabitacion.setActionCommand("");
        bntGuardarSeccionHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarSeccionHabitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(bntGuardarSeccionHabitacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(bntGuardarSeccionHabitacion)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ProductosHabitacionLayout = new javax.swing.GroupLayout(ProductosHabitacion.getContentPane());
        ProductosHabitacion.getContentPane().setLayout(ProductosHabitacionLayout);
        ProductosHabitacionLayout.setHorizontalGroup(
            ProductosHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosHabitacionLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        ProductosHabitacionLayout.setVerticalGroup(
            ProductosHabitacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ProductosSalaEstar.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ProductosSalaEstar.setTitle("Productos para la Sala de Estar");
        ProductosSalaEstar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ProductosSalaEstar.setSize(new java.awt.Dimension(770, 500));

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblSillas.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblSillas.setText("Sillas");

        cmbSillas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "19", "19", "20" }));

        lblPrecioSillas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioSillas.setText("$500");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenSillas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(lblSillas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(cmbSillas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(lblPrecioSillas)
                        .addGap(39, 39, 39))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblSillas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioSillas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagenSillas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel3.setText("Productos de Sala");

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblMuebles.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblMuebles.setText("Muebles");

        cmbMuebles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "19", "19", "20" }));

        lblPrecioMuebles.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioMuebles.setText("$1200");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImagenMuebles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(lblMuebles)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(cmbMuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(lblPrecioMuebles)
                                .addGap(32, 32, 32)))))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMuebles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMuebles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioMuebles))
                .addGap(18, 18, 18)
                .addComponent(lblImagenMuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        bntGuardarSeleccionSala.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        bntGuardarSeleccionSala.setText("Guardar Selección");
        bntGuardarSeleccionSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarSeleccionSalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(bntGuardarSeleccionSala)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntGuardarSeleccionSala)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblMesas.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblMesas.setText("Mesas");

        cmbMesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "19", "19", "20" }));

        lblPrecioMesas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioMesas.setText("$400");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(lblMesas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(cmbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(lblPrecioMesas)
                        .addGap(33, 33, 33))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioMesas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lblImagenMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel3))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ProductosSalaEstarLayout = new javax.swing.GroupLayout(ProductosSalaEstar.getContentPane());
        ProductosSalaEstar.getContentPane().setLayout(ProductosSalaEstarLayout);
        ProductosSalaEstarLayout.setHorizontalGroup(
            ProductosSalaEstarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ProductosSalaEstarLayout.setVerticalGroup(
            ProductosSalaEstarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosSalaEstarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ProductosCocina.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        ProductosCocina.setTitle("Productos de Cocina");
        ProductosCocina.setSize(new java.awt.Dimension(540, 720));

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel4.setText("Productos de Cocina");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblCafeteras.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblCafeteras.setText("Cafeteras");

        cmbCafeteras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        lblPrecioCafeteras.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioCafeteras.setText("$250");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenCafeteras2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(lblCafeteras)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(cmbCafeteras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(lblPrecioCafeteras)
                        .addGap(43, 43, 43))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCafeteras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCafeteras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioCafeteras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(lblImagenCafeteras2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblRefrigeradoras.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblRefrigeradoras.setText("Refrigeradoras");

        cmbRefrigeradoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        lblPrecioRefrigerador.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioRefrigerador.setText("$900");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagenRefrigerador, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRefrigeradoras))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(cmbRefrigeradoras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecioRefrigerador)
                        .addGap(51, 51, 51))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRefrigeradoras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRefrigeradoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioRefrigerador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(lblImagenRefrigerador, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblCocinas.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblCocinas.setText("Cocinas");

        cmbCocinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        lblPrecioCocina.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioCocina.setText("$900");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenCocinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(lblCocinas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(cmbCocinas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecioCocina)
                        .addGap(35, 35, 35))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCocinas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCocinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioCocina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagenCocinas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblMicroondas.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblMicroondas.setText("Microondas");

        cmbMicroondas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        lblPrecioMicroondas.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioMicroondas.setText("$200");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(lblMicroondas)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(cmbMicroondas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecioMicroondas)
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagenMicroondas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMicroondas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMicroondas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioMicroondas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(lblImagenMicroondas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        bntGuardarSeleccionCocina.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        bntGuardarSeleccionCocina.setText("Guardar Selcción");
        bntGuardarSeleccionCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarSeleccionCocinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(bntGuardarSeleccionCocina, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntGuardarSeleccionCocina)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ProductosCocinaLayout = new javax.swing.GroupLayout(ProductosCocina.getContentPane());
        ProductosCocina.getContentPane().setLayout(ProductosCocinaLayout);
        ProductosCocinaLayout.setHorizontalGroup(
            ProductosCocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductosCocinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProductosCocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ProductosCocinaLayout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(ProductosCocinaLayout.createSequentialGroup()
                        .addGroup(ProductosCocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(ProductosCocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ProductosCocinaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductosCocinaLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        ProductosCocinaLayout.setVerticalGroup(
            ProductosCocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductosCocinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProductosCocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProductosCocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        pnlAsistentesV.setBorder(javax.swing.BorderFactory.createTitledBorder("Destacados"));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblAlexa1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblAlexa1.setText("Alexa");

        cmbAlexa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "19", "19", "20", "21", "22", "23", "24", "25" }));

        lblPrecioAlexa1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioAlexa1.setText("$55");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagenAlexa, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbAlexa1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(lblPrecioAlexa1))
                            .addComponent(lblAlexa1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlexa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAlexa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioAlexa1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblImagenAlexa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblLED1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblLED1.setText("Luces LED (2 m)");

        cmbLED1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "19", "19", "20", "21", "22", "23", "24", "25" }));

        lblPrecioLEDLuces.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioLEDLuces.setText("$25");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagenLuces, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblLED1)
                                .addGap(0, 80, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmbLED1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecioLEDLuces)
                        .addGap(52, 52, 52))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLED1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbLED1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioLEDLuces))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImagenLuces, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblConsola1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblConsola1.setText("PS5");

        cmbConsolas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        lblPrecioPS5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioPS5.setText("$1200");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenConsolas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblConsola1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cmbConsolas1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecioPS5)
                        .addGap(53, 53, 53))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblConsola1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbConsolas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioPS5))
                .addGap(15, 15, 15)
                .addComponent(lblImagenConsolas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblCafeteras1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lblCafeteras1.setText("Cafeteras");

        cmbCafeteras1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        lblPrecioCafetera.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPrecioCafetera.setText("$250");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenCafeteras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblCafeteras1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cmbCafeteras1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecioCafetera)
                        .addGap(43, 43, 43))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCafeteras1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCafeteras1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioCafetera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(lblImagenCafeteras, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlAsistentesVLayout = new javax.swing.GroupLayout(pnlAsistentesV);
        pnlAsistentesV.setLayout(pnlAsistentesVLayout);
        pnlAsistentesVLayout.setHorizontalGroup(
            pnlAsistentesVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAsistentesVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAsistentesVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAsistentesVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAsistentesVLayout.setVerticalGroup(
            pnlAsistentesVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAsistentesVLayout.createSequentialGroup()
                .addGroup(pnlAsistentesVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlAsistentesVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        bntComprar.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        bntComprar.setText("Comprar");
        bntComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(bntComprar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntComprar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jMenu1.setText("Secciones");

        mntAsistentesV.setText("Asistentes Virtuales");
        mntAsistentesV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntAsistentesVActionPerformed(evt);
            }
        });
        jMenu1.add(mntAsistentesV);

        mnProductosH.setText("Productos Hogar");

        mntHabitacion.setText("Habitacion");
        mntHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntHabitacionActionPerformed(evt);
            }
        });
        mnProductosH.add(mntHabitacion);

        mntSalaEstar.setText("Sala de Estar");
        mntSalaEstar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntSalaEstarActionPerformed(evt);
            }
        });
        mnProductosH.add(mntSalaEstar);

        mntCocina.setText("Cocina");
        mntCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntCocinaActionPerformed(evt);
            }
        });
        mnProductosH.add(mntCocina);

        jMenu1.add(mnProductosH);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAsistentesV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAsistentesV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mntAsistentesVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntAsistentesVActionPerformed
        // TODO add your handling code here:
        
        AsistentesVirtuales.setVisible(true);
     
        ImageIcon alexa2 =new ImageIcon(getClass().getResource("/imagenes/Alexa.png"));
        ImageIcon icono5 =new ImageIcon(alexa2.getImage().getScaledInstance(lblImagenAlexa2.getWidth(),lblImagenAlexa2.getHeight(),Image.SCALE_DEFAULT));
        lblImagenAlexa2.setIcon(icono5);
        
        ImageIcon google =new ImageIcon(getClass().getResource("/imagenes/GoogleHome.png"));
        ImageIcon icono6 =new ImageIcon(google.getImage().getScaledInstance(lblImagenGoogle.getWidth(),lblImagenGoogle.getHeight(),Image.SCALE_DEFAULT));
        lblImagenGoogle.setIcon(icono6);

      
    }//GEN-LAST:event_mntAsistentesVActionPerformed

    private void mntHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntHabitacionActionPerformed
        // TODO add your handling code here:
        ProductosHabitacion.setVisible(true);
        
        ImageIcon luces =new ImageIcon(getClass().getResource("/imagenes/Led.png"));
        ImageIcon icono =new ImageIcon(luces.getImage().getScaledInstance(lblImagenLuces2.getWidth(),lblImagenLuces2.getHeight(),Image.SCALE_DEFAULT));
        lblImagenLuces2.setIcon(icono);
        
        ImageIcon lamparas =new ImageIcon(getClass().getResource("/imagenes/Lamparas.png"));
        ImageIcon icono1 =new ImageIcon(lamparas.getImage().getScaledInstance(lblImagenLamparas.getWidth(),lblImagenLamparas.getHeight(),Image.SCALE_DEFAULT));
        lblImagenLamparas.setIcon(icono1);
        
        ImageIcon tv =new ImageIcon(getClass().getResource("/imagenes/Tv.png"));
        ImageIcon icono2 =new ImageIcon(tv.getImage().getScaledInstance(lblImagenTv.getWidth(),lblImagenTv.getHeight(),Image.SCALE_DEFAULT));
        lblImagenTv.setIcon(icono2);
        
        ImageIcon consolas =new ImageIcon(getClass().getResource("/imagenes/XBOX.png"));
        ImageIcon icono3 =new ImageIcon(consolas.getImage().getScaledInstance(lblImagenConsolas2.getWidth(),lblImagenConsolas2.getHeight(),Image.SCALE_DEFAULT));
        lblImagenConsolas2.setIcon(icono3);
        
       
    }//GEN-LAST:event_mntHabitacionActionPerformed

    private void mntSalaEstarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntSalaEstarActionPerformed
        // TODO add your handling code here:
        ProductosSalaEstar.setVisible(true);
        
        ImageIcon muebles =new ImageIcon(getClass().getResource("/imagenes/Muebles.png"));
        ImageIcon icono =new ImageIcon(muebles.getImage().getScaledInstance(lblImagenMuebles.getWidth(),lblImagenMuebles.getHeight(),Image.SCALE_DEFAULT));
        lblImagenMuebles.setIcon(icono);
        
        ImageIcon mesas =new ImageIcon(getClass().getResource("/imagenes/Mesa.png"));
        ImageIcon icono1 =new ImageIcon(mesas.getImage().getScaledInstance(lblImagenMesas.getWidth(),lblImagenMesas.getHeight(),Image.SCALE_DEFAULT));
        lblImagenMesas.setIcon(icono1);
        
        ImageIcon sillas =new ImageIcon(getClass().getResource("/imagenes/Silla.png"));
        ImageIcon icono2 =new ImageIcon(sillas.getImage().getScaledInstance(lblImagenSillas.getWidth(),lblImagenSillas.getHeight(),Image.SCALE_DEFAULT));
        lblImagenSillas.setIcon(icono2);
        
        
    }//GEN-LAST:event_mntSalaEstarActionPerformed

    private void mntCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntCocinaActionPerformed
        // TODO add your handling code here:
        ProductosCocina.setVisible(true);
        ImageIcon cafeteras =new ImageIcon(getClass().getResource("/imagenes/Cafetera.png"));
        ImageIcon icono =new ImageIcon(cafeteras.getImage().getScaledInstance(lblImagenCafeteras2.getWidth(),lblImagenCafeteras2.getHeight(),Image.SCALE_DEFAULT));
        lblImagenCafeteras2.setIcon(icono);
        
        ImageIcon refrigerador =new ImageIcon(getClass().getResource("/imagenes/Refrigerador.png"));
        ImageIcon icono1 =new ImageIcon(refrigerador.getImage().getScaledInstance(lblImagenRefrigerador.getWidth(),lblImagenRefrigerador.getHeight(),Image.SCALE_DEFAULT));
        lblImagenRefrigerador.setIcon(icono1);
        
        ImageIcon cocinas =new ImageIcon(getClass().getResource("/imagenes/Cocina.png"));
        ImageIcon icono2 =new ImageIcon(cocinas.getImage().getScaledInstance(lblImagenCocinas.getWidth(),lblImagenCocinas.getHeight(),Image.SCALE_DEFAULT));
        lblImagenCocinas.setIcon(icono2);
        
        ImageIcon microondas =new ImageIcon(getClass().getResource("/imagenes/Microondas.png"));
        ImageIcon icono3 =new ImageIcon(microondas.getImage().getScaledInstance(lblImagenMicroondas.getWidth(),lblImagenMicroondas.getHeight(),Image.SCALE_DEFAULT));
        lblImagenMicroondas.setIcon(icono3);
        
       
    }//GEN-LAST:event_mntCocinaActionPerformed

    private void bntGuardarSeccionAsistentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarSeccionAsistentesActionPerformed
        // TODO add your handling code here:
        int alexa;
        int googleH;
        
        alexa = Integer.parseInt(cmbAlexa.getSelectedItem().toString());
        googleH = Integer.parseInt(cmbGoogleHome.getSelectedItem().toString());
        
        productosInteligentes.get(0).setStockComprado(alexa);
        productosInteligentes.get(1).setStockComprado(googleH);
        
        AsistentesVirtuales.dispose();
        
    }//GEN-LAST:event_bntGuardarSeccionAsistentesActionPerformed

    private void bntGuardarSeccionHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarSeccionHabitacionActionPerformed
        // TODO add your handling code here:
        int luces;
        int lampara;
        int tv;
        int xbox;
        
        luces = Integer.parseInt(cmbLED.getSelectedItem().toString());
        lampara = Integer.parseInt(cmbLamparas.getSelectedItem().toString());
        tv = Integer.parseInt(cmbTV.getSelectedItem().toString());
        xbox = Integer.parseInt(cmbConsolas.getSelectedItem().toString());
        
        productosInteligentes.get(2).setStockComprado(luces);
        productosInteligentes.get(3).setStockComprado(lampara);
        productosInteligentes.get(4).setStockComprado(tv);
        productosInteligentes.get(6).setStockComprado(xbox);
   
        ProductosHabitacion.dispose();
    }//GEN-LAST:event_bntGuardarSeccionHabitacionActionPerformed

    private void bntGuardarSeleccionSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarSeleccionSalaActionPerformed
        // TODO add your handling code here:
        int mueble;
        int silla;
        int mesa;
        
        mueble = Integer.parseInt(cmbMuebles.getSelectedItem().toString());
        mesa = Integer.parseInt(cmbMesas.getSelectedItem().toString());
        silla = Integer.parseInt(cmbSillas.getSelectedItem().toString());
        
        productosInteligentes.get(7).setStockComprado(mueble);
        productosInteligentes.get(8).setStockComprado(mesa);
        productosInteligentes.get(9).setStockComprado(silla);
        
        ProductosSalaEstar.dispose();
    }//GEN-LAST:event_bntGuardarSeleccionSalaActionPerformed

    private void bntComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntComprarActionPerformed
        // TODO add your handling code here:
        int alexa;
        int luces;
        int cafetera;
        int ps5;
        
        alexa = Integer.parseInt(cmbAlexa1.getSelectedItem().toString());
        luces = Integer.parseInt(cmbLED1.getSelectedItem().toString());
        cafetera = Integer.parseInt(cmbCafeteras1.getSelectedItem().toString());
        ps5 = Integer.parseInt(cmbConsolas1.getSelectedItem().toString());
        
        productosInteligentes.get(0).setStockComprado(alexa);
        productosInteligentes.get(2).setStockComprado(luces);
        productosInteligentes.get(10).setStockComprado(cafetera);
        productosInteligentes.get(5).setStockComprado(ps5);
        
        this.dispose();
        FacturaGUI factura = new FacturaGUI();
        factura.setVisible(true);
        
    }//GEN-LAST:event_bntComprarActionPerformed

    private void bntGuardarSeleccionCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarSeleccionCocinaActionPerformed
        // TODO add your handling code here:
        int cafetera;
        int cocina;
        int microondas;
        int refrigeradora;
        
        cafetera = Integer.parseInt(cmbCafeteras.getSelectedItem().toString());
        cocina = Integer.parseInt(cmbCocinas.getSelectedItem().toString());
        microondas = Integer.parseInt(cmbMicroondas.getSelectedItem().toString());
        refrigeradora = Integer.parseInt(cmbRefrigeradoras.getSelectedItem().toString());
        
        productosInteligentes.get(10).setStockComprado(cafetera);
        productosInteligentes.get(11).setStockComprado(cocina);
        productosInteligentes.get(12).setStockComprado(microondas);
        productosInteligentes.get(13).setStockComprado(refrigeradora);
        
    }//GEN-LAST:event_bntGuardarSeleccionCocinaActionPerformed

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
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AsistentesVirtuales;
    private javax.swing.JFrame ProductosCocina;
    private javax.swing.JFrame ProductosHabitacion;
    private javax.swing.JFrame ProductosSalaEstar;
    private javax.swing.JButton bntComprar;
    private javax.swing.JButton bntGuardarSeccionAsistentes;
    private javax.swing.JButton bntGuardarSeccionHabitacion;
    private javax.swing.JButton bntGuardarSeleccionCocina;
    private javax.swing.JButton bntGuardarSeleccionSala;
    private javax.swing.JComboBox<String> cmbAlexa;
    private javax.swing.JComboBox<String> cmbAlexa1;
    private javax.swing.JComboBox<String> cmbCafeteras;
    private javax.swing.JComboBox<String> cmbCafeteras1;
    private javax.swing.JComboBox<String> cmbCocinas;
    private javax.swing.JComboBox<String> cmbConsolas;
    private javax.swing.JComboBox<String> cmbConsolas1;
    private javax.swing.JComboBox<String> cmbGoogleHome;
    private javax.swing.JComboBox<String> cmbLED;
    private javax.swing.JComboBox<String> cmbLED1;
    private javax.swing.JComboBox<String> cmbLamparas;
    private javax.swing.JComboBox<String> cmbMesas;
    private javax.swing.JComboBox<String> cmbMicroondas;
    private javax.swing.JComboBox<String> cmbMuebles;
    private javax.swing.JComboBox<String> cmbRefrigeradoras;
    private javax.swing.JComboBox<String> cmbSillas;
    private javax.swing.JComboBox<String> cmbTV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblAlexa;
    private javax.swing.JLabel lblAlexa1;
    private javax.swing.JLabel lblCafeteras;
    private javax.swing.JLabel lblCafeteras1;
    private javax.swing.JLabel lblCocinas;
    private javax.swing.JLabel lblConsola;
    private javax.swing.JLabel lblConsola1;
    private javax.swing.JLabel lblGoogleHome;
    private javax.swing.JLabel lblImagenAlexa;
    private javax.swing.JLabel lblImagenAlexa2;
    private javax.swing.JLabel lblImagenCafeteras;
    private javax.swing.JLabel lblImagenCafeteras2;
    private javax.swing.JLabel lblImagenCocinas;
    private javax.swing.JLabel lblImagenConsolas;
    private javax.swing.JLabel lblImagenConsolas2;
    private javax.swing.JLabel lblImagenGoogle;
    private javax.swing.JLabel lblImagenLamparas;
    private javax.swing.JLabel lblImagenLuces;
    private javax.swing.JLabel lblImagenLuces2;
    private javax.swing.JLabel lblImagenMesas;
    private javax.swing.JLabel lblImagenMicroondas;
    private javax.swing.JLabel lblImagenMuebles;
    private javax.swing.JLabel lblImagenRefrigerador;
    private javax.swing.JLabel lblImagenSillas;
    private javax.swing.JLabel lblImagenTv;
    private javax.swing.JLabel lblLED;
    private javax.swing.JLabel lblLED1;
    private javax.swing.JLabel lblLamparas;
    private javax.swing.JLabel lblMesas;
    private javax.swing.JLabel lblMicroondas;
    private javax.swing.JLabel lblMuebles;
    private javax.swing.JLabel lblPrecioAlexa;
    private javax.swing.JLabel lblPrecioAlexa1;
    private javax.swing.JLabel lblPrecioCafetera;
    private javax.swing.JLabel lblPrecioCafeteras;
    private javax.swing.JLabel lblPrecioCocina;
    private javax.swing.JLabel lblPrecioGoogleHome;
    private javax.swing.JLabel lblPrecioLEDLuces;
    private javax.swing.JLabel lblPrecioLamparas;
    private javax.swing.JLabel lblPrecioLuces;
    private javax.swing.JLabel lblPrecioMesas;
    private javax.swing.JLabel lblPrecioMicroondas;
    private javax.swing.JLabel lblPrecioMuebles;
    private javax.swing.JLabel lblPrecioPS5;
    private javax.swing.JLabel lblPrecioRefrigerador;
    private javax.swing.JLabel lblPrecioSillas;
    private javax.swing.JLabel lblPrecioXboxX;
    private javax.swing.JLabel lblRefrigeradoras;
    private javax.swing.JLabel lblSillas;
    private javax.swing.JLabel lblTV;
    private javax.swing.JMenu mnProductosH;
    private javax.swing.JMenuItem mntAsistentesV;
    private javax.swing.JMenuItem mntCocina;
    private javax.swing.JMenuItem mntHabitacion;
    private javax.swing.JMenuItem mntSalaEstar;
    private javax.swing.JPanel pnlAsistentesV;
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
