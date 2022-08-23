package anonymusClassesAndEnums.additionalTask;

enum Vehicles {
    MERCEDES(12000, "Black") {
        @Override
        public String getCurrency() {
            return "$";
        }
    },

    PORSCHE(40000, "White") {
        @Override
        public String getCurrency() {
            return "euros";
        }
    };

    int price;
    String color;

    public int getPrice(){
        return price;
    }

    public String getColor(){
        return color;
    }

    public abstract String getCurrency();

    Vehicles(int price, String color){
        this.price = price;
        this.color = color;
    }

    public String toString(){
        return "Car: " + super.toString() + "\n" + "Color: " + getColor() + "\n" + "Price: " + getPrice() + " " + getCurrency();
    }


}

