package view.WareHouseView;

import controller.WareHouseService;
import util.Validate;

import java.awt.*;
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
        quantityItem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PriceIn = new javax.swing.JTextField();
        PriceOut = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AddBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Message = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        error3 = new javax.swing.JLabel();
        error4 = new javax.swing.JLabel();
        error5 = new javax.swing.JLabel();
        error6 = new javax.swing.JLabel();
        jDateNgayNhap = new com.toedter.calendar.JDateChooser();
        jDateHSD = new com.toedter.calendar.JDateChooser();
        errorName = new javax.swing.JLabel();
        errorQuantity = new javax.swing.JLabel();
        errorPriceIn = new javax.swing.JLabel();
        errorPriceOut = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();

        jLabel1.setText("Tên Sản Phẩm");

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

        javax.swing.GroupLayout AddWviewLayout = new javax.swing.GroupLayout(AddWview);
        AddWview.setLayout(AddWviewLayout);
        AddWviewLayout.setHorizontalGroup(
            AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddWviewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AddWviewLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(error5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AddWviewLayout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddWviewLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(error4))
                            .addComponent(errorPriceIn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(error6)
                        .addGap(282, 282, 282))
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantityItem, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(itemName)
                            .addComponent(PriceIn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(errorQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AddWviewLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(64, 64, 64)
                                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateHSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(error2)
                                .addGap(253, 253, 253))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddWviewLayout.createSequentialGroup()
                                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddWviewLayout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(error1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddWviewLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(error3)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceOut, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errorPriceOut, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        AddWviewLayout.setVerticalGroup(
            AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddWviewLayout.createSequentialGroup()
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddWviewLayout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(error2)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddWviewLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jDateNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jDateHSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(error6))
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AddWviewLayout.createSequentialGroup()
                                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(error1))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(quantityItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(error3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9))
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addComponent(error4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(PriceIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorPriceIn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel7))
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PriceOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(errorPriceOut, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(error5)
                        .addGap(56, 56, 56)
                        .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        Title.setText("Thêm Sản Phẩm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AddWview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(438, 438, 438))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddWview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        boolean check;
        config();
        //validate:
        ArrayList<Integer> test1 = Validate.checkMutiLine("empty", itemName.getText(), quantityItem.getText(), PriceIn.getText(), PriceOut.getText());
        ArrayList<Integer> test2 = Validate.checkMutiLine("isNumber", quantityItem.getText(), PriceIn.getText(), PriceOut.getText());
        ArrayList<Integer> test3 = Validate.checkMutiLine("validDate");
        if (!test1.isEmpty()) {
            callMessErrorEmpty(test1);
        } else if (!test2.isEmpty()) {
            callMessErrorNumber(test2);
        } else if (!test3.isEmpty()) {
            callMessErrorValideDate(test3);
        }
        String ten_san_pham = itemName.getText();
        Date ngay_nhap = getSelectedDate(jDateNgayNhap);
        int so_luong = Integer.parseInt(quantityItem.getText());
        Double gia_nhap = Double.parseDouble(PriceIn.getText());
        Double gia_ban = Double.parseDouble(PriceOut.getText());
        Date han_su_dung = getSelectedDate(jDateHSD);
        ;

        check = ws.createWareHouse(ten_san_pham, ngay_nhap, so_luong, gia_nhap, gia_ban, han_su_dung);
        if (check) {
            Message.setForeground(new Color(13, 110, 253));
            Message.setText("Thêm Mặt Hàng Thành Công");
        } else {
            Message.setForeground(new Color(255, 0, 0));
            Message.setText("Thêm Mặt Hàng Thất Bại");
        }
    }//GEN-LAST:event_AddBtnActionPerformed

    private void callMessErrorValideDate(ArrayList<Integer> idError) {
//        for (Integer i : idError) {
//            switch (i) {
//                case 2, 6:
//                    error2.setForeground(new Color(255, 0, 0));
//                    error6.setText("Vui lòng nhập lại ngày tháng");
//                    break;
//                default:
//                    break;
//            }
//        }
    }

    private void callMessErrorNumber(ArrayList<Integer> idError) {
        for (Integer i : idError) {
            switch (i) {
                case 3:
                    errorQuantity.setForeground(new Color(255, 0, 0));
                    errorQuantity.setText("Vui lòng Chỉ Nhập Số");
                    break;
                case 4:
                    errorPriceIn.setForeground(new Color(255, 0, 0));
                    errorPriceIn.setText("Vui lòng Chỉ Nhập Số");
                    break;
                case 5:
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

    private void config() {
        errorName.setText("");
        error2.setText("");
        errorQuantity.setText("");
        errorPriceIn.setText("");
        errorPriceOut.setText("");
        error6.setText("");
    }

    private Date getSelectedDate(com.toedter.calendar.JDateChooser dateChooser) {
        return dateChooser.getDate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JPanel AddWview;
    private javax.swing.JLabel Message;
    private javax.swing.JTextField PriceIn;
    private javax.swing.JTextField PriceOut;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel error3;
    private javax.swing.JLabel error4;
    private javax.swing.JLabel error5;
    private javax.swing.JLabel error6;
    private javax.swing.JLabel errorName;
    private javax.swing.JLabel errorPriceIn;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField quantityItem;
    // End of variables declaration//GEN-END:variables
}
