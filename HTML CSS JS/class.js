class Bus{
    constructor(price){
        this.price=price;
    }

    //construstr(price,color){
    //this.price=price;
    //this.color=color;
   //}
   display=function(){
       document.write('</br>c2 objects price is'+ this.price);
       document.write('</br>c2 objects color is'+ this.color);
   }

   setPrice=function(x){
       this.price=x
   }
   applyDiscount = function(percentage){
       this.price=this.price-(this.price*percentage/100);
   }
};

var Bus1 = new Bus();
document.write("</br>bus1 price is"+bus1);
bus1.display();
bus1.setPrice(25000);
bus1.display();
bus1.applyDiscount(50);
bus1.display();

//var bus1 = new Bus(10578);
//document.write("</br>bus1 price is"+bus1.price);

var bus2 = new Bus(10578,red);
document.write("</br>bus2 price is"+bus1.price+"and color is"+bus2.color);


class LuxuryBus extends Bus{

    constructor(price,color,withAC){
       // super(price, color);
       this.withAC = price;
       this.withAC = color;
        this.withAC = withAC;
    }
    display=function(){
        //super.display();
        //using string literal
        //var displayString=(</br>object's has AC is***${this.withAC}***);
        document.write('</br>objects price is 20000'+this.price);
        document.write('</br>objects cplor is 20000'+this.color);
        document.write('</br>objects withACis 20000'+this.withAC);
        //document.write(displayString);
    }
};

var lBus1 = new LuxuruBus(20000,"purple",true);
lBus.display();