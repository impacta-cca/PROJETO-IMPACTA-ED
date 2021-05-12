package tad_mapa_ordenado_avl.exception;


@SuppressWarnings("serial")

public class InvalidEntryException extends RuntimeException {
	public InvalidEntryException(String err) {
		super(err);
	}
}
