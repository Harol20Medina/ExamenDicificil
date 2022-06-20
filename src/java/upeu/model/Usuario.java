/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upeu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author HP
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private Integer usuario_id;
    private String usernameusuario;
    private Integer passwordusuario;
    private Boolean estadousuario;
    private Integer empleado_id;
    private Integer rol_id;
}
