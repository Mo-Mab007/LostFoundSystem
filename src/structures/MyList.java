/*
 * Campus Lost and Found System
 *
 * OWNER: Mohamed. Shared class - do NOT edit. Ask Mohamed if you need a change.
 */
package structures;

/**
 * Our own simple growable list (backed by a plain array). Use it whenever a method
 * must return "many" things. Do NOT use java.util.ArrayList or LinkedList.
 */
public class MyList<T> {
    private Object[] data = new Object[10];
    private int size = 0;

    public void add(T value) {
        if (size == data.length) {
            Object[] bigger = new Object[data.length * 2];
            for (int i = 0; i < size; i++) bigger[i] = data[i];
            data = bigger;
        }
        data[size++] = value;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    public void set(int index, T value) {
        checkIndex(index);
        data[index] = value;
    }

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index " + index + ", size " + size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            if (i > 0) sb.append(", ");
            sb.append(data[i]);
        }
        return sb.append("]").toString();
    }
}
