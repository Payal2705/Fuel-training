 class substring
  {
  public static void main(String[]args)
  {
   String s1="xHix";
   if(s1.charAt(0)=='x')
   {
   s1=s1.substring(1,s1.length());
   }
   if(s1.charAt(s1.length()-1)=='x');
   {
   s1=s1.substring(0,s1.length()-1);
   }
   System.out.println(s1);
   }
   }

