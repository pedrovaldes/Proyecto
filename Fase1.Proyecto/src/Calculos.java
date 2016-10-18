import java.util.Date;

public class Calculos {
	private Evento[] evento;
	private int cantEventos;
	
	public Calculos(){
		evento = new Evento[200];//Se crea arreglo de eventos para guardar todos los eventos que desee el usuario
	}
	
	/**
	 * @param nombreEvento: nombre del evento
	 * @param descripcion: breve descripcion del evento
	 * @param fechaEntrega: fecha limite para entregar trabajo
	 * @param tipoEvento: tarea, proyecto, examen, otro
	 */
	public void llenarEvento(String nombreEvento, String descripcion, Date fechaEntrega, String tipoEvento){
		Evento tempE = new Evento(nombreEvento, descripcion, fechaEntrega, tipoEvento);
		tempE.setNombreEvento(nombreEvento);
		tempE.setDescripcion(descripcion);
		tempE.setFechaEntrega(fechaEntrega);
		tempE.setTipoEvento(tipoEvento);
		
		if (cantEventos<evento.length){//Permite agregar un evento si la capacidad del arreglo lo permite
			evento[cantEventos] = tempE;
			cantEventos++;
		}
	}
	
	
	/**
	 * @param elevento: evento que el usuario selecciona
	 */
	public void eliminarEvento(Evento elevento){//Eliminar el evento que el usuario selecciones
		int i = 0;
		while (i<200){
			if (evento[i] == elevento){
				evento[i] = null;
			}
		i++;
		}
	}
}