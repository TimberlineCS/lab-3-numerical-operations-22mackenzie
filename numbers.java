/*Mackenzie Butler 
Computer science 
9/22/2020*/

public class numbers{
 public static void main (String args[]){
   //challenge 1
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
String number1 = "1234";
String number1a = number1.substring(0,1);
String number1b = number1.substring(1,2);
String number1c = number1.substring(2,3);
String number1d = number1.substring(3,4);
String final1= number1d+number1c+number1b+number1a;
System.out.println(final1);

String number2 = "6789";
String number2a = number2.substring(0,1);
String number2b = number2.substring(1,2);
String number2c = number2.substring(2,3);
String number2d = number2.substring(3,4);
String final2= number2d+number2c+number2b+number2a;
System.out.println(final2);

String number3 = "1080";
String number3a = number3.substring(0,1);
String number3b = number3.substring(1,2);
String number3c = number3.substring(2,3);
String number3d = number3.substring(3,4);
String final3= number3d+number3c+number3b+number3a;
System.out.println(final3);

 }
}
