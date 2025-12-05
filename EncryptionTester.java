import static org.junit.Assert.*;
import org.junit.Test;
public class EncryptionTester
{
    @Test
   public void testAdd50(){
        
        String result = Encryption.movingLeft("dvir gever",2);
        assertEquals("gever dvir",result);  
    } 
     @Test
   public void testAdd51(){
        
        String result = Encryption.movingLeft("dvir",1);
        assertEquals("dvir",result);  
    } 
     @Test
   public void testAdd52(){
        
        String result = Encryption.movingLeft("gever",1);
        assertEquals("gever",result);  
    } 
     @Test
   public void testAdd53(){
        
        String result = Encryption.movingLeft("dvir gever retsah",3);
        assertEquals("gever retsah dvir",result);  
    } 
     @Test
   public void testAdd54(){
        
        String result = Encryption.movingLeft("moshe ran baroh",3);
        assertEquals("ran baroh moshe",result);  
    } 
       // טסטים של דביר גוטסדינר 11 עד 25
}
    @Test
   public void testAdd16(){
        
        String result = Encryption.moveRight("abcd",1);
        assertEquals("dabc",result);   
    }
    @Test
   public void testAdd17(){
        
        String result = Encryption.moveRight("agcd",1);
        assertEquals("dagc",result);   
    }
    @Test
   public void testAdd18(){
        
        String result = Encryption.moveRight("yghwy",1);
        assertEquals("yyghw",result);   
    }
    @Test
   public void testAdd19(){
        
        String result = Encryption.moveRight("abcd efgh",2);
        assertEquals("ghabcd ef",result);   
    }
    @Test
   public void testAdd20(){
        
        String result = Encryption.moveRight("abcd efgh ijkl",3);
        assertEquals("jklabcd efgh i",result);   
    }
    @Test
   public void testAdd21(){
        
        String result = Encryption.moveLeft("abcd efgh ijkl",3);
        assertEquals("d efgh ijklabc",result);  
    }
    @Test
   public void testAdd22(){
        
        String result = Encryption.moveLeft("gferg",1);
        assertEquals("fergg",result);  
    }
    @Test
   public void testAdd23(){
        
        String result = Encryption.moveLeft("macabi tel aviv",3);
        assertEquals("abi tel avivmac",result);  
    }
    @Test
   public void testAdd24(){
        
        String result = Encryption.moveLeft("messi goat",2);
        assertEquals("ssi goatme",result);  
    }
    @Test
   public void testAdd25(){
        
        String result = Encryption.moveLeft("stern",1);
        assertEquals("terns",result);  
    } 
    // טסטים של שטרן  16 עד 25 
    //tests 26-35 - moishie
    @Test
   public void testAdd55(){
        
        String result = Encryption.replaceVowels("moishie the goat");
        assertEquals("m01sh1# th# g0@t",result);   
    }
    @Test
   public void testAdd56(){
        
        String result = Encryption.replaceVowels("moshe tzvi yosef");
        assertEquals("m0sh# tzv1 y0s#f",result);   
    }
     @Test
   public void testAdd57(){
        
        String result = Encryption.replaceVowels("nike alphafly");
        assertEquals("n1k# @lph@fly",result);   
    }
     @Test
   public void testAdd58(){
        
        String result = Encryption.replaceVowels("shabbat shalom");
        assertEquals("sh@bb@t sh@l0m",result);   
    }
     @Test
   public void testAdd59(){
        
        String result = Encryption.replaceVowels("rudy project");
        assertEquals("r&dy pr0j#ct",result);   
    }
     @Test
   public void testAdd60(){
        
        String result = Encryption.replaceSpecialCharacter("m01sh1# th# g0@t");
        assertEquals("moishie the goat",result);   
    }
     @Test
   public void testAdd61(){
        
        String result = Encryption.replaceSpecialCharacter("m0sh# tzv1 y0s#f");
        assertEquals("moshe tzvi yosef",result);   
    }
      @Test
   public void testAdd62(){
        
        String result = Encryption.replaceSpecialCharacter("n1k# @lph@fly");
        assertEquals("nike alphafly",result);   
    }
      @Test
   public void testAdd63(){
        
        String result = Encryption.replaceSpecialCharacter("sh@bb@t sh@l0m");
        assertEquals("shabbat shalom",result);   
    }
      @Test
   public void testAdd64(){
        
        String result = Encryption.replaceSpecialCharacter("r&dy pr0j#ct");
        assertEquals("rudy project",result);   
    }
