package tad_lista_prioridade.exception;

@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException {

	public InvalidPositionException(String err) {
		super(err);
	}

}
