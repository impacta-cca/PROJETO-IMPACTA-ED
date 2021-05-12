package tad_mapa_ordenado_abb.interfaces;

public interface Entry<K, V> {
	// Retorna uma chave armazenada nesta entrada.

	public K getKey();

	// Retorna o valor armazenado nesta entrada.

	public V getValue();
	
}
