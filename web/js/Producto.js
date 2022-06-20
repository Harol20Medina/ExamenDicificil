$(document).ready(() => {
    listarProductos();
});

const listarProductos = () => {
    $('#selectProducto option').remove();
    $.get('ProductoController', {Producto: 1}, (data) => {

        //console.log(data);
        const productos = JSON.parse(data);

        //console.table(productos);

        productos.forEach((producto) => {
            $('#selectProducto').append(`
                    
                    <option value='${producto.producto_id}'>${producto.nombreproducto}</option>
                `);
        });




    } );
};
