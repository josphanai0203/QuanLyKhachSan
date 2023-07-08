/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface IService<T> {
    public boolean add(T t);
    public ArrayList<T> selectAll();
    public boolean update(T t);
    public boolean delete(T t);
    public T findById(T t);
}
