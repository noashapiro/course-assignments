public class ErrorHandling {
    public static void main(String[] args) {
        int number = 0;
        try{
            System.out.println(10/number);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("bad math");
        }finally{
            System.out.println("Will always run...");
        }
        System.out.println("This will be printed, because we handled the exception!");
    }
}
