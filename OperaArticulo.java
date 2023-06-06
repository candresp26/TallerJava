/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

/**
 *
 * @author leonardo.sanchez
 */
public interface OperaArticulo {
    public abstract void agregarArticulo(Articulo articulo);
    public abstract void eliminarArticulo(int codigo);
    public abstract Articulo buscarArticulo(int codigo);
    public abstract void listarArticulos();
}
