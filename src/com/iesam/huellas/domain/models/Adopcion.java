package com.iesam.huellas.domain.models;

public class Adopcion {
    private String id;
    private String fechaAdopcion;
    private Animales animales;
    private Adoptante adoptante;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechaAdopcion() {
        return fechaAdopcion;
    }

    public void setFechaAdopcion(String fechaAdopcion) {
        this.fechaAdopcion = fechaAdopcion;
    }

    public Animales getAnimales(Cat gato1) {
        return animales;
    }

    public Adoptante getAdoptante(Adoptante adoptante1) {
        return adoptante;
    }
}
