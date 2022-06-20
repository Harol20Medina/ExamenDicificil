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
public class ProductoDto {
    private Integer producto_id;
    private String nombreproducto;
    private Double precioproducto;
    private Double stockproducto;
    private Boolean estadoproducto;
    private Integer categoria_id;
    private String nombrecategoria;
    private Boolean estadocategoria;
}
