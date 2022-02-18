package JavaTest.test1;
/*
 @saphrena
 @2022/2/8 008
 @Demo
*/

import java.io.*;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.text");
        if(file.isFile()) {
            BufferedReader br = new BufferedReader(new FileReader("text.text"));
            HashSet<String> hs = new HashSet<>();
            FileInputStream fs = new FileInputStream(file);
            InputStreamReader InputStreamReader = new InputStreamReader(fs);
            BufferedReader bufferedReader = new BufferedReader(InputStreamReader);
            hs.add(String.valueOf(file));
            for (String h : hs) {
                System.out.println(h);

            }

            }
        }
    }


