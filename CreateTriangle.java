package part1;

public class CreateTriangle {
    public static void main (String [] args){
        //Looping bersarang

        for(int i =0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print("* ");
                if (i==j){
                    break;
                } else if ((i+j)==9){
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}