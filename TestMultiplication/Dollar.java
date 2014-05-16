<<<<<<< HEAD
public class Dollar {
    public Dollar(int amount) {
        this.amount= amount;
    }

    public void times(int multiplier) {
        amount= amount * multiplier;
    }

    public int amount;
}
=======
public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {        
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object){
        Dollar dollar=(Dollar)object;
        return amount==dollar.amount;
    }
    private int amount;
}

class Money{
    
}


class France extends Money {
    public France(int amount) {
        this.amount = amount;
    }

    public France times(int multiplier) {        
        return new France(amount * multiplier);
    }

    public boolean equals(Object object){
        France france=(France)object;
        return amount==france.amount;
    }
    private int amount;
}
>>>>>>> ec7466880218603d78c9cc2e81b63039d13bdc39
