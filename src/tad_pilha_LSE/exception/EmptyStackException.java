package tad_pilha_LSE.exception;

@SuppressWarnings("serial")
public class EmptyStackException extends RuntimeException {
	public EmptyStackException(String err) {
		super(err);
	}
}
