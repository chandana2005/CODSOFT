import java.util.Scanner;

public class grades
{
    public static void main(String args[])
    {
    
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();

        avg = total/6;
        System.out.println("The student Grade is: ");
        if(avg>=80)
        {   System.out.println("Total marks:"+total);
            System.out.println("Percentage:"+avg);
            System.out.print("Grade: A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.println("Total marks:"+total);
           System.out.println("Percentage:"+avg);
           System.out.print("Grade: B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.println("Total marks:"+total);
            System.out.println("Percentage:"+avg);
            System.out.print("Grade: C");
        }
        else
        {
            System.out.println("Total marks:"+total);
            System.out.println("Percentage:"+avg);
            System.out.print("Grade: D");
        }
    }
}
