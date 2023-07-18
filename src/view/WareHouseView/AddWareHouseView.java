package view.WareHouseView;

import controller.WareHouseService;
import util.Validate;

import java.awt.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

public class AddWareHouseView extends javax.swing.JPanel {

    private WareHouseService ws = new WareHouseService();

    public AddWareHouseView() {
        ws = new WareHouseService();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddWview = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        itemName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PriceIn = new javax.swing.JTextField();
        PriceOut = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        Message = new javax.swing.JLabel();
        jDateNgayNhap = new com.toedter.calendar.JDateChooser();
        jDateHSD = new com.toedter.calendar.JDateChooser();
        errorName = new javax.swing.JLabel();
        errorQuantity = new javax.swing.JLabel();
        errorPriceIn = new javax.swing.JLabel();
        errorPriceOut = new javax.swing.JLabel();
        quantityItem = new javax.swing.JTextField();
        errorPriceIn2 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();

        jLabel1.setText("Tên Sản Phẩm");

        itemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Số Lượng");

        jLabel3.setText("Giá Nhập");

        jLabel4.setText("Giá Bán");

        jLabel5.setText("Ngày Nhập");

        jLabel6.setText("Hạn Sử Dụng");

        AddBtn.setText("Thêm Sản Phẩm");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        Message.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        javax.swing.GroupLayout AddWviewLayout = new javax.swing.GroupLayout(AddWview);
        AddWview.setLayout(AddWviewLayout);
        AddWviewLayout.setHorizontalGroup(
            AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddWviewLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addGap(40, 40, 40)
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGap(0, 34, Short.MAX_VALUE)
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AddWviewLayout.createSequentialGroup()
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138))
                            .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(154, 154, 154))
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceOut, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddWviewLayout.createSequentialGroup()
                                .addComponent(errorPriceIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorPriceOut, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorPriceIn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddWviewLayout.createSequentialGroup()
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddWviewLayout.createSequentialGroup()
                                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddWviewLayout.createSequentialGroup()
                                        .addComponent(PriceIn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(errorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(errorQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(129, 129, 129))
                            .addGroup(AddWviewLayout.createSequentialGroup()
                                .addComponent(quantityItem)
                                .addGap(85, 85, 85)))
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(69, 69, 69)
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateNgayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jDateHSD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))))
        );
        AddWviewLayout.setVerticalGroup(
            AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddWviewLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddWviewLayout.createSequentialGroup()
                                .addComponent(quantityItem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddWviewLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddWviewLayout.createSequentialGroup()
                                        .addComponent(jDateNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDateHSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(AddWviewLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41))))))
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)))
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PriceIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorPriceIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorPriceOut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorPriceIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Title.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Title.setText("Thêm Sản Phẩm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(AddWview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(417, 417, 417))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddWview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        boolean check;
        config();
        //validate:
        ArrayList<Integer> test1 = Validate.checkMutiLine("empty", itemName.getText(), quantityItem.getText(), PriceIn.getText(), PriceOut.getText());
        ArrayList<Integer> test2 = Validate.checkMutiLine("isNumber", PriceIn.getText(), PriceOut.getText());

        if (!test1.isEmpty()) {
            callMessErrorEmpty(test1);
        } else if (!test2.isEmpty()) {
            callMessErrorNumber(test2);
        }
        String ten_san_pham = itemName.getText();
        Date ngay_nhap = getSelectedDate(jDateNgayNhap);

        java.util.Date utilDate = getSelectedDate(jDateNgayNhap);
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        int so_luong = Integer.parseInt(quantityItem.getText());
        Double gia_nhap = Double.parseDouble(PriceIn.getText());
        Double gia_ban = Double.parseDouble(PriceOut.getText());
        Date han_su_dung = getSelectedDate(jDateHSD);

        java.util.Date utilDate2 = getSelectedDate(jDateHSD);
        java.sql.Date sqlDate2 = new java.sql.Date(utilDate2.getTime());
        ;

        check = ws.createWareHouse(ten_san_pham, sqlDate, so_luong, gia_nhap, gia_ban, sqlDate2);
        if (check) {
            Message.setForeground(new Color(13, 110, 253));
            Message.setText("Thêm Mặt Hàng Thành Công");
            resetForm();
        } else {
            Message.setForeground(new Color(255, 0, 0));
            Message.setText("Thêm Mặt Hàng Thất Bại");
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void itemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemNameActionPerformed

    private void callMessErrorNumber(ArrayList<Integer> idError) {
        for (Integer i : idError) {
            switch (i) {
                case 1:
                    errorQuantity.setForeground(new Color(255, 0, 0));
                    errorQuantity.setText("Vui lòng Chỉ Nhập Số");
                    break;
                case 2:
                    errorPriceIn.setForeground(new Color(255, 0, 0));
                    errorPriceIn.setText("Vui lòng Chỉ Nhập Số");
                    break;
                case 3:
                    errorPriceOut.setForeground(new Color(255, 0, 0));
                    errorPriceOut.setText("Vui lòng Chỉ Nhập Số");
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
                    errorName.setForeground(new Color(255, 0, 0));
                    errorName.setText("Vui lòng Nhập Trường Này");
                    break;
                case 2:
                    errorQuantity.setForeground(new Color(255, 0, 0));
                    errorQuantity.setText("Vui lòng Nhập Trường Này");
                    break;
                case 3:
                    errorPriceIn.setForeground(new Color(255, 0, 0));
                    errorPriceIn.setText("Vui lòng Nhập Trường Này");
                    break;
                case 4:
                    errorPriceOut.setForeground(new Color(255, 0, 0));
                    errorPriceOut.setText("Vui lòng Nhập Trường Này");
                    break;

                default:
                    break;
            }
        }
    }

    private void resetForm() {
        itemName.setText("");
        quantityItem.setText("");
        PriceIn.setText("");
        PriceOut.setText("");
        LocalDate today = LocalDate.now();
        Date date = Date.from(today.atStartOfDay(ZoneId.systemDefault()).toInstant());
        jDateNgayNhap.setDate(date);
        jDateHSD.setDate(date);
//        Message.setText("");

    }

    private void config() {
        errorName.setText("");
        errorQuantity.setText("");
        errorPriceIn.setText("");
        errorPriceOut.setText("");

    }

    private Date getSelectedDate(com.toedter.calendar.JDateChooser dateChooser) {
        return (Date) dateChooser.getDate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JPanel AddWview;
    private javax.swing.JLabel Message;
    private javax.swing.JTextField PriceIn;
    private javax.swing.JTextField PriceOut;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel errorName;
    private javax.swing.JLabel errorPriceIn;
    private javax.swing.JLabel errorPriceIn2;
    private javax.swing.JLabel errorPriceOut;
    private javax.swing.JLabel errorQuantity;
    private javax.swing.JTextField itemName;
    private com.toedter.calendar.JDateChooser jDateHSD;
    private com.toedter.calendar.JDateChooser jDateNgayNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField quantityItem;
    // End of variables declaration//GEN-END:variables
}
