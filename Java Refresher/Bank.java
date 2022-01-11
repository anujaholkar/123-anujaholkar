class Bank{
int getRateOfInterest(){
return 0;
}

class SBI extends Bank{
int getRateOfInterest(){
return 8;
}

class ICICIextends Bank{
int getRateOfInterest(){
return 7;
}

class Test2{
public static void main(String args[]){
SBI s=new SBI();
ICICI i=new ICICI();

System.out.println("SBI Rate of Interest: "+s.int getRateOfInterest());
System.out.println("ICICI Rate of Interest: "+i.int getRateOfInterest());
}
}
}