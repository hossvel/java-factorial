package com.devhoss.entidades;

public class Respuesta {
private int numero;
private Long respuesta;
private String version;


public Respuesta(int numero, Long respuesta, String version) {
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
public Long getRespuesta() {
	return respuesta;
}
public void setRespuesta(Long respuesta) {
	this.respuesta = respuesta;
}
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
	

}
