public class Cust{
static void PrintMsg(String name){
System.out.println("Hello"+name);
}
static void PrintValue(int val){
System.out.println(val);
}
public static void main(String args[]){
consumer<String>con1 = Cust::printMsg;
consumer1.accept("anuja");
Consumer<Integer>con2 = ConsumerInterface;
consumer2.accept(12);
}
}