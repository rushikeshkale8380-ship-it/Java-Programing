import java.util.*;                                  //import package Scanner Class Come From this Package
class input                                          //class 
{
    public static void main(String A[])
    {
        Scanner sobj=new Scanner(System.in);         //Create Object Of Scanner CLass

        String sName=null;                          //Declare String sName
        int iAge=0;                                 //Declare Integer VAriable iAge
        float fMarks=0.0f;                          //Declare Float Variable fMarks

        System.out.println("Enter Your Name:");    //Display On Console 
        sName=sobj.nextLine();                     //Accept String sName

        System.out.println("Enter Your Age:");     
        iAge=sobj.nextInt();                      //Accept integer iAge

        System.out.println("Enter your Marks:");
        fMarks=sobj.nextFloat();                  //Accept Float fMarks

        System.out.println("Name:"+sName);       //Display Name on Console
        System.out.println("Age:"+iAge);         //Display Age on Console
        System.out.println("Marks:"+fMarks);     //Display Marks On Console

    }
}
