/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author leonardo.sanchez
 */
public class TicketDeCompra {
    private int numero;
    private double subtotal;
    private double descuento;
    private double iva;
    private double total;
    private CarritoDeCompras carrito;

    public double calculaSubtotal()
    {
        return subtotal;
    }
    public double calculaDescuento()
    {
        return descuento;
    }
    public double calculaIva()
    {
        return iva;
    }
    public double calculaTotal()
    {
        return total;
    }
    public void imprimirTicket()
    {
        
    }
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public CarritoDeCompras getCarrito() {
        return carrito;
    }

    public void setCarrito(CarritoDeCompras carrito) {
        this.carrito = carrito;
    }
    
    
    
}
