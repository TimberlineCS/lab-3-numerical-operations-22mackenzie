/*Mackenzie Butler 
Computer science 
9/22/2020*/

public class numbers{
 public static void main (String args[]){
   //challenge 1
   System.out.println("");
   System.out.println("challenge 1");
   double d1 = 37.9;
double d2 = 1004.128;
int i1 = 12;
int i2 = 18;
//predicted 39
System.out.println(57.2 * (i1 / i2) + 1);
//predicted 39.133333333
System.out.println(57.2 * ((double)i1 / i2) + 1);
//predicted -1345.4
System.out.println(15 - i1* (d1*3) + 4);
//predicted -1345
System.out.println(15 - i1*((int)d1*3) + 4	);

//challenge 2
System.out.println("");
System.out.println("challenge 2");
int number1 = 1234;

 int number1a= number1%10;
 int main1 = number1/10;
 int number1b = main1%10;
 int main2 = number1/100;
 int number1c = main2%10;
 int main3 = number1/1000;
 System.out.print(number1a);
System.out.print(number1b);
System.out.print(number1c);
System.out.println(main3);


int number2 = 6789;

 int number2a= number2%10;
 int main1a = number2/10;
 int number2b = main1a%10;
 int main2a = number2/100;
 int number2c = main2a%10;
 int main3a = number2/1000;

 System.out.print(number2a);
 System.out.print(number2b);
 System.out.print(number2c);
  System.out.println(main3a);


int number3 = 1080;

 int number3a= number3%10;
 int main1b = number3/10;
 int number3b = main1b%10;
 int main2b = number3/100;
 int number3c = main2b%10;
 int main3b = number3/1000;
System.out.print(number3a);
System.out.print(number3b);
System.out.print(number3c);
System.out.print(main3b);

 }
}
