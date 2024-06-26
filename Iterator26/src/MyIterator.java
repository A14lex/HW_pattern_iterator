import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {
    Randoms randoms;
    int min, max;

    public MyIterator(Integer min, Integer max) {
        this.min = min;
        this.max = max;

    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        this.randoms = new Randoms(this.min, this.max);

        return this.randoms.numbers;
    }
}
