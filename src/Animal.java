public abstract class Animal {
    protected String name;
    protected boolean satiety;
    private static int countAnimal;

    //Считаем животных
    public Animal() {
        countAnimal++;
    }

    public Animal(String name, boolean satiety) {
        this();
        this.name = name;
        this.satiety = satiety;
    }


    public void showName() {
        System.out.println("\n" + name);
    }

    public void showCountAnimal() {
        System.out.println("Всего создали :" + countAnimal + " животных!");
    }

    abstract void animalRun(int distance);

    abstract void animalSwim(int distance);
}
