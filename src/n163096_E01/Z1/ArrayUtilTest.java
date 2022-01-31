package n163096_E01.Z1;

import java.time.LocalTime;
import java.lang.Character;

public class ArrayUtilTest {
    public static void main(String[] args) {
        LocalTime[] tab1 = {LocalTime.of(5,20, 4), LocalTime.of(6,14,2), LocalTime.of(1,15,7), LocalTime.of(6,14,2)};
        System.out.println(ArrayUtil.removeRepeatedElements(tab1));

        Character[] tab2 = {'a','b','c','d','b','e'};
        System.out.println(ArrayUtil.removeRepeatedElements(tab2));
    }
}
