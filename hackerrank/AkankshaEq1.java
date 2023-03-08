public class AkankshaEq1 {
    
 // Function to find the count
 static int findCount(String str1, String str2)
 {
     int len = str1.length();
     int len2 = str2.length();
     int ans = Integer.MAX_VALUE;
  
     // Initialize hash for both strings
     int [] hash1 = new int[26];
     int [] hash2 = new int[26];
  
     // hash the frequency of letters of str1
     for (int i = 0; i < len; i++)
         hash1[(int)(str1.charAt(i) - 'a')]++;
  
     // hash the frequency of letters of str2
     for (int i = 0; i < len2; i++)
         hash2[(int)(str2.charAt(i) - 'a')]++;
  
     // Find the count of str2 constructed from str1
     for (int i = 0; i < 26; i++)
         if (hash2[i] != 0)
             ans = Math.min(ans, hash1[i] / hash2[i]);
  
     // Return answer
     return ans;
 }
  
 // Driver code
 public static void main(String []args)
 {
     String str1 = "abcABCdgcabcabc";
     String str2 = "ABCabc";
     System.out.println(findCount(str1, str2));
 }
    

}
