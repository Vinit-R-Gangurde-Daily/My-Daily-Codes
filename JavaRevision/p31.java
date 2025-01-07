import java.io.*;
import java.util.*;

class Solution {
    public static List<Integer> frequency(String s) {
        int[] freq = new int[26];
        int i = 0;
        int len = s.length();
        
        while (i < len) {
            int num;
            int count = 1;
            
            // Parsing the number with or without '#'
            if (i + 2 < len && s.charAt(i + 2) == '#') {
                num = Integer.parseInt(s.substring(i, i + 2)) - 1;
                i += 3;
            } else {
                num = s.charAt(i++) - '1';
            }
            
            // Parsing the count in parentheses
            if (i < len && s.charAt(i) == '(') {
                int j = s.indexOf(')', i);
                if (j == -1) {
                    throw new IllegalArgumentException("Malformed input: missing closing parenthesis.");
                }
                count = Integer.parseInt(s.substring(i + 1, j));
                i = j + 1;
            }
            
            freq[num] += count;
        }
        
        List<Integer> result = new ArrayList<>(26);
        for (int f : freq) {
            result.add(f);
        }
        
        return result;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = bufferedReader.readLine();
        
        try {
            List<Integer> result = frequency(s);
            
            for (Integer count : result) {
                bufferedWriter.write(count.toString());
                bufferedWriter.newLine();
            }
        } catch (IllegalArgumentException e) {
            bufferedWriter.write("Error: " + e.getMessage());
        } finally {
            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
