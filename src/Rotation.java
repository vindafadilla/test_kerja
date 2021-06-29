
public class Rotation {
	static void rotasiKiri(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            rotasiKiriperSatuKali(arr, n);
    }
 
    static void rotasiKiriperSatuKali(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }
    
	public static void main(String[] args)
    {		
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotasiKiri(arr, 2, 7);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}
