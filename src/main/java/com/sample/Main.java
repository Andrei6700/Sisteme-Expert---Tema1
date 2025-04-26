package com.sample;

public class Main {
    public static void main(String[] args) {
        Comanda comanda = new Comanda();

        Laptop lenovo = new Laptop("LENOVO");
        lenovo.addComponenta(new Componenta("MEMORY", "32", 1300.0));
        lenovo.addComponenta(new Componenta("HDD",    "1024",250.0));
        lenovo.addComponenta(new Componenta("WEB",    "1080",370.0));
        lenovo.addComponenta(new Componenta("SSD",    "500", 600.0));
        lenovo.addComponenta(new Componenta("VIDEO",  "2",   780.0));
        comanda.addLaptop(lenovo);

        Laptop hp = new Laptop("HP");
        hp.addComponenta(new Componenta("MEMORY", "8",   450.0));
        hp.addComponenta(new Componenta("HDD",    "1024",250.0));
        hp.addComponenta(new Componenta("WEB",    "1080",370.0));
        hp.addComponenta(new Componenta("SSD",    "500", 600.0));
        hp.addComponenta(new Componenta("VIDEO",  "2",   780.0));
        comanda.addLaptop(hp);

        Laptop dell = new Laptop("DELL");
        dell.addComponenta(new Componenta("MEMORY", "16", 700.0));
        dell.addComponenta(new Componenta("HDD",    "1024",250.0));
        dell.addComponenta(new Componenta("WEB",    "1080",370.0));
        dell.addComponenta(new Componenta("SSD",    "500", 600.0));
        dell.addComponenta(new Componenta("VIDEO",  "2",   780.0));
        comanda.addLaptop(dell);

        for (Laptop l : comanda.getLaptopuri()) {
            System.out.println(
              l.getMarca().toUpperCase()
              + ": "
              + l.getValoareLaptop()
            );
        }

        System.out.println("Laptop with more than 8Gb RAM:");
        for (Laptop l : comanda.getLaptopuri()) {
            for (Componenta c : l.getComponente()) {
                if (c.getTip().equals("MEMORY")
                 && Integer.parseInt(c.getCaracteristica()) > 8) {
                    System.out.println(l);
                    break;
                }
            }
        }

        boolean existaHP = comanda.getLaptopuri()
                          .stream()
                          .anyMatch(x -> x.getMarca().equalsIgnoreCase("HP"));
        if (existaHP) {
            System.out.println("We have orders for HP!");
        }
    }
}
