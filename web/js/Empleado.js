
$(document).ready(() => {
    listarEmpleados();
});
const listarEmpleados = () => {
     $('#selectVendedor option').remove();
    $.get('EmpleadoController', {empleado: 1}, (data) => {

        //console.log(data);
        const empleados = JSON.parse(data);

        //console.table(empleados);

        empleados.forEach((empleado) => {
            $('#selectVendedor').append(`
                    
                    <option value='${empleado.empleado_id}'>${empleado.nombrepersona}</option>
                `);
        });




    } );
};
