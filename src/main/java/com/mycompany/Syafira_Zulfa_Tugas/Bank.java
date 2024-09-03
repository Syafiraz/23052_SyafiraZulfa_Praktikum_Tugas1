/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Syafira_Zulfa_Tugas;

/**
 *
 * @author Auriga
 */
public class Bank {
    private int saldo;

    public Bank(int saldo) {
        this.saldo = saldo;
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;
        System.out.println("Simpan uang: Rp. " + jumlah);
        System.out.println("Saldo saat ini: Rp. " + saldo);
        System.out.println();
    }

    public void ambilUang(int jumlah) {
        saldo -= jumlah;
        System.out.println("Ambil uang: Rp. " + jumlah);
        System.out.println("Saldo saat ini: Rp. " + saldo);
        System.out.println();
    }

    public int getSaldo() {
        return saldo;
    }
}
