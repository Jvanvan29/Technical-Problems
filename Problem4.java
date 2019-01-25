import java.util.*;

//Hacker Rank!!!

class Problem4{
  int amIDoneYet = 0;
  public void func(int a, int b, int c, int d){
    rec(a,b,c,d);
    if(amIDoneYet == 1){
      System.out.println("Fuck ya");
    }else{

    }
  }

  public void rec(int a, int b, int c, int d) {
    if((a > c) || (b > d)){ //We know its too far gone
      return;
    }
    if((a == c) && (b == d)){ //We Finsihed!!!
      amIDoneYet = 1;
      return;
    }
    rec(a+b, b, c, d);
    rec(a, b+a, c, d);
  }
}
