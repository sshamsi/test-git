package com.practice.misc;
import java.util.*;

public class Ransom {
    Map<String, Integer> magazineMap;
    String[] noteWords;
    
    public Ransom(String magazine, String note) {
        String[] magazineWords = magazine.split(" ");
        noteWords = note.split(" ");
        magazineMap = new HashMap<String, Integer>();
        for(int i=0 ; i<magazineWords.length; i++){
            if(magazineMap.containsKey(magazineWords[i])){
                magazineMap.put(magazineWords[i], magazineMap.get(magazineWords[i])+1);
            }
            else{
                magazineMap.put(magazineWords[i], 1);
            }
        }
    }
    
    public boolean solve() {
        
        for(int i=0; i<noteWords.length;i++){
            if(magazineMap.containsKey(noteWords[i])){
                if(magazineMap.get(noteWords[i])<=0){
                    return false;
                }
                else{
                   magazineMap.put(noteWords[i], magazineMap.get(noteWords[i])-1); 
                }
            }
        }
        return true;
       
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        Ransom s = new Ransom(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
