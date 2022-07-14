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
public class main4 extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main4() {
        initComponents();
        connect();
        load();
        load2();
        load3();
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
            LocalDate D = LocalDate.now();
            String Date = D.toString();
            //Date = "%"+Date+"%";
            pst=con.prepareStatement("select * from income");
            //pst.setString(1, Date);
            ResultSet Rs= pst.executeQuery();
            
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("Invoice_no"));
                    v.add(Rs.getString("description"));
                    v.add(Rs.getInt("Income"));
                    v.add(Rs.getInt("Outgoing"));
                }
                df.addRow(v);
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void load2(){
        try {
            int a;
            pst=con.prepareStatement("select Date,sum(income),sum(outgoing) from income group by date ");
            ResultSet Rs= pst.executeQuery();
            
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable2.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                int inc=Rs.getInt("sum(income)");
                int ong=Rs.getInt("sum(outgoing)");
                int total = inc-ong;
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("Date"));
                    v.add(String.valueOf(total));   
                }
                df.addRow(v);
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void load3(){
        try {
            int a;
            pst=con.prepareStatement("select year_and_month,sum(income),sum(outgoing) from income group by year_and_month ");
            ResultSet Rs= pst.executeQuery();
            
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable3.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                int inc=Rs.getInt("sum(income)");
                int ong=Rs.getInt("sum(outgoing)");
                int total = inc-ong;
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("year_and_month"));
                    v.add(String.valueOf(total));   
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
        invoiceno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Pricetxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Datetxt1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox<>();
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
        jTextField1.setBounds(0, 107, 1293, 3);

        bill.setBackground(new java.awt.Color(255, 255, 255));
        bill.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Daily Income");

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
        jLabel3.setText("Invoice No");

        invoiceno.setBackground(new java.awt.Color(0, 0, 102));
        invoiceno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        invoiceno.setForeground(new java.awt.Color(255, 255, 255));
        invoiceno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                invoicenoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                invoicenoKeyTyped(evt);
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
                "Invoice No", "Description", "Income", "Outgoing"
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

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Income"
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
        jLabel5.setText("Monthly Income");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Date");

        Datetxt1.setBackground(new java.awt.Color(0, 0, 102));
        Datetxt1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Datetxt1.setForeground(new java.awt.Color(255, 255, 255));
        Datetxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Datetxt1ActionPerformed(evt);
            }
        });

        jTable3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Month", "Income"
            }
        ));
        jTable3.setRowHeight(30);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(250);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Type");

        typeCombo.setBackground(new java.awt.Color(0, 0, 102));
        typeCombo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        typeCombo.setForeground(new java.awt.Color(255, 255, 255));
        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Income", "Outgoing" }));
        typeCombo.setSelectedIndex(-1);

        javax.swing.GroupLayout billLayout = new javax.swing.GroupLayout(bill);
        bill.setLayout(billLayout);
        billLayout.setHorizontalGroup(
            billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(billLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(billLayout.createSequentialGroup()
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel7))
                                        .addGap(37, 37, 37))
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(25, 25, 25)
                                        .addComponent(invoiceno, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel6)
                                .addGap(31, 31, 31)
                                .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(billLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(destxt, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addComponent(Pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Datetxt1))))
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        billLayout.setVerticalGroup(
            billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(invoiceno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(destxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(Datetxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(billLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        jPanel1.add(bill);
        bill.setBounds(3, 115, 1280, 790);

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
        jPanel1.setBounds(0, 0, 1290, 910);

        setSize(new java.awt.Dimension(1292, 916));
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
        
            
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            df=(DefaultTableModel)jTable1.getModel();
            int selected =jTable1.getSelectedRow();
            String fNo= df.getValueAt(selected,0).toString();

            pst=con.prepareStatement("select * from income where Invoice_No = ?");
            pst.setString(1, fNo);
            ResultSet Rs= pst.executeQuery();
            Rs.next();
            invoiceno.setText(Rs.getString("Invoice_no"));
            destxt.setText(Rs.getString("description"));
            Pricetxt.setText(Rs.getString("income"));
            Datetxt1.setText(Rs.getString("Date"));
            

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
            String fNo=invoiceno.getText();
            String brand = destxt.getText();
            String price = Pricetxt.getText();
            String Date = Datetxt1.getText();
            int p=Integer.parseInt(price);
            String type = (String) typeCombo.getSelectedItem();
            pst = con.prepareStatement("update income set description=?,Price=?,Date=? where invoiceNo=?" );
            pst.setString(1,brand );
            pst.setString(2, price);
            pst.setString(3,Date);
            pst.setString(4, fNo);
            pst.executeUpdate();

            invoiceno.setText("");
            destxt.setText("");
            Pricetxt.setText("");
            typeCombo.setSelectedIndex(-1);
            Datetxt1.setText("");
            invoiceno.requestFocus();

            invoiceno.requestFocus();
            load();
            load2();
            load3();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_EditActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        try {

            String lNo=invoiceno.getText();
            String des = destxt.getText();
            String price = Pricetxt.getText();
            int p=Integer.parseInt(price);
            String type = (String) typeCombo.getSelectedItem();
            LocalDate D = LocalDate.now();
            String Date = D.toString();
            String YandM = Date.substring(0,7);
            
            if  (type.equalsIgnoreCase("income")){
            pst=con.prepareStatement("insert into income(description,date,Year_and_month,income) values(?,?,?,?) ");
            pst.setString(1, des);
            pst.setString(2, Date);
            pst.setString(3,YandM);
            pst.setInt(4, p);
            pst.executeUpdate();
            }
            else{
            pst=con.prepareStatement("insert into income(description,date,Year_and_month,outgoing) values(?,?,?,?) ");
            pst.setString(1, des);
            pst.setString(2, Date);
            pst.setString(3,YandM);
            pst.setInt(4, p);
            pst.executeUpdate();    
            }


            invoiceno.setText("");
            destxt.setText("");
            Pricetxt.setText("");
            typeCombo.setSelectedIndex(-1);
            Datetxt1.setText("");
            invoiceno.requestFocus();

            load();
            load2();
            load3();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_SubmitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        invoiceno.setText("");
            destxt.setText("");
            Pricetxt.setText("");
            typeCombo.setSelectedIndex(-1);
            Datetxt1.setText("");
            invoiceno.requestFocus();
        load();
        load2();
        load3();
    }//GEN-LAST:event_ResetActionPerformed

    private void invoicenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invoicenoKeyTyped

    }//GEN-LAST:event_invoicenoKeyTyped

    private void invoicenoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invoicenoKeyPressed

    }//GEN-LAST:event_invoicenoKeyPressed

    private void destxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_destxtKeyTyped
        String Search = destxt.getText();
        Search="%"+Search+"%";
        try {
            int a;
            pst=con.prepareStatement("Select * from income where description LIKE '"+Search+"'");
            ResultSet Rs= pst.executeQuery();

            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);

            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("Invoice_no"));
                    v.add(Rs.getString("description"));
                    v.add(Rs.getInt("Income"));
                    v.add(Rs.getInt("Outgoing"));
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
            pst=con.prepareStatement("Select * from income where description LIKE '"+Search+"'");
            ResultSet Rs= pst.executeQuery();

            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);

            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("Invoice_no"));
                    v.add(Rs.getString("description"));
                    v.add(Rs.getInt("Income"));
                    v.add(Rs.getInt("Outgoing"));
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

    private void iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMouseClicked
        this.setVisible(false);
        new main1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_iconMouseClicked

    private void Datetxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Datetxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Datetxt1ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3MouseClicked
    
    
    
    
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
    private javax.swing.JTextField Datetxt1;
    private javax.swing.JButton Edit;
    private javax.swing.JTextField Pricetxt;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Submit;
    private javax.swing.JPanel bill;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel close2;
    private javax.swing.JTextField destxt;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JTextField invoiceno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> typeCombo;
    // End of variables declaration//GEN-END:variables
}
