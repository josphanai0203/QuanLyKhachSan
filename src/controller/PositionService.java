/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.PositionDAO;
import java.util.ArrayList;
import model.Position;
import service.IPosition;

/**
 *
 * @author Trinh
 */
public class PositionService implements IPosition{
    static PositionDAO pd = new PositionDAO();

    @Override
    public boolean add(Position t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Position> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Position t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Position t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Position findById(Position t) {
        return pd.findById(t);
    }
    
    public Position findByName(String t) {
        return pd.findByName(t);
    }
    
}
