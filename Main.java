package main;
import java.time.LocalDate;
import model.Sistema;
/**
 *
 * @author Operador
 */
public class Main {
    public static void main (String[]args){
        Sistema sistema = new Sistema();
        
    System.out.println("Test 1-1"); 
    sistema.agregarPedidoPapelMensual(LocalDate.of(2020,12,12), 2500.0, LocalDate.of(2020,12,15), 5);
    
    System.out.println("Test 1-2"); 
    sistema.agregarPedidoElectronico(LocalDate.of(2020,12,12), 3000.0,"PC no funciona",200.0);
    
    System.out.println("Test 1-3a"); 
    sistema.agregarPedidoPapelMensual(LocalDate.of(2020,12,12), 2500.0, LocalDate.of(2020,12,15), 0 );
    
    System.out.println("Test 1-3b"); 
    sistema.agregarPedidoElectronico(LocalDate.of(2020,12,12), 3500.0,"",200.0);
    
    System.out.println("Test 3-1"); 
    sistema.agregarPedidoPapelMensual(LocalDate.of(2020,12,12), 2500.0, LocalDate.of(2020,12,15), 3);
    sistema.agregarPedidoElectronico(LocalDate.of(2020,12,12), 3000.0,"PC no funciona",200.0);
    sistema.agregarPedidoElectronico(LocalDate.of(2020,12,12), 3100.0,"monitor no funciona",200.0);
    
    System.out.println("TOTAL GENERAL:"+ sistema.calcularTotalGeneral());
    
    //prueba precio final
    System.out.println("Test 2-1");
    //Pedido pedidoPapel = sistema.traerPedido(1);
    //if (pedidoPapel != null){
    //    System.out.println ("PRECIO FINAL DEL PEDIDO:" + pedidoPapel.calcularPrecioFinal());
    //}
    System.out.println("Test 2-1");
    //Pedido pedidoElectronico = sistema.traerPedido(2);
    //if (pedidoElectronico != null){
    //    System.out.println ("PRECIO FINAL DEL PEDIDO" + pedidoElectronico.calcularPrecioFinal());
    }
}
