package com.example.examen_practico_u2;

public class Resturante {
    private int idImagen;
    private String sNombre;
    private String sDescripcion;
    private String sDireccion;

    public Resturante(int idImagen, String sNombre, String sDescripcion, String sDireccion) {
        this.idImagen = idImagen;
        this.sNombre = sNombre;
        this.sDescripcion = sDescripcion;
        this.sDireccion = sDireccion;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }

    public String getsDireccion() {
        return sDireccion;
    }

    public void setsDireccion(String sDireccion) {
        this.sDireccion = sDireccion;
    }
}
