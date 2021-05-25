import java.util.*;
class AlphabetB{
public static void main(String[] args){
int i,j,n=8;
for(i=0;i<=n;i++){
for(j=0;j<=n/2;j++){

if(j==0 || (j==4 && (i!=0 && i!=4 && i!=n)) ||(i==0 || i==4 || i==n) && (j>0 && j<4))
System.out.print("*");
else
System.out.print(" ");

}
System.out.println();
}
}
}