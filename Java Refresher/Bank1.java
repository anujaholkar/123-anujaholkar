

public interface Bank1 {
float rateOfInterest();
}
class SBI implements Bank1{
public float rateOfInterest() {
return 9.5f;
}
}
class BOI extends SBI implements Bank1{
public float rateOfInterest() {
return 7.0f;
}
}
class TestInterface{
public static void main(String[] args) {
Bank1 b = new SBI();
System.out.println("ROI:"+b. rateOfInterest());
}
}




