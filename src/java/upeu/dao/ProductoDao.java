/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import unionDtos.ProductoDto;
import upeu.model.Producto;

/**
 *
 * @author HP
 */
public interface ProductoDao {  
    List<ProductoDto> listarProductos();
}
