package n163096_E01.Z2;

import java.math.BigInteger;
import java.util.*;

public class Z2 {
    public static void main(String[] args) {
        ArrayList<String> t1 = new ArrayList<>();
        t1.add("a");
        t1.add("b");
        t1.add("c");
        t1.add("h");
        t1.add("j");
        printWithSemicolon(t1);
        System.out.println();

        PriorityQueue<Integer> t2 = new PriorityQueue<>();
        t2.add(2);
        t2.add(7);
        t2.add(0);
        t2.add(15);
        printWithSemicolon(t2);
        System.out.println();

        LinkedList<Double> t3 = new LinkedList<>();
        t3.add(10.5);
        t3.add(233.6);
        t3.add(12.543);
        t3.add(0.23);
        t3.add(11.0);
        t3.add(99.999);
        printWithSemicolon(t3);
        System.out.println();

        HashSet<BigInteger> t4 = new HashSet<>();
        t4.add(BigInteger.valueOf(2444));
        t4.add(BigInteger.valueOf(1999));
        t4.add(BigInteger.valueOf(2012));
        t4.add(BigInteger.valueOf(2022));
        t4.add(BigInteger.valueOf(2019));
        printWithSemicolon(t4);
    }


    public static <T, E extends Iterable> void printWithSemicolon(E obj)
    {
        Iterator<E> iter = obj.iterator();
        while (iter.hasNext())
        {
            System.out.print(iter.next() + "; ");
        }
    }
}
