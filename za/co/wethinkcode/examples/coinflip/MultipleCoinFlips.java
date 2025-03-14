package za.co.wethinkcode.examples.coinflip;
import java.util.Random;
public class MultipleCoinFlips {
    public static void main(String[] args) {
        int flips = 1;
        if (args.length==1){
            try {
                flips = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException e){
                System.out.println("Invalid number of arguments, the error is "+e.getMessage());
                return;
            }
        }
        Random RabObject = new Random();
        int tail_counter =0;
        int head_counter =0;
        for (int i=0;i<flips;i++){
            if (RabObject.nextInt(2)==0) {
                head_counter++;
            System.out.println("Round:"+(i+1)+"Heads" );
            }
            else{
                System.out.println("Round:"+(i+1)+"Tails");
                tail_counter++;
            }

        }
        System.out.println("Tails: "+tail_counter +" and Heads: "+head_counter );
    }
}
