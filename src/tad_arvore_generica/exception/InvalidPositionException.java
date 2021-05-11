package tad_arvore_generica.exception;

@SuppressWarnings("serial")
public class InvalidPositionException extends RuntimeException {

	public InvalidPositionException(String err) {
		super(err);
	}

}
