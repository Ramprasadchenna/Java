package elite;
public class MyExplicitThrow {
public static void main(String[] args) {
try {
MyExplicitThrow met=new  MyExplicitThrow();
System.out.println("Length of JUNK is"+met.getStringSize("JUNK"));
System.out.println("Length of WRONG is"+met.getStringSize("WRONG"));
System.out.println("Length of null is"+met.getStringSize("null"));
}
catch(Exception ex)
{
System.out.println("Exception message."+ex.getMessage());
}
}
public int getStringSize(String str)throws Exception {
if(str==null)
{throw new Exception("null is passed");
}
return str.length();
}
}


