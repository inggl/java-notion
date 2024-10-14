import java.util.Date;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        /*
         * Variables
         * */
        {
            byte $ = 1;
            int € = 1;
            int £ = 1;
            //byte _ = 1; // Doesn't compile
            byte b_ = 1;
            byte _b = 1;

            //byte case = 1; //Doesn't compile. Reserved keyword.
            var var = 1; // var is not reserved keyword

            //var x; // Doesn't compile.
            //var x=5, y = 6; // Doesn't compile.

            int a;
            //System.out.println(a); // Doesn't compile. Local variable must be initialized before usage.
        }

        /*
         * Packages
         * */
        {
            Date date = new Date(); // java.util.Date

            // Conflicts
            // import java.sql.Date;
            // To resolve use wildcard import java.sql.*;

        }

        /*
         * Data types
         * */
        {
            boolean bool = false;
            // boolean bool = 0; // Doesn't compile

            byte b = 100;
            //byte b1 = 300; // Doesn't compile

            short s = 100;

            int i = 100;
            //int i = 100L; // Doesn't compile!
            int i1 = 1_000_000;
            int i2 = 1____0;
            //int i = _10; // Doesn't compile!
            //int i = 10_; // Doesn't compile!

            long l = 100L; // 100.0l
            long l1 = 100; // Promoting int to long
            //long l2 = 2983746129; // Doesn't compile!
            long l2 = 2983746129L;

            float f = 100.0F; // 100.0f
            // float f = 100.0; // Doesn't compile!
            double d = 100.0; // 100.0
            double d1 = 1_0_0.0;
            //double d = 100_.0; // Doesn't compile!
            //double d = 100._0; // Doesn't compile!

            char c = 'A';
            System.out.println("char c = 'A'");
            System.out.println(c); // A

            char c1 = 65;
            System.out.println("char c1 = 65");
            System.out.println(c1); // A

            char c2 = '\u0061';
            System.out.println("char c2 = '\\u0061'");
            System.out.println(c2); // a
        }

        /*
         * Operators
         * */
        {
            // instanceof
            System.out.println("null instanceof String");
            System.out.println(null instanceof String); // always false!

            //System.out.println((new Object()) instanceof null); // Doesn't compile
        }

        /*
         * String
         * */
        {
            // String Pool
            String s1 = "aBcd";
            String s2 = "aBcd";
            System.out.printf("""
                    s1: %s
                    s2: %s
                    """, s1, s2);

            System.out.println("s1 == s2");
            System.out.println(s1 == s2); // true

            System.out.println("s1.equals(s2)");
            System.out.println(s1.equals(s2)); // true

            // String reference
            String s3 = new String("b");
            String s4 = new String("b");
            System.out.printf("""
                    s3: %s
                    s4: %s
                    """, s3, s4);

            System.out.println("s3 == s4");
            System.out.println(s3 == s4); // false

            System.out.println("s3.equals(s4)");
            System.out.println(s3.equals(s4)); // true

            // Methods
            System.out.println("s1.toLowerCase()");
            System.out.println(s1.toLowerCase()); // abcd

            System.out.println("s1.toUpperCase()");
            System.out.println(s1.toUpperCase()); // ABCD

            System.out.println("s1.charAt(0)");
            System.out.println(s1.charAt(0)); // a

            System.out.println("s1.charAt(1)");
            System.out.println(s1.charAt(1)); // B

            System.out.println("s1.charAt(5)");
            System.out.println("StringIndexOutOfBoundsException"); // StringIndexOutOfBoundsException
        }

        /*
         * StringBuilder
         * */
        {
            StringBuilder sb = new StringBuilder();

            sb.append(1);
            System.out.println("sb.append(1)");
            System.out.println(sb); // 1

            sb.insert(0, 2);
            System.out.println("sb.insert(0, 2)");
            System.out.println(sb); // 21

            System.out.println("new StringBuilder().insert(0, 1)");
            System.out.println(new StringBuilder().insert(0, 1)); // 1
        }

        /*
         * Array
         * */
        {

        }
    }
}
