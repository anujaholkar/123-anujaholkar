public class Customer2{

String name;
int password;

void purchase(){
System.out.println("bying something");
}
class Customer extends Customer2{

void purchase(){
System.out.println("nothing bye");
}
}

public static void main(String args[]){
Customer c = New Customer();
c.purchase();
}
}