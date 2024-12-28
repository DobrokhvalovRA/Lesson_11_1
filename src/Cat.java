public class Cat extends Animal {
    private static int count_Cat;

    public Cat(String name) {
        super(name, false);
        count_Cat++;
    }

    void animal_Run(int distance) {
        if (distance < 0)
            System.out.println("Вы ввели не корректное значение!");
        else if (distance > 0 & distance < 100)
            System.out.println("Кот - " + name + " пробежал: " + distance + "м.");
        else System.out.println("Кот - " + name + " не может пробежать так много!");
    }

    void animal_Swim(int distance) {
        System.out.println("Кот - " + name + " не умеет плавать ! ");
    }

    void show_Count_Cat() {
        System.out.println("Всего создали :" + count_Cat + " котов!");
    }

    void eat(Bow bow) {
        if (bow.count < 100)
            satiety = false;
        else {
            bow.count = bow.count - 100;
            satiety = true;
        }
    }
}
