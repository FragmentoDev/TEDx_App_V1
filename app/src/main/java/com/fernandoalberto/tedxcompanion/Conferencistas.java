package com.fernandoalberto.tedxcompanion;

public class Conferencistas {
    private String Nombre;
    private String Taller;
    private String Descipcion;
    private int Hora_Inicio;
    private int Hora_Final;

    public Conferencistas() {
    }

    public Conferencistas(String nombre, String taller, String descipcion, int hora_Inicio, int hora_Final) {
        Nombre = nombre;
        Taller = taller;
        Descipcion = descipcion;
        Hora_Inicio = hora_Inicio;
        Hora_Final = hora_Final;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTaller() {
        return Taller;
    }

    public void setTaller(String taller) {
        Taller = taller;
    }

    public String getDescipcion() {
        return Descipcion;
    }

    public void setDescipcion(String descipcion) {
        Descipcion = descipcion;
    }

    public int getHora_Inicio() {
        return Hora_Inicio;
    }

    public void setHora_Inicio(int hora_Inicio) {
        Hora_Inicio = hora_Inicio;
    }

    public int getHora_Final() {
        return Hora_Final;
    }

    public void setHora_Final(int hora_Final) {
        Hora_Final = hora_Final;
    }
}
