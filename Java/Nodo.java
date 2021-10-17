import java.util.ArrayList;
import java.util.List;

public class Nodo {

	private String nombre;
	private boolean visitadoBFS;
	private boolean visitadoDFS;
	private List<Nodo> vecinosList;
	
	Nodo(){
		vecinosList = new ArrayList<>();
	}
	
	public Nodo(String nombre) {
		this.nombre = nombre;
		this.visitadoBFS = false;
		this.visitadoDFS = false;
		vecinosList = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setVisitadoBFS(Boolean visitado) {
		this.visitadoBFS = visitado;
	}
	public boolean getVisitadoBFS() {
		return visitadoBFS;
	}

	public void setVisitadoDFS(Boolean visitado) {
		this.visitadoDFS = visitado;
	}
	public boolean getVisitadoDFS() {
		return visitadoDFS;
	}
	public List<Nodo> getVecinosList() {
		return vecinosList;
	}

	public void setVecinosList(List<Nodo> vecinosList) {
		this.vecinosList = vecinosList;
	}

	public void agregarNodo(Nodo nodo){
		vecinosList.add(nodo);
	}

	@Override
	public String toString() {
		return this.nombre;
	}
	
}
