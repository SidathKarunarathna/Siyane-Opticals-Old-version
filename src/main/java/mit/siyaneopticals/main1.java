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
public class main1 extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main1() {
        initComponents();
        connect();
        load();
    }
    Connection con;
    PreparedStatement pst;
    DefaultTableModel df;
    private int orderNo1;
    
    public int order(){
        return orderNo1;
    }
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
            pst=con.prepareStatement("select * from customer order by order_number DESC");
            ResultSet Rs= pst.executeQuery();
            
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("Order_number"));
                    v.add(Rs.getString("name"));
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
        nametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OderNotxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        frametxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Home = new javax.swing.JTextField();
        Mobile = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lenstxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Bal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        dateP = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        dateD = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
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
        jTextField1.setBounds(0, 107, 1303, 3);

        bill.setBackground(new java.awt.Color(255, 255, 255));
        bill.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Customer");

        nametxt.setBackground(new java.awt.Color(0, 0, 102));
        nametxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nametxt.setForeground(new java.awt.Color(255, 255, 255));
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        nametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nametxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nametxtKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Order No");

        OderNotxt.setBackground(new java.awt.Color(0, 0, 102));
        OderNotxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        OderNotxt.setForeground(new java.awt.Color(255, 255, 255));
        OderNotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OderNotxtActionPerformed(evt);
            }
        });
        OderNotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                OderNotxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                OderNotxtKeyTyped(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Frame No");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Description");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Total");

        Totaltxt.setBackground(new java.awt.Color(0, 0, 102));
        Totaltxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Totaltxt.setForeground(new java.awt.Color(255, 255, 255));

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
        jButton2.setText("Edit");
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

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 102));
        jLabel21.setText("Left Eye");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 102));
        jLabel22.setText("Right Eye");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order NO", "Name", "Date of Purchase"
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

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("Home");

        Home.setBackground(new java.awt.Color(0, 0, 102));
        Home.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        Mobile.setBackground(new java.awt.Color(0, 0, 102));
        Mobile.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Mobile.setForeground(new java.awt.Color(255, 255, 255));
        Mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MobileActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Mobile");

        lenstxt.setBackground(new java.awt.Color(0, 0, 102));
        lenstxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lenstxt.setForeground(new java.awt.Color(255, 255, 255));
        lenstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lenstxtActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("Lens Code");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Balance");

        Bal.setBackground(new java.awt.Color(0, 0, 102));
        Bal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Bal.setForeground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("%");

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 102));
        jLabel19.setText("Age");

        agetxt.setBackground(new java.awt.Color(0, 0, 102));
        agetxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        agetxt.setForeground(new java.awt.Color(255, 255, 255));

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Complete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Deliver");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("Date of Purchased");

        dateP.setBackground(new java.awt.Color(0, 0, 102));
        dateP.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dateP.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 102));
        jLabel17.setText("Date of Delivered");

        dateD.setBackground(new java.awt.Color(0, 0, 102));
        dateD.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dateD.setForeground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 102));
        jLabel20.setText("Status");

        Status.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Status.setForeground(new java.awt.Color(0, 0, 102));

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
                                .addGap(12, 12, 12)
                                .addComponent(Rsp, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
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
                                        .addComponent(jLabel22)
                                        .addGap(230, 230, 230)
                                        .addComponent(jLabel21))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Destxt))
                            .addGroup(billLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OderNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addGap(11, 11, 11))
                            .addGroup(billLayout.createSequentialGroup()
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nametxt)
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(billLayout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(billLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lenstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(frametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(billLayout.createSequentialGroup()
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(billLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(Totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(Addvancetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, billLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, billLayout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)
                                        .addComponent(dateP))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, billLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(31, 31, 31)
                                        .addComponent(dateD)))))
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20)
                                .addGap(62, 62, 62))
                            .addGroup(billLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(billLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Bal, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                    .addContainerGap(946, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addGap(317, 317, 317)))
        );
        billLayout.setVerticalGroup(
            billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(OderNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
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
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billLayout.createSequentialGroup()
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(frametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(billLayout.createSequentialGroup()
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lenstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Destxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(Addvancetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(Bal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(dateP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(dateD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(billLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(billLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(billLayout.createSequentialGroup()
                    .addGap(530, 530, 530)
                    .addComponent(jLabel16)
                    .addContainerGap(221, Short.MAX_VALUE)))
        );

        jPanel1.add(bill);
        bill.setBounds(10, 128, 1270, 780);

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
        jLabel18.setBounds(3, 3, 1280, 117);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1290, 920);

        setSize(new java.awt.Dimension(1296, 921));
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            
            
            String orderNo = OderNotxt.getText();
            int ON= Integer.parseInt(orderNo);
            String name = nametxt.getText();
            String address = addresstxt.getText();
            String age = agetxt.getText();
            String frameNo = frametxt.getText();
            String lenscode = lenstxt.getText();
            String home=Home.getText();
            String mobile= Mobile.getText();
            String RightSp = Rsp.getText();
            String RightCy = Rcy.getText();
            String RightAxis =Rax.getText();
            String RightAdd = Radd.getText();
            String Leftsp = Lsp.getText();
            String Leftcy = Lcy.getText();
            String LeftAxis = Lax.getText();
            String LeftAdd = Ladd.getText();
            String description = Destxt.getText();
            String Total = Totaltxt.getText();
            String Advance = Addvancetxt.getText();
            String date1= dateP.getText();
            int tot = Integer.parseInt(Total);
            int ad = Integer.parseInt(Advance);
            
            
            //Date date = new Date();
            //DateFormat d = new SimpleDateFormat("DD-MM-YYYY");
            
            //String Date = d.format(date);
            
            
            pst = con.prepareStatement("update customer set name=?,address=?,age=?,frame_Number=?,lensCode=?,Home=?,Rsp=?,Rcyl=?,Raxis=?,Radd=?,Lsp=?,Lcy=?,Laxis=?,Ladd=?,description=?,mobile=?,dateOfPurchase=? where order_Number=?" );
            
            pst.setString(1,name);
            pst.setString(2, address);
            pst.setString(3, age);
            pst.setString(4, frameNo);
            pst.setString(5, lenscode);
            pst.setString(6, home);
            pst.setString(7, RightSp);
            pst.setString(8, RightCy);
            pst.setString(9, RightAxis);
            pst.setString(10, RightAdd);
            pst.setString(11, Leftsp);
            pst.setString(12, Leftcy);
            pst.setString(13, LeftAxis);
            pst.setString(14, LeftAdd);
            pst.setString(15, description);
            pst.setString(16,mobile);
            pst.setString(17, date1);
            pst.setInt(18,ON);
            pst.executeUpdate();
            
            pst = con.prepareStatement("update customer_payment set Total=?,advance=? where order_Number=?" );
            pst.setInt(1,tot);
            pst.setInt(2, ad);
            pst.setInt(3,ON);
            pst.executeUpdate();
            
            OderNotxt.setText("");
            nametxt.setText("");
            addresstxt.setText("");
            agetxt.setText("");
            frametxt.setText("");
            Home.setText("");
            Mobile.setText("");
            Rsp.setText("");
            Rcy.setText("");
            Radd.setText("");
            Rax.setText("");
            lenstxt.setText("");
            Lsp.setText("");
            Lcy.setText("");
            Lax.setText("");
            Ladd.setText("");
            Destxt.setText("");
            Totaltxt.setText("");
            Addvancetxt.setText("");
            OderNotxt.requestFocus();
            dateP.setText("");
            dateD.setText("");
            Bal.setText("");
            Status.setText("");
            load();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
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
            agetxt.setText("");
            frametxt.setText("");
            Home.setText("");
            Mobile.setText("");
            Rsp.setText("");
            Rcy.setText("");
            Radd.setText("");
            Rax.setText("");
            Lsp.setText("");
            lenstxt.setText("");
            Lcy.setText("");
            Lax.setText("");
            Ladd.setText("");
            Destxt.setText("");
            Totaltxt.setText("");
            Addvancetxt.setText("");
            OderNotxt.requestFocus();
            dateP.setText("");
            dateD.setText("");
            Bal.setText("");
            Status.setText("");
            load();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

            new main2().setVisible(true);
                    
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
        this.setVisible(false);
        new main().setVisible(true);
    }//GEN-LAST:event_icon1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            df=(DefaultTableModel)jTable1.getModel();
            int selected =jTable1.getSelectedRow();
            int oNo= Integer.parseInt(df.getValueAt(selected,0).toString());
            
            pst=con.prepareStatement("select * from customer where order_Number = ?");
            pst.setInt(1, oNo);
            ResultSet Rs= pst.executeQuery();
            Rs.next();
            OderNotxt.setText(String.valueOf(Rs.getInt("order_number")));
            nametxt.setText(Rs.getString("name"));
            addresstxt.setText(Rs.getString("address"));
            agetxt.setText(Rs.getString("age"));
            frametxt.setText(Rs.getString("frame_Number"));
            lenstxt.setText(Rs.getString("lensCode"));
            Home.setText(Rs.getString("Home"));
            Mobile.setText(Rs.getString("Mobile"));
            Rsp.setText(Rs.getString("Rsp"));
            Rcy.setText(Rs.getString("Rcyl"));
            Rax.setText(Rs.getString("Raxis"));
            Radd.setText(Rs.getString("Radd"));
            Lsp.setText(Rs.getString("Lsp"));
            Lcy.setText(Rs.getString("Lcy"));
            Lax.setText(Rs.getString("Laxis"));
            Ladd.setText(Rs.getString("Ladd"));
            dateP.setText(Rs.getString("dateOfPurchase"));
            dateD.setText(Rs.getString("dateOfDelivery"));
            Destxt.setText(Rs.getString("description"));
            String dateC = Rs.getString("dateOfCompleted");
            
            if (dateC != null){
                Status.setText("COMPLETED");
            }
            else{
                Status.setText("NOT COMPLETED");
            }
            
            pst=con.prepareStatement("select * from customer_payment where order_Number = ?");
            pst.setInt(1, oNo);
            Rs= pst.executeQuery();
            Rs.next();
            Totaltxt.setText(String.valueOf(Rs.getInt("total")));
            Addvancetxt.setText(String.valueOf(Rs.getInt("advance")));
            
            int T = Rs.getInt("total");
            int A= Rs.getInt("advance");
            int B= T-A;
            Bal.setText(String.valueOf(B));
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void nametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametxtKeyPressed
        String Search = nametxt.getText();
        Search="%"+Search+"%";
        try {
            int a;
            pst=con.prepareStatement("Select * from customer where name LIKE '"+Search+"'");
            ResultSet Rs= pst.executeQuery();
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("Order_number"));
                    v.add(Rs.getString("name"));
                    v.add(Rs.getString("dateOfPurchase"));   
                }
                df.addRow(v);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_nametxtKeyPressed

    private void nametxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametxtKeyTyped
        String Search = nametxt.getText();
        Search="%"+Search+"%";
        try {
            int a;
            pst=con.prepareStatement("Select * from customer where name LIKE '"+Search+"'");
            ResultSet Rs= pst.executeQuery();
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("Order_number"));
                    v.add(Rs.getString("name"));
                    v.add(Rs.getString("dateOfPurchase"));   
                }
                df.addRow(v);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nametxtKeyTyped

    private void OderNotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OderNotxtKeyPressed
        
    }//GEN-LAST:event_OderNotxtKeyPressed

    private void OderNotxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OderNotxtKeyTyped
        
    }//GEN-LAST:event_OderNotxtKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Search = OderNotxt.getText();
        int se = Integer.parseInt(Search);
        try {
            int a;
            pst=con.prepareStatement("Select * from customer where order_number= ?");
            pst.setInt(1, se);
            ResultSet Rs= pst.executeQuery();
            
            ResultSetMetaData rd= Rs.getMetaData();
            a=rd.getColumnCount();
            df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            
            while(Rs.next()){
                Vector v =new Vector();
                for(int i=1;i<a;i++){
                    v.add(Rs.getString("Order_number"));
                    v.add(Rs.getString("name"));
                    v.add(Rs.getString("dateOfPurchase"));   
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

    private void OderNotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OderNotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OderNotxtActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void MobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MobileActionPerformed

    private void lenstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lenstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lenstxtActionPerformed

    private void icon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon3MouseClicked
        this.setVisible(false);
        new main3().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_icon3MouseClicked

    private void icon2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MouseClicked
        this.setVisible(false);
        new main1_1().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_icon2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            LocalDate D = LocalDate.now();
            String Date = D.toString();
            String ONo= OderNotxt.getText();
            int o= Integer.parseInt(ONo);
            pst= con.prepareStatement("Update customer set dateOfCompleted=? where order_number =?" );
            pst.setString(1, Date);
            pst.setInt(2, o);
            pst.executeUpdate();
            OderNotxt.setText("");
            nametxt.setText("");
            addresstxt.setText("");
            agetxt.setText("");
            frametxt.setText("");
            Home.setText("");
            Mobile.setText("");
            lenstxt.setText("");
            Rsp.setText("");
            Rcy.setText("");
            Radd.setText("");
            Rax.setText("");
            Lsp.setText("");
            Lcy.setText("");
            Lax.setText("");
            Ladd.setText("");
            Destxt.setText("");
            Totaltxt.setText("");
            Addvancetxt.setText("");
            OderNotxt.requestFocus();
            dateP.setText("");
            dateD.setText("");
            Bal.setText("");
            Status.setText("");
            load();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {                                         
            try {
                LocalDate D = LocalDate.now();
                String Date = D.toString();
                String ONo= OderNotxt.getText();
                int o= Integer.parseInt(ONo);
                pst= con.prepareStatement("Update customer set dateOfDelivery=? where order_number =?" );
                pst.setString(1, Date);
                pst.setInt(2, o);
                pst.executeUpdate();
                // TODO add your handling code here:
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "ERROR");
                Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
            }
            String orderNo = OderNotxt.getText();
            String Advance1 = Addvancetxt.getText();
            String total= Totaltxt.getText();
            System.out.println(Advance1);
            int ad = Integer.parseInt(Advance1);
            int tot = Integer.parseInt(total);
            int bal= tot-ad;
            String des;
            LocalDate D = LocalDate.now();
            String Date = D.toString();
            String YandM = Date.substring(0,7);
            if(ad==tot){
                des="O/N "+orderNo+" full pay";
                
            }
            else{
                des="O/N "+orderNo+" Balance";
            }
            
            
            pst=con.prepareStatement("insert into income(description,date,Year_and_month,income) values(?,?,?,?) ");
            pst.setString(1, des);
            pst.setString(2, Date);
            pst.setString(3,YandM);
            pst.setInt(4, bal);
            pst.executeUpdate();
            
            OderNotxt.setText("");
                nametxt.setText("");
                addresstxt.setText("");
                agetxt.setText("");
                frametxt.setText("");
                Home.setText("");
                Mobile.setText("");
                Rsp.setText("");
                Rcy.setText("");
                Radd.setText("");
                Rax.setText("");
                Lsp.setText("");
                Lcy.setText("");
                lenstxt.setText("");
                Lax.setText("");
                Ladd.setText("");
                Destxt.setText("");
                Totaltxt.setText("");
                Addvancetxt.setText("");
                OderNotxt.requestFocus();
                dateP.setText("");
                dateD.setText("");
                Bal.setText("");
                Status.setText("");
                load();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
            Logger.getLogger(main1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void icon4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon4MouseClicked
        this.setVisible(false);
        new main4().setVisible(true); // TODO add your handling code here:
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
    private javax.swing.JTextField Addvancetxt;
    private javax.swing.JTextField Bal;
    private javax.swing.JTextField Destxt;
    private javax.swing.JTextField Home;
    private javax.swing.JTextField Ladd;
    private javax.swing.JTextField Lax;
    private javax.swing.JTextField Lcy;
    private javax.swing.JTextField Lsp;
    private javax.swing.JTextField Mobile;
    private javax.swing.JTextField OderNotxt;
    private javax.swing.JTextField Radd;
    private javax.swing.JTextField Rax;
    private javax.swing.JTextField Rcy;
    private javax.swing.JTextField Rsp;
    private javax.swing.JLabel Status;
    private javax.swing.JTextField Totaltxt;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField agetxt;
    private javax.swing.JPanel bill;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel close2;
    private javax.swing.JTextField dateD;
    private javax.swing.JTextField dateP;
    private javax.swing.JTextField frametxt;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lenstxt;
    private javax.swing.JTextField nametxt;
    // End of variables declaration//GEN-END:variables
}
