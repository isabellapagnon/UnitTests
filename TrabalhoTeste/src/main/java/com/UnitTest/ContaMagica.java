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
	
    void deposito(int valor)throws IllegalArgumentException {
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

    void retirada(int valor) throws IllegalArgumentException{
        if (valor < 0) {
            throw new IllegalArgumentException("Valor inválido!");
        }
        else {
            saldo = saldo - valor;
        }
        if (status == PLATINUM && saldo < 100000 ){
            status = GOLD;
        }
        if (status == GOLD && saldo < 25000 ){
            status = SILVER;
        }
        

    }
//    public static void main(String args[]){
//        ContaMagica conta = new ContaMagica();
//        System.out.println("----------------//");
//        conta.deposito(25000);
//        System.out.println(conta.getSaldo());
//        System.out.println(conta.getStatus());
//        conta.deposito(30000);
//        System.out.println(conta.getSaldo());
//        System.out.println(conta.getStatus());
//        conta.deposito(200000);
//        System.out.println(conta.getSaldo());
//        System.out.println(conta.getStatus());
//        System.out.println("----------------//");
//        conta.retirada(155001);
//        System.out.println(conta.getSaldo());
//        System.out.println(conta.getStatus());
//        conta.retirada(90000);
//        System.out.println(conta.getSaldo());
//        System.out.println(conta.getStatus());
//
//        System.out.println("-------- FIM --------");
//    }
}
