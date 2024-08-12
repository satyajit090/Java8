package LamdaExpression;
@FunctionalInterface
interface  Interf
{
    public void m1();
}
public class Exmp {
    public static void main(String[] args) {
        Interf i=()-> System.out.println("Satyajit");
        i.m1();
    }
}
