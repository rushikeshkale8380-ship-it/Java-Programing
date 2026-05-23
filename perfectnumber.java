//Perfect Number
import java.util.Scanner;                             //It is Scanner class library it is use to take Input
class NumberX                                         //Class 
{
    public boolean CheckPerfect(int iNo)              //Function Chech number perfecct or not
    {
        int iCnt=0;                                   //Declare iCnt Variable for loop counter
        int iSum=0;                                   //Declare iSum  Variable to Store sum
        for(iCnt=1;iCnt <= (iNo/2);iCnt++)      
        {
            if((iNo%iCnt)==0)                        //It is Check icnt is Factor of iNo
            {
              iSum=iSum+iCnt;                        //Store the sum of factor
            }
        }
        if(iSum==iNo)                                //Check sum is equal to number
        {
            return true;  
        }
        else
        {
            return false;
        }
    }
}
class perfectnumber                                  //Class name is perfectnumber
{

    public static void main(String A[])              //Main
    {
        Scanner sobj=new Scanner(System.in);         //Create Object of Scanner class name is sobj

        int iValue=0;                                //Declare iValue variable for input from user
        boolean bRet=false;                          //Declare Variable bRet to store return result

        System.out.println("Enter nummber:");        //Show Enter number on console
        iValue=sobj.nextInt();                       //get integer input from user
        
        NumberX nobj=new NumberX();                  //Create object nobj of class NumberX
        bRet=nobj.CheckPerfect(iValue);              //call function Checkperfect to check number is perfect or not

        if(bRet==true)                               //if number is perfect thenn bRet is true 
        {
            System.out.println("It Is Perfect");     //bRet are true print It is Perfect on screen 
        }
        else 
        {
            System.out.println("It Is Not Perfect");  //Othrwise print It is Not Perfect
        }


    }
} 

//Time Complexity:O(N/2)
//Where N>=0
