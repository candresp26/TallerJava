/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leonardo.sanchez
 */
public class Cliente extends Persona {

    private int numero;
    //private String domicilio;
    //private String nombre;
    private String rfc;
    private CarritoDeCompras carritoDeCompras;
    public Cliente(int numero, String domicilio, String nombre, String rfc, int edad) {
        super(nombre, domicilio, edad);
        this.numero = numero;
        //this.domicilio = domicilio;
        //this.nombre = nombre;
        this.rfc = rfc;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    /*public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }*/
    public String getRfc() {
        return rfc;
    }
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numero=" + numero + ", rfc=" + rfc + ", carritoDeCompras=" + carritoDeCompras + '}';
    }
}