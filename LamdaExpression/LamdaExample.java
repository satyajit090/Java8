package LamdaExpression;

import java.util.function.Function;

public class LamdaExample {

    public static void main(String[] args) {
        Function<Integer,Integer> f=i->i*i;
        System.out.println(f.apply(8));
    }
}
