package tad_lista_de_nodos.exception;

@SuppressWarnings("serial")
public class BoundaryViolationException extends RuntimeException {

	public BoundaryViolationException(String err) {
		super(err);
	}
}
