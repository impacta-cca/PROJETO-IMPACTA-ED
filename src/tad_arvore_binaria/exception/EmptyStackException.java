package tad_arvore_binaria.exception;

@SuppressWarnings("serial")

public class EmptyStackException extends RuntimeException {
	public EmptyStackException(String err) {
		super(err);
	}

}
