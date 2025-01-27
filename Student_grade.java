import java.util.*;
class grade{
     
    public static void main (String args[]){
        Scanner sc=new Scanner (System.in);
        int n=5;
        int sub[]=new int[n];
        System.out.println("enter markks out of 100 for DM ,LDCO,DSA,BCN respectively");
        for(int i=0;i<n;i++){
            System.out.println("enter marks");
            sub[i]=sc.nextInt();
        }
        
        int total =0;
        for(int i=0;i<n;i++){
            total=total+sub[i];
        }
        
        System.out.println("Total of marks is : "+total);
        
        int average=(total/n);
        System.out.println("average percentage : "+average);
        
        if(average>90 && average<=100 ){
            System.out.println("you got A+ grade");
        }
        if(average>80 && average<=90 ){
            System.out.println("you got A grade");
        }
        if(average>70 && average<=80 ){
            System.out.println("you got B grade");
        }
        if(average>60 && average<=70 ){
            System.out.println("you got C grade");
        }
        if(average>50 && average<=60 ){
            System.out.println("you got D grade");
        }
        if(average>40 && average<=35 ){
            System.out.println("you got E  grade");
        }
        if(average<35) {
            System.out.println("you are fail");
        }
    }
}
