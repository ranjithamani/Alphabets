import java.util.*;
class AlphabetQ{
public static void main(String[] args){
int i,j,n=8;


for(i=0;i<=n;i++){
	
for(j=0;j<=5;j++){
if(((j==0 || j==4)&& (i>0 && i<6)) || 
((i==0 || i==6)&& (j>0 && j<4)) || (i==5 && j==1) || (i==7 && j==3))
	
System.out.print("*");
	
else
System.out.print(" ");

}
System.out.println();
}
}
}
