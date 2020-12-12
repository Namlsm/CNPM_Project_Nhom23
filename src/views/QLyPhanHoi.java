/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controllers.PhanHoiController;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;


       

/**
 *
 * @author Vostro 3580
 */
public class QLyPhanHoi extends javax.swing.JPanel {

    JFrame parentFrame;
    /**
     * Creates new form QLyPhanHoi
     */
    public QLyPhanHoi(JFrame parentFrame) {
        this.parentFrame = parentFrame;
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSearch = new javax.swing.JTable();
        btnXuatPH = new javax.swing.JButton();
        btnGhiNhan = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        combox = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        tableSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phản ánh", "Người phản ánh", "Nội dung", "Ngày phản ánh", "Phân loại", "Trạng thái"
            }
        ));
        jScrollPane1.setViewportView(tableSearch);

        btnXuatPH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnXuatPH.setForeground(new java.awt.Color(102, 0, 102));
        btnXuatPH.setText("Xem phản hồi");
        btnXuatPH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXuatPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatPHActionPerformed(evt);
            }
        });

        btnGhiNhan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGhiNhan.setForeground(new java.awt.Color(102, 0, 102));
        btnGhiNhan.setText("Thêm phản hồi");
        btnGhiNhan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGhiNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiNhanActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(102, 0, 102));
        btnSearch.setText("Tìm kiếm");
        btnSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        combox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        combox.setForeground(new java.awt.Color(153, 0, 153));
        combox.setModel(new DefaultComboBoxModel(new PhanHoiController().comboxLinhVuc()));
        combox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Chọn lĩnh vực");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Người phản ánh");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combox, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addGap(69, 69, 69)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXuatPH, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGhiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(combox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnXuatPH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnGhiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXuatPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatPHActionPerformed
        // TODO add your handling code here:

        ResultSet rs=null;
        try{
            int selected=tableSearch.getSelectedRow();
            if(selected==-1){
                JOptionPane.showMessageDialog(this, "Chưa có hàng nào được chọn !");

            }else{
                String data=tblModel.getValueAt(selected, 0).toString();
                rs= new PhanHoiController().XuatPH(data);
                if(rs.isBeforeFirst()==false){
                    JOptionPane.showMessageDialog(this, "Phản ánh này chưa được ghi nhận phản hồi, hãy ghi nhận trước !");

                }else{
                    String maPH=null, ngayPH=null, ngLQ=null, nd=null, cQ=null;
                    while(rs.next()){
                        maPH=String.valueOf(rs.getInt("MA_PHAN_HOI"));
                        ngayPH=String.valueOf(rs.getDate("NGAY_PHAN_HOI"));
                        ngLQ=String.valueOf(rs.getString("NGUOI_LIEN_QUAN"));
                        nd=String.valueOf(rs.getString("NOI_DUNG"));
                        cQ=String.valueOf(rs.getString("CO_QUAN"));
                    }

                    this.removeAll();
                    this.setLayout(new BorderLayout());
                    this.add(new XemPhanHoi(parentFrame, nd, Integer.valueOf(maPH)));
                    this.validate();
                    this.repaint();
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnXuatPHActionPerformed

    private void btnGhiNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiNhanActionPerformed
        // TODO add your handling code here:
        int selected= tableSearch.getSelectedRow();
        if(selected==-1){
            JOptionPane.showMessageDialog(this, "Không có hàng nào được chọn !");
            return;
        }else{
            String maPA=tblModel.getValueAt(selected, 0).toString();
            try{
                ResultSet rs=new PhanHoiController().GhiNhanPhanHoi(maPA);
                if(rs.isBeforeFirst()){
                    JOptionPane.showMessageDialog(this, "Phản hồi này đã được ghi nhận, bấm xem phản hồi !");
                    return;
                }else{
                    this.removeAll();
                    this.setLayout(new BorderLayout());
                    this.add(new ThemPhanHoiPanel(parentFrame, maPA));
                    this.validate();
                    this.repaint();
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnGhiNhanActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        ResultSet rs=null;
        try{
            if(selected==null){
                JOptionPane.showMessageDialog(this, "Bạn chưa chọn tìm kiếm theo tiêu chí !");
                return;
            }
            rs= new PhanHoiController().Search(txtSearch.getText(), selected);
            if(rs.isBeforeFirst()==false){
                JOptionPane.showMessageDialog(this, "Không tìm thấy nội dung bạn cần tìm !");
                return;
            }
            Vector data=null;
            tblModel.setRowCount(0);
            while(rs.next()){
                data=new Vector();
                data.add(rs.getInt("MA_PHAN_ANH"));
                data.add(rs.getString("NGUOI_PHAN_ANH"));
                data.add(rs.getString("NOI_DUNG"));
                data.add(rs.getDate("NGAY_PHAN_ANH"));
                data.add(rs.getString("PHAN_LOAI"));
                data.add(rs.getString("TRANG_THAI"));
                tblModel.addRow(data);
            }
            tableSearch.setModel(tblModel);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed
    private String selected=null;
    private void comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxActionPerformed
        // TODO add your handling code here:
        selected= combox.getSelectedItem().toString();
    }//GEN-LAST:event_comboxActionPerformed

    private String header[]={"Mã phản ánh", "Người phản ánh", "Nội dung", "Ngày phản ánh", "Phân loại", "Trạng thái"};
    private DefaultTableModel tblModel=new DefaultTableModel(header,0);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGhiNhan;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnXuatPH;
    private javax.swing.JComboBox<String> combox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSearch;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
