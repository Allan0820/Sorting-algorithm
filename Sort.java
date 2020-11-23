import java.text.ParseException;
import java.util.concurrent.TimeUnit;
class Sort
{
  public static void main(String argh[])
  {
  long endTime=0;
  long startTime=0;
  String args[]=new String[1000];
  for(int ini=0;ini<1000;ini++)
  {
 if(ini%2==0)
 {
 args[ini]=String.valueOf((999-ini));
  }
  else
  {
 args[ini]=String.valueOf((ini));
  }
 
  }
 /* feeding random values of data to the program i.e 1,999,2,998....*/
 
 
  startTime = System.nanoTime();
      String MasterArray[]=new String[1000];/*Setting the array to which
                                     the elements to be sorted are matched*/
 
 for(int i=0;i<1000;i++)
 MasterArray[i]="i";/*Initializing the array(In this case we have initilized the array with numbers till 1000
                            since the dataset taken is from 1-1000 else we could run one pass throught the program to
 find the max and min values and initialize MasterArray accordingly*/
int temp=0;
 for(int j=0;j<args.length;j++)
 {
        temp=Integer.parseInt(args[j]);/*here temp denotes the value of the jth
                               element of the argument array which is
then matched
                                        to the index of the master array*/
        MasterArray[temp]="RED";/*The value is flagged as RED*/
}
for (int k=0;k<1000;k++)/*The flagged elements are printed in ascending order*/
{
        if(MasterArray[k]=="RED")

System.out.print(k+",");
 
}
 endTime = System.nanoTime();
 long durationInNano = (endTime - startTime);  
   System.out.print("the timetaken is"+durationInNano);
}

}     
