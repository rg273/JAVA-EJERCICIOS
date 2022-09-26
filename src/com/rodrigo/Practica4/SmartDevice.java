package com.rodrigo.Practica4;

public class SmartDevice {
    String marca;
    String software;
    double versionSoftware;


    public SmartDevice(String marca, String software, double versionSoftware){
        this.marca = marca;
        this.software = software;
        this.versionSoftware = versionSoftware;

    }
    public static class SmartWatch extends SmartDevice{
        String versionWatch;
        boolean sumergible;
        String color;


        public SmartWatch(String marca, String software, double versionSoftware, String versionWatch, boolean sumergible, String color) {
            super(marca, software, versionSoftware);
            this.versionWatch = versionWatch;
            this.sumergible = sumergible;
            this.color = color;
        }

        @Override
        public String toString() {
            return "marca = " + marca +
                    ", software = '" + software + '\'' +
                    ", versionsoftware = '" + versionSoftware + '\'' +
                    ", versionWatch = '" + versionWatch + '\'' +
                    ", sumergible = " + sumergible +
                    ", color = ' " + color + '\'' +
                    '}';
        }
    }
    public static class SmartPhone extends SmartDevice{
        String versionCelular;
        double peso;
        String color;

        //constructores
        public SmartPhone(String marca, String software, double versionSoftware, String versionCelular, double peso, String color){
            super(marca,software,versionSoftware);
            this.versionCelular = versionCelular;
            this.peso = peso;
            this.color = color;
        }

        @Override
        public String toString() {
            return "marca = " + marca +
                    ", software = " + software +
                    ", color = " + color +
                    ", peso = " + peso +
                    ", version Celular = " + versionCelular;
        }
    }


    public static void main(String[] args) {

        SmartDevice A23 = new SmartPhone("samsung","android",9.0, "A23", 769.9,"white");

        SmartWatch AppleSE = new SmartWatch("Apple","watchOS",9.8,"SE",true,"red");

        System.out.println("El celular que tengo es un " + A23);
        System.out.println("El reloj que tengo es un " + AppleSE);
    }
}
