class Main {
  public static void main(String[] args) {
    
    int a,b;
    for(a=1;a<6;a++)
    {
      for(b=0;b<5;b++)
      {
      if(b<(5-a)) 
      {
      System.out.print(" "); 
      }
        else 
      {
        System.out.print("*");
      }
      }
       System.out.println();
    }

    
  }
}