import java.util.Scanner;
public class PosNegAvg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter numbers to find sum of positive and negative integers");
        int num[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Input: ");
            num[i] = sc.nextInt();
        }

        int pos_sum = 0;
        int neg_sum = 0;
        int pos_count = 0;
        int neg_count = 0;


        for(int i=0; i<size; i++){
            if(num[i]>0){
                pos_sum = pos_sum + num[i];
                pos_count = pos_count + 1;
            }
            else if(num[i]<0){
                neg_sum = neg_sum + num[i];
                neg_count = neg_count + 1;
            }
        }
        System.out.println("Average of positive integers is: "+ (pos_sum / pos_count) );
        System.out.println("Average of negative integers is: "+ (neg_sum / neg_count) );
        
        sc.close();
    }

}