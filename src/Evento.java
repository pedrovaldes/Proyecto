import java.util.Date;

public class Evento {
	private String nombreEvento;
	private String descripcion;
	private Date fechaEntrega;
	
	public Evento(String nombreEvento, String descripcion, Date fechaEntrega){
		this.nombreEvento = nombreEvento;
		this.descripcion = descripcion;
		this.fechaEntrega = fechaEntrega;
	}
	
	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	
	

}
