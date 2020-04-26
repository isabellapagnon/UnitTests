package com.UnitTest;

import java.lang.Throwable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaMagicaTest {

    @Test
    public void silver_Com_0_Saldo(){
        ContaMagica c = new ContaMagica();
        c.deposito(0);
        assertEquals(c.getStatus(), 0);
    }

    @Test
    public void silver_Com_50000_Saldo(){
        ContaMagica c = new ContaMagica();
        c.deposito(50000);
        assertEquals(c.getStatus(), 0);
    }

    @Test
    public void deposito_Silver_Para_Gold_50001_Saldo(){
        ContaMagica c = new ContaMagica();
        c.deposito(50001);
        assertEquals(c.getStatus(), 1);
    }

    @Test
    public void deposito_Silver_Para_Gold_200000_Saldo(){
        ContaMagica c = new ContaMagica();
        c.deposito(200000);
        assertEquals(c.getStatus(), 1);
    }

    @Test
    public void deposito_Gold_Para_Platinium_200001_Saldo(){
        ContaMagica c = new ContaMagica();
        c.deposito(200001);
        assertEquals(c.getStatus(), 2);
    }

    @Test
    public void deposito_Gold_Para_Platinium_1000000_Saldo(){
        ContaMagica c = new ContaMagica();
        c.deposito(1000000);
        assertEquals(c.getStatus(), 2);
    }

    @Test
    public void retirada_Platinium_para_Gold_99999_Saldo() {
        ContaMagica c = new ContaMagica();
        c.deposito(200001);
        c.retirada(100002);
        assertEquals(c.getStatus(), 1);
    }

    @Test
    public void retirada_Platinium_para_Gold_24999_Saldo() {
        ContaMagica c = new ContaMagica();
        c.deposito(200001);
        c.retirada(175002);
        assertEquals(c.getStatus(), 1);
    }

    @Test
    public void retirada_Gold_para_Silver_24999_Saldo(){
        ContaMagica c = new ContaMagica();
        c.deposito(50001);
        c.retirada(25002);
        assertEquals(c.getStatus(), 0);
    }


    @Test
    public void saldoInsuficiente(){
        ContaMagica c = new ContaMagica();
        c.deposito(6000);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {c.retirada(10000);
          });

    }

    @Test
    public void DepositoNegativo(){
        ContaMagica c = new ContaMagica();
        Assertions.assertThrows(IllegalArgumentException.class, () -> { c.deposito(-150);
          });

    }
    @Test
    public void RetiradaNegativa(){
        ContaMagica c = new ContaMagica();
        Assertions.assertThrows(IllegalArgumentException.class, () -> { c.retirada(-150);
        });

    }
 }
