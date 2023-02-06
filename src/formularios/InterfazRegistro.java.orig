
package formularios;
    

import formularios.Ticket;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Estacionamiento;
import modelo.ListaEstacionamiento;
import modelo.ReportePago;
import modelo.TRegistro;
import modelo.Vehiculo;


public class InterfazRegistro extends javax.swing.JFrame implements Serializable {
    // private String cod;
     
     private ListaEstacionamiento estac = new ListaEstacionamiento ();
     private TRegistro alquiler [] = new TRegistro [0];
     private ReportePago boletas[] = new ReportePago[0];
 
    public void setBoletas(ReportePago[] boletas) {
        this.boletas = boletas;
    }     
     
   public TRegistro[] getAlquiler() {
                try
         {

          FileInputStream  fis=new FileInputStream("Alquiler.txt");
          ObjectInputStream G=new ObjectInputStream(fis);
                        
          alquiler=(TRegistro[])G.readObject();
           
        
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Se está creando el archivo",
                      "Apertura de Archivo", JOptionPane.INFORMATION_MESSAGE);
         }  
        
        return alquiler;
    }

    public void setAlquiler(TRegistro[] alquiler) {
        this.alquiler = alquiler;
    }
     
    public ListaEstacionamiento getEstac() {
        return estac;
    }

    public void setEstac(ListaEstacionamiento estac) {
        this.estac = estac;
    }


    
    public InterfazRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);
        estac.llenadoEst();
       
    }

     @Override
    public Image getIconImage (){
        Image retvalue =Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logo.png"));
        return retvalue;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        list = new javax.swing.JComboBox<>();
        selecEst = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        titulodatos = new javax.swing.JLabel();
        titulonomb = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        titDni = new javax.swing.JLabel();
        titapellidos = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        dni = new javax.swing.JTextField();
        titTelf = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        titPlaca = new javax.swing.JLabel();
        titMarca = new javax.swing.JLabel();
        titModelo = new javax.swing.JLabel();
        placa = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        modelo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        estacionamiento = new javax.swing.JLabel();
        menPlaca = new javax.swing.JLabel();
        menDni = new javax.swing.JLabel();
        menTelf = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(35, 75, 131));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESTACIONAMIENTOS");

        list.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listActionPerformed(evt);
            }
        });

        selecEst.setBackground(new java.awt.Color(204, 204, 255));
        selecEst.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        selecEst.setText("SELECCIONAR ESTACIONAMIENTO");
        selecEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecEstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selecEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(list, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selecEst, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        titulodatos.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        titulodatos.setForeground(new java.awt.Color(0, 0, 51));
        titulodatos.setText("DATOS DEL CLIENTE");

        titulonomb.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        titulonomb.setText("NOMBRE:");

        nombre.setPreferredSize(new java.awt.Dimension(6, 25));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        titDni.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        titDni.setText("DNI:");

        titapellidos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        titapellidos.setText("APELLIDOS:");

        apellido.setPreferredSize(new java.awt.Dimension(6, 25));
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });

        dni.setPreferredSize(new java.awt.Dimension(6, 25));
        dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniKeyTyped(evt);
            }
        });

        titTelf.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        titTelf.setText("TELÉFONO:");

        telefono.setPreferredSize(new java.awt.Dimension(6, 23));
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("VEHÍCULO");

        titPlaca.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        titPlaca.setText("PLACA:");

        titMarca.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        titMarca.setText("MARCA:");

        titModelo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        titModelo.setText("MODELO:");

        placa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaActionPerformed(evt);
            }
        });
        placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                placaKeyTyped(evt);
            }
        });

        marca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });

        modelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
        jPanel5.setPreferredSize(new java.awt.Dimension(590, 4));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("ENTRADA DE VEHÍCULO");

        registrar.setBackground(new java.awt.Color(102, 255, 102));
        registrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        registrar.setText("REGISTRAR");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("ESTACIONAMIENTO:");

        estacionamiento.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        menPlaca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        menPlaca.setForeground(new java.awt.Color(204, 0, 0));

        menDni.setForeground(new java.awt.Color(255, 0, 0));

        menTelf.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titDni, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titulonomb, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titapellidos)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titTelf)
                        .addGap(18, 18, 18)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(menDni, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(menTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(titulodatos)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(estacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(titMarca)
                                    .addComponent(titModelo)
                                    .addComponent(titPlaca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(menPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(titulonomb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titDni)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titulodatos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titapellidos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menDni, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(titTelf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titPlaca)
                    .addComponent(placa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titMarca))
                        .addGap(18, 18, 18)
                        .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(estacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    //JTextField dni,solo se puede ingresar 9 parametros
    private void dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniKeyTyped
       
        if(dni.getText().length()>=8 ){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        char val = evt.getKeyChar();
        
        //validación de ingreso de datos (solo se pueden ingresar caracteres)
        if (Character.isLetter(val)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }
    }//GEN-LAST:event_dniKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        if(telefono.getText().length()>=9){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            
        }
        
        //validación de ingreso de datos (solo se pueden ingresar caracteres)
         char val = evt.getKeyChar();
        if (Character.isLetter(val)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo números");
        }
    }//GEN-LAST:event_telefonoKeyTyped
    //ya esta
    public void mostrar (){
        ListaRegistros l = new ListaRegistros ();
        
        
        try
         {

          FileInputStream  fis=new FileInputStream("Alquiler.txt");
          ObjectInputStream G=new ObjectInputStream(fis);
                        
          alquiler=(TRegistro[])G.readObject();
           
        
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Se está creando el archivo",
                      "Apertura de Archivo", JOptionPane.INFORMATION_MESSAGE);
         }        
        
        String matriz [][] = new String [alquiler.length][6];
        for(int i=0;i<alquiler.length;i++){
            
            String fechaT =alquiler[i].getDia()+" / "+alquiler[i].getMes()+" / "+alquiler[i].getAnio();
            String horaT = alquiler[i].getHora()+" : "+alquiler[i].getMin();
            
            String nomap = alquiler[i].getIdCli().getNombre()+" "+alquiler[i].getIdCli().getApellido();
            
                matriz [i][0]=nomap;
                matriz [i][1]=alquiler[i].getIdCli().getDni();
                matriz [i][2]=alquiler[i].getIdCli().getAutomovil().getPlaca();
                matriz [i][3]=fechaT;
                matriz [i][4]=horaT;
                matriz [i][5]=alquiler[i].getEspacio().getCodEsp();

        }
        
        l.mostrar(matriz);
        
        l.setVisible(true);
    }
    
    public ReportePago[] getBoletas() {
        return boletas;
    }
    /*Boton de registrar, aparece el ticket*/
    
    //ya esta
    public void agregar (TRegistro tr){
        int i;
            try
         {

          FileInputStream  fis=new FileInputStream("Alquiler.txt");
          ObjectInputStream G=new ObjectInputStream(fis);
                        
          alquiler=(TRegistro[])G.readObject();
           
        
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Se está creando el archivo",
                      "Apertura de Archivo", JOptionPane.INFORMATION_MESSAGE);
         }   
            
                        i = alquiler.length;
                        TRegistro tick;
                        redimensionarAgregar();

                        tick = tr;
                         alquiler[i] = tick;
                    try
                    {
                        FileOutputStream fos=new FileOutputStream("Alquiler.txt");
                        ObjectOutputStream G=new ObjectOutputStream(fos);
                        
                        G.writeObject(alquiler);
              
                        G.flush();
                        G.close();
                        
                    }catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "No se modificó el archivo", "Información",
                        JOptionPane.WARNING_MESSAGE);
                    }
          
    }
    
       public TRegistro Leer(TRegistro Treg){
        return Treg;
    }   
    
    public void redimensionarAgregar() {
        int n = alquiler.length;
        n = n + 1;
        TRegistro y[] = new TRegistro[n];
        for (int i = 0; i < alquiler.length; i = i + 1) {
            y[i] = alquiler[i];
        }
        alquiler = y;
    }
    
    public TRegistro registroT() {
        return alquiler[alquiler.length - 1];
    }
    
    
   // ya esta
    public void eliminar(String dni) {
        Scanner entrada = new Scanner(System.in);
        int pos;
        pos = posDatos(dni);
        
        try
         {
     

          FileInputStream  fis=new FileInputStream("Alquiler.txt");
          ObjectInputStream G=new ObjectInputStream(fis);
                        
          alquiler=(TRegistro[])G.readObject();
           
        
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, "Error de lectura de archivo", 
                     "Advertencia", JOptionPane.WARNING_MESSAGE);
         }
        
         try
         {
     

          FileInputStream  fis=new FileInputStream("Estacionamiento.txt");
          ObjectInputStream G=new ObjectInputStream(fis);
                        
          estac=(ListaEstacionamiento)G.readObject();
           
        
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"Se está creando el archivo",
                      "Apertura de Archivo", JOptionPane.INFORMATION_MESSAGE);
         }        
        
        
        if (pos != -1) {
            String codEstacionamiento;
            codEstacionamiento = alquiler[pos].getEspacio().getCodEsp();
            Estacionamiento est = new Estacionamiento();
            est = estac.modDis(codEstacionamiento);//Estacionamiento, modificar disponibilidad
            
         try
         {
            FileOutputStream  fos=new FileOutputStream("Estacionamiento.txt");
            ObjectOutputStream G=new ObjectOutputStream(fos);

            G.writeObject(estac);
            G.flush();
            G.close();
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, "No se modificó el archivo", "Información",
                        JOptionPane.WARNING_MESSAGE);
         }
            alquiler[pos].setEspacio(est);
            for (int i = pos; i < alquiler.length; i = i + 1) {
                if (i + 1 == alquiler.length) {
                    alquiler[i] = null;
                } else {
                    alquiler[i] = alquiler[i + 1];
                }
            }
            redimensionarElimi();
        } else {
            JOptionPane.showMessageDialog(null,"No existe el archivo",
                      "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
        try
         {

            FileOutputStream  fos=new FileOutputStream("Alquiler.txt");
            ObjectOutputStream G=new ObjectOutputStream(fos);

            G.writeObject(alquiler);
                  
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, "No se modificó el archivo", 
                     "Información", JOptionPane.WARNING_MESSAGE);
         }
            

    }
    
    public int posDatos(String cod) {
        boolean band = false;
        int i, pos = -1;
        for (i = 0; i < alquiler.length; i ++) {
            if (alquiler[i].dni().equals(cod)) {
                
                pos = i;
            }
        }
        return pos;
    }
    
    public void redimensionarElimi() {
        int n = alquiler.length;
        n = n - 1;
        TRegistro y[] = new TRegistro[n];
        for (int i = 0; i < alquiler.length - 1; i = i + 1) {
            y[i] = alquiler[i];
        }
        alquiler = y;
    }
    
    public boolean validarCamposLlenos(){
        boolean sal = true;
        
        if (nombre.getText().isEmpty() || apellido.getText().isEmpty()|| 
                dni.getText().isEmpty() || placa.getText().isEmpty()|| 
                marca.getText().isEmpty()||modelo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos Vacios");
            sal = false;
        }
        
        
        return sal;
    }
    public int cantRegistro(){
        return alquiler.length;
    }
    public boolean valCaposMen (){
        boolean sa=true;
        if (placa.getText().length()<6){
             String men = "6 Dígitos necesarios ";
             menPlaca.setText(men);
             sa=false;
         }
        if (dni.getText().length()<8){
            String men1= "8 Dígitos necesarios";
            menDni.setText(men1);
            sa=false;
        }
        if (telefono.getText().length()<9){
            String men2="9 Dígitos necesarios";
            menTelf.setText(men2);
            sa=false;
        }
       
       return sa;
    }
    
    public void mostrarListaDesplegable(){
         try {
               FileInputStream G  =new FileInputStream("Estacionamiento.txt");
                ObjectInputStream H=new ObjectInputStream(G);
                estac=(ListaEstacionamiento)H.readObject();
                    
         }catch(Exception e) {
           JOptionPane.showMessageDialog(null,"Se está creando el archivo",
                      "Apertura de Archivo", JOptionPane.INFORMATION_MESSAGE);
        }        
        int cant = list.getItemCount();
        if (cant==0){
            for (int i = 0; i < 30; i++) {
               String e = "A"+(i+1);
               if (estac.mostrarDisponibilidad(e)){
                   list.addItem(e);
               }else{
                   list.addItem(e+" Ocupado");
               }
            }
        }
    }
   
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
       String cod = null;
        boolean p=valCaposMen ();
        boolean val = validarCamposLlenos ();
        if (val && p){
        Cliente cli = new Cliente();
        Vehiculo v = new Vehiculo();
        Ticket t = new Ticket ();
        int dia, mes, anio, hora, min;
        String codEst ;
        
        LocalDateTime ahora= LocalDateTime.now();
        dia=ahora.getDayOfMonth();
        mes=ahora.getMonthValue();
        anio=ahora.getYear();
        hora=ahora.getHour();
        min=ahora.getMinute();
       
        //ListaRegistros li= new ListaRegistros ();
        Estacionamiento est = new Estacionamiento ();
       
        int i = JOptionPane.showConfirmDialog(null,
             "¿Los datos ingresados son correctos" , "Confimacion de Datos", 0);
        if (i==0){
            t.setVisible(true);
            
            TRegistro tr= new TRegistro ();
            tr= new TRegistro ();
            
            v.setMarca(marca.getText());
            v.setModelo(modelo.getText());
            v.setPlaca(placa.getText());
      
            cli.setNombre(nombre.getText());
            cli.setApellido(apellido.getText());
            cli.setDni(dni.getText());
            cli.setTelefono(telefono.getText());
            cli.setId_Cliente(cod);
            cli.setAutomovil(v);
            codEst = estacionamiento.getText();
            est.setCodEsp(estacionamiento.getText());
            
            
             if(estac.buscar(codEst) == -1 ){
           JOptionPane.showMessageDialog(null, "EL ESTACIONAMIENTO NO EXISTE");
           
            }else{
            if(estac.mostrarDisponibilidad(codEst)== false){
                    JOptionPane.showMessageDialog(null, "Estacionamiento OCUPADO");

                }
            else{
                try
                {
                    FileInputStream G  =new FileInputStream("Estacionamiento.txt");
                    ObjectInputStream H=new ObjectInputStream(G);
                    estac=(ListaEstacionamiento)H.readObject();
                    
                }catch(Exception e)
                {
                    System.out.println("Error");
                }
                 est = estac.modDis(codEst);//Estacionamiento
               try
                {
                     FileOutputStream fos=new FileOutputStream("Estacionamiento.txt");
                     ObjectOutputStream G=new ObjectOutputStream(fos);
                        
                        G.writeObject(estac);
    
                        G.flush();
                        G.close();
                    
                }catch(Exception e)
                {
                    System.out.println("Error");
                }
                 tr.setIdCli(cli);
                tr.setDia(dia);
                tr.setMes(mes);
                tr.setAnio(anio);
                tr.setHora(hora);
                tr.setMin(min);
                tr.setEspacio(est);

                agregar (Leer(tr));

                String fechaT =dia+" / "+mes+" / "+anio;
                String horaT = hora+" : "+min;
                
                String nom;
                nom = nombre.getText()+" "+apellido.getText();
                Ticket.tFecha.setText(fechaT);
                Ticket.tHora.setText(horaT);
                Ticket.tNombre.setText(nom);
                Ticket.tApellido.setText(dni.getText());
                Ticket.tEstacio.setText(estacionamiento.getText());
                cod =cli.generarCodigo(nombre.getText(), apellido.getText(), dni.getText());
                Ticket.codigoReg.setText(cod);
                
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
                
                agregarBoleta();
                
                this.setVisible (false);
                
                nombre.setText("");apellido.setText(""); dni.setText("");
                telefono.setText(""); placa.setText(""); marca.setText("");
                modelo.setText(""); marca.setText("");estacionamiento.setText("");
                menDni.setText("");menTelf.setText(""); menPlaca.setText("");
   
            }          
       }
                             
        }else{
            if(val==false)
            JOptionPane.showMessageDialog(this,"Modifique los datos", "MODIFICACIÓN", JOptionPane.ERROR_MESSAGE);
            if(p==false){
            JOptionPane.showMessageDialog(this,"Modifique los campos indicados", "MODIFICACIÓN", JOptionPane.ERROR_MESSAGE);    
            }
            }
            
        }
    }//GEN-LAST:event_registrarActionPerformed

    public int cantRegistros(){
        return alquiler.length;
    }
    
    public void agregarBoleta(){
        int i;
        
         try
        {
          FileInputStream  fis=new FileInputStream("Boletas1.txt");
          ObjectInputStream G=new ObjectInputStream(fis);
                        
          boletas=(ReportePago[])G.readObject();
           
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Se está creando el archivo",
                      "Apertura de Archivo", JOptionPane.INFORMATION_MESSAGE);
        }        
 
        i=boletas.length;
        TRegistro tick;
        redimensionarAgregarBoleta();//hace que aumente un espacio en el vector boletas
        tick=registroT();
        ReportePago bolt=new ReportePago(); 
        bolt.setTicket(tick);
        boletas[i]=bolt;
        
          try{
                FileOutputStream fos=new FileOutputStream("Boletas1.txt");
                ObjectOutputStream G=new ObjectOutputStream(fos);
                        
                 G.writeObject(boletas);
              
    
                 G.flush();
                G.close();
                        
            }catch(Exception e){
                 JOptionPane.showMessageDialog(null,"No se modificó el archivo",
                      "Información", JOptionPane.INFORMATION_MESSAGE);
            }
          

    }
    //uso de la interfaz AumentoLista
    
    public void redimensionarAgregarBoleta(){
    
        int n=boletas.length;
        n=n+1;
        ReportePago y[] = new ReportePago[n];
        for(int i =0;i<boletas.length;i=i+1){
            y[i] = boletas[i];
        }
        boletas=y;
    }    
    

    private void placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char val = evt.getKeyChar();
        
        if (Character.isDigit(val)){
            getToolkit().beep();
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo letras");
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
         char val = evt.getKeyChar();
        
        if (Character.isDigit(val)){
            getToolkit().beep();
            
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo letras");
        }
    }//GEN-LAST:event_apellidoKeyTyped

    private void selecEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecEstActionPerformed
       String item= list.getSelectedItem ().toString();
        
        JOptionPane.showMessageDialog(null, "El estacionamiento seleccionado es "+item);
        
        estacionamiento.setText(item);
    }//GEN-LAST:event_selecEstActionPerformed

    private void listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listActionPerformed
       //estac.mostrarLista();
    }//GEN-LAST:event_listActionPerformed

    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaActionPerformed

    private void placaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placaKeyTyped
         if(placa.getText().length()>=6 ){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
         
    }//GEN-LAST:event_placaKeyTyped

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
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField dni;
    private javax.swing.JLabel estacionamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JComboBox<String> list;
    private javax.swing.JTextField marca;
    private javax.swing.JLabel menDni;
    private javax.swing.JLabel menPlaca;
    private javax.swing.JLabel menTelf;
    private javax.swing.JTextField modelo;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField placa;
    private javax.swing.JButton registrar;
    private javax.swing.JButton selecEst;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel titDni;
    private javax.swing.JLabel titMarca;
    private javax.swing.JLabel titModelo;
    private javax.swing.JLabel titPlaca;
    private javax.swing.JLabel titTelf;
    private javax.swing.JLabel titapellidos;
    private javax.swing.JLabel titulodatos;
    private javax.swing.JLabel titulonomb;
    // End of variables declaration//GEN-END:variables
}
