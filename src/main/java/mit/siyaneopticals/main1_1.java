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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sidath Karunarathna
 */
public class main1_1 extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main1_1() {
        initComponents();
        connect();
        load();
        load2();
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
                Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void load(){
        try {
            int a;
            pst=con.prepareStatement("select * from frame_Stock ");
            ResultSet Rs= pst.executeQuery();
            
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("FrameNo"));
                    v.add(Rs.getString("Brand"));
                    v.add(Rs.getString("DateOfSale"));   
                }
                df.addRow(v);
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void load2(){
        try {
            int a;
            pst=con.prepareStatement("select Brand,Count(Brand) from frame_Stock group by Brand  ");
            ResultSet Rs= pst.executeQuery();
            
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable2.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("Brand"));
                    v.add(Rs.getString("Count(Brand)"));   
                }
                df.addRow(v);
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        bill = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Brandtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        frameNo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        madeCombo = new javax.swing.JComboBox<>();
        Reset = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Pricetxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
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

        bill.setBackground(new java.awt.Color(255, 255, 255));
        bill.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Frame");

        Brandtxt.setBackground(new java.awt.Color(0, 0, 102));
        Brandtxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Brandtxt.setForeground(new java.awt.Color(255, 255, 255));
        Brandtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandtxtActionPerformed(evt);
            }
        });
        Brandtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BrandtxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BrandtxtKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Brand");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Frame No");

        frameNo.setBackground(new java.awt.Color(0, 0, 102));
        frameNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        frameNo.setForeground(new java.awt.Color(255, 255, 255));
        frameNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                frameNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                frameNoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Made");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Price");

        madeCombo.setBackground(new java.awt.Color(0, 0, 102));
        madeCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        madeCombo.setForeground(new java.awt.Color(255, 255, 255));
        madeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metal", "Plastic" }));
        madeCombo.setSelectedIndex(-1);

        Reset.setBackground(new java.awt.Color(51, 51, 51));
        Reset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Submit.setBackground(new java.awt.Color(51, 51, 51));
        Submit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("Add");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Edit.setBackground(new java.awt.Color(51, 51, 51));
        Edit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Pricetxt.setBackground(new java.awt.Color(0, 0, 102));
        Pricetxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Pricetxt.setForeground(new java.awt.Color(255, 255, 255));
        Pricetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PricetxtActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Frame No", "Brand", "Date of sale"
            }
        ));
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Frame No");
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Quantity"
            }
        ));
        jTable2.setRowHeight(30);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(250);
        }

        javax.swing.GroupLayout billLayout = new javax.swing.GroupLayout(bill);
        bill.setLayout(billLayout);
        billLayout.setHorizontalGroup(
            billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(billLayout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(billLayout.createSequentialGroup()
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, billLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(frameNo))
                            .addGroup(billLayout.createSequentialGroup()
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addGap(40, 40, 40)
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(madeCombo, 0, 176, Short.MAX_VALUE)
                                    .addComponent(Brandtxt)
                                    .addComponent(Pricetxt))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        billLayout.setVerticalGroup(
            billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(frameNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(34, 34, 34)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Brandtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(madeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(357, 357, 357)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(billLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sidath Karunarathna\\Documents\\NetBeansProjects\\SiyanaeOpticals\\SIYANE\\Untitled-1.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(icon1)
                        .addGap(206, 206, 206)
                        .addComponent(icon2)
                        .addGap(44, 44, 44)
                        .addComponent(icon3)
                        .addGap(593, 593, 593)
                        .addComponent(close2)
                        .addGap(6, 6, 6)
                        .addComponent(close1)
                        .addGap(6, 6, 6)
                        .addComponent(close))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(644, 644, 644)
                        .addComponent(icon4))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 1283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(806, 806, 806)
                        .addComponent(icon5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(icon))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(close2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(icon5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(close1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(close))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1296, 925);

        setSize(new java.awt.Dimension(1297, 927));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BrandtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandtxtActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        try {
            
            
            String fNo=frameNo.getText();
            String brand = Brandtxt.getText();
            String made= (String) madeCombo.getSelectedItem();
            String price = Pricetxt.getText();
            
            
            
            pst = con.prepareStatement("insert into frame_stock(FrameNo,Brand,Made,Price) values(?,?,?,?) " );
            
            pst.setString(1,fNo);
            pst.setString(2, brand);
            pst.setString(3, made);
            pst.setString(4, price);
            pst.executeUpdate();
            
            frameNo.setText("");
            Brandtxt.setText("");
            madeCombo.setSelectedIndex(-1);
            Pricetxt.setText("");
            frameNo.requestFocus();
            
            load();
            load2();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void PricetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PricetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PricetxtActionPerformed

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

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        frameNo.setText("");
            Brandtxt.setText("");
            madeCombo.setSelectedIndex(-1);
            Pricetxt.setText("");
            
            frameNo.requestFocus();
            load();
            load2();
    }//GEN-LAST:event_ResetActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        try {
            String fNo=frameNo.getText();
            String brand = Brandtxt.getText();
            String made= (String) madeCombo.getSelectedItem();
            String price = Pricetxt.getText();
            pst = con.prepareStatement("update frame_stock set Brand=?,Made=?,Price=? where FrameNo=?" );
            pst.setString(1,brand );
            pst.setString(2,made);
            pst.setString(3, price);
            pst.setString(4, fNo);
            pst.executeUpdate();
            
            frameNo.setText("");
            Brandtxt.setText("");
            madeCombo.setSelectedIndex(-1);
            Pricetxt.setText("");
            
            frameNo.requestFocus();
            load();
            load2();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
            
         
    }//GEN-LAST:event_EditActionPerformed

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
        this.setVisible(false);
        new main().setVisible(true);
    }//GEN-LAST:event_icon1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            df=(DefaultTableModel)jTable1.getModel();
            int selected =jTable1.getSelectedRow();
            String fNo= df.getValueAt(selected,0).toString();
            
            pst=con.prepareStatement("select * from frame_stock where FrameNo = ?");
            pst.setString(1, fNo);
            ResultSet Rs= pst.executeQuery();
            Rs.next();
            frameNo.setText(Rs.getString("FrameNo"));
            Brandtxt.setText(Rs.getString("Brand"));
            madeCombo.setSelectedItem(Rs.getString("Made"));
            Pricetxt.setText(Rs.getString("Price"));
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void BrandtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BrandtxtKeyPressed
        String Search = Brandtxt.getText();
        Search="%"+Search+"%";
        try {
            int a;
            pst=con.prepareStatement("Select * from frame_stock where Brand LIKE '"+Search+"'");
            ResultSet Rs= pst.executeQuery();
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("FrameNo"));
                    v.add(Rs.getString("Brand"));
                    v.add(Rs.getString("DateOfSale"));    
                }
                df.addRow(v);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BrandtxtKeyPressed

    private void BrandtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BrandtxtKeyTyped
        String Search = Brandtxt.getText();
        Search="%"+Search+"%";
        try {
            int a;
            pst=con.prepareStatement("Select * from frame_Stock where Brand LIKE '"+Search+"'");
            ResultSet Rs= pst.executeQuery();
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("FrameNo"));
                    v.add(Rs.getString("Brand"));
                    v.add(Rs.getString("DateOfSale"));     
                }
                df.addRow(v);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BrandtxtKeyTyped

    private void frameNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_frameNoKeyPressed
        
    }//GEN-LAST:event_frameNoKeyPressed

    private void frameNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_frameNoKeyTyped
        
    }//GEN-LAST:event_frameNoKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Search = frameNo.getText();
        int se = Integer.parseInt(Search);
        try {
            int a;
            pst=con.prepareStatement("Select * from frame_stock where FrameNo=?");
            pst.setString(1, Search);
            ResultSet Rs= pst.executeQuery();
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("FrameNo"));
                    v.add(Rs.getString("Brand"));
                    v.add(Rs.getString("DateOfSale"));     
                }
                df.addRow(v);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void icon5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon5MouseClicked
            this.setVisible(false);
        new LOGOUT2().setVisible(true); 
    }//GEN-LAST:event_icon5MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseClicked

    private void icon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MouseClicked
                // TODO add your handling code here:
    }//GEN-LAST:event_icon2MouseClicked

    private void iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseClicked
        this.setVisible(false);
        new main1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_iconMouseClicked

    private void icon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MouseClicked
        this.setVisible(false);
        new main3().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_icon3MouseClicked

    private void icon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MouseClicked
        this.setVisible(false);
        new main4().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_icon4MouseClicked
    
    
    
    
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
            java.util.logging.Logger.getLogger(main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Brandtxt;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField Pricetxt;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Submit;
    private javax.swing.JPanel bill;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel close2;
    private javax.swing.JTextField frameNo;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> madeCombo;
    // End of variables declaration//GEN-END:variables
}
