package tad_fila_LSE.exception;

@SuppressWarnings("serial")

public class EmptyQueueException extends RuntimeException {
	public EmptyQueueException(String err) {
		super(err);
	}

}