
$(document).ready(() => {
    listarSucursales();
});
const listarSucursales = () => {
     $('#selectSucursal option').remove();
    $.get('SucursalController', {sucursal: 1}, (data) => {

        //console.log(data);
        const sucursales = JSON.parse(data);

        //console.table(sucursales);

        sucursales.forEach((sucursal) => {
            $('#selectSucursal').append(`
                    
                    <option value='${sucursal.sucursal_id}'>${sucursal.nombresucursal}</option>
                `);
        });


    } );
};
