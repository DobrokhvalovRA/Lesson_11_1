public class Cat extends Animal {
    private static int countCat;

    //Считаем сколько котов
    public Cat(String name) {
        super(name, false);
        countCat++;
    }

    // Бежим
    void animalRun(int distance) {
        if (distance < 0)
            System.out.println("Вы ввели не корректное значение!");
        else if (distance < 100)
            System.out.println("Кот - " + name + " пробежал: " + distance + "м.");
        else System.out.println("Кот - " + name + " не может пробежать так много!");
    }

    //Плывем
    void animalSwim(int distance) {
        System.out.println("Кот - " + name + " не умеет плавать ! ");

    }

    //Смотрим сколько котом
    void showCountCat() {

        System.out.println("Всего создали :" + countCat + " котов!");
    }

    //Едим, для сытости кот должен съесть 100 гр.
    void eat(Bow bow) {
        int count = bow.getCount();
        if (count < 100)
            satiety = false;
        else {
            count = count - 100;
            bow.setCount(count);
            satiety = true;
        }
    }
}
