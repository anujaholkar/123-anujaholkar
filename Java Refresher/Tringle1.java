public  class Tringle1{
public static void main(String args[]){

int i, j, row=6;
for(i=0;i<row;i++){
for(j=2*(row-1);j>=0;j--){
System.out.println(" ");
}
for(j=0;j<=i;j++){
System.out.println("*");
}
System.out.println();
}
}
}