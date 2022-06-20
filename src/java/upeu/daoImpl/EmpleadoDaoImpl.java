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
import unionDtos.EmpleadoDto;
import upeu.config.Conexion;
import upeu.dao.EmpleadoDao;
import upeu.model.Empleado;

/**
 *
 * @author HP
 */
public class EmpleadoDaoImpl implements EmpleadoDao {

    private PreparedStatement preparedStatement;
    private ResultSet resultset;
    private Connection conexion;

    @Override
    public List<EmpleadoDto> listarEmpleados() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
String SQL = "SELECT p.persona_id, p.nombres, p.apellidos, p.dni, p.telefono, r.nombre FROM personas p JOIN empleado e ON p.persona_id=e.persona_id JOIN usuarios u ON e.empleado_id=u.empleado_id JOIN roles r ON r.rol_id=u.rol_id WHERE r.rol_id=3";
        List<EmpleadoDto> empleados = new ArrayList<EmpleadoDto>(10);

        try {

            conexion = Conexion.getConexion();
            preparedStatement = conexion.prepareStatement(SQL);
            resultset = preparedStatement.executeQuery();

            while (resultset.next()) {
                
                EmpleadoDto  empleado = new EmpleadoDto();
                empleado.setPersona_id(resultset.getInt("persona_id"));
                empleado.setNombrepersona(resultset.getString("nombres"));
                empleado.setApellidospersona(resultset.getString("apellidos"));
                empleado.setDnipersona(resultset.getString("dni"));
                empleado.setTelefonopersona(resultset.getString("telefono"));
                empleado.setNombrerol(resultset.getString("nombre"));
                empleados.add(empleado);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return empleados;
    }

}
