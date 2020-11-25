/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controller.SQLconnection;
import java.sql.Date;
import Model.PhanHoi;
import Model.PhanHoiModify;
/**
 *
 * @author Vostro 3580
 */
public class QLPhanHoi extends javax.swing.JFrame {

    /**
     * Creates new form QLPhanHoi
     */
    public QLPhanHoi() {
        initComponents();
        this.setTitle("Quản lý phản hồi");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablePA = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaPH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNgLQ = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaND = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        comboxCQ = new javax.swing.JComboBox<>();
        comboxDay = new javax.swing.JComboBox<>();
        comboxMonth = new javax.swing.JComboBox<>();
        comboxYear = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnSelect = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablePH = new javax.swing.JTable();
        btnHienThi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablePA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablePA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ma PA", "Nguoi PA", "Ngay PA"
            }
        ));
        jScrollPane1.setViewportView(tablePA);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Search");

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mã phàn hồi ");

        txtMaPH.setEditable(false);
        txtMaPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPHActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Ngày phản hồi");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Người liên quan");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nội dung");

        txtAreaND.setColumns(20);
        txtAreaND.setRows(5);
        jScrollPane2.setViewportView(txtAreaND);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Cơ quan");

        comboxCQ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboxCQ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UBND QUẬN HAI BÀ TRƯNG", "TAND QUẬN HAI BÀ TRƯNG", "CÔNG AN QUẬN HAI BÀ TRƯNG", "PHÒNG THANH TRA QUẬN HAI BÀ TRƯNG", "BHXH QUẬN HAI BÀ TRƯNG", "VĂN PHÒNG ĐĂNG KÝ ĐẮT ĐAI QUẬN HAI BÀ TRƯNG", "PHÒNG LAO ĐỘNG THƯƠNG BINH XÃ HỘI" }));
        comboxCQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxCQActionPerformed(evt);
            }
        });

        comboxDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        comboxDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxDayActionPerformed(evt);
            }
        });

        comboxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        comboxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxMonthActionPerformed(evt);
            }
        });

        comboxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021" }));
        comboxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNgLQ, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                        .addComponent(comboxCQ, 0, 0, Short.MAX_VALUE)
                        .addComponent(txtMaPH, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(comboxDay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaPH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtNgLQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(comboxCQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSelect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        tablePH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablePH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã phản hồi", "Ngày phản hồi", "Người liên quan", "Nội dung", "Cơ quan"
            }
        ));
        jScrollPane3.setViewportView(tablePH);

        btnHienThi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHienThi.setText("Hiện thị phản hồi");
        btnHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienThiActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("QUẢN LÝ PHẢN HỒI");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(419, 419, 419)
                .addComponent(btnSelect)
                .addGap(43, 43, 43)
                .addComponent(btnHienThi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSelect)
                    .addComponent(btnHienThi))
                .addGap(227, 227, 227))
        );

        setSize(new java.awt.Dimension(1195, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed
    
    private String cqString;
    
    private void comboxCQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxCQActionPerformed
        // TODO add your handling code here:
        cqString=comboxCQ.getSelectedItem().toString();
    }//GEN-LAST:event_comboxCQActionPerformed

    private String header[]={"Mã phản ánh", "Người phản ánh", "Ngày phản ánh"};
    private DefaultTableModel tblModel=new DefaultTableModel(header,0);
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
      Statement st=null;
      ResultSet rs=null;
      Connection conn= new SQLconnection().Connect();
      try{
          
          String sql= "select MA_PHAN_ANH, NGUOI_PHAN_ANH, NGAY_PHAN_ANH from PHAN_ANH";
          
          if(txtSearch.getText().length()>0){
              sql=sql+" where MA_PHAN_ANH like '"+txtSearch.getText()+"%'";
          }
          st=conn.createStatement();
          rs=st.executeQuery(sql);
          Vector data=null;
          tblModel.setRowCount(0);
          if(rs.isBeforeFirst()!=true){
              JOptionPane.showMessageDialog(this, "Không tìm thấy !");
              return;
          }
          while(rs.next()){
              data=new Vector();
              data.add(rs.getInt("MA_PHAN_ANH"));
              data.add(rs.getString("NGUOI_PHAN_ANH"));
              data.add(rs.getDate("NGAY_PHAN_ANH"));
              tblModel.addRow(data);
          }
          tablePA.setModel(tblModel);
          
      }catch(Exception ex){
          ex.printStackTrace();
      }finally{
          try{
              if(conn != null){
                  conn.close();
              }
              if(st!=null){
                  st.close();
              }
              if(rs!=null){
                  rs.close();
              }
          }catch(Exception ex){
              ex.printStackTrace();
          }            
      }
    }//GEN-LAST:event_btnSearchActionPerformed
    private String header1[]={"Mã phản hồi", "Ngày phản hồi", "Người liên quan", "Nội dung", "Cơ quan"};
    private DefaultTableModel tblModel1=new DefaultTableModel(header1, 0);
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        PhanHoi ph= new PhanHoi()   ;
        try{
            
            if(txtMaPH.getText().length()==0 || txtNgLQ.getText().length()==0 || txtAreaND.getText().length()==0 ){
                JOptionPane.showMessageDialog(this, "Bạn còn nhập thiếu thông tin ! Kiểm tra và nhập lại !");
                return;
            }else{
            ph.setMaPhanHoi( Integer.parseInt(txtMaPH.getText()));
            ph.setNgayPhanHoi(yearString+"-"+monthString+"-"+dayString);
            ph.setNguoiLienQuan(txtNgLQ.getText());
            ph.setNoiDung(txtAreaND.getText());
            ph.setCoQuan(cqString);
            int ret=JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm độc giả mới?", "Yes", JOptionPane.YES_NO_OPTION);
            if(ret!=JOptionPane.YES_OPTION){
                return;
            }    
            
            ret=PhanHoiModify.themPhanHoi(ph);
            if(ret!=-1){
                JOptionPane.showMessageDialog(this, "Bạn đã thêm một phản hồi mới thành công !");
             }
            
          }
        }catch(Exception ex){
            ex.printStackTrace();
        }         
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtMaPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPHActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        // TODO add your handling code here:
        Statement st=null;
        Connection conn= new SQLconnection().Connect();
        try{
        st=conn.createStatement();
        int selected=tablePA.getSelectedRow();
        if(selected<0){
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn phản ánh !");
            return;
        }else{
        txtMaPH.setText(tblModel.getValueAt(selected, 0).toString());
        if(st.executeQuery("select MA_PHAN_HOI from PhanHoi where MA_PHAN_HOI="+txtMaPH.getText()).isBeforeFirst()==true){
                JOptionPane.showMessageDialog(this, "Phản hồi này đã được thêm trước đó !");
                return;
            }
        }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                if(conn!=null){
                conn.close();
            }
            if(st!=null){
                st.close();
            }
            }catch(Exception ex){
                ex.printStackTrace();
            
        }
              
    }//GEN-LAST:event_btnSelectActionPerformed
    }
    private String dayString;
    private String monthString;
    private String yearString;
    private void comboxDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxDayActionPerformed
        // TODO add your handling code here:
        dayString=comboxDay.getSelectedItem().toString();
    }//GEN-LAST:event_comboxDayActionPerformed

    private void comboxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxMonthActionPerformed
        // TODO add your handling code here:
        monthString=comboxMonth.getSelectedItem().toString();
    }//GEN-LAST:event_comboxMonthActionPerformed

    private void comboxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxYearActionPerformed
        // TODO add your handling code here:
        yearString=comboxYear.getSelectedItem().toString();
    }//GEN-LAST:event_comboxYearActionPerformed

    private void btnHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienThiActionPerformed
        // TODO add your handling code here:
        Connection conn= new SQLconnection().Connect();
        Statement st=null;
        ResultSet rs=null;
        try{
            String sql2="select * from PhanHoi";
            st=conn.createStatement();
            rs=st.executeQuery(sql2);
            tblModel1.setRowCount(0);
            Vector data=null;
            while(rs.next()){
                data= new Vector();
                data.add(rs.getInt("MA_PHAN_HOI"));
                data.add(rs.getDate("NGAY_PHAN_HOI"));
                data.add(rs.getString("NGUOI_LIEN_QUAN"));
                data.add(rs.getString("NOI_DUNG"));
                data.add(rs.getString("CO_QUAN"));
                tblModel1.addRow(data);
            }
            tablePH.setModel(tblModel1);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                if(conn!=null){
                    conn.close();
                }
                if(rs!=null){
                    rs.close();
                }
                if(st!=null){
                    st.close();
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnHienThiActionPerformed

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
            java.util.logging.Logger.getLogger(QLPhanHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLPhanHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLPhanHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLPhanHoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLPhanHoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox<String> comboxCQ;
    private javax.swing.JComboBox<String> comboxDay;
    private javax.swing.JComboBox<String> comboxMonth;
    private javax.swing.JComboBox<String> comboxYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablePA;
    private javax.swing.JTable tablePH;
    private javax.swing.JTextArea txtAreaND;
    private javax.swing.JTextField txtMaPH;
    private javax.swing.JTextField txtNgLQ;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
