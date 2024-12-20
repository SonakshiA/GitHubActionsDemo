public class MathTest {
    public static void main(String[] args) {
        int result  = 2+2;
        if(result==4){
            System.out.println("Test passed: 2 + 2 = 4");
        }else{
            System.err.println("Test failed: 2 + 2 != 4");
            System.exit(1); // Exit with error code for CI to catch
        }
    }
}
