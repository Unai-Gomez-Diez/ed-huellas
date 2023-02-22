package com.iesam.huellas.domain.models;

import com.iesam.huellas.domain.models.Animales;

public class Perro extends Animales {
    private String raza;
    private boolean amigable;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isAmigable() {
        return amigable;
    }

    public void setAmigable(boolean amigable) {
        this.amigable = amigable;
    }
}
