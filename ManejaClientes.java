/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo;

/**
 *
 * @author leonardo.sanchez
 */
public interface ManejaClientes {
 
    public abstract void altaCliente(Cliente cliente);
    public abstract void bajaCliente(int numero);
    public abstract void actualizaCliente(Cliente cliente);
    public abstract Cliente buscaCliente(int numero);
    public abstract void imprimeClientes();
}
