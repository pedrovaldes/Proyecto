
public class Usuario {
	private String nombre;
	private String contrasena;

	/**
	 * @param nombre del usuario
	 * @param contrasena del usuario
	 */
	public Usuario(String nombre, String contrasena){
		this.nombre = nombre;
		this.contrasena = contrasena; 
	}

	/**
	 * @return nombre de usuario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre de usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return contrasena del usuario
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * @param contrasena del usuario
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
}