package model;

import java.time.LocalDate;

/**
 *
 * @author Operador
 */
class PedidoElectronico extends Pedido {
    private String motivo;
    private double porcentajeExtra;

    public PedidoElectronico(LocalDate fechaCreacion, double porcentajeExtra, String motivo, double montoBase) {
        super(fechaCreacion, montoBase);
        if (motivo == null){
            throw new IllegalArgumentException ("el motivo esta vacio");
        }
        this.motivo = motivo;
        this.porcentajeExtra = porcentajeExtra;
    }
    
    @Override
    public double calcularPrecioFinal (){
        return montoBase + (montoBase * (porcentajeExtra / 100));
    }
    
    
}
