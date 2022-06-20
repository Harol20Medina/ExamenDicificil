

$(document).ready(() => {
    listarClientes();
});

const listarClientes = () => {
    $('#selectCliente option').remove();
    $.get('ClientesController', {cliente: 1}, (data) => {

        alert(data);
        console.log(data);
        const clientes = JSON.parse(data);

        console.table(clientes);

        clientes.forEach((cliente) => {
            $('#selectCliente').append(`
                    
                    <option value='${cliente.cliente_id}'>${cliente.nombrepersona}</option>
                `);
        });




    } );
};

