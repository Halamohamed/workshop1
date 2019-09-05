package se.ceutbildning.hala;

import java.util.UUID;

public class BankAccount {
    private String id;
    private double saldo;
    private Customer kund;

    public BankAccount(double saldo, Customer kund) {
        this.id= UUID.randomUUID().toString();
        this.saldo = saldo;
        this.kund = kund;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Customer getKund() {
        return kund;
    }

    public void setKund(Customer kund) {
        this.kund = kund;
    }

    public double deposit(double belopp){
        if (belopp >0 ) {
            this.saldo += belopp;
            return saldo;
        }
        return -1;

    }

    public double withdraw(double belopp){
        if (belopp < saldo && belopp < 5000 ) {
            this.saldo -= belopp;
            return saldo;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id='" + id + '\'' +
                ", saldo=" + saldo +
                ", kund=" + kund +
                '}';
    }
}
