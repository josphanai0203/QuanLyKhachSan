/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.roomView;

import controller.RoomService;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.Room;

/**
 *
 * @author Admin
 */
public class DefaultRoomView extends javax.swing.JPanel {

    private static Room roomSelect;
    private ArrayList<Room> list;
    private RoomService rs = new RoomService();

    public DefaultRoomView() {
        initComponents();
        list = rs.selectAll();
        setTableRoom();
    }
    private void setTableRoom() {
        DefaultTableModel dtm = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        roomTable.setModel(dtm);
        ListSelectionModel lsm = roomTable.getSelectionModel();
        lsm.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsm.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                crearteCustomer();
            }
        });
        setColumnName(dtm);
        setColumnWidths(roomTable,100,400,200,200,200);
        setRow(dtm);
    }

    private void setColumnName(DefaultTableModel dtm) {
        dtm.addColumn("ID");
        dtm.addColumn("Tên Phòng");
        dtm.addColumn("Diện Tích");
        dtm.addColumn("Loại Phòng");
        dtm.addColumn("Tình Trạng");
    }

    public void setColumnWidths(JTable table, int... widths) {
        TableColumnModel columnModel = table.getColumnModel();
        for (int i = 0; i < widths.length; i++) {
            if (i < columnModel.getColumnCount()) {
                columnModel.getColumn(i).setMaxWidth(widths[i]);
            } else {
                break;
            }
        }
    }

    public void setRow(DefaultTableModel dfm) {
        Vector v = null;
        for (Room r : list) {
            v = new Vector();
            v.removeAllElements();
            v.add(r.getId_room());
            v.add(r.getName());
            v.add(r.getArea());
            v.add(r.getRoomType());
            v.add((r.isIsUsed()==true)?"Đang Sử Dụng":"Còn Trống");
            dfm.addRow(v);
        }

    }

    public void crearteCustomer() {
        int row = roomTable.getSelectedRow();
        int id =  (Integer)roomTable.getValueAt(row, 0);
        roomSelect = new Room(id);
    }

    public static Room getRoomSelected() {
        return roomSelect;
    }
    public static void setRoomNull(){
        roomSelect = null;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        roomTable = new javax.swing.JTable();

        roomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(roomTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1086, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable roomTable;
    // End of variables declaration//GEN-END:variables
}
