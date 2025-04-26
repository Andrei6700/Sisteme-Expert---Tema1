package com.sample;

import java.util.List;
import java.util.ArrayList;

public class Comanda {
    private List<Laptop> laptopuri = new ArrayList<>();

    public void addLaptop(Laptop l) {
        laptopuri.add(l);
    }
    public List<Laptop> getLaptopuri() {
        return laptopuri;
    }

    public double getValoareComanda() {
        double total = 0;
        for (Laptop l : laptopuri) {
            total += l.getValoareLaptop();
        }
        return total;
    }
}
