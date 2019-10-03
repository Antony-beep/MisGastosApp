package com.Cristobal.misgastosapp.modelo;

public class Contabilidad {
    private double monto;
    private String tipo;
    private String metodo;

    public Contabilidad(double monto, String tipo, String metodo) {
        this.monto = monto;
        this.tipo = tipo;
        this.metodo = metodo;
    }

    public Contabilidad() {
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "Contabilidad{" +
                "monto=" + monto +
                ", tipo='" + tipo + '\'' +
                ", metodo='" + metodo + '\'' +
                '}';
    }
}
