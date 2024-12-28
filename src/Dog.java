public class Dog extends Animal {
    private static int count_Dog;

    //Считаем собак
    public Dog(String name) {
        super(name, false);
        count_Dog++;
    }

    //Бежим
    void animal_Run(int distance) {
        if (distance <= 0)
            System.out.println("Вы ввели не корректное значение!");
        else if (distance > 0 & distance <= 500)
            System.out.println("Собака - " + name + " пробежала: " + distance + "м.");
        else System.out.println("Собака - " + name + " не может пробежать так много!");
    }

    //Плывем
    void animal_Swim(int distance) {
        if (distance <= 0)
            System.out.println("Вы ввели не корректное значение!");
        else if (distance > 0 & distance <= 10)
            System.out.println("Собака - " + name + " проплыла: " + distance + "м.");
        else System.out.println("Собака - " + name + " не может проплыть так много!");
    }

    //Смотрим сколько собак
    void show_Count_Dog() {
        System.out.println("Всего создали :" + count_Dog + " собак!");
    }

}
