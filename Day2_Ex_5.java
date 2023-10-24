package demo;



import static java.lang.System.out;
import java.util.Scanner;

class A
{
private int num;
private static int nim=70;

A(int num)
{
this.num=num;
}

public void setNum(int k)
{
num=k;
}
public int getNum()
{
return num;
}

public static int getNim()
{
return nim;
}
}

class B
{
private int num;
private static int nim=87;

B()
{

}

public void setNum(int k)
{
num=k;
}
public int getNum()
{
return num;
}

public static int getNim()
{
return nim;
}
}


class C
{
private int num,n;
private static int nim=90;

C(int num,int n)
{
this.num=num;
this.n=n;
}

public void setNum(int k ,int u)
{
num=k;
n=u;
}
public int getNum()
{
return n;
}

public static int getNim()
{
return nim;
}
}



public class Day2_Ex_5
{
public static void main(String[] args)
{
A ob=new A(10);
System.out.println(ob.getNum());


B ob1=new B();
ob1.setNum(20);
System.out.println(ob1.getNum());

C ob2=new C(10,20);
System.out.println(ob2.getNum());


System.out.println(ob2.getNim());
System.out.println(ob.getNim());
System.out.println(ob1.getNim());

}
}