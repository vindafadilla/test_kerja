
public class PermutasiString {
    static void printPermutasiString(String str, String temp)
    {
  
        // Jika string kosong
        if (str.length() == 0) {
  
            // print ans
            System.out.print(temp + " ");
            return;
        }
  
        boolean alpha[] = new boolean[26];
  
        for (int i = 0; i < str.length(); i++) {
  
            char ch = str.charAt(i);
  
           String ros = str.substring(0, i) + 
                         str.substring(i + 1);
  
            if (alpha[ch - 'a'] == false)
                printPermutasiString(ros, temp + ch);
            alpha[ch - 'a'] = true;
        }
    }
    
    public static void main(String[] args)
    {
        String s = "aba";
        printPermutasiString(s, "");
    }

}
