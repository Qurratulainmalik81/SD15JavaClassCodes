class ExceptionDemo {
      public static void main(String args[]){
        int age = -1;
        try{
          if(age < 0)
         throw new MyOwnException("Age can't be less than zero");
      else
         System.out.println("Input is valid!!");}
    catch (MyOwnException e) {
            System.out.println(e.getMessage());
       }

  }
}