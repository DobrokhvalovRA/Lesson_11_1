public class Main {
    public static void main(String[] args) {
        int i, count_Cat = 10;

        Bow bow1 = new Bow(100); //Создаем миску
        bow1.fillBow(100); // Наполняем миску

        // Создаем много котов
        Cat[] cat = new Cat[count_Cat];
        for (i = 0; i < count_Cat; i++) {
            cat[i] = new Cat("Мурзя" + i);
            cat[i].eat(bow1); //кормим котов
            if (!cat[i].satiety) // смотрим сытый или нет
                System.out.println(cat[i].name + " - остался голодным !");
            else
                System.out.println(cat[i].name + " - наелся от пуза !");
        }


        cat[1].showName();
        cat[1].animalRun(110);
        cat[1].animalSwim(100);


        Dog dog1 = new Dog("Фина");
        dog1.showName();
        dog1.animalRun(1000);
        dog1.animalSwim(250);

        cat[1].showCountAnimal();
        cat[1].showCountCat();
        dog1.showCountDog();
    }
}