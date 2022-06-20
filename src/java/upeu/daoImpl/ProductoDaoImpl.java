/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import unionDtos.ProductoDto;
import upeu.config.Conexion;
import upeu.dao.ProductoDao;
import upeu.model.Producto;

/**
 *
 * @author HP
 */
public class ProductoDaoImpl implements ProductoDao {

    private PreparedStatement preparedStatement;
    private ResultSet resultset;
    private Connection conexion;


    @Override
    public List<ProductoDto> listarProductos() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String SQL = "SELECT * FROM producto p, categoria c WHERE p.categoria_id = c.categoria_id";
        
        List<ProductoDto> productos = new ArrayList<ProductoDto>(10);

        try {

            conexion = Conexion.getConexion();
            preparedStatement = conexion.prepareStatement(SQL);
            resultset = preparedStatement.executeQuery();

            while (resultset.next()) {

                 ProductoDto producto = new ProductoDto();
                producto.setProducto_id(resultset.getInt("producto_id"));
                producto.setNombreproducto(resultset.getString("nombre"));
                producto.setCategoria_id(resultset.getInt("categoria_id"));
                productos.add(producto);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return productos;
    }

}
