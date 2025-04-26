package com.sample;

import java.util.List;
import java.util.ArrayList;

public class Laptop {
    private String marca;
    private List<Componenta> componente = new ArrayList<>();

    public Laptop(String marca) {
        this.marca = marca;
    }
    public String getMarca() { return marca; }
    public void addComponenta(Componenta c) {
        componente.add(c);
    }
    public List<Componenta> getComponente() { return componente; }

    public double getValoareLaptop() {
        double total = 0;
        for (Componenta c : componente) {
            total += c.getPret();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order [ category = "
             + marca.toUpperCase()
             + ", lines="
             + componente
             + " ]";
    }
}
