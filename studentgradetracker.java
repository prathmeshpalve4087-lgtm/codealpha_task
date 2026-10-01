import java.util.Scanner;

public class studentgradetracker {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println(" Enter total no.of Students : ");
        int n = input.nextInt();
        String[] names = new String[n];
        int [] marks = new int[n];

        int total = 0;
        int highest = 0;
        int lowest = 100;

        for (int i = 0; i < n ; i++) {
            System.out.println("Enter names of Student :" + (i+1) + ":");
            names[i] = input.next();
             
            System.out.println(" Enter marks : " );
            marks[i] = input.nextInt();

            total = total + marks[i];
             
            if (marks[i] >= highest) {
                highest = marks[i] ;
                }

                if (marks[i] <= lowest) {
                   lowest = marks[i] ;
                }
        } 
        //students dtails
        System.out.println("___student grade reports___");

         for( int i = 0; i < n ; i ++ ){
            char grade ;

            if (marks[i] >= 90) {
                grade = 'A';
            }
         else if (marks[i] >= 80) {
                       grade = 'B' ; }
           else if (marks[i] >= 70) {
            grade = 'c';
           }
           else if ( marks[i] >= 60) {
            grade = 'd';
           }
           else if (marks[i] >= 50){
            grade = 'e';
           }
           else { grade = 'f'; }

           System.out.println(names[i] + "- marks : " + marks[i] + "- grade" + grade);

           double average = (double) total / n ;
           

           System.out.println("____ class reports____");
           System.out.println("Total marks : " + total);
           System.out.println("Average marks : " + average);
           System.out.println("Highest marks : " + highest);
           System.out.println("Lowest marks : " + lowest);
        }
           input.close();

    }
    
}
