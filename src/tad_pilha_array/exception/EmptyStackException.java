package tad_pilha_array.exception;

@SuppressWarnings("serial")

public class EmptyStackException extends RuntimeException {
	public EmptyStackException(String err) {
		super(err);
	}

}
