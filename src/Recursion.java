
public class Recursion {
	/*
	 * Berdasarkan source code yang ada, terjadi recursion yang artinya method tersebut dipanggil secara kontinyu oleh method itu sendiri
	 * Method akan terus dipanggil selama var b belum 0, dan selama belum 0, var b akan diisi oleh sisa bagi var a dibagi var b, 
	 * sementara var a digantikan nilai b saat itu
	 * Berikut ini method dalam java, method1 dengan recursion, method2 tanpa recursion
	*/
	
	static int method1(int a, int b) {
		System.out.println(a+", "+b);
		return (b==0)?a:method1(b, a%b);
	}
	static int method2(int a, int b) {
		int c=0;
		while(b!=0) {
			System.out.println(a+", "+b);
			c=a;
			a=b;
			b=c%b;
		}
		return a;
	}
	
	public static void main(String[] args)
    {		
        System.out.println(method2(1071, 1029));
        System.out.println(method2(5872, 120));
    }

}
