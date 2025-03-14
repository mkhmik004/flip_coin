package za.co.wethinkcode.examples.coinflip;
import java.util.Random;
public class MultipleCoinFlips {
    public static void main(String[] args) {
        int flips = 1;
        if (args.length==1){
            flips=Integer.parseInt(args[0]);
        }
        Random RabObject = new Random();
        for (int i=0;i<flips;i++){
            if (RabObject.nextInt(2)==0) {
            System.out.println("Round:"+(i+1)+"Heads" );
            }
            else{
                System.out.println("Round:"+(i+1)+"Tails");
            }
        }
    }
}
