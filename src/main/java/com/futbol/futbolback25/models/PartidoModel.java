package com.futbol.futbolback25.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="partidos")
public class PartidoModel {

    @Id
    private String id;
    private UsuarioModel usuario; //Información del usuario
    private EquipoModel local; //Esta es la información del equipo 1
    private EquipoModel visitante;//Esta es la información del equipo 2
    private String fecha;
    private int goleslocal;
    private int golesvisitante;

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public UsuarioModel getUsuario() {
        return usuario;
    }
    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }
    public EquipoModel getLocal() {
        return local;
    }
    public void setLocal(EquipoModel local) {
        this.local = local;
    }
    public EquipoModel getVisitante() {
        return visitante;
    }
    public void setVisitante(EquipoModel visitante) {
        this.visitante = visitante;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public int getGoleslocal() {
        return goleslocal;
    }
    public void setGoleslocal(int goleslocal) {
        this.goleslocal = goleslocal;
    }
    public int getGolesvisitante() {
        return golesvisitante;
    }
    public void setGolesvisitante(int golesvisitante) {
        this.golesvisitante = golesvisitante;
    }

    

    
    
}
