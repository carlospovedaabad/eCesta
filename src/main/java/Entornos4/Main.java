/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entornos4;

public class Main {

    public static void main(String[] args) {

        eCesta cesta;

        cesta = new eCesta("Poveda Abad", 100, "71220863Y", 10);

        try {

            cesta.comprar(50);

        } catch (Exception e) {

            System.out.println("No se puede pagar");

        }

        try {

            System.out.println("Solicitar actualización de bono");

            cesta.ActualizarBono(100);

        } catch (Exception e) {

            System.out.println("Error al recargar");

        }

        double bonoactual = cesta.bonificacion();

        System.out.println("Su bono actual es  " + bonoactual);

    }
    // Agrupar las intrcciones del objeto cesta en un método //
    public static void NuevoMetodo(eCesta cesta) {
        try {
            cesta.comprar(50);
        } catch (Exception e) {
            System.out.println("No se puede pagar");
        }

        try {
            System.out.println("Solicitar actualización de bono");
            cesta.ActualizarBono(100);
        } catch (Exception e) {
            System.out.println("Error al recargar");
        }

        double bonoactual = cesta.bonificacion();
        System.out.println("Su bono actual es  " + bonoactual);
    }

}
