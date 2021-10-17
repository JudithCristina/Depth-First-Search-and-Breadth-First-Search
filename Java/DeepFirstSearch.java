import java.util.List;
import java.util.Stack;

public class DeepFirstSearch {

	public void buscar(Nodo raiz, Nodo objetivo) {

		Stack<Nodo> pila = new Stack<>();//LIFO
		pila.add(raiz);

		do{
			System.out.println(pila);

			if(pila.contains(objetivo)){
				System.out.println("--> Found: " + objetivo);
				return;
			}

			//Evaluar Nodo y Removerlo
			Nodo nodoActual = pila.pop();
			nodoActual.setVisitadoDFS(true);
			//Expandir
			List<Nodo> vecinos = nodoActual.getVecinosList();
			for (Nodo letter : vecinos) {
				if(!pila.contains(letter) && letter.getVisitadoDFS()==false){
					pila.add(letter);
					letter.setVisitadoDFS(true);
				}
			}


		}while(!pila.isEmpty());

	}

}
