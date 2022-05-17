import java.util.Scanner;

public class Main {
    public static void main (String []args){
        int[] films = new int[10];
        films[0] = 12;
        films[1] = 9;
        Scanner sc = new Scanner(System.in);

        for(int i=2; i<10; i++){
            System.out.print("The number of movies with superhero num." +(i+1)+ " is ");
            films [i] = sc.nextInt();
        }
        int totalMovies = 0;
        for( int num : films){
            totalMovies += num;
        }

        System.out.println("The total number of movies with all superheroes " + totalMovies);

        int min = films [0];
        for (int i=1; i<10; i++){
            if (films[i]<min){
                min = films[i];
            }
        }
        System.out.println("The smallest filmography consists of " + min +" movie(s).");
        sc.close();
    }
}