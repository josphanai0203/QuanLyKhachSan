
package view.WareHouseView;
import controller.WareHouseService;
import util.Validate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        dayIn = new javax.swing.JTextField();
        hSD = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Message = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        error3 = new javax.swing.JLabel();
        error4 = new javax.swing.JLabel();
        error5 = new javax.swing.JLabel();
        error6 = new javax.swing.JLabel();
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddWviewLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)))
                .addGap(40, 40, 40)
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quantityItem, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                            .addComponent(itemName))
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddWviewLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(64, 64, 64)
                                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hSD, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dayIn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(218, 218, 218))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddWviewLayout.createSequentialGroup()
                                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddWviewLayout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(error3))
                                    .addGroup(AddWviewLayout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(error1)))
                                .addContainerGap(506, Short.MAX_VALUE))))
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PriceIn, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(PriceOut))
                            .addGroup(AddWviewLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(error4)))
                        .addGap(60, 60, 60)
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddWviewLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(error6)
                                .addGap(282, 282, 282))
                            .addGroup(AddWviewLayout.createSequentialGroup()
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddWviewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(error2)
                .addGap(289, 289, 289))
            .addGroup(AddWviewLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(error5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddWviewLayout.setVerticalGroup(
            AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddWviewLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(error1))
                            .addComponent(jLabel1))
                        .addGap(37, 37, 37)
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(quantityItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(error3)))
                        .addGap(47, 47, 47))
                    .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dayIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addComponent(error2)
                        .addGap(28, 28, 28)
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(hSD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(error6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddWviewLayout.createSequentialGroup()
                        .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(PriceIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(error4)
                        .addGap(14, 14, 14)))
                .addComponent(jLabel4)
                .addGroup(AddWviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel7))
                    .addGroup(AddWviewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PriceOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap(51, Short.MAX_VALUE)
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
                .addContainerGap(16, Short.MAX_VALUE)
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
        ArrayList<Integer> test1 = Validate.checkMutiLine("empty", itemName.getText(), dayIn.getText(),quantityItem.getText(), PriceIn.getText(), PriceOut.getText(), hSD.getText());
        ArrayList<Integer> test2 = Validate.checkMutiLine("isNumber", quantityItem.getText(), PriceIn.getText(), PriceOut.getText());
        ArrayList<Integer> test3 = Validate.checkMutiLine("validDate", dayIn.getText(), hSD.getText());
        if (!test1.isEmpty()) {
            callMessErrorEmpty(test1);
        } else if (!test2.isEmpty()) {
            callMessErrorNumber(test2);
        } else if (!test3.isEmpty()) {
            callMessErrorValideDate(test3);
        }
        String ten_san_pham = itemName.getText();
        Date ngay_nhap = java.sql.Date.valueOf(dayIn.getText());
        int so_luong = Integer.parseInt(quantityItem.getText());
        Double gia_nhap = Double.parseDouble(PriceIn.getText());
        Double gia_ban = Double.parseDouble(PriceOut.getText());
        Date hạn_su_dung = java.sql.Date.valueOf(hSD.getText());
        check = ws.createWareHouse(ten_san_pham, ngay_nhap, so_luong, gia_nhap, gia_ban, hạn_su_dung);
        if (check) {
            Message.setForeground(new Color(13, 110, 253));
            Message.setText("Thêm Mặt Hàng Thành Công");
        } else {
            Message.setForeground(new Color(255, 0, 0));
            Message.setText("Thêm Mặt Hàng Thất Bại");
        }
    }//GEN-LAST:event_AddBtnActionPerformed
        private void callMessErrorValideDate(ArrayList<Integer> idError) {
            for (Integer i : idError) {
                switch (i) {
                    case 2, 6:
                    error2.setForeground(new Color(255, 0, 0));
                    error6.setText("Vui lòng nhập lại ngày tháng");
                    break;
                    default:
                    break;
                }
            }
        }
      private void callMessErrorNumber(ArrayList<Integer> idError) {
            for (Integer i : idError) {
                switch (i) {
                    case 2:
                    error2.setForeground(new Color(255, 0, 0));
                    error2.setText("Vui lòng Chỉ Nhập Số");
                    break;
                    case 4:
                    error4.setForeground(new Color(255, 0, 0));
                    error4.setText("Vui lòng Chỉ Nhập Số");
                    break;
                    case 5:
                    error5.setForeground(new Color(255, 0, 0));
                    error5.setText("Vui lòng Chỉ Nhập Số");
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
                    default:
                    break;
                }
            }
        }
        private void config() {
            error1.setText("");
            error2.setText("");
            error3.setText("");
            error4.setText("");
            error5.setText("");
            error6.setText("");
        }

      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JPanel AddWview;
    private javax.swing.JLabel Message;
    private javax.swing.JTextField PriceIn;
    private javax.swing.JTextField PriceOut;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField dayIn;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel error3;
    private javax.swing.JLabel error4;
    private javax.swing.JLabel error5;
    private javax.swing.JLabel error6;
    private javax.swing.JTextField hSD;
    private javax.swing.JTextField itemName;
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
