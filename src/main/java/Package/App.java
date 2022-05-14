package Package;

import java.io.IOException;
import java.util.ArrayList;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	dataDriven excel = new dataDriven();
    	
    	ArrayList<String> data = excel.getData("Login");
    	
        System.out.println( data.get(0));
        System.out.println( data.get(1));
        System.out.println( data.get(2));
    }
}
