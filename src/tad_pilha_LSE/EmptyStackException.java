package tad_pilha_LSE;

@SuppressWarnings("serial")
public class EmptyStackException extends RuntimeException {
	public EmptyStackException(String err) {
		super(err);
	}
}
