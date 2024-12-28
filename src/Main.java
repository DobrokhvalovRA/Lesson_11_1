public class Main {
    public static void main(String[] args) {
        int i, count_Cat = 10;

        Bow bow1 = new Bow(500);
        bow1.fill_Bow(100);

        Cat[] cat = new Cat[count_Cat];
        for (i = 0; i < count_Cat; i++) {
            cat[i] = new Cat("Мурзя" + i);
            cat[i].eat(bow1);
            if (cat[i].satiety == false)
                System.out.println(cat[i].name + " - остался голодным !");
            else
                System.out.println(cat[i].name + " - наелся от пуза !");
        }


        cat[1].show_Name();
        cat[1].animal_Run(110);
        cat[1].animal_Swim(100);


        Dog dog1 = new Dog("Фина");
        dog1.show_Name();
        dog1.animal_Run(1000);
        dog1.animal_Swim(250);

        cat[1].show_Count_Animal();
        cat[1].show_Count_Cat();
        dog1.show_Count_Dog();
    }
}