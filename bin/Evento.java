

public class Evento {
	private String nombreEvento;
	private String descripcion;
	private String fechaEntrega;
	private String tipoEvento;
	private String materia;
	
	/**
	 * @param nombreEvento
	 * @param descripcion
	 * @param fechaEntrega
	 * @param tipoEvento
	 * @param materia
	 */
	public Evento(String nombreEvento, String descripcion, String fechaEntrega, String tipoEvento, String materia){
		this.nombreEvento = nombreEvento;
		this.descripcion = descripcion;
		this.fechaEntrega = fechaEntrega;
		this.tipoEvento = tipoEvento;
		this.materia = materia;
	}
	
	/**
	 * @return nombre del evento
	 */
	public String getNombreEvento() {
		return nombreEvento;
	}

	/**
	 * @param nombreEvento
	 */
	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	/**
	 * @return breve descripcion del evento
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion del evento
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return fecha limite para terminar tarea
	 */
	public String getFechaEntrega() {
		return fechaEntrega;
	}

	/**
	 * @param fechaEntrega
	 */
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	/**
	 * @return tipo de evento: tarea, proyecto, examen, otro
	 */
	public String getTipoEvento(){
		return tipoEvento;
	}
	/**
	 * @param tipoEvento
	 */
	public void setTipoEvento(String tipoEvento){
		this.tipoEvento = tipoEvento;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

}
