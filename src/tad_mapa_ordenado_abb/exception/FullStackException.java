package tad_mapa_ordenado_abb.exception;

@SuppressWarnings("serial")

public class FullStackException extends RuntimeException {
	public FullStackException(String err) {
		super(err);
	}

}