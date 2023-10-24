package demo;


import static java.lang.System.out;
import java.util.Scanner;

class P
{


static
{
out.println("from A");
}
}

class F
{
static
{
out.println("from A");
}

}
class G
{
static {
out.println("from c");
}
}



public class Day2_Ex_6
{
static {
out.println("before execution");
}
public static void main(String[] args)
{
P a=new P();
}
static {
out.println("after main execution");
}

}