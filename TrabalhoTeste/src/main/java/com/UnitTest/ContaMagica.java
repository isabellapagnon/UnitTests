package com.UnitTest;
public class ContaMagica {
    public static final int SILVER = 0;
    public static final int GOLD = 1;
    public static final int PLATINUM = 2;
    double saldo;
    int status;
    
    double getSaldo(){
        return saldo;
    }
	
    int getStatus(){
        if (saldo <= 50000){
            status = SILVER;
        }
        if (saldo > 50000 && saldo < 200000){
            status = GOLD;
        }
        if (saldo > 200000){
            status = PLATINUM;
        }
        return status;
    }
	
    void deposito(int valor) {
        if (valor < 0) {
            //throws INVALID_OPER_EXCEPTION
            System.out.println("Valor inválido!");  
        }
        else {
            saldo = saldo + valor;
        }
        
    }

    void retirada(int valor) {
        if (valor < 0) {
            //throws INVALID_OPER_EXCEPTION
            System.out.println("Valor inválido!");  
        }
        else {
            saldo = saldo - valor;
        }

    }
}
