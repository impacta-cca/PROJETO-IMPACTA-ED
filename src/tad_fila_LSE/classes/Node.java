package tad_fila_LSE.classes;

public class Node<E> {

	private E element; // assumimos: os elementos s�o strings

	private Node next;

	// Cria um nodo com um dado elemento e o pr�ximo nodo

	public Node() {
		this.element = null;
		this.next = null;
	}

	// Retorna o elemento deste nodo

	public E getElement() {
		return element;
	}

	// Retorna o pr�ximo elemento deste nodo

	public Node getNext() {
		return next;
	}

	// M�todos modificadores:

	// Define o elemento deste nodo

	public void setElement(E elem) {
		element = elem;
	}

	// Define o pr�ximo elemento deste nodo

	public void setNext(Node newNext) {
		next = newNext;
	}

}
