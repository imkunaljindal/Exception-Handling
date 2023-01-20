public class Main {
    public static void main(String[] args) {

//        System.out.println("A");
//        int i = 10;
//        int j = 0;
//
//        try{
//          int k = i/j;
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("B");
//        }
//        finally{
//            System.out.println("E");
//        }

//          try{
//             fun(10);
//          }
//          catch (UnderAgeException e){
//              System.out.println(e.getMessage());
//          }
        try{
           fun(5);
        }
        catch (Exception e){
            System.out.println("This is an exception");
        }

    }

    public static void fun(int age){

       if(age<18){
           throw new RuntimeException("Message");
       }
    }

    public static class UnderAgeException extends Exception{
        public UnderAgeException(String message){
            super(message);
        }
    }
  }