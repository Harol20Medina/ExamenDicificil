/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import upeu.config.Conexion;
import upeu.dao.SucursalDao;
import upeu.model.Sucursal;

/**
 *
 * @author intel
 */
public class SucursalDaoImpl implements SucursalDao{
    
    private PreparedStatement preparedStatement;
    private ResultSet resultset;
    private Connection conexion;

    @Override
    public List<Sucursal> listarSucursales() {
        
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
     String SQL ="SELECT sucursal_id, nombre FROM sucursales s;";
     
     List<Sucursal> sucursales = new ArrayList<Sucursal>(10);

        try {

            conexion = Conexion.getConexion();
            preparedStatement = conexion.prepareStatement(SQL);
            resultset = preparedStatement.executeQuery();

            while (resultset.next()) {

                 Sucursal sucursal = new Sucursal();
                sucursal.setSucursal_id(resultset.getInt("sucursal_id"));
                sucursal.setNombresucursal(resultset.getString("nombre"));
                sucursales.add(sucursal);
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return sucursales;
    }
    
}
