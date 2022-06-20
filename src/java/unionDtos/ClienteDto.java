/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class ClienteDto {

    public static Object listarClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Integer cliente_id;
    private String direccioncliente;
    private String hobbycliente;
    private String correocliente;
    private Integer persona_id;
    
    private String nombrepersona;
    private String apellidopersona;
    private String dnipersona;
    private String telefonopersona;
    
}
