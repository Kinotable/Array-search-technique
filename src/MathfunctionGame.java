import java.util.Scanner;

public class MathfunctionGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("try to guess the number");
        int count = 0;
        double numberDeci = Math.random() *100;
        int number = (int)Math.ceil(numberDeci);
        boolean correct = false;
        while (correct==false){
            System.out.println("guess the number");
            int guess = s.nextInt();
            if(number==guess){
                System.out.println("tht correct the number was, "+ number+" you got it in " +count+ " tries ");
                break;
            }
            else if (number<guess) {
                System.out.println("your number is too big");
                count += 1;
            }
            else if (number>guess) {
                System.out.println("your number is too small");
                count += 1;
            }
            
        }
    }
}
