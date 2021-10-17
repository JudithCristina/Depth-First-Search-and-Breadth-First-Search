import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

	public void buscar(Nodo raiz, Nodo objetivo) {
		Queue<Nodo> cola = new LinkedList<>();//FIFO
		cola.add(raiz);

		do{
			System.out.println(cola);

			if(cola.contains(objetivo)){
				System.out.println("--> Found: " + objetivo);
				return;
			}

			//Evaluar Nodo y Removerlo
			Nodo nodoActual = cola.remove();
			nodoActual.setVisitadoBFS(true);
			//Expandir
			List<Nodo> vecinos = nodoActual.getVecinosList();

			for (Nodo letter : vecinos) {
				if(!cola.contains(letter) && letter.getVisitadoBFS()==false){
					cola.add(letter);
					letter.setVisitadoBFS(true);
				}
			}


		}while(!cola.isEmpty());

	}

}
