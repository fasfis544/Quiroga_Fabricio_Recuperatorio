package model;
import java.time.LocalDate;
/**
 *
 * @author Operador
 */
class PedidoPapelMensual extends Pedido {
    private LocalDate FechaEntrega;
    private int cantidadResmas;

    public PedidoPapelMensual(LocalDate FechaEntrega, double montoBase, LocalDate fechaCreacion) {
        super(fechaCreacion, montoBase);
        if (cantidadResmas <= 0 ){
            throw new IllegalArgumentException ("cantidad de remas debe ser mayor a 0");
        }
        this.FechaEntrega = FechaEntrega;
        this.cantidadResmas = cantidadResmas;
    }
    
    @Override
    public double calcularPrecioFinal(){
        return montoBase * cantidadResmas;
    }
    
    
    
    
    
}
