import java.util.ArrayList;
import java.util.List;

import package2.*;
import package2.package21.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Person2 person2;

        int a = 5;
//        List<String> strings = new ArrayList<>();
//        while (true) {
//            strings.add(new String("fsdfd"));
//        }
        String b = "szxfd", c = "dsfdg";
        b = c;// = "dsfdg"
        c = null;
        System.gc();
        Thread.sleep(10000);
        Runtime.getRuntime().gc();
//        b = String.valueOf(a);

    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("finalize");
    }

    public static void test(int a) {

    }
}
