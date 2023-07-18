/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.customerView;

import controller.CustomerService;
import controller.RegisterService;
import controller.RoomService;
import java.awt.Color;
import java.util.ArrayList;
import model.Customer;
import model.RegistrationForm;
import model.Room;
import util.Validate;

/**
 *
 * @author Admin
 */
public class AddCustomerView extends javax.swing.JPanel {

    private static RoomService rs = new RoomService();
    private static CustomerService cs = new CustomerService();
    private Customer cusSelect;
    private RegistrationForm re;
    private RegisterService reg = new RegisterService();

    /**
     * Creates new form AddCustomerView
     */
    public AddCustomerView(String fix) {
        initComponents();
        header.setText("Sửa Thông Tin Phòng");
        addBtn.setText("Sửa Thông Tin");
        setData();
    }

    public AddCustomerView() {
        initComponents();
        addRoomFiel();
    }

    private void addRoomFiel() {
        ArrayList<Room> list = rs.getAvailableRooms();
        for (Room r : list) {
            customerRoom.addItem(r.getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        genderMale = new javax.swing.JRadioButton();
        genderFemale = new javax.swing.JRadioButton();
        customerName = new javax.swing.JTextField();
        customerYear = new javax.swing.JTextField();
        customerAddress = new javax.swing.JTextField();
        customerNation = new javax.swing.JTextField();
        customerCard = new javax.swing.JTextField();
        customerPhone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        customerRoom = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        totalTime = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        error1 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        errorGender = new javax.swing.JLabel();
        error3 = new javax.swing.JLabel();
        error4 = new javax.swing.JLabel();
        error5 = new javax.swing.JLabel();
        error6 = new javax.swing.JLabel();
        error7 = new javax.swing.JLabel();
        error8 = new javax.swing.JLabel();
        header = new javax.swing.JLabel();

        jLabel1.setText("Tên Khách Hàng");

        jLabel2.setText("Năm Sinh");

        jLabel3.setText("Giới Tính");

        jLabel4.setText("Quốc Tịch");

        jLabel5.setText("Số CMND");

        jLabel6.setText("Địa Chỉ");

        jLabel7.setText("Số Điện Thoại");

        buttonGroup1.add(genderMale);
        genderMale.setText("Nam");

        buttonGroup1.add(genderFemale);
        genderFemale.setText("Nữ");
        genderFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderFemaleActionPerformed(evt);
            }
        });

        customerPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerPhoneActionPerformed(evt);
            }
        });

        jLabel8.setText("Mã Phòng");

        addBtn.setText("Thêm Khách Hàng");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        message.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        message.setForeground(new java.awt.Color(13, 110, 253));

        jLabel10.setText("Thời Gian Thuê");

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giờ", "Ngày", "Tháng", "Năm" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(error1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(genderMale)
                        .addGap(18, 18, 18)
                        .addComponent(genderFemale)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(customerName, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(customerYear)
                    .addComponent(customerAddress)
                    .addComponent(customerNation)
                    .addComponent(customerCard)
                    .addComponent(error2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(error3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(error4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(error5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(totalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(error6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(error7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customerRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(error8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(customerName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customerYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(genderMale)
                                    .addComponent(genderFemale)
                                    .addComponent(jLabel7)
                                    .addComponent(customerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorGender, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(error6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(customerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(totalTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(error3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(error7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customerNation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customerRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(error4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(error8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(customerCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(addBtn)
                .addGap(49, 49, 49)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );

        header.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Thêm Khách Hàng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(430, 430, 430))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(130, 130, 130))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addCus() {
        if (validateCus()) {
            boolean check;
            String ten_khach_hang = customerName.getText();
            int nam_sinh = Integer.parseInt(customerYear.getText());
            String gender = "";
            if (genderMale.isSelected()) {
                gender += "Nam";
            } else {
                gender += "Nữ";
            }
            String dia_chi = customerAddress.getText();
            String quoc_tich = customerNation.getText();
            int so_cmnd = Integer.parseInt(customerCard.getText());
            String so_dien_thoai = customerPhone.getText();
            String ma_phong = (String) customerRoom.getSelectedItem();
            int totalTimeCus = Integer.parseInt(totalTime.getText());
            String typeRent = (String) type.getSelectedItem();
            check = cs.createCustomer(ten_khach_hang, nam_sinh, gender, dia_chi, quoc_tich, so_cmnd, so_dien_thoai, ma_phong, totalTimeCus, typeRent);
            if (check) {
                message.setForeground(new Color(13, 110, 253));
                message.setText("Thêm Khách Hàng Thành Công");
                customerRoom.removeItem((String)ma_phong);
                reset();

            } else {
                message.setForeground(new Color(255, 0, 0));
                message.setText("Thêm Khách Hàng Thất Bại");
            }
        }
    }

    private void fixCus() {
        if (validateCus()) {
            boolean check;
            boolean check2;
            String ten_khach_hang = customerName.getText();
            int nam_sinh = Integer.parseInt(customerYear.getText());
            String gender = "";
            if (genderMale.isSelected()) {
                gender += "Nam";
            } else {
                gender += "Nữ";
            }
            String dia_chi = customerAddress.getText();
            String quoc_tich = customerNation.getText();
            int so_cmnd = Integer.parseInt(customerCard.getText());
            String so_dien_thoai = customerPhone.getText();
            String ma_phong = (String) customerRoom.getSelectedItem();
            int totalTimeCus = Integer.parseInt(totalTime.getText());
            String typeRent = (String) type.getSelectedItem();
            if (ma_phong == cusSelect.getMaPhong().getName()) {
                Customer c = new Customer(cusSelect.getMaKhachHang(), ten_khach_hang, nam_sinh, gender, dia_chi, quoc_tich, so_cmnd, so_dien_thoai, cusSelect.getMaPhong(), typeRent);
                check2 = reg.Update(re.getMaSoDangKi(), totalTimeCus);
                check = cs.update(c);
            } else {
                Room r = rs.findByName(ma_phong);
                Customer c = new Customer(cusSelect.getMaKhachHang(), ten_khach_hang, nam_sinh, gender, dia_chi, quoc_tich, so_cmnd, so_dien_thoai, r, typeRent);
                check = cs.update(c);
                check2 = reg.Update(re.getMaSoDangKi(), totalTimeCus);
                rs.chaneRoom(cusSelect.getMaPhong().getId_room(), r.getId_room());

            }
            if (check && check2) {
                message.setForeground(new Color(13, 110, 253));
                message.setText("Sửa Khách Hàng Thành Công");
            } else {
                message.setForeground(new Color(255, 0, 0));
                message.setText("Sửa Khách Hàng Thất Bại");
            }
        }
    }

    public void reset() {
        customerName.setText("");
        customerYear.setText("");
        genderMale.setSelected(false);
        genderFemale.setSelected(false);
        customerAddress.setText("");
        customerNation.setText("");
        customerCard.setText("");
        customerPhone.setText("");
        totalTime.setText("");
        customerRoom.setSelectedIndex(0);

    }
    private void genderFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderFemaleActionPerformed

    private void customerPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerPhoneActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if (addBtn.getText() == "Thêm Khách Hàng") {
            addCus();
        } else {
            fixCus();
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed
    private void callMessErrorNumber(ArrayList<Integer> idError) {
        for (Integer i : idError) {

            switch (i) {
                case 1:
                    error2.setForeground(new Color(255, 0, 0));
                    error2.setText("Vui lòng Chỉ Nhập Số");
                    break;
                case 2:
                    error5.setForeground(new Color(255, 0, 0));
                    error5.setText("Vui lòng Chỉ Nhập Số");
                    break;
                case 3:
                    error6.setForeground(new Color(255, 0, 0));
                    error6.setText("Vui lòng Chỉ Nhập Số");
                    break;
                case 4:
                    error7.setForeground(new Color(255, 0, 0));
                    error7.setText("Vui lòng Chỉ Nhập Số");
                    break;
                case 101:
                    error2.setForeground(new Color(255, 0, 0));
                    error2.setText("Vui lòng Nhập Giá Trị Dương");
                    break;
                case 102:
                    error5.setForeground(new Color(255, 0, 0));
                    error5.setText("Số chứng minh không hợp lệ");
                    break;
                case 103:
                    error6.setForeground(new Color(255, 0, 0));
                    error6.setText("Số điện thoại không hợp lệ");
                    break;
                case 104:
                    error7.setForeground(new Color(255, 0, 0));
                    error7.setText("Vui lòng nhập số nguyên dương");
                    break;
                default:
                    break;
            }
        }

    }

    private void callMessErrorEmpty(ArrayList<Integer> idError) {
        for (Integer i : idError) {

            switch (i) {
                case 1:
                    error1.setForeground(new Color(255, 0, 0));
                    error1.setText("Vui lòng Nhập Trường Này");
                    break;
                case 2:
                    error2.setForeground(new Color(255, 0, 0));
                    error2.setText("Vui lòng Nhập Trường Này");
                    break;
                case 3:
                    error3.setForeground(new Color(255, 0, 0));
                    error3.setText("Vui lòng Nhập Trường Này");
                    break;
                case 4:
                    error4.setForeground(new Color(255, 0, 0));
                    error4.setText("Vui lòng Nhập Trường Này");
                    break;
                case 5:
                    error5.setForeground(new Color(255, 0, 0));
                    error5.setText("Vui lòng Nhập Trường Này");
                    break;
                case 6:
                    error6.setForeground(new Color(255, 0, 0));
                    error6.setText("Vui lòng Nhập Trường Này");
                    break;
                case 7:
                    error7.setForeground(new Color(255, 0, 0));
                    error7.setText("Vui lòng Nhập Trường Này");
                    break;
                case 8:
                    error8.setForeground(new Color(255, 0, 0));
                    error8.setText("Vui lòng Nhập Trường Này");
                    break;
                default:
                    break;
            }
        }

    }

    private void setData() {
        Customer customer = DefaultCustomerView.getCustomerSelected();
        re = reg.findByIDCus(customer.getMaKhachHang());
        cusSelect = cs.findById(customer);
        System.out.println(cusSelect.getGioiTinh());
        customerName.setText(cusSelect.getTenKhachHang());
        customerAddress.setText(cusSelect.getDiaChi());
        customerCard.setText(String.valueOf(cusSelect.getSoCMND()));
        customerNation.setText(cusSelect.getQuocTich());
        customerPhone.setText(cusSelect.getSdt());
        customerYear.setText(String.valueOf(cusSelect.getNamSinh()));
        totalTime.setText(String.valueOf(re.getThoiGianThue()));
        type.setSelectedItem((String) cusSelect.getKieuthue());
        if (cusSelect.getGioiTinh().equals("Nam")) {
            genderMale.setSelected(true);
        } else {
            genderFemale.setSelected(true);
        }
        addRoomFielFix();
    }

    private void addRoomFielFix() {
        ArrayList<Room> list = rs.getAvailableRooms();
        Room currentRoom = rs.findById(cusSelect.getMaPhong());
        customerRoom.addItem(currentRoom.getName());
        for (Room r : list) {
            customerRoom.addItem(r.getName());
        }
    }

    private boolean validateCus() {
        config();
        //validate
        ArrayList<Integer> test1 = Validate.checkMutiLine("empty", customerName.getText(), customerYear.getText(), customerAddress.getText(), customerNation.getText(), customerCard.getText(), customerPhone.getText(), totalTime.getText(), (String) customerRoom.getSelectedItem());
        ArrayList<Integer> test2 = Validate.checkMutiLine("isNumber", customerYear.getText(), customerCard.getText(), customerPhone.getText(), totalTime.getText());
        if (!test1.isEmpty() || (!genderFemale.isSelected() && !genderMale.isSelected())) {
            if (!genderFemale.isSelected() && !genderMale.isSelected()) {
                errorGender.setForeground(new Color(255, 0, 0));
                errorGender.setText("Vui Lòng Tích vào trường này");
            }

            callMessErrorEmpty(test1);
            return false;
        } else if (!test2.isEmpty()) {
            callMessErrorNumber(test2);
            return false;
        } else {
            return true;
        }
    }

    private void config() {
        error1.setText("");
        error2.setText("");
        error3.setText("");
        error4.setText("");
        error5.setText("");
        error6.setText("");
        error7.setText("");
        error8.setText("");
        errorGender.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField customerAddress;
    private javax.swing.JTextField customerCard;
    private javax.swing.JTextField customerName;
    private javax.swing.JTextField customerNation;
    private javax.swing.JTextField customerPhone;
    private javax.swing.JComboBox<String> customerRoom;
    private javax.swing.JTextField customerYear;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel error3;
    private javax.swing.JLabel error4;
    private javax.swing.JLabel error5;
    private javax.swing.JLabel error6;
    private javax.swing.JLabel error7;
    private javax.swing.JLabel error8;
    private javax.swing.JLabel errorGender;
    private javax.swing.JRadioButton genderFemale;
    private javax.swing.JRadioButton genderMale;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel message;
    private javax.swing.JTextField totalTime;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
