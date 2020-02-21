class GFG 
{ 
public static void main(String args[])  
{   
int a= 5, b = 10, c = 15, max;     
max = (a > b) ?(a > c ? a : c) :(b > c ? b : c); 
System.out.println("Largest number among " + a +", " + b + " and " + c + " is " + max + ". " );  
}  
} 