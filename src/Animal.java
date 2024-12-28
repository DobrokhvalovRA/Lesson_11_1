abstract public class Animal {
    protected String name;
    protected boolean satiety;
    private static int count_Animal;

    public Animal() {
        count_Animal++;
    }

    public Animal(String name, boolean satiety) {
        this();
        this.name = name;
        this.satiety = satiety;
    }


    public void show_Name() {
        System.out.println("\n" + name);
    }

    public void show_Count_Animal() {
        System.out.println("Всего создали :" + count_Animal + " животных!");
    }

    abstract void animal_Run(int distance);

    abstract void animal_Swim(int distance);
}
