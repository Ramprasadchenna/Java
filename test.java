//ternaryoperator
public class test
{
public static void main(String[] args)
{
int a,b;
a=20;
b=(a==1)?45:23;
System.out.println("value of b is:"+b);
b=(a==10)?45:23;
System.out.println("value of b is:"+b);
int x=10;
int y=20;
x=y++;
System.out.println(x);
System.out.println(y);
int num=7;
if (num<7)
{
System.out.println("number is above 7");
}
else if(num==7)
{
System.out.println("number equal to 7");
}
else
{
System.out.println("number is below 7");
}
}
}