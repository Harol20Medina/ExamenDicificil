/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.model.Categoria;

/**
 *
 * @author HP
 */
public interface CategoriaDao {
    List<Categoria> listarVenta(); 

    public Object readAll();
}
