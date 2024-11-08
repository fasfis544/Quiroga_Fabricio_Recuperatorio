package model;
import java.time.LocalDate;
/**
 *
 * @author Operador
 */
abstract class Pedido {
    protected static int contador = 1; // contador de id 
    protected int idPedido;
    protected LocalDate fechaCreacion;
    protected double montoBase;

    public Pedido(LocalDate fechaCreacion, double montoBase) {
        this.idPedido = contador ++;
        this.fechaCreacion = fechaCreacion;
        this.montoBase = montoBase;
    }
    
    public abstract double calcularPrecioFinal(); 
    
}

