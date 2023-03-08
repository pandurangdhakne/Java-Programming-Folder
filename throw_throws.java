import java.util.Scanner;



class DecideForVote extends Exception
{
    DecideForVote(String str)
    {
        System.out.println(str);
    }
}

public class throw_throws {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of candidet:- ");
        int age_count = sc.nextInt();

        try {
            vote(age_count);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }

    }

    static void vote(int age) throws DecideForVote
    {
        if(age < 18)
        {
            throw new DecideForVote("Not eligiable for voting");
        }
        else
        {
            System.out.println("you are eligiable for voting");
        }
    }
    

}
