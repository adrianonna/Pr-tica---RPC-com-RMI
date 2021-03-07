package com.gugawag.rpc.banco;

import java.io.Serializable;

public class Conta implements Serializable {
    public String numero;
    public Double saldo;

    public Conta() {}

    public Conta(String numero) {
        this.numero = numero;
    }

    public Conta(String numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
}