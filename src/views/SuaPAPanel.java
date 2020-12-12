/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.DatePlus;
import controllers.SuaPAController;
import java.awt.BorderLayout;
import java.sql.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import models.PhanAnh;

/**
 *
 * @author THINKBOOK
 */
public class SuaPAPanel extends javax.swing.JPanel {
    
    JFrame parentFrame;
    PhanAnh previousPA;
    
    /**
     * Creates new form ThemPAPanel
     */
    public SuaPAPanel(JFrame parentFrame,PhanAnh previousPA) {
        this.parentFrame = parentFrame;
        this.previousPA = previousPA;
        initComponents();
        setPhanAnh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        nameTextFiled = new javax.swing.JTextField();
        lbDay = new javax.swing.JLabel();
        lbMonth = new javax.swing.JLabel();
        lbYear = new javax.swing.JLabel();
        dateComboBox = new javax.swing.JComboBox<>();
        monthComboBox = new javax.swing.JComboBox<>();
        yearComboBox = new javax.swing.JComboBox<>();
        lbType = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        lbState = new javax.swing.JLabel();
        stateComboBox = new javax.swing.JComboBox<>();
        lbContent = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentTextFiled = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1126, 838));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sửa phản ánh"));

        lbName.setText("Người Phản Ánh:");

        nameTextFiled.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lbDay.setText("Ngày:");

        lbMonth.setText("Tháng:");

        lbYear.setText("Năm:");

        dateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2031", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));

        lbType.setText("Lĩnh Vực:");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Môi trường", "An toàn thực phẩm", "Thủ tục hành chính", "An ninh trật tự", "Lĩnh vực khác" }));

        lbState.setText("Trạng Thái:");

        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang giải quyết", "Đã giải quyết" }));

        lbContent.setText("Nội Dung:");

        contentTextFiled.setColumns(20);
        contentTextFiled.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        contentTextFiled.setRows(1000);
        jScrollPane1.setViewportView(contentTextFiled);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1031, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContent, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbType, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(lbState, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(dateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(nameTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addComponent(lbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(112, 112, 112)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbMonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monthComboBox)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateComboBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(lbType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stateComboBox))
                .addGap(18, 18, 18)
                .addComponent(lbContent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        String name = nameTextFiled.getText();
        String content = contentTextFiled.getText();
        
        if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tên người phản ánh");
        } else if (content.equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập nội dung phản ánh");
        } else {
            String day = dateComboBox.getSelectedItem().toString();
            String month = monthComboBox.getSelectedItem().toString();
            String year = yearComboBox.getSelectedItem().toString();
            
            Date date = Date.valueOf(year + "-" + month + "-" + day);
            
            String type = typeComboBox.getSelectedItem().toString();
            String state = stateComboBox.getSelectedItem().toString();
            PhanAnh pa = new PhanAnh(previousPA.getId(), name, content, date, type, state);
            SuaPAController.updatePhanAnh(pa);
            JOptionPane.showMessageDialog(this, "Lưu thành công!");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.add(new PhanAnhPanel(parentFrame));
        this.validate();
        this.repaint();
    }//GEN-LAST:event_backButtonActionPerformed
    
    private void setPhanAnh(){
        nameTextFiled.setText(previousPA.getName());
        contentTextFiled.setText(previousPA.getContent());
        DatePlus dp = new DatePlus(previousPA.getDate());
        
        int year = dp.getYear();
        int month = dp.getMonth();
        int day = dp.getDay();
        
        for(int i=0;i<dateComboBox.getItemCount();i++){
            if(day == Integer.parseInt(dateComboBox.getItemAt(i))){
                dateComboBox.setSelectedIndex(i);
                break;
            }
        }
        for(int i=0;i<monthComboBox.getItemCount();i++){
            if(month==Integer.parseInt(monthComboBox.getItemAt(i))){
                monthComboBox.setSelectedIndex(i);
                break;
            }
        }
        for(int i=0;i<yearComboBox.getItemCount();i++){
            if(year==Integer.parseInt(yearComboBox.getItemAt(i))){
                yearComboBox.setSelectedIndex(i);
                break;
            }
        }
        String type = previousPA.getType();
        for(int i=0;i<typeComboBox.getItemCount();i++){
            if(type.compareTo(typeComboBox.getItemAt(i))==0){
                typeComboBox.setSelectedIndex(i);
                break;
            }
        }
        String state = previousPA.getState();
        for(int i=0;i<stateComboBox.getItemCount();i++){
            if(state.compareTo(stateComboBox.getItemAt(i))==0){
                stateComboBox.setSelectedIndex(i);
                break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextArea contentTextFiled;
    private javax.swing.JComboBox<String> dateComboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbContent;
    private javax.swing.JLabel lbDay;
    private javax.swing.JLabel lbMonth;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbState;
    private javax.swing.JLabel lbType;
    private javax.swing.JLabel lbYear;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JTextField nameTextFiled;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox<String> stateComboBox;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}