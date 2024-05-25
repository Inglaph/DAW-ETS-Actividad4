/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deposito.cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria simple. Proporciona métodos
 * para consultar y modificar el saldo de la cuenta.
 *
 * @author Inglap
 * @version 1.0
 * @since 2023
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros para inicializar la cuenta.
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return El saldo actual.
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     * 
     * @param cantidad La cantidad a retirar.
     */
    public void retirar(double cantidad) {
        try {
            System.out.println("Retiro en cuenta:" + cantidad);
            if (cantidad <= 0) {
                throw new Exception("No se puede retirar una cantidad negativa");
            }
            if (estado() < cantidad) {
                throw new Exception("No se hay suficiente saldo");
            }
            setSaldo(getSaldo() - cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * 
     * @param cantidad La cantidad a ingresar.
     */
    public void ingresar(double cantidad) {
        try {
            System.out.println("Ingreso en cuenta:" + cantidad);
            if (cantidad < 0) {
                throw new Exception("No se puede ingresar una cantidad negativa");
            }
            setSaldo(getSaldo() + cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Método principal para probar la clase CCuenta.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        operaciones(cuenta1);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }
    
    
    /**
     * Realiza operaciones de ingreso y retiro en la cuenta.
     * 
     * @param cuenta1 La cuenta en la que se realizan las operaciones.
     */
    private static void operaciones(CCuenta cuenta1) {
        // Operaciones de ingreso y retiro
        cuenta1.retirar(2300);
        cuenta1.ingresar(685);
        cuenta1.ingresar(7000);
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre El nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     * 
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param cuenta El número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo El saldo a establecer.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return El tipo de interés.
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

     /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInteres El tipo de interés a establecer.
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
