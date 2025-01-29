/**
 * Ingresamos comentarios para la creacion de javadoc en la tarea 04 de entornos de desarrollo,
 * este comentario lo estamos introduciendo en la cabecera donde explicariuamos la funcionalidad
 * de la clase correspondiente con el autor y la version. En este caso es una clase que se utiliza 
 * para obtener y actualizar datos bancarios mediante get y set los cuales se han creado mediante 
 * refactor en la elaboracion de la tarea.
 * @author santos_mesones_saul
 * @version febrero_2025
 */
package cuentas;
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
/**
 * Método CCuenta que incluye varios set para introducir los diferentes datos de la ceunta
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**
 * Este comentario es para un método llamdo estado que no recive ningún dato y devuelve getSaldo()
 * @return getSaldo()
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Este método es ingresar el cual recibe un double con una cantidad y puede devolver una excepción
 * @param cantidad
 * @throws Exception
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Método para retirar que recibe un double con la cantidad y lanza una excepción
 * @param cantidad
 * @throws Exception
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * Método get para obtener el tipo de interés
 * @return tipoInterés
 */
	private double getTipoInterés() {
		return tipoInterés;
	}
/**
 * Método set para modificar el tipo de interés
 * @param tipoInterés
 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
/**
 * Método get para obtener el saldo
 * @return saldo
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * Método set para modificar el saldo
 * @param saldo
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * Método get para obtener la cuenta
 * @return cuenta
 */
	private String getCuenta() {
		return cuenta;
	}
/**
 * Método set para modificar la cuenta
 * @param cuenta
 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * Método get para obtener el nombre
 * @return nombre
 */
	private String getNombre() {
		return nombre;
	}
/**
 * Método set para modificar el nombre
 * @param nombre
 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
