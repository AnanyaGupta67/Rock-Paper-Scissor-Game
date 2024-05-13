import java.util.Random;
import java.util.*;

class Puzzle {
public static void main(String []args)
{
String []name={"Stone","Paper","Scissor"};
String str1="Stone";
String str2="Paper";
String str3="Scissor";
Random random=new Random();
System.out.println("Player-1:- Enter your turn");
Scanner sc=new Scanner(System.in);
String turn=sc.nextLine();

System.out.println("Player-2:- Enter your turn\n" + name[random.nextInt(name.length)]);
if(str1.equals(turn))
{
   switch(name[random.nextInt(name.length)])
   {
   case "Stone":
   System.out.println("0 points");
   break;
   case "Paper":
   System.out.println("player 2 won");
   break;
   case "Scissor":
   System.out.println("player 1  won");
   break;
   default:
    System.out.println("invalid");

   }
}
else if(str2.equals(turn))
{
   switch(name[random.nextInt(name.length)])
   {
   case "Stone":
   System.out.println("player 1 won");
   break;
   case "Paper":
   System.out.println("0 points");
   break;
   case "Scissor":
   System.out.println("player 2 won");
   break;
   default:
    System.out.println("invalid");

   }
}
else if(str3.equals(turn))
{
   switch(name[random.nextInt(name.length)])
   {
   case "Stone":
   System.out.println("player 2  won");
   break;
   case "Paper":
   System.out.println("player 1 won");
   break;
   case "Scissor":
   System.out.println("0 points");
   break;
   default:
    System.out.println("invalid");

   }
}
}
}

