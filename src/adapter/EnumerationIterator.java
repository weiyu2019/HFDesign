package adapter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

public class EnumerationIterator implements Iterator {
    Enumeration enumeration;
    public EnumerationIterator(Enumeration e) {
        this.enumeration = e;
    }
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

//    @Override
//    public void forEachRemaining(Consumer action) {
//        Iterator.super.forEachRemaining(action);
//    }
}
