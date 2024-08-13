import java.util.Scanner;

public class Main {
    public static int N;
    public static int[][] grid;
    public static int n = 3;
    public static int[][] box = new int [n][n];

    public static int diff;

    public static int getNum(int rowS, int colS, int rowE, int colE){
        int num = 0;

        for(int row = rowS; row <= rowE; row++){
            for(int col = colS; col <=colE; col++){
                num += grid[row][col];
            }
        }
        return num;
    }
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int maxNum = 0;
        
        N = scanner.nextInt();
        grid = new int[N][N];
        diff = N - n;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                grid[i][j] = scanner.nextInt();
            }
        }
        for(int row = 0; row <= diff; row++){
            for(int col = 0; col <= diff; col++){
                int num = getNum(row, col, row + n - 1, col + n - 1);
                maxNum = Math.max(maxNum, num);
            }
        }
        System.out.print(maxNum);
    }
}