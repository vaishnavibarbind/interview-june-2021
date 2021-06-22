package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
   int[] bNum=new int[32];
    int i=0;
    String strnum="";
    while(n>0){
      bNum[i]=n%2;
      n=n/2;
      i++;
    }
    for(int j=i-1;j>=0;j--){
      String xText = bNum[j] + "";
      strnum=strnum+xtext;
    }
    return strnum;
    
  }
}
