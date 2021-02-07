
import java.math.BigInteger;


public class Extra_Long_Factorials {
     static void extraLongFactorials(int n) {
BigInteger f = new BigInteger("1");

int temp=n;
for (int i=0; i<temp; i++){
    f=f.multiply(BigInteger.valueOf(n)); 
    n--;
}System.out.println(f);

    }
}
