package tad_fila_array.exception;

@SuppressWarnings("serial")

public class EmptyQueueException extends RuntimeException {
	public EmptyQueueException(String err) {
		super(err);
	}

}