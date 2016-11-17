

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
	 * @param materia
	 */
	public void crearCuenta(String cuenta, String contrasena){
	Evento tempA= new Evento(usuario, contrasena);
	tempA.setUsuario(usuario);
	tempA.setContraseña(contrasena);
	}
	
	
	public void llenarEvento(String nombreEvento, String descripcion, String fechaEntrega, String tipoEvento, String materia){
		Evento tempE = new Evento(nombreEvento, descripcion, fechaEntrega, tipoEvento, materia);
		tempE.setNombreEvento(nombreEvento);
		tempE.setDescripcion(descripcion);
		tempE.setFechaEntrega(fechaEntrega);
		tempE.setTipoEvento(tipoEvento);
		tempE.setMateria(materia);
		
		if (cantEventos<evento.length){//Permite agregar un evento si la capacidad del arreglo lo permite
			evento[cantEventos] = tempE;
			cantEventos++;
		}
	}
	
	public String BuscarTipoEvento(String tipo){
		int i = 0;
		String n = "";
		while (i<200){
			if (evento[i].getTipoEvento() == tipo){
				n = n + evento[i].getNombreEvento() + "\n";
			}
		i++;
		}
		return n;
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