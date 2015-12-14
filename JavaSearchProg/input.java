@@ -0,0 +1,42 @@
import java.io.*;

public class Input{
  
  private static String str="";
  private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  private static int i=0;
  private static double d=0.0;
  
  public static String readString(){
    try{
      str=br.readLine();
    }
    catch(IOException e){
      System.out.println(e);
    }
    return str;
  }

  public static int readInt(){
    try{
      str=br.readLine();
      i=Integer.parseInt(str);
    }
    catch(IOException e){
      System.out.println(e);
    }
    return i;
  }

  public static double readDouble(){
    try{
      str=br.readLine();
      d=Double.parseDouble(str);
    }
    catch(IOException e){
      System.out.println(e);
    }
    return d;
  }
  
}
\ No newline at end of file
