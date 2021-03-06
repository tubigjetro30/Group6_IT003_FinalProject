
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JJVT
 */
public class data extends javax.swing.JFrame {
    static final String USER = "system"; //Database Username
    static final String PASS = "Oracle_2"; //Your Account Password
    static final String DATABASE = "orcl"; //Database Name
    static final String SERVER_IP = "192.168.23.128"; //Your Database Server IP (run ipconfig in cmd)
    static final String PORT = "1521";
    static final String DB_URL = "jdbc:oracle:thin:@" + SERVER_IP + ":" + PORT + ":" +DATABASE;  

    /**
     * Creates new form data
     */
    public data() {
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

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        firstname_txt = new javax.swing.JTextField();
        lastname_txt = new javax.swing.JTextField();
        class_combo = new javax.swing.JComboBox<>();
        seat_combo = new javax.swing.JComboBox<>();
        price_combo = new javax.swing.JComboBox<>();
        origin_combo = new javax.swing.JComboBox<>();
        destination_combo = new javax.swing.JComboBox<>();
        departure_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        history_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        booking_btn = new javax.swing.JButton();
        seats_btn = new javax.swing.JButton();
        about_btn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/border.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 10, 580));

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Last Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Flight Class:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Seat No.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Price:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Origin:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Destination:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("Departure Date:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        firstname_txt.setBackground(new java.awt.Color(51, 51, 51));
        firstname_txt.setForeground(new java.awt.Color(0, 204, 204));
        firstname_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 204, 204)));
        jPanel1.add(firstname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 100, -1));

        lastname_txt.setBackground(new java.awt.Color(51, 51, 51));
        lastname_txt.setForeground(new java.awt.Color(0, 204, 204));
        lastname_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 204, 204)));
        jPanel1.add(lastname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 110, -1));

        class_combo.setBackground(new java.awt.Color(0, 204, 204));
        class_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business", "First Class" }));
        class_combo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(class_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 300, -1));

        seat_combo.setBackground(new java.awt.Color(0, 204, 204));
        seat_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F1", "F2", "F3", "F4", "F5", "F6", "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10", "E11", "E12", "E13", "E14", "E15", "E16", "E17", "E18", "E19", "E20" }));
        seat_combo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(seat_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 130, -1));

        price_combo.setBackground(new java.awt.Color(0, 204, 204));
        price_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2,000", "6,000", "11,000" }));
        price_combo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(price_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 120, -1));

        origin_combo.setBackground(new java.awt.Color(0, 204, 204));
        origin_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BXU", "CBO", "CLARK", "DGT", "DPL", "IAO", "LGP", "NAIA", "OZC", "RXS", "TUG", "USU" }));
        origin_combo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(origin_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 300, -1));

        destination_combo.setBackground(new java.awt.Color(0, 204, 204));
        destination_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BXU", "CBO", "CLARK", "DGT", "DPL", "IAO", "LGP", "NAIA", "OZC", "RXS", "TUG", "USU" }));
        destination_combo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(destination_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 300, -1));

        departure_txt.setBackground(new java.awt.Color(51, 51, 51));
        departure_txt.setForeground(new java.awt.Color(0, 204, 204));
        departure_txt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 204, 204)));
        jPanel1.add(departure_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 240, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 200, 40));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/booking.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seats.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aboutus.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/history.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 40));

        history_btn.setBackground(new java.awt.Color(0, 153, 153));
        history_btn.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        history_btn.setForeground(new java.awt.Color(255, 255, 255));
        history_btn.setText("Flight History");
        history_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                history_btnActionPerformed(evt);
            }
        });
        jPanel2.add(history_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 260, 60));

        home_btn.setBackground(new java.awt.Color(0, 153, 153));
        home_btn.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        home_btn.setForeground(new java.awt.Color(255, 255, 255));
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        jPanel2.add(home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 60));

        booking_btn.setBackground(new java.awt.Color(0, 153, 153));
        booking_btn.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        booking_btn.setForeground(new java.awt.Color(255, 255, 255));
        booking_btn.setText("Booking");
        booking_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_btnActionPerformed(evt);
            }
        });
        jPanel2.add(booking_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 260, 60));

        seats_btn.setBackground(new java.awt.Color(0, 153, 153));
        seats_btn.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        seats_btn.setForeground(new java.awt.Color(255, 255, 255));
        seats_btn.setText("Flight Seats");
        seats_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seats_btnActionPerformed(evt);
            }
        });
        jPanel2.add(seats_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 60));

        about_btn.setBackground(new java.awt.Color(0, 153, 153));
        about_btn.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        about_btn.setForeground(new java.awt.Color(255, 255, 255));
        about_btn.setText("About Us");
        about_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_btnActionPerformed(evt);
            }
        });
        jPanel2.add(about_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 260, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flight.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Available Flights");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 260, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          try {

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "INSERT INTO flights (firstname, lastname, flightclass, origin, destination, departure, seatno, price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmnt = conn.prepareStatement(sql);
            stmnt.setString(1, firstname_txt.getText());
            stmnt.setString(2, lastname_txt.getText());
            stmnt.setString(3, (String) class_combo.getSelectedItem());
            stmnt.setString(4, (String) origin_combo.getSelectedItem());
            stmnt.setString(5, (String) destination_combo.getSelectedItem());
            stmnt.setString(6,  departure_txt.getText());
            stmnt.setString(7, (String) seat_combo.getSelectedItem());
            stmnt.setString(8, (String) price_combo.getSelectedItem());
            stmnt.executeUpdate();
            jOptionPane1.showMessageDialog(null, "Inserted records successfully");
          
            
            receipt x = new receipt();
            x.first_rcv.setText(data.firstname_txt.getText());
            x.last_rcv.setText(data.lastname_txt.getText());
            x.class_rcv.setText((String)data.class_combo.getSelectedItem());
            x.origin_rcv.setText((String)data.origin_combo.getSelectedItem());
            x.destination_rcv.setText((String)data.destination_combo.getSelectedItem());
            x.date_rcv.setText(data.departure_txt.getText());
            x.seat_rcv.setText((String)data.seat_combo.getSelectedItem());
            x.price_rcv.setText((String)data.price_combo.getSelectedItem());
            x.setVisible(true);

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
          this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void booking_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_btnActionPerformed
         new data().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_booking_btnActionPerformed

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_home_btnActionPerformed

    private void seats_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seats_btnActionPerformed
        new seatings().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_seats_btnActionPerformed

    private void about_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_btnActionPerformed
        new AboutUs().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_about_btnActionPerformed

    private void history_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_history_btnActionPerformed
        new History().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_history_btnActionPerformed

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
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_btn;
    private javax.swing.JButton booking_btn;
    public static javax.swing.JComboBox<String> class_combo;
    public static javax.swing.JTextField departure_txt;
    public static javax.swing.JComboBox<String> destination_combo;
    public static javax.swing.JTextField firstname_txt;
    private javax.swing.JButton history_btn;
    private javax.swing.JButton home_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField lastname_txt;
    public static javax.swing.JComboBox<String> origin_combo;
    public static javax.swing.JComboBox<String> price_combo;
    public static javax.swing.JComboBox<String> seat_combo;
    private javax.swing.JButton seats_btn;
    // End of variables declaration//GEN-END:variables
}
