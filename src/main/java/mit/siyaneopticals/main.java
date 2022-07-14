/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mit.siyaneopticals;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sidath Karunarathna
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
            connect();
        try {
            pst =con.prepareStatement("select max(order_Number) from customer");
            ResultSet Rs =pst.executeQuery();
            Rs.next();
            int nextOrder = Rs.getInt("max(order_Number)") +1;
            OderNotxt.setText(String.valueOf(nextOrder));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    Connection con;
    PreparedStatement pst;
    DefaultTableModel df;
    
    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                con= DriverManager.getConnection("jdbc:mysql://localhost:3306/siyane_opticals","root","");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "ERROR");
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        bill = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Bill = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        OrderN = new javax.swing.JLabel();
        datelable = new javax.swing.JLabel();
        Namelable = new javax.swing.JLabel();
        telLable = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        totlable = new javax.swing.JLabel();
        adlable = new javax.swing.JLabel();
        ballable = new javax.swing.JLabel();
        deslable = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OderNotxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        frametxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Home = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Totaltxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Addvancetxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Destxt = new javax.swing.JTextField();
        Rsp = new javax.swing.JTextField();
        Rcy = new javax.swing.JTextField();
        Rax = new javax.swing.JTextField();
        Radd = new javax.swing.JTextField();
        Ladd = new javax.swing.JTextField();
        Lax = new javax.swing.JTextField();
        Lcy = new javax.swing.JTextField();
        Lsp = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lenstxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Mobile = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        disco = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        checktot = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        close = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        close2 = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        icon2 = new javax.swing.JLabel();
        icon3 = new javax.swing.JLabel();
        icon4 = new javax.swing.JLabel();
        icon5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(0, 107, 1283, 3);

        bill.setBackground(new java.awt.Color(255, 255, 255));
        bill.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Sales");

        Bill.setBackground(new java.awt.Color(255, 255, 255));
        Bill.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText("SIYANE OPTICALS");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText("HOT LINE : 0714772359");

        OrderN.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        OrderN.setForeground(new java.awt.Color(0, 51, 255));
        OrderN.setText("O/N:-");

        datelable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        datelable.setForeground(new java.awt.Color(0, 51, 255));
        datelable.setText("YYYY-MM-DD");

        Namelable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Namelable.setForeground(new java.awt.Color(0, 51, 255));
        Namelable.setText("Name:-");

        telLable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        telLable.setForeground(new java.awt.Color(0, 51, 255));
        telLable.setText("Tele :-");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 255));
        jLabel17.setText("Description");

        totlable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        totlable.setForeground(new java.awt.Color(0, 51, 255));
        totlable.setText("Total     =");

        adlable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        adlable.setForeground(new java.awt.Color(0, 51, 255));
        adlable.setText("Advance =");

        ballable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ballable.setForeground(new java.awt.Color(0, 51, 255));
        ballable.setText("Balance  =");

        deslable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        deslable.setForeground(new java.awt.Color(0, 51, 255));
        deslable.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        deslable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        javax.swing.GroupLayout BillLayout = new javax.swing.GroupLayout(Bill);
        Bill.setLayout(BillLayout);
        BillLayout.setHorizontalGroup(
            BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillLayout.createSequentialGroup()
                .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel12))
                    .addGroup(BillLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillLayout.createSequentialGroup()
                .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BillLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totlable, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BillLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Namelable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telLable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BillLayout.createSequentialGroup()
                                .addComponent(OrderN, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(datelable))
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deslable, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(BillLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adlable, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ballable, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );
        BillLayout.setVerticalGroup(
            BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(BillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OrderN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datelable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Namelable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telLable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deslable, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totlable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adlable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ballable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        nametxt.setBackground(new java.awt.Color(0, 0, 102));
        nametxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nametxt.setForeground(new java.awt.Color(255, 255, 255));
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Name");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Order No");

        OderNotxt.setBackground(new java.awt.Color(0, 0, 102));
        OderNotxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        OderNotxt.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Adderess");

        addresstxt.setBackground(new java.awt.Color(0, 0, 102));
        addresstxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addresstxt.setForeground(new java.awt.Color(255, 255, 255));
        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Tele No");

        frametxt.setBackground(new java.awt.Color(0, 0, 102));
        frametxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        frametxt.setForeground(new java.awt.Color(255, 255, 255));
        frametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frametxtActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Frame No");

        Home.setBackground(new java.awt.Color(0, 0, 102));
        Home.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Lens Code");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Description");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Total");

        Totaltxt.setBackground(new java.awt.Color(0, 0, 102));
        Totaltxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Totaltxt.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Advance");

        Addvancetxt.setBackground(new java.awt.Color(0, 0, 102));
        Addvancetxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Addvancetxt.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Destxt.setBackground(new java.awt.Color(0, 0, 102));
        Destxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Destxt.setForeground(new java.awt.Color(255, 255, 255));
        Destxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestxtActionPerformed(evt);
            }
        });

        Rsp.setBackground(new java.awt.Color(0, 0, 102));
        Rsp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Rsp.setForeground(new java.awt.Color(255, 255, 255));
        Rsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RspActionPerformed(evt);
            }
        });

        Rcy.setBackground(new java.awt.Color(0, 0, 102));
        Rcy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Rcy.setForeground(new java.awt.Color(255, 255, 255));
        Rcy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RcyActionPerformed(evt);
            }
        });

        Rax.setBackground(new java.awt.Color(0, 0, 102));
        Rax.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Rax.setForeground(new java.awt.Color(255, 255, 255));
        Rax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaxActionPerformed(evt);
            }
        });

        Radd.setBackground(new java.awt.Color(0, 0, 102));
        Radd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Radd.setForeground(new java.awt.Color(255, 255, 255));
        Radd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaddActionPerformed(evt);
            }
        });

        Ladd.setBackground(new java.awt.Color(0, 0, 102));
        Ladd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Ladd.setForeground(new java.awt.Color(255, 255, 255));
        Ladd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaddActionPerformed(evt);
            }
        });

        Lax.setBackground(new java.awt.Color(0, 0, 102));
        Lax.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Lax.setForeground(new java.awt.Color(255, 255, 255));
        Lax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaxActionPerformed(evt);
            }
        });

        Lcy.setBackground(new java.awt.Color(0, 0, 102));
        Lcy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Lcy.setForeground(new java.awt.Color(255, 255, 255));
        Lcy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LcyActionPerformed(evt);
            }
        });

        Lsp.setBackground(new java.awt.Color(0, 0, 102));
        Lsp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Lsp.setForeground(new java.awt.Color(255, 255, 255));
        Lsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LspActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 102));
        jLabel21.setText("Left Eye");

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 102));
        jLabel22.setText("Right Eye");

        lenstxt.setBackground(new java.awt.Color(0, 0, 102));
        lenstxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lenstxt.setForeground(new java.awt.Color(255, 255, 255));
        lenstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lenstxtActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Mobile");

        Mobile.setBackground(new java.awt.Color(0, 0, 102));
        Mobile.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Mobile.setForeground(new java.awt.Color(255, 255, 255));
        Mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("Home");

        disco.setBackground(new java.awt.Color(0, 0, 102));
        disco.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        disco.setForeground(new java.awt.Color(255, 255, 255));
        disco.setText("0");
        disco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                discoMouseClicked(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Discount");

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("%");

        checktot.setBackground(new java.awt.Color(51, 51, 51));
        checktot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        checktot.setForeground(new java.awt.Color(255, 255, 255));
        checktot.setText("Total");
        checktot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checktotActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 102));
        jLabel19.setText("Age");

        agetxt.setBackground(new java.awt.Color(0, 0, 102));
        agetxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        agetxt.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout billLayout = new javax.swing.GroupLayout(bill);
        bill.setLayout(billLayout);
        billLayout.setHorizontalGroup(
            billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billLayout.createSequentialGroup()
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billLayout.createSequentialGroup()
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                                        .addComponent(Rsp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)))
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Rcy, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(Radd))
                                        .addGap(18, 18, 18)
                                        .addComponent(Rax, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Lsp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Ladd, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                            .addComponent(Lcy))
                                        .addGap(18, 18, 18)
                                        .addComponent(Lax, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25))
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(billLayout.createSequentialGroup()
                                                .addComponent(jLabel22)
                                                .addGap(230, 230, 230)
                                                .addComponent(jLabel21))
                                            .addGroup(billLayout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(lenstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(94, 94, 94)
                                                .addComponent(jLabel6)
                                                .addGap(34, 34, 34)
                                                .addComponent(frametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Destxt))
                            .addGroup(billLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(OderNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(billLayout.createSequentialGroup()
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nametxt)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(23, 23, 23))
                    .addGroup(billLayout.createSequentialGroup()
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(Totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(checktot, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billLayout.createSequentialGroup()
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel15))
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(billLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Addvancetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(disco, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(40, 40, 40)
                .addComponent(Bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        billLayout.setVerticalGroup(
            billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billLayout.createSequentialGroup()
                        .addComponent(Bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(billLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(OderNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(21, 21, 21)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lenstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(frametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billLayout.createSequentialGroup()
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Rsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Rcy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Rax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(Radd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(billLayout.createSequentialGroup()
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lcy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Lax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(Ladd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billLayout.createSequentialGroup()
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(Destxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(Addvancetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(disco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(0, 162, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checktot, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21))))))
        );

        jPanel1.add(bill);
        bill.setBounds(3, 112, 1270, 750);

        close.setBackground(new java.awt.Color(255, 0, 0));
        close.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sidath Karunarathna\\Documents\\NetBeansProjects\\SiyaneOpticals\\Images\\Webp.net-resizeimage9.png")); // NOI18N
        close.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        jPanel1.add(close);
        close.setBounds(1246, 11, 30, 30);

        close1.setBackground(new java.awt.Color(51, 204, 255));
        close1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sidath Karunarathna\\Documents\\NetBeansProjects\\SiyaneOpticals\\Images\\Webp.net-resizeimage (1)1.png")); // NOI18N
        close1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close1MouseExited(evt);
            }
        });
        jPanel1.add(close1);
        close1.setBounds(1210, 11, 30, 30);

        close2.setBackground(new java.awt.Color(102, 255, 255));
        close2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sidath Karunarathna\\Documents\\NetBeansProjects\\SiyaneOpticals\\Images\\Webp.net-resizeimage (2)2.png")); // NOI18N
        close2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close2MouseExited(evt);
            }
        });
        jPanel1.add(close2);
        close2.setBounds(1174, 11, 30, 40);

        icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sidath Karunarathna\\Documents\\NetBeansProjects\\SiyaneOpticals\\Images\\Webp.net-resizeimage (4)4.png")); // NOI18N
        icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconMouseExited(evt);
            }
        });
        jPanel1.add(icon);
        icon.setBounds(174, 0, 100, 101);

        icon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sidath Karunarathna\\Documents\\NetBeansProjects\\SiyaneOpticals\\Images\\Webp.net-resizeimage (6)6.png")); // NOI18N
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icon1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icon1MouseExited(evt);
            }
        });
        jPanel1.add(icon1);
        icon1.setBounds(20, 0, 111, 101);

        icon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sidath Karunarathna\\Documents\\NetBeansProjects\\SiyaneOpticals\\Images\\Webp.net-resizeimage (3)3.png")); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icon2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icon2MouseExited(evt);
            }
        });
        jPanel1.add(icon2);
        icon2.setBounds(337, 0, 100, 101);

        icon3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sidath Karunarathna\\Documents\\NetBeansProjects\\SiyaneOpticals\\Images\\Webp.net-resizeimage (7)7.png")); // NOI18N
        icon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icon3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icon3MouseExited(evt);
            }
        });
        jPanel1.add(icon3);
        icon3.setBounds(481, 0, 100, 101);

        icon4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sidath Karunarathna\\Documents\\NetBeansProjects\\SiyaneOpticals\\Images\\Webp.net-resizeimage (5)5.png")); // NOI18N
        icon4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icon4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icon4MouseExited(evt);
            }
        });
        jPanel1.add(icon4);
        icon4.setBounds(644, 0, 100, 101);

        icon5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sidath Karunarathna\\Documents\\NetBeansProjects\\SiyaneOpticals\\Images\\Webp.net-resizeimage (8)8.png")); // NOI18N
        icon5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icon5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icon5MouseExited(evt);
            }
        });
        jPanel1.add(icon5);
        icon5.setBounds(806, 0, 100, 101);

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sidath Karunarathna\\Documents\\NetBeansProjects\\SiyanaeOpticals\\SIYANE\\Untitled-1.png")); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(4, 3, 1270, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1283, 879);

        setSize(new java.awt.Dimension(1283, 879));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtActionPerformed

    private void frametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frametxtActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {                                         
            try {
                
                
                String orderNo = OderNotxt.getText();
                int ON= Integer.parseInt(orderNo);
                String name = nametxt.getText();
                String age= agetxt.getText();
                String address = addresstxt.getText();
                String frameNo = frametxt.getText();
                String lenscode =lenstxt.getText();
                String home = Home.getText();
                String mobile=Mobile.getText();
                String RightSp = Rsp.getText();
                String RightCy = Rcy.getText();
                String RightAxis =Rax.getText();
                String RightAdd = Radd.getText();
                String Leftsp = Lsp.getText();
                String Leftcy = Lcy.getText();
                String LeftAxis = Lax.getText();
                String LeftAdd = Ladd.getText();
                String description = Destxt.getText();
                String Advance = Addvancetxt.getText();
                String Discount= disco.getText();
                double dis=Double.parseDouble(Discount);
                
                
                int ad = Integer.parseInt(Advance);
                
                
                pst = con.prepareStatement("select Brand,price from frame_stock where FrameNo=?");
                pst.setString(1,frameNo);
                ResultSet Rs1 =pst.executeQuery();
                Rs1.next();
                int p1 = Integer.parseInt(Rs1.getString("price"));
                
                pst = con.prepareStatement("select Description,price from lense_stock where lensCode=?");
                pst.setString(1,lenscode);
                ResultSet Rs2 =pst.executeQuery();
                Rs2.next();
                int p2 = Integer.parseInt(Rs2.getString("price"));
                
                int tot= p1+p2;
                int newtot;
                Totaltxt.setText(String.valueOf(tot));
                int d = (int)(tot*(dis/100.0));
                newtot=tot-d;
                String Total= String.valueOf(newtot);
                
                //Date date = new Date();
                //DateFormat d = new SimpleDateFormat("DD-MM-YYYY");
                LocalDate D = LocalDate.now();
                String Date = D.toString();
                //String Date = d.format(date);
                System.out.println(Date);
                pst = con.prepareStatement("insert into customer(order_number,name,address,age,home,mobile,Rsp,Rcyl,Raxis,Radd,Lsp,Lcy,Laxis,Ladd,description,dateOfPurchase,frame_number,lensCode)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)" );
                pst.setInt(1,ON);
                pst.setString(2,name);
                pst.setString(3, address);
                pst.setString(4,age);
                pst.setString(5, home);
                pst.setString(6, mobile);
                pst.setString(7, RightSp);
                pst.setString(8, RightCy);
                pst.setString(9, RightAxis);
                pst.setString(10, RightAdd);
                pst.setString(11, Leftsp);
                pst.setString(12, Leftcy);
                pst.setString(13, LeftAxis);
                pst.setString(14, LeftAdd);
                pst.setString(15, description);
                pst.setString(16, Date);
                pst.setString(17,frameNo);
                pst.setString(18,lenscode);
                pst.executeUpdate();
                
                pst = con.prepareStatement("insert into customer_payment(order_number,total,advance)values(?,?,?)" );
                pst.setInt(1,ON);
                pst.setInt(2, newtot);
                pst.setInt(3, ad);
                pst.executeUpdate();
                
                
                
                pst= con.prepareStatement("select * from customer where order_Number=(SELECT max(order_Number) FROM customer)");
                ResultSet Rs = pst.executeQuery();
                Rs.next();
                String O_No = String.valueOf(Rs.getInt("order_Number"));
                OrderN.setText("O/N:- "+O_No);
                datelable.setText(Rs.getString("dateOfPurchase"));
                Namelable.setText("Name:- "+Rs.getString("Name"));
                telLable.setText("Tele:- "+Rs.getString("Home")+" "+Rs.getString("Mobile"));
                deslable.setText(Rs1.getString("Brand")+" frame with "+Rs2.getString("Description")+" lens");
                
                pst= con.prepareStatement("select * from customer_payment where order_Number=(SELECT max(order_Number) FROM customer)");
                ResultSet Rs3 = pst.executeQuery();
                Rs3.next();
                int tota= Rs3.getInt("total");
                int adv=Rs3.getInt("advance");
                int bal =tota-adv;
                String Balance = String.valueOf(bal);
                String total = String.valueOf(tota);
                String adva =String.valueOf(adv);
                totlable.setText("Total     = "+total);
                adlable.setText("Advance ="+adva);
                ballable.setText("balance  ="+Balance);
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "ERROR");
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            String orderNo = OderNotxt.getText();
            String Advance = Addvancetxt.getText();
            String total= Totaltxt.getText();
            int ad = Integer.parseInt(Advance);
            int tot = Integer.parseInt(total);
            String des;
            LocalDate D = LocalDate.now();
            String Date = D.toString();
            String YandM = Date.substring(0,7);
            if(ad==tot){
                des="O/N "+orderNo+" full pay";
                
            }
            else{
                des="O/N "+orderNo+" Advance";
            }
            
            
            pst=con.prepareStatement("insert into income(description,date,Year_and_month,income) values(?,?,?,?) ");
            pst.setString(1, des);
            pst.setString(2, Date);
            pst.setString(3,YandM);
            pst.setInt(4, ad);
            pst.executeUpdate();
            OderNotxt.setText("");
                nametxt.setText("");
                addresstxt.setText("");
                Home.setText("");
                Mobile.setText("");
                frametxt.setText("");
                lenstxt.setText("");
                Rsp.setText("");
                Rcy.setText("");
                Radd.setText("");
                Rax.setText("");
                Lsp.setText("");
                agetxt.setText("");
                Lcy.setText("");
                Lax.setText("");
                Ladd.setText("");
                Destxt.setText("");
                Totaltxt.setText("");
                Addvancetxt.setText("");
                disco.setText("");
                OderNotxt.requestFocus();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestxtActionPerformed

    private void RspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RspActionPerformed

    private void RcyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RcyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RcyActionPerformed

    private void RaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RaxActionPerformed

    private void RaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RaddActionPerformed

    private void LaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LaddActionPerformed

    private void LaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LaxActionPerformed

    private void LcyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LcyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LcyActionPerformed

    private void LspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LspActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setLocation((close.getLocation().x)-2, (close.getLocation().y)+2);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setLocation((close.getLocation().x)+2, (close.getLocation().y)-2);
    }//GEN-LAST:event_closeMouseExited
    int xMouse;

    int yMouse;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse  = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        OderNotxt.setText("");
            nametxt.setText("");
            addresstxt.setText("");
            Home.setText("");
            Mobile.setText("");
            frametxt.setText("");
            lenstxt.setText("");
            Rsp.setText("");
            Rcy.setText("");
            Radd.setText("");
            Rax.setText("");
            Lsp.setText("");
            agetxt.setText("");
            Lcy.setText("");
            Lax.setText("");
            Ladd.setText("");
            Destxt.setText("");
            Totaltxt.setText("");
            Addvancetxt.setText("");
            disco.setText("");
            OderNotxt.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            PrinterJob job= PrinterJob.getPrinterJob();
            job.setJobName("print Data");
            
            job.setPrintable(new Printable(){
                public int print(Graphics pg,PageFormat pf,int pageNum){
                    pf.setOrientation(PageFormat.PORTRAIT);
                    if (pageNum>0){
                        return Printable.NO_SUCH_PAGE;
                    }
                    java.awt.Graphics2D g2 = (java.awt.Graphics2D)pg;
                    g2.translate(pf.getImageableX(),pf.getImageableY());
                    g2.scale(0.63,0.97);
                    Bill.paint(g2);
                    return Printable.PAGE_EXISTS;
                }           
    });
            boolean ok = job.printDialog();
            if(ok){
                try{
                    job.print();
                }
                catch(PrinterException ex){
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_close2MouseClicked

    private void close2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseEntered
        close2.setLocation((close2.getLocation().x)-2, (close2.getLocation().y)+2);
    }//GEN-LAST:event_close2MouseEntered

    private void close2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseExited
        close2.setLocation((close2.getLocation().x)+2, (close2.getLocation().y)-2);
    }//GEN-LAST:event_close2MouseExited

    private void close1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseExited
        close1.setLocation((close1.getLocation().x)+2, (close1.getLocation().y)-2);
    }//GEN-LAST:event_close1MouseExited

    private void close1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseEntered
        close1.setLocation((close1.getLocation().x)-2, (close1.getLocation().y)+2);
    }//GEN-LAST:event_close1MouseEntered

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        if(this.getExtendedState()!= JFrame.MAXIMIZED_BOTH){
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(JFrame.NORMAL);
        }
    }//GEN-LAST:event_close1MouseClicked

    private void iconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseEntered
        icon.setLocation((icon.getLocation().x)-2, (icon.getLocation().y)+2);
    }//GEN-LAST:event_iconMouseEntered

    private void iconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseExited
        icon.setLocation((icon.getLocation().x)+2, (icon.getLocation().y)-2);
    }//GEN-LAST:event_iconMouseExited

    private void icon1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MouseEntered
        icon1.setLocation((icon1.getLocation().x)-2, (icon1.getLocation().y)+2);
    }//GEN-LAST:event_icon1MouseEntered

    private void icon1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MouseExited
        icon1.setLocation((icon1.getLocation().x)+2, (icon1.getLocation().y)-2);
    }//GEN-LAST:event_icon1MouseExited

    private void icon2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MouseEntered
    icon2.setLocation((icon2.getLocation().x)-2, (icon2.getLocation().y)+2);
    }//GEN-LAST:event_icon2MouseEntered

    private void icon2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MouseExited
        icon2.setLocation((icon2.getLocation().x)+2, (icon2.getLocation().y)-2);
    }//GEN-LAST:event_icon2MouseExited

    private void icon3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MouseEntered
    icon3.setLocation((icon3.getLocation().x)-2, (icon3.getLocation().y)+2);
    }//GEN-LAST:event_icon3MouseEntered

    private void icon3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MouseExited
        icon3.setLocation((icon3.getLocation().x)+2, (icon3.getLocation().y)-2);
    }//GEN-LAST:event_icon3MouseExited

    private void icon4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MouseEntered
    icon4.setLocation((icon4.getLocation().x)-2, (icon4.getLocation().y)+2);
    }//GEN-LAST:event_icon4MouseEntered

    private void icon4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MouseExited
        icon4.setLocation((icon4.getLocation().x)+2, (icon4.getLocation().y)-2);
    }//GEN-LAST:event_icon4MouseExited

    private void icon5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon5MouseEntered
    icon5.setLocation((icon5.getLocation().x)-2, (icon5.getLocation().y)+2);
    }//GEN-LAST:event_icon5MouseEntered

    private void icon5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon5MouseExited
        icon5.setLocation((icon5.getLocation().x)+2, (icon5.getLocation().y)-2);
    }//GEN-LAST:event_icon5MouseExited

    
    private void icon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MouseClicked
        this.setVisible(true);
        new main1().setVisible(false);
        
    }//GEN-LAST:event_icon1MouseClicked

    private void iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseClicked
        this.setVisible(false);
        new main1().setVisible(true);
    }//GEN-LAST:event_iconMouseClicked

    private void lenstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lenstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lenstxtActionPerformed

    private void MobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MobileActionPerformed

    private void icon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MouseClicked
        this.setVisible(false);
        new main1_1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_icon2MouseClicked

    private void icon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MouseClicked
       this.setVisible(false);
       new main3().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_icon3MouseClicked

    private void checktotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checktotActionPerformed
        try {
            String frameNo = frametxt.getText();
            String lenscode =lenstxt.getText();
            pst = con.prepareStatement("select Brand,price from frame_stock where FrameNo=?");
            pst.setString(1,frameNo);
            ResultSet Rs1 =pst.executeQuery();
            Rs1.next();
            int p1 = Integer.parseInt(Rs1.getString("price"));
            
            pst = con.prepareStatement("select Description,price from lense_stock where lensCode=?");
            pst.setString(1,lenscode);
            ResultSet Rs2 =pst.executeQuery();
            Rs2.next();
            int p2 = Integer.parseInt(Rs2.getString("price"));
            
            int tot= p1+p2;
            Totaltxt.setText(String.valueOf(tot));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checktotActionPerformed

    private void discoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discoMouseClicked
                    // TODO add your handling code here:
    }//GEN-LAST:event_discoMouseClicked

    private void icon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MouseClicked
        this.setVisible(false);
        new main4().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_icon4MouseClicked

    private void icon5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon5MouseClicked
        this.setVisible(false);
        new LOGOUT2().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_icon5MouseClicked
    
    
    
    
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Addvancetxt;
    private javax.swing.JPanel Bill;
    private javax.swing.JTextField Destxt;
    private javax.swing.JTextField Home;
    private javax.swing.JTextField Ladd;
    private javax.swing.JTextField Lax;
    private javax.swing.JTextField Lcy;
    private javax.swing.JTextField Lsp;
    private javax.swing.JTextField Mobile;
    private javax.swing.JLabel Namelable;
    private javax.swing.JTextField OderNotxt;
    private javax.swing.JLabel OrderN;
    private javax.swing.JTextField Radd;
    private javax.swing.JTextField Rax;
    private javax.swing.JTextField Rcy;
    private javax.swing.JTextField Rsp;
    private javax.swing.JTextField Totaltxt;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JLabel adlable;
    private javax.swing.JTextField agetxt;
    private javax.swing.JLabel ballable;
    private javax.swing.JPanel bill;
    private javax.swing.JButton checktot;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel close2;
    private javax.swing.JLabel datelable;
    private javax.swing.JLabel deslable;
    private javax.swing.JTextField disco;
    private javax.swing.JTextField frametxt;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lenstxt;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel telLable;
    private javax.swing.JLabel totlable;
    // End of variables declaration//GEN-END:variables
}
