package anonymusClassesAndEnums.task2;

enum Animals {
    DOG(2){
        @Override
        public int getAge() {
            return this.age;
        }

        @Override
        public String getYears() {
            return "years";
        }
    },
    CAT(3){
        @Override
        public int getAge() {
            return this.age;
        }

        @Override
        public String getYears() {
            return "month";
        }
    },

    FLAMINGO(4){
        @Override
        public int getAge() {
            return this.age;
        }

        @Override
        public String getYears() {
            return "years";
        }
    },

    ELEPHANT(10){
        @Override
        public int getAge() {
            return super.getAge();
        }

        @Override
        public String getYears() {
            return "years";
        }
    };
    int age;

    Animals(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "Animal: " + super.toString() + "\n" + "Age: " + getAge()+ " " + getYears();
    }

    public abstract String getYears();
}
