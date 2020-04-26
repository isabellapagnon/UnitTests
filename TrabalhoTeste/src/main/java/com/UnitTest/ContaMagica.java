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
        if (saldo <= 50000){
            status = SILVER;
        }
        if (saldo > 50000 && saldo <= 200000){
            status = GOLD;
        }
        if (saldo > 200000){
            status = PLATINUM;
        }
        return status;
    }
	
    void deposito(int valor) //throws INVALID_OPER_EXCEPTION 
    {
        if (valor < 0) {
            //throw new Exception();
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
    public static void main(String args[]){
        ContaMagica conta = new ContaMagica();
        System.out.println("----------------//");
        conta.deposito(25000);
        System.out.println(conta.getSaldo());
        System.out.println(conta.getStatus());
        conta.deposito(30000);
        System.out.println(conta.getSaldo());
        System.out.println(conta.getStatus());

        System.out.println("-------- FIM --------");
    }
}
