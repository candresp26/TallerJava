/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leonardo.sanchez
 */
public class Articulo {
    private int codigo;
    private int descuento;
    private String descripcion;
    private double precio;
    private double iva;

    public Articulo(int codigo, int descuento, String descripcion, double precio, double iva) {
        this.codigo = codigo;
        this.descuento = descuento;
        this.descripcion = descripcion;
        this.precio = precio;
        this.iva = iva;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Articulo{" + "codigo=" + codigo + ", descuento=" + descuento + ", descripcion=" + descripcion + ", precio=" + precio + ", iva=" + iva + '}';
    }
}
