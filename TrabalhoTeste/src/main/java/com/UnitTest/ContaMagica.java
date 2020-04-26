package com.UnitTest;
public class ContaMagica {
    public static final int SILVER = 0;
    public static final int GOLD = 1;
    public static final int PLATINUM = 2;
    double saldo = 0;
    int status = SILVER;
    
    double getSaldo(){
        return saldo;
    }
	
    int getStatus(){
        return status;
    }
	
    void deposito(int valor)//throws IllegalArgumentException
    {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido!");  
        }
        else {
            saldo = saldo + valor;
        }
        if (saldo <= 50000){
            status = SILVER;
        }
        if (saldo > 50000 && saldo <= 200000){
            status = GOLD;
        }
        if (saldo > 200000){
            status = PLATINUM;
        }
        
    }

    void retirada(int valor) //throws IllegalArgumentException
     {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido!");
        }
        if (valor > saldo){
            throw new IllegalArgumentException("Valor inválido!");
        }
        else {
            saldo = saldo - valor;
        }
        if (status == PLATINUM && saldo < 100000 ){
            status = GOLD;
        }
        else if (status == GOLD && saldo < 25000 ){
            status = SILVER;
        }
        

    }
}
