class ExceptionDemo {
  public static void EmployAge(int age) throws MyOwnException
  {
    if(age < 0)
         throw new MyOwnException("Age can't be less than zero");
      else
         System.out.println("Input is valid!!");

  }
      public static void main(String args[]){
        int age = -1;
        try{
          EmployAge(age);
        }
    catch (MyOwnException e) {
            System.out.println(e.getMessage());
       }

  }
}