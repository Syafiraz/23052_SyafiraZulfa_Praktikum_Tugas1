/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Syafira_Zulfa_Tugas;

/**
 *
 * @author Auriga
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank bankABC = new Bank(100000);

        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini: Rp. " + bankABC.getSaldo());
        System.out.println();

        bankABC.simpanUang(500000);

        bankABC.ambilUang(150000);
    }
}

