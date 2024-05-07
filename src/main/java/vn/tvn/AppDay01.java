package vn.tvn;

import vn.tvn.java_basic.DemoDebug;
import vn.tvn.java_basic.objects.sub_object.DemoImportPackage;

/**
 * Hello world!
 *
 */
public class AppDay01
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Huyen Nguyen" );
        System.out.println( "30 tuoi" );
        System.out.println( "Ngô Gia Tự" );
        String mess = formatString ("han han");
        System.out.println(mess);
        DemoDebug demoDebug = new DemoDebug();
        String alert = demoDebug.otherFunction();
        System.out.println(alert);

        // Import Package
        DemoImportPackage demoImportPackage = new DemoImportPackage();
        demoImportPackage.importMethodDemo();

    }
    public static String formatString(String name){
        String text = "Welcome to HCM, %s";
        return String.format(text, name);
    }

}
