import java.util.Scanner;
import java.util.Random;

public class Main{
    //static final Scanner sc = new Scanner(System.in);
    static void inoutRand (int[][] x, int n1, int m1){
        Random rand = new Random();
        for (int i=0;i<n1; i++){
            for (int j=0; j<m1; j++){
                x[i][j]=rand.nextInt(59);
                System.out.print(x[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    static void inoutUser (int[][] x, int n1, int m1, Scanner sc){
        //Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Enter results:");
        for (int i=0;i<n1; i++){
            for (int j=0; j<m1; j++){
                temp =sc.nextInt();
                x[i][j] = temp;
            }
            System.out.print("\n");
        }
        //sc.close();;
    }

    static int win (int[][] x, int n, int m){
        int sum;
        int[] personalResult = new int[m];
        for (int i=0; i<n; i++){
            sum = 0;
            for(int j=0; j<m; j++){
                sum+=x[i][j];
            }
            personalResult[i] = sum;
            System.out.printf("Total score of %d player = %d\n", i+1, sum);
        }
        
        int imax = 0;
        int max = 0;
        for (int i=0; i<n; i++)
            {
                if (max<personalResult[i]){
                    max = personalResult[i];
                    imax=i+1;
                }
            }
            System.out.println("The winner is player "+imax+" with the score of "+max+"\n");
            return max;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, m;
        //n=3; m=4;
        System.out.print("Enter number of players: ");
        n = sc.nextInt();
        System.out.print("Enter number of attempts: ");
        m = sc.nextInt();
        
        int[][] x = new int[n][m];
        int[][] y = new int[n][m];  
        int[][] z = new int[n][m];  
        
        System.out.println("First team results\n");
        //inoutRand(x, n, m);
        inoutUser(x, n, m, sc);
        int first_win = win(x, n, m);

        System.out.println("Second team results\n");
        inoutRand(y, n, m);
        //inoutUser(y,n,m, sc);
        int second_win = win(y, n, m);

        System.out.println("Third team results\n");
        inoutRand(z, n, m);
        //inoutUser(z,n,m,sc);
        sc.close();
        int third_win = win(z, n, m);
        int max, num;
        if (first_win>second_win && first_win>third_win){
            max = first_win;
            num = 1;
        }else if (second_win>third_win){
            max = second_win;
            num = 2;
        }else{
            max = third_win;
            num = 3;
        }
        System.out.printf("\nThe best result was shown by player of the team %d with a score of %d.\n",num, max);
    }
}