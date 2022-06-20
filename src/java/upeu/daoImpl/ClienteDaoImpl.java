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
import unionDtos.ClienteDto;
import upeu.config.Conexion;
import upeu.dao.ClienteDao;
import upeu.model.Empleado;
import upeu.model.Cliente;

/**
 *
 * @author HP
 */
public class ClienteDaoImpl implements ClienteDao {

    
    private PreparedStatement preparedStatement;
    private ResultSet resultset;
    private Connection conexion;

    
    @Override
    public List<ClienteDto> listarClientes() {
        
        //comentar o eliminar
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        
        String SQL = "SELECT * FROM cliente c, personas p WHERE c.persona_id = p.persona_id";
        
        List<ClienteDto> clientes = new ArrayList<ClienteDto>(10);

        try {

            conexion = Conexion.getConexion();
            preparedStatement = conexion.prepareStatement(SQL);
            resultset = preparedStatement.executeQuery();

            while (resultset.next()) {
                
                ClienteDto  cliente = new ClienteDto();
                cliente.setCliente_id(resultset.getInt("cliente_id"));
                cliente.setNombrepersona(resultset.getString("nombres"));
                clientes.add(cliente);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return clientes;
    }

    

}
