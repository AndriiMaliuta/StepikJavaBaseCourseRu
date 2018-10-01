package stepik.basic.course;

import java.math.BigInteger;

public class BigInteger1 {
    public static BigInteger factorial(int value) {

        BigInteger factorial = BigInteger.valueOf(1);

        for (int i = 1; i <= value; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));

    return factorial;
    }
}
