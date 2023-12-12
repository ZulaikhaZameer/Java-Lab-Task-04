import java.util.Scanner;
public class ArrayOperation {
    public static int smallestElement(int[] arr){
        int smallest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static int largestElement(int[] arr){
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        ArrayOperation arrOp = new ArrayOperation();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        int smallest = arrOp.smallestElement(arr);
        int largest = arrOp.largestElement(arr);

        System.out.println("Smallest Element is : "+ smallest);
        System.out.println("Largest Element is : "+ largest);

        sc.close();
    }
}
