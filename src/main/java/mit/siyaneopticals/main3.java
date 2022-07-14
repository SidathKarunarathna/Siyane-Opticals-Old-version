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
public class main3 extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main3() {
        initComponents();
        connect();
        load();
        load2();
    }
    Connection con;
    PreparedStatement pst;
    DefaultTableModel df;
    ResultSet Rs1;
    
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
            pst=con.prepareStatement("select * from lense_Stock ");
            ResultSet Rs= pst.executeQuery();
            
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("lensCode"));
                    v.add(Rs.getString("description"));
                    v.add(Rs.getString("price"));   
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
            pst=con.prepareStatement("select order_number,dateOfPurchase from customer where dateOfOrdered is Null  ");
            ResultSet Rs= pst.executeQuery();
            
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable2.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("order_number"));
                    v.add(Rs.getString("dateOfPurchase"));   
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
        destxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lenscode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Pricetxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Rsp = new javax.swing.JTextField();
        Rcy = new javax.swing.JTextField();
        Rax = new javax.swing.JTextField();
        Radd = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Lsp = new javax.swing.JTextField();
        Lcy = new javax.swing.JTextField();
        Lax = new javax.swing.JTextField();
        Ladd = new javax.swing.JTextField();
        detxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Submit1 = new javax.swing.JButton();
        Reset1 = new javax.swing.JButton();
        ON = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
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
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));
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
        jTextField1.setBounds(0, 107, 1293, 3);

        bill.setBackground(new java.awt.Color(255, 255, 255));
        bill.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Lens");

        destxt.setBackground(new java.awt.Color(0, 0, 102));
        destxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        destxt.setForeground(new java.awt.Color(255, 255, 255));
        destxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destxtActionPerformed(evt);
            }
        });
        destxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                destxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                destxtKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Description");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Lens Code");

        lenscode.setBackground(new java.awt.Color(0, 0, 102));
        lenscode.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lenscode.setForeground(new java.awt.Color(255, 255, 255));
        lenscode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lenscodeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lenscodeKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Price");

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
                "Lens Code", "Description", "Price"
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
                "Order No", "Date of Purchase"
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

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Lens to be Ordered");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 102));
        jLabel22.setText("Right Eye");

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

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 102));
        jLabel21.setText("Left Eye");

        Lsp.setBackground(new java.awt.Color(0, 0, 102));
        Lsp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Lsp.setForeground(new java.awt.Color(255, 255, 255));
        Lsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LspActionPerformed(evt);
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

        Lax.setBackground(new java.awt.Color(0, 0, 102));
        Lax.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Lax.setForeground(new java.awt.Color(255, 255, 255));
        Lax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaxActionPerformed(evt);
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

        detxt.setBackground(new java.awt.Color(0, 0, 102));
        detxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        detxt.setForeground(new java.awt.Color(255, 255, 255));
        detxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detxtActionPerformed(evt);
            }
        });
        detxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                detxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                detxtKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Description");

        Submit1.setBackground(new java.awt.Color(51, 51, 51));
        Submit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Submit1.setForeground(new java.awt.Color(255, 255, 255));
        Submit1.setText("Order");
        Submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit1ActionPerformed(evt);
            }
        });

        Reset1.setBackground(new java.awt.Color(51, 51, 51));
        Reset1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Reset1.setForeground(new java.awt.Color(255, 255, 255));
        Reset1.setText("Reset");
        Reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset1ActionPerformed(evt);
            }
        });

        ON.setBackground(new java.awt.Color(0, 0, 102));
        ON.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ON.setForeground(new java.awt.Color(255, 255, 255));
        ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 102));
        jLabel23.setText("O/N");

        javax.swing.GroupLayout billLayout = new javax.swing.GroupLayout(bill);
        bill.setLayout(billLayout);
        billLayout.setHorizontalGroup(
            billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(billLayout.createSequentialGroup()
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, billLayout.createSequentialGroup()
                                .addGap(194, 194, 194)
                                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, billLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(40, 40, 40)
                                .addComponent(detxt, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(billLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billLayout.createSequentialGroup()
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(40, 40, 40))
                                        .addGroup(billLayout.createSequentialGroup()
                                            .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel7))
                                            .addGap(37, 37, 37)))
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(39, 39, 39)))
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lenscode)
                                            .addComponent(Pricetxt, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(destxt, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37))
                            .addGroup(billLayout.createSequentialGroup()
                                .addComponent(Rsp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Rcy)
                                            .addComponent(Radd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(Rax, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Lsp, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Ladd)
                                            .addComponent(Lcy, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(Lax, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel21)))
                            .addGroup(billLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(ON, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(623, 623, 623))
        );
        billLayout.setVerticalGroup(
            billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lenscode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(34, 34, 34)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(destxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(billLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billLayout.createSequentialGroup()
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21)))
                            .addGroup(billLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ON, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))))
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
                        .addGap(28, 28, 28)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(detxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(billLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );

        jPanel1.add(bill);
        bill.setBounds(10, 110, 1280, 789);

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
        close.setBounds(1250, 10, 30, 30);

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
        close1.setBounds(1210, 10, 30, 30);

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
        close2.setBounds(1170, 10, 30, 40);

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
        icon1.setBounds(5, 0, 111, 101);

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
        jLabel18.setBounds(4, 4, 1320, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1300, 910);

        setSize(new java.awt.Dimension(1303, 916));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void icon5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon5MouseClicked
        this.setVisible(false);
        new LOGOUT2().setVisible(true);
    }//GEN-LAST:event_icon5MouseClicked

    private void icon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MouseClicked
        this.setVisible(false);
        new main1_1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_icon2MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try {
            df=(DefaultTableModel)jTable2.getModel();
            int selected =jTable2.getSelectedRow();
            int oNo= Integer.parseInt(df.getValueAt(selected,0).toString());
            
            pst=con.prepareStatement("select * from customer where order_Number = ?");
            pst.setInt(1, oNo);
            Rs1= pst.executeQuery();
            Rs1.next();
            ON.setText(String.valueOf(oNo));
            Rsp.setText(Rs1.getString("Rsp"));
            Rcy.setText(Rs1.getString("Rcyl"));
            Rax.setText(Rs1.getString("Raxis"));
            Radd.setText(Rs1.getString("Radd"));
            Lsp.setText(Rs1.getString("Lsp"));
            Lcy.setText(Rs1.getString("Lcy"));
            Lax.setText(Rs1.getString("Laxis"));
            Ladd.setText(Rs1.getString("Ladd"));
            String lensCode=Rs1.getString("lensCode");
            
            pst=con.prepareStatement("select description from lense_Stock where lensCode = ?");
            pst.setString(1, lensCode);
            ResultSet Rs2= pst.executeQuery();
            Rs2.next();
            detxt.setText(Rs2.getString("description"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main3.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Search = lenscode.getText();
        int se = Integer.parseInt(Search);
        try {
            int a;
            pst=con.prepareStatement("Select * from lense_stock where lensCode=?");
            pst.setString(1, Search);
            ResultSet Rs= pst.executeQuery();

            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);

            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("lensCode"));
                    v.add(Rs.getString("description"));
                    v.add(Rs.getString("price"));
                }
                df.addRow(v);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            df=(DefaultTableModel)jTable1.getModel();
            int selected =jTable1.getSelectedRow();
            String fNo= df.getValueAt(selected,0).toString();

            pst=con.prepareStatement("select * from lense_stock where lensCode = ?");
            pst.setString(1, fNo);
            ResultSet Rs= pst.executeQuery();
            Rs.next();
            lenscode.setText(Rs.getString("lensCode"));
            destxt.setText(Rs.getString("description"));
            Pricetxt.setText(Rs.getString("Price"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void PricetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PricetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PricetxtActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        try {
            String fNo=lenscode.getText();
            String brand = destxt.getText();
            String price = Pricetxt.getText();
            pst = con.prepareStatement("update lense_stock set description=?,Price=? where lensCode=?" );
            pst.setString(1,brand );
            pst.setString(2, price);
            pst.setString(3, fNo);
            pst.executeUpdate();

            lenscode.setText("");
            destxt.setText("");
            Pricetxt.setText("");

            lenscode.requestFocus();
            load();
            load2();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_EditActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        try {

            String lNo=lenscode.getText();
            String des = destxt.getText();
            String price = Pricetxt.getText();

            pst = con.prepareStatement("insert into lense_stock(lensCode,description,Price) values(?,?,?) " );

            pst.setString(1,lNo);
            pst.setString(2, des);
            pst.setString(3, price);
            pst.executeUpdate();

            lenscode.setText("");
            destxt.setText("");
            Pricetxt.setText("");
            lenscode.requestFocus();

            load();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_SubmitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        lenscode.setText("");
        destxt.setText("");
        Pricetxt.setText("");

        lenscode.requestFocus();
        load();
        load2();
    }//GEN-LAST:event_ResetActionPerformed

    private void lenscodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lenscodeKeyTyped

    }//GEN-LAST:event_lenscodeKeyTyped

    private void lenscodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lenscodeKeyPressed

    }//GEN-LAST:event_lenscodeKeyPressed

    private void destxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_destxtKeyTyped
        String Search = destxt.getText();
        Search="%"+Search+"%";
        try {
            int a;
            pst=con.prepareStatement("Select * from lense_stock where description LIKE '"+Search+"'");
            ResultSet Rs= pst.executeQuery();

            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);

            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("lensCode"));
                    v.add(Rs.getString("description"));
                    v.add(Rs.getString("price"));
                }
                df.addRow(v);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_destxtKeyTyped

    private void destxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_destxtKeyPressed
        String Search = destxt.getText();
        Search="%"+Search+"%";
        try {
            int a;
            pst=con.prepareStatement("Select * from lense_stock where description LIKE '"+Search+"'");
            ResultSet Rs= pst.executeQuery();

            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);

            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("lensCode"));
                    v.add(Rs.getString("description"));
                    v.add(Rs.getString("price"));
                }
                df.addRow(v);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_destxtKeyPressed

    private void destxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destxtActionPerformed

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

    private void LspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LspActionPerformed

    private void LcyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LcyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LcyActionPerformed

    private void LaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LaxActionPerformed

    private void LaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LaddActionPerformed

    private void detxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_detxtActionPerformed

    private void detxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_detxtKeyPressed

    private void detxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detxtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_detxtKeyTyped

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed
        try {
            LocalDate D = LocalDate.now();
            String Date = D.toString();
            String ONo= ON.getText();
            int o= Integer.parseInt(ONo);
            pst= con.prepareStatement("Update customer set dateOfOrdered=? where order_number =?" );
            pst.setString(1, Date);
            pst.setInt(2, o);
            pst.executeUpdate(); 
            load2();
            ON.setText("");
            Rsp.setText("");
            Rcy.setText("");
            Rax.setText("");
            Radd.setText("");
            Lsp.setText("");
            Lcy.setText("");
            Lax.setText("");
            Ladd.setText("");
            detxt.setText("");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }//GEN-LAST:event_Submit1ActionPerformed

    private void Reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset1ActionPerformed
        ON.setText("");
            Rsp.setText("");
            Rcy.setText("");
            Rax.setText("");
            Radd.setText("");
            Lsp.setText("");
            Lcy.setText("");
            Lax.setText("");
            Ladd.setText("");
            detxt.setText("");
    }//GEN-LAST:event_Reset1ActionPerformed

    private void iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseClicked
        this.setVisible(false);
        new main1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_iconMouseClicked

    private void ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ONActionPerformed

    private void icon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MouseClicked
        this.setVisible(false);
        new main4().setVisible(true);         // TODO add your handling code here:
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
    private javax.swing.JButton Edit;
    private javax.swing.JTextField Ladd;
    private javax.swing.JTextField Lax;
    private javax.swing.JTextField Lcy;
    private javax.swing.JTextField Lsp;
    private javax.swing.JTextField ON;
    private javax.swing.JTextField Pricetxt;
    private javax.swing.JTextField Radd;
    private javax.swing.JTextField Rax;
    private javax.swing.JTextField Rcy;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Reset1;
    private javax.swing.JTextField Rsp;
    private javax.swing.JButton Submit;
    private javax.swing.JButton Submit1;
    private javax.swing.JPanel bill;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel close2;
    private javax.swing.JTextField destxt;
    private javax.swing.JTextField detxt;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lenscode;
    // End of variables declaration//GEN-END:variables
}
