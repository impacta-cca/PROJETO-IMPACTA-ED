package tad_mapa_ordenado_abb.exception;

@SuppressWarnings("serial")
public class InvalidKeyException extends RuntimeException {
	public InvalidKeyException(String err) {
		super(err);
	}
}
