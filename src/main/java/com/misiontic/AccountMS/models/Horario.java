package com.misiontic.AccountMS.models;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Horario {
    @Id
    private String documento;
    private String nombres;
    private String jornada;
    private  String hora;
    private  Date fecha;


    public Horario(String documento, String nombres, String jornada, String hora, Date fecha){
        this.documento=documento;
        this.nombres=nombres;
        this.jornada=jornada;
        this.hora=hora;
        this.fecha=fecha;

    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}