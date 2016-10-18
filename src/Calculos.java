
public class Calculos {
	private Usuario usuario;
	private Evento[] evento;
	private int cantEventos;
	
	public Calculos(){
		evento = new Evento[0];
	}
	
	public void llenarEvento(String nombreEvento, String descripcion, Date fechaEntrega){
		Evento tempE = new Evento();
		tempE.setNombreEvento(nombreEvento);
		tempE.setDescripcion(descripcion);
		tempE.setFechaEntrega(fechaEntrega);
	}
