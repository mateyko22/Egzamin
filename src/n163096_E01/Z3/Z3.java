package n163096_E01.Z3;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Z3 {
    public static void main(String[] args) {
        System.out.println(with("src\\n163096_E01\\Z1", ".java"));
    }

    public static List<String> with (String dir, String ex)
    {
        File f = new File(dir);
        return Arrays.stream(f.list(((dir1, name) -> name.endsWith(ex)))).toList();
    }
}
