/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Juan Eyzaguirre
 */
public class Tienda {
    
    private ArrayList<Empleado> listaEmpleado;
    private ArrayList<Producto> listaProducto;

    public Tienda(ArrayList<Empleado> listaEmpleado, ArrayList<Producto> listaProducto) {
        this.listaEmpleado = listaEmpleado;
        this.listaProducto = listaProducto;
    }

    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
    
}
