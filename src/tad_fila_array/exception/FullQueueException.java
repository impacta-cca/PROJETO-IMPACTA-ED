package tad_fila_array.exception;

@SuppressWarnings("serial")

public class FullQueueException extends RuntimeException {
	public FullQueueException(String err) {
		super(err);
	}

}