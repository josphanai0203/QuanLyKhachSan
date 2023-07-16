
package view.WareHouseView;
import controller.MenuController;
import controller.WareHouseService;
import model.WareHouse;

import javax.swing.*;

public class WareHouseView extends javax.swing.JPanel {

    private MenuController controller;
    private WareHouseService ws = new WareHouseService();
    
    public WareHouseView() {
        initComponents();
         initComponents();
        controller = new MenuController(wareView);
        controller.setViewWareHouse(new JButton());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wareMenu = new javax.swing.JPanel();
        addbtn = new javax.swing.JButton();
        fixitembtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        wareView = new javax.swing.JPanel();

        addbtn.setText("Thêm Sản Phẩm");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        fixitembtn.setText("Sửa Mã Hàng");
        fixitembtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixitembtnActionPerformed(evt);
            }
        });

        delbtn.setText("Xoá Mã Hàng");
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });

        backbtn.setText("Trở Lại");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wareMenuLayout = new javax.swing.GroupLayout(wareMenu);
        wareMenu.setLayout(wareMenuLayout);
        wareMenuLayout.setHorizontalGroup(
            wareMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wareMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(fixitembtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addComponent(backbtn)
                .addGap(33, 33, 33))
        );
        wareMenuLayout.setVerticalGroup(
            wareMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wareMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(wareMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fixitembtn)
                    .addComponent(delbtn)
                    .addComponent(backbtn)
                    .addComponent(addbtn))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout wareViewLayout = new javax.swing.GroupLayout(wareView);
        wareView.setLayout(wareViewLayout);
        wareViewLayout.setHorizontalGroup(
            wareViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        wareViewLayout.setVerticalGroup(
            wareViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(wareMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(wareView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(wareMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wareView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
       controller.setViewWareHouse(backbtn);
    }//GEN-LAST:event_backbtnActionPerformed

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
        WareHouse w = DefauseWareHouseView.getWarehouseSelect();
        if(w==null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn Mặt Hàng cần Xoá", "thông báo", JOptionPane.INFORMATION_MESSAGE);
        }else{
            int check = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá vật phẩm này ", "",JOptionPane.INFORMATION_MESSAGE);
            if(check==JOptionPane.YES_OPTION){
                boolean isDel = ws.delete(w);
                if(isDel){
                    controller.setViewWareHouse(new JButton());
                    JOptionPane.showMessageDialog(this, "Đã Xoá Thành Công","Thông Báo", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_delbtnActionPerformed

    private void fixitembtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixitembtnActionPerformed
        WareHouse w = DefauseWareHouseView.getWarehouseSelect();
        if(w == null){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn mặt hàng cần sửa","Thông Báo", JOptionPane.INFORMATION_MESSAGE);
        }else{
            controller.setViewWareHouse(fixitembtn);
        }
    }//GEN-LAST:event_fixitembtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        controller.setViewWareHouse(addbtn);
    }//GEN-LAST:event_addbtnActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton delbtn;
    private javax.swing.JButton fixitembtn;
    private javax.swing.JPanel wareMenu;
    private javax.swing.JPanel wareView;
    // End of variables declaration//GEN-END:variables
}
