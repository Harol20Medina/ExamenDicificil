/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package upeu.test;

import com.google.gson.Gson;
import upeu.config.Conexion;
import upeu.dao.ClienteDao;
import upeu.dao.EmpleadoDao;
import upeu.dao.ProductoDao;
import upeu.dao.SucursalDao;
import upeu.daoImpl.ClienteDaoImpl;
import upeu.daoImpl.EmpleadoDaoImpl;
import upeu.daoImpl.ProductoDaoImpl;
import upeu.daoImpl.SucursalDaoImpl;



/**
 *
 * @author admin
 */
public class Test {

static Gson gson = new Gson();
    /**
     * @param args the command line arguments
     */

static ProductoDao productoDao = new ProductoDaoImpl();
static EmpleadoDao empleadoDao = new EmpleadoDaoImpl();
static SucursalDao sucursalDao = new SucursalDaoImpl();
static ClienteDao clienteDao = new ClienteDaoImpl();


    public static void main(String[] args) {
        //System.out.println(gson.toJson(empleadoDao.listarEmpleados()));
        //System.out.println(gson.toJson(productoDao.listarProductos()));
        //System.out.println(gson.toJson(sucursalDao.listarSucursales()));
        System.out.println(gson.toJson(clienteDao.listarClientes()));

        if(Conexion.getConexion()!=null){
            System.out.println("si");
        }else{
            System.out.println("no");
        }

    }
    
}
