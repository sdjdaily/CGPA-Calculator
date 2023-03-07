import java.util.*;

class cgpa {
    public static void main(String[] args) {
        int noOfSubjects;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of subjects: ");
        noOfSubjects = sc.nextInt();

        double gp;
        int cr;

        int totalCR = 0;
        double totalGP = 0;

        for(int i = 0; i < noOfSubjects; i++){
            System.out.println("Enter Grade Points for subject " + (i + 1) + " : ");
            gp = sc.nextDouble();

            System.out.println("Enter Credit Score: ");
            cr = sc.nextInt();
            
            totalGP += gp * cr;
            totalCR += cr;  
        }

        System.out.println("GPA: " + (totalGP/totalCR));

        sc.close();
    }
}
