package tad_pilha_array.exception;

@SuppressWarnings("serial")

public class FullStackException extends RuntimeException {
	public FullStackException(String err) {
		super(err);
	}

}