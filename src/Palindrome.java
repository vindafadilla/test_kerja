
public class Palindrome {
	static int countSwap(String str)
    {
 
        // Panjang string
        int n = str.length();
 
        //Convert ke array
        char s[] = str.toCharArray();
 
        int count = 0;
 
        // Loop 
        for (int i = 0; i < n / 2; i++) {
 
            int left = i;
 
            int right = n - left - 1;
 
            // loop dari pointer kanan ke pointer kiri
            while (left < right) {
 
                // Jika sama berhenti, jika berbeda geser lagi
                if (s[left] == s[right]) {
                    break;
                }
                else {
                    right--;
                }
            }

            if (left == right) {
                return -1;
            }
            else if (s[left] != s[n - left - 1]) {
                char temp = s[right];
                s[right] = s[n - left - 1];
                s[n - left - 1] = temp;
                count++;
            }
        }
 
        return count;
    }
	
    public static void main(String[] args)
    {
        String s = "abcde";
        int ans1 = countSwap(s);
        System.out.println(ans1);
    }

}
