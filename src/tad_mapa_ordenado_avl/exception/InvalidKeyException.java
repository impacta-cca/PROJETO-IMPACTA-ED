package tad_mapa_ordenado_avl.exception;

@SuppressWarnings("serial")
public class InvalidKeyException extends RuntimeException {
	public InvalidKeyException(String err) {
		super(err);
	}
}
