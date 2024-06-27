import java.util.Iterator;
import java.util.Random;

public class MyIterator implements Iterator<Integer> {
    //    Randoms randoms;
    int min, max;
    Random random;

    public MyIterator(Integer min, Integer max) {
        this.min = min;
        this.max = max;
        random = new Random();// добавлен

    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
//        this.randoms = new Randoms(this.min, this.max);

//        return this.randoms.numbers;
        return min + random.nextInt(max + 1 - min);
    }
}
