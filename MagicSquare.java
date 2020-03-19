package magicsquare;
import java.io.*;
public class MagicSquare {
    public static boolean again = true;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        while(again == true){
        System.out.println("Enter a odd number: ");
        
        int n  = Integer.parseInt(br.readLine());
   
   
     
        for (int[] row : magicSquareOdd(n)) {
            for (int x : row)
                System.out.format("%2s ", x);
            System.out.println();
        }
        
        if(n % 2 != 0 && n != 1){
        System.out.printf("\nSum is: %d \n", (n * n + 1) * n / 2);
        }
        
        
            System.out.println("Try Again?\n"
                    + "[1] Yes\n"
                    + "[2] No\n");
            
            int choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                    again = true;
                    break;
                case 2:
                    System.out.println("Have a nice day!");
                    again = false;
                    break;
                default:
                    break;
            }
        
       
        }
    }

        
    
    

 
    static int[][] magicSquareOdd(int base) {
       
        if (base % 2 == 0 || base < 3){
            System.out.println("ERROR : Must be odd number");
            System.out.println("Retrying ...");
            base = 0;
            again = true;
        }
 
        int[][] grid = new int[base][base];
        int r = 0, number = 0;
        int size = base * base;
 
        int c = base / 2;
        while (number++ < size) {
            grid[r][c] = number;
            if (r == 0) {
                if (c == base - 1) {
                    r++;
                } else {
                    r = base - 1;
                    c++;
                }
            } else {
                if (c == base - 1) {
                    r--;
                    c = 0;
                } else {
                    if (grid[r - 1][c + 1] == 0) {
                        r--;
                        c++;
                    } else {
                        r++;
                    }
                }
            }
        }
        return grid;
    }
    
}