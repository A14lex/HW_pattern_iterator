import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int numbers;
    int min;
    int max;


    public Randoms(int min, int max) {
        this.random = new Random();
        //...
        this.numbers = min + random.nextInt(max + 1 - min);
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(this.min, this.max);


    }


}