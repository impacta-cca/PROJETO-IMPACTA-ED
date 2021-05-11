package tad_lista_prioridade.exception;

@SuppressWarnings("serial")
public class InvalidKeyException extends RuntimeException {
	public InvalidKeyException(String err) {
		super(err);
	}
}
