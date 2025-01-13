public class Dog extends Animal {
    private static int countDog;

    //Считаем собак
    public Dog(String name) {
        super(name, false);
        countDog++;
    }

    //Бежим
    void animalRun(int distance) {
        if (distance <= 0)
            System.out.println("Вы ввели не корректное значение!");
        else if (distance <= 500)
            System.out.println("Собака - " + name + " пробежала: " + distance + "м.");
        else System.out.println("Собака - " + name + " не может пробежать так много!");
    }

    //Плывем
    void animalSwim(int distance) {
        if (distance <= 0)
            System.out.println("Вы ввели не корректное значение!");
        else if (distance <= 10)
            System.out.println("Собака - " + name + " проплыла: " + distance + "м.");
        else System.out.println("Собака - " + name + " не может проплыть так много!");
    }

    //Смотрим сколько собак
    void showCountDog() {
        System.out.println("Всего создали :" + countDog + " собак!");
    }

}
