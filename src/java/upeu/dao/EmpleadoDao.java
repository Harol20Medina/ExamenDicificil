/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package upeu.dao;

import java.util.List;
import upeu.model.Empleado;
import unionDtos.EmpleadoDto;

/**
 *
 * @author HP
 */
public interface EmpleadoDao {
    List<EmpleadoDto> listarEmpleados();
}
