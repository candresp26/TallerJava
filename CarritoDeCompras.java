/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;


/**
 *
 * @author leonardo.sanchez
 */
public class CarritoDeCompras implements OperaArticulo{
              //Generico
    ArrayList<Articulo> ListaArticulos;

    public CarritoDeCompras() {
    }

    public CarritoDeCompras(ArrayList<Articulo> ListaArticulos) {
        this.ListaArticulos = ListaArticulos;
    }    
    
    public ArrayList<Articulo> getListaArticulos() {
        return ListaArticulos;
    }

    public void setListaArticulos(ArrayList<Articulo> ListaArticulos) {
        this.ListaArticulos = new ArrayList(ListaArticulos);
    }

    @Override
    public String toString() {
        return "CarritoDeCompras{" + "ListaArticulos=" + ListaArticulos + '}';
    }

    @Override
    public void agregarArticulo(Articulo articulo) {
        ListaArticulos.add(articulo);
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarArticulo(int codigo) {
        for (int i = 0; i < ListaArticulos.size(); i++) {
            Articulo articulo = ListaArticulos.get(i);
            if (articulo.getCodigo() == codigo) {
                ListaArticulos.remove(i);
                break;
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Articulo buscarArticulo(int codigo) {
        for (Articulo articulo : ListaArticulos) {
            if (articulo.getCodigo() == codigo) {
                return articulo;
            }
        }
        return null; // Si no se encuentra el artículo, retorna null
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void listarArticulos() {
        for (Articulo articulo : ListaArticulos) {
            System.out.println(articulo);
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
