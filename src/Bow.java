public class Bow {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    // Количество еды
    public Bow(int count) {
        this.count = count;
    }

    // Наполнение миски
    public void fillBow(int count) {
        if (count >= 0)
            this.count = this.count + count;
        else
            System.out.println("Вы правда хотите забрать еду у этих бедных животных ?");
    }
}
