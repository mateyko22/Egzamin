package n163096_E01.Z1;

import java.util.ArrayList;

public class ArrayUtil {
    public static <T extends Comparable<T>> ArrayList<T> removeRepeatedElements(T[] tab)
    {
        ArrayList<T> noRepeated = new ArrayList<>();
        ArrayList<T> All = new ArrayList<>();
        for (int i=0; i<tab.length; i++)
        {
            if (!noRepeated.contains(tab[i]))
                noRepeated.add(tab[i]);
        }


        return noRepeated;
    }
}
