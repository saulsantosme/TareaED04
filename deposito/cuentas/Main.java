/**
 * Comentarios para la tarea 04 de entornos de desarrollo sobre la clase main cuentas la cual interactua con la 
 * clase CCuenta de su mismo paquete mediante el uso de métodos, getters y setters.Esta es la clase principal, la 
 * cual ejecuta el programa e introduce y consulta los datos en la classe CCuenta. Estos comentarios se introducen 
 * como realización de la tarea y se añaden despues de ellos el autor y la versión.
 * @author santos_mesones_saul
 * @version febrero_2025
 */
package cuentas;
public class Main {
// Método main
    public static void main(float cantidad) {
        operativa_cuenta();
    }
/**
 * Método operativa_cuenta creado con refactor durante la elaboracion de la tarea
 */
	public static void operativa_cuenta() {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
