/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class BankBeraksi {
     public static void main(String[] args) {
        // TODO code application logic here
        BANK saldo = new BANK (350000);
        saldo.getsaldo();
        saldo.simpanUang(1000000);
        saldo.ambilUang(1300000);
}
}