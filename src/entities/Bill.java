package entities;

public class Bill {
    public Character gender;
    public Integer beer;
    public Integer barbecue;
    public Integer softDrink;

    public double feeding(){
        Double valorCerveja = 5.0;
        Double valorRefrigerante = 3.0;
        Double valorChurrasco = 7.0;

        Double consumoTotal = valorCerveja * this.beer + valorRefrigerante * this.softDrink + valorChurrasco * this.barbecue;

        return consumoTotal;
    }

    public double cover(){
        return feeding() > 30.0 ? 0.0 : 4.0;
    }

    public double ticket(){
        return this.gender == 'M' ? 10.0 : 8.0;
    }

    public double total(){
        Double total = feeding() + cover() + ticket();

        return total;
    }


}
