
public class AppPrincipal {

	public static void main(String[] args) {

		//Crear los Nodos
		Nodo s = new Nodo("S");
		Nodo d = new Nodo("D");
		Nodo a = new Nodo("A");
		Nodo e = new Nodo("E");
		Nodo b = new Nodo("B");
		Nodo f = new Nodo("F");
		Nodo c = new Nodo("C");
		Nodo g = new Nodo("G");


		//Agregar nodos hijos

			s.agregarNodo(d);
			s.agregarNodo(a);
			d.agregarNodo(a);
			d.agregarNodo(e);
			a.agregarNodo(d);
			a.agregarNodo(b);
			e.agregarNodo(f);
			e.agregarNodo(b);
			b.agregarNodo(e);
			b.agregarNodo(c);
			f.agregarNodo(g);

		System.out.println("\nBreadth First Search: ");
		BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
		breadthFirstSearch.buscar(s,g);

		System.out.println("\n\nDeep First Search: ");
		DeepFirstSearch deepFirstSearch = new DeepFirstSearch();
		deepFirstSearch.buscar(s,g);

	}
}
