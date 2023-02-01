import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    protected Random random = new Random();

    public MagicBox(int SIZE) {
        this.items = (T[]) new Object[SIZE];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {

            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        int empty = 0;
        for (T i : items) {
            if (i == null) {
                empty++;
            }
        }
        if (empty > 0) {
            throw new RuntimeException("Коробка не полна,есть свободные ячейки, осталось заполнить ещё " + empty);
        }
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }
}