import java.util.*;
class AlphabetF{
public static void main(String[] args){
int i,j,n=8;
for(i=0;i<=n;i++){
for(j=0;j<=n/2;j++){

if(i==0 || i==4 || j==0)
System.out.print("*");
else
System.out.print(" ");

}
System.out.println();
}
}
}
