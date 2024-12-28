public class Bow {
    public int count;

    public Bow(int count) {
        this.count = count;
    }

    public void fill_Bow(int count) {
        if (count >= 0)
            this.count = this.count + count;
        else
            System.out.println("Вы правда хотите забрать еду у этих бедных животных ?");
    }
}
