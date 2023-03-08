

public class CalculateThePowerOfTheDigit {
    
    static double answer;

    static double calculatePower(int n, int m)
    {

        if(m == 0)
        {
            return 1;
        }

         answer = n * calculatePower(n, m-1);
        
        return answer;
    }


    public static void main(String[] args) {
        
    //   System.out.println(Math.sqrt(4));


    System.out.println(calculatePower(3,4));
        

    }



}


















