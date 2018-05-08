package javaapplication71;

public class Konto {

    private int saldo = 0;

    public int setSaldo(int i) {

        if (i > 0) {

            saldo = i;

        }
        return saldo;

    }
    
    public int inSæt(int i){
     if(i>0){
     saldo += i;
         
     }
     return saldo;
        
    }

}
