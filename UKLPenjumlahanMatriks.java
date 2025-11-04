import java.util.Scanner;

public class UKLPenjumlahanMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Penjumlahan Dua Matriks ---");
        System.out.print("Masukkan jumlah baris (m): ");
        int m = input.nextInt();
        System.out.print("Masukkan jumlah kolom (n): ");
        int n = input.nextInt();
        
        int[][] matriksA = new int[m][n];
        int[][] matriksB = new int[m][n];
        int[][] matriksHasil = new int[m][n];
        
        System.out.println("\n--- Masukkan Elemen Matriks A ---");
        masukkanElemenMatriks(input, matriksA, m, n, "A");
        
        System.out.println("\n--- Masukkan Elemen Matriks B ---");
        masukkanElemenMatriks(input, matriksB, m, n, "B");
        
        input.close();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriksHasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
        
        System.out.println("\n==================================");
        System.out.println("     HASIL PENJUMLAHAN MATRIKS");
        System.out.println("==================================");
        
        System.out.println("Matriks A:");
        tampilkanMatriks(matriksA, m, n);
        
        System.out.println("\nMatriks B:");
        tampilkanMatriks(matriksB, m, n);
        
        System.out.println("\nMatriks A + B:");
        tampilkanMatriks(matriksHasil, m, n);
    }
    
    public static void masukkanElemenMatriks(Scanner scanner, int[][] matriks, int baris, int kolom, String nama) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.printf("Elemen %s[%d][%d]: ", nama, i, j);
                matriks[i][j] = scanner.nextInt();
            }
        }
    }

    
    public static void tampilkanMatriks(int[][] matriks, int baris, int kolom) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                
                System.out.print(matriks[i][j] + "\t"); 
            }
            System.out.println(); 
        }
    }
}