package tad_lista_prioridade.interfaces;

public interface CompleteBinaryTree<E> extends BinaryTree<E> {

	// Adiciona um elemento à árvore após o último nodo. Retorna a nova posição criada.

	public Position<E> add(E elem);

	// Remove e retorna o elemento armazenado no último nodo da árvoere.

	public E remove();
}
