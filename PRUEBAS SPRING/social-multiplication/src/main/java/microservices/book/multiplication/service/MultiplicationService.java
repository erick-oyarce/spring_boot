package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationService {
	
	Multiplication createRandomMultiplication();

	/**
	* @regreso verdadero si el intento coincide con el resultado de la
	* multiplicación, falso en caso contrario.
	*/
	boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
}
