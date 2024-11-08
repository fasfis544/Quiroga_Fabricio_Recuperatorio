package model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Operador
 */
public class Sistema {
    private final List<Pedido> pedidos;
    public Sistema(){
        pedidos = new ArrayList<>();
    }
    public boolean agregarPedidoPapelMensual (LocalDate fechaCreacion, double montoBase, LocalDate fechaEntrega, int par1){
        try {
            PedidoPapelMensual Pedido = new PedidoPapelMensual (fechaCreacion, montoBase, fechaEntrega);
            pedidos.add(Pedido);
            System.out.println("Pedido cargado con exito");
            return true;
        } catch (IllegalArgumentException e) {
        System.out.println("no se cargo el pedido con exito");
        return false;
        }
    }
    public boolean agregarPedidoElectronico (LocalDate fechaCreacion, double montoBase,String motivo, double porcentajeExtra){
        try {
            PedidoElectronico Pedido = new PedidoElectronico (fechaCreacion, montoBase, motivo, porcentajeExtra);
            pedidos.add(Pedido);
            System.out.println("Pedido cargado con exito");
            return true;
        } catch (IllegalArgumentException e) {
        System.out.println("no se cargo el pedido con exito");
        return false;
        }
    }
    public List<Pedido> traerPedidos(){
        return pedidos;
    }
    public Pedido traerPedido(int idPedido){
        return pedidos.stream().filter(p -> p.idPedido == idPedido).findFirst().orElse(null);
    }  
    public List<Pedido> traerPedido(String motivo){
        List<Pedido> resultado = new ArrayList<> ();
        for (Pedido p : pedidos){
            if (p instanceof PedidoElectronico){
                resultado.add(p);
                
            }
        }
        return resultado;
    }
    public double calcularTotalGeneral(){
        return pedidos.stream().mapToDouble(Pedido::calcularPrecioFinal).sum();
    }
}
    

