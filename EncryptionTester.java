import static org.junit.Assert.*;
import org.junit.Test;


import static org.junit.Assert.*;
import org.junit.Test;
public class EncryptionTester
{
    @Test
   public static void testAdd0(){
        
        String result = Encryption.moveLeft("abcd",1);
        assertEquals("dabc",result);   
    }
    // 10 הבדיקות הראשונות הם שלי
    @Test
   public static void testAdd1(){
        
        String result = Encryption.moveLeft("agcd",1);
        assertEquals("dagc",result);   
    }
    @Test
   public static void testAdd2(){
        
        String result = Encryption.moveLeft("yghwy",1);
        assertEquals("yyghw",result);   
    }
    @Test
   public static void testAdd3(){
        
        String result = Encryption.moveLeft("abcd efgh",2);
        assertEquals("ghabcd ef",result);   
    }
    @Test
   public static void testAdd4(){
        
        String result = Encryption.moveLeft("abcd efgh ijkl",3);
        assertEquals("i efgh jklabcd",result);   
    }
    
}
