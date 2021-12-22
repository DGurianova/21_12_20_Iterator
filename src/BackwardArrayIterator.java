import java.util.Iterator;


public class BackwardArrayIterator implements Iterator<Integer> {

    private final int[] array;
    private int currentIndex;

    public BackwardArrayIterator(int[] array) {
        this.array = array;
        currentIndex = array.length - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public Integer next() {
        int res = array[currentIndex];
        currentIndex--;
        return res;
    }


}


