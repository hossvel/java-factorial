package com.devhoss.entidades;
import java.math.BigInteger;

public class Respuesta {
private int numero;
private BigInteger respuesta;
private String version;


public Respuesta(int numero, BigInteger respuesta, String version) {
	super();
	this.numero = numero;
	this.respuesta = respuesta;
	this.version = version;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public BigInteger getRespuesta() {
	return respuesta;
}
public void setRespuesta(BigInteger respuesta) {
	this.respuesta = respuesta;
}
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
	

}
