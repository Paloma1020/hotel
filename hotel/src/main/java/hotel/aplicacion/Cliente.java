/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.aplicacion;

/**
 *
 * @author Paloma
 *
 *Contiene los atributos del cliente
 *Metodo obtenerNumeroCliente
 *Metodo mostrarInformación
 *
 **/
public class Cliente {
	/**
	 * Atributos necesarios para el objeto cliente
	 * codigo
	 * nombre
	 * dni
	 * telefono
	 * el atributo statico nos servirá para generear numeros de clientes.
	 */
    private static int contadorClientes = 0;
    private int codigo;
    public String nombre;
    public String dni;
    public String telefono;

    /**
     * Realizamos el constructor
     * @param nombre
     * @param dni
     * @param telefono
     * @throws Exception
     */
    
    public Cliente(String nombre, String dni, String telefono) throws Exception {
        // Validación del DNI, si no es correcto no creará el objeto
        Utilidades.validarDNI(dni); 
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.codigo = obtenerNumeroCliente();
    }
    
    /**
     * Getters y Setters de los atributos
     * @return
     */

   public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Metodo obtenerNumeroCliente 
	 * El cual se irá sumando por cada cliente nuevo
	 * @return
	 */
	

		private static int obtenerNumeroCliente() {
        contadorClientes++;
        return contadorClientes;
    }
	
		/**
		 * Metodo mostrarInformacion 
		 * Muestra la información de los atributos
		 * @return
		 */

    
    public String mostrarInformacion() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", DNI: " + dni + ", Teléfono: " + telefono;
    }
}
