package com.devhoss.rest;

import java.math.BigInteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devhoss.entidades.Respuesta;

@RestController
@RequestMapping("/factorial")
public class OperacionController {
	@GetMapping("/{numero}")
	public Respuesta getbyid(@PathVariable int numero) {

		return new Respuesta(numero,factorialHavingLargeResult(numero),"2.0");
	}
	public long factorialUsingForLoop(int n) {
		long fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public long factorialUsingRecursion(int n) {
		if (n <= 2) {
			return n;
		}
		return n * factorialUsingRecursion(n - 1);
	}

	public BigInteger factorialHavingLargeResult(int n) {
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= n; i++)
			result = result.multiply(BigInteger.valueOf(i));
		return result;
	}



}

