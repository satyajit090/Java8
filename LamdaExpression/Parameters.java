package LamdaExpression;
@FunctionalInterface
interface Interfa{
    public void add1(int a,int b);
}
public class Parameters {
    public static void main(String[] args) {
        Interfa i=(a,b)-> System.out.println("the sum is"+ (a+b));
        i.add1(10,30);
    }
}
