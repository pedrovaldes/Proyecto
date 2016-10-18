import java.util.Date;

public class Evento {
	private String nombreEvento;
	private String descripcion;
	private Date fechaEntrega;
	private String tipoEvento;
	
	/**
	 * @param nombreEvento
	 * @param descripcion
	 * @param fechaEntrega
	 * @param tipoEvento
	 */
	public Evento(String nombreEvento, String descripcion, Date fechaEntrega, String tipoEvento){
		this.nombreEvento = nombreEvento;
		this.descripcion = descripcion;
		this.fechaEntrega = fechaEntrega;
		this.tipoEvento = tipoEvento;
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
	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	/**
	 * @param fechaEntrega
	 */
	public void setFechaEntrega(Date fechaEntrega) {
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

}
