package com.devhoss.entidades;

public class Respuesta {
private int numero;
private int respuesta;
private String version;


public Respuesta(int numero, int respuesta, String version) {
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
public int getRespuesta() {
	return respuesta;
}
public void setRespuesta(int respuesta) {
	this.respuesta = respuesta;
}
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
	

}
