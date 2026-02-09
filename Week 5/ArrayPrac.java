
public class ArrayPrac{
public static void main(String[] args) {
    int array1[] = new int[10];
    int array2[] = {21,32,3,4,5,6,7,8,9,10};

    //Largest(array2);
    search(array2,201);

   // Arrays.sort(array2);
//     int flag = 0;
//     System.out.println("Flag in main 1 " + flag);//0
// //    System.out.println("Array 2 before increment :");
//    for(int i = 0;i<array2.length;i++)
//              System.out.print(array2[i]+" ");

    // sumAvg(array2);
    // Increment(array2, flag);
    // System.out.println("Flag in main 2 " + flag);
//       System.out.println("\nArray 2:");
//    for(int i = 0;i<array2.length;i++)
//         System.out.print(array2[i]+" ");

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter 10 Integers");
    // for(int i = 0;i<array1.length;i++)
    //     array1[i] = sc.nextInt();

    //  System.out.println("Array 1:");
    // for(int i = 0;i<array1.length;i++)
    //      System.out.println(array1[i]*array1[i]);

   // SqCu(array2);

}
public static void sumAvg(int arr[])
{
    int sum = 0;
    double Average = 0.0;

    for(int i = 0;i<arr.length;i++)
        sum = sum + arr[i];
    System.out.println("Sum = " + sum);
    Average = (double) sum/(double) arr.length;
    System.out.println("Average = " + Average);
}
public static void Increment(int arr[], int fg)
{
     System.out.println("Method Flag 1 " + fg);//0
     fg = 100;
     System.out.println("Method Flag 2 " + fg);//100
//  for(int i = 0;i<arr.length;i++)
//     arr[i] = arr[i]+1;
// System.out.println("\nArray in method after increment:");

//  for(int i = 0;i<arr.length;i++)
//     System.out.print(arr[i]+" ");
}

public static void SqCu(int arr[])
{
    int square[] = new int[arr.length];
       int cube[] = new int[arr.length];
    for(int i = 0;i<arr.length;i++)
    {
        square[i] = arr[i]*arr[i];
        cube[i] = arr[i]*arr[i]*arr[i];
    }
     System.out.println("Array\t\tSquare\t\tCubes");
     for (int i = 0; i < arr.length; i++)
     System.out.println(arr[i]+"\t\t"+square[i]+"\t\t"+cube[i]);

}

//Java Method that finds largest element present in an integer array.
// It must also print the location or index at which maximum element occurs in array.

public static void Largest(int array1[])
{
    //{21,32,3,4,5,6,7,8,9,10};
    int largest = 0;
    int index = 0;
    // Arrays.sort(array1);
    // largest = array1[9];
    // System.out.println("Largest Element " + largest);
for(int i = 0;i<array1.length;i++)
            if(array1[i]>largest)
            {
                largest = array1[i];
                index = i;
            }
    System.out.println("Largest Element " + largest + " is at index = " + index);
}

public static void search(int array[], int number)
{
    for(int i = 0;i<array.length;i++)
    {
             //   System.out.println("" + i);

            if(array[i]==number)
            {
                System.out.println("Found");
                 break;
            }
     }
}
}