/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unionDtos;

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

public class EmpleadoDto {
    private Integer empleado_id; 
    private String cargoempleado;
    private Integer persona_id; 
    private String nombrepersona;
    private String apellidospersona;
    private String dnipersona;
    private String telefonopersona;
    private Integer rol_id;
    private String nombrerol;
    private Boolean estadorol;

}
