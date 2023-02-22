package com.iesam.huellas.domain.models;

import com.iesam.huellas.domain.models.Persona;

public class Socio extends Persona {
    private String cuentaBancaria;

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
}
