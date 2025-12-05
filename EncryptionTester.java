import static org.junit.Assert.*;
import org.junit.Test;
public class EncryptionTester
{
    @Test
    public void testAdd1(){
       
        int result = Encryption.wordsCount("Yohai");
        assertEquals(1,result);
       
    }
    @Test
    public void testAdd2(){
       
        int result = Encryption.wordsCount("Hi man");
        assertEquals(2,result);
       
    }
    @Test
    public void testAdd3(){
       
        int result = Encryption.wordsCount("Hello big world");
        assertEquals(3,result);
       
    }
    @Test
    public void testAdd4(){
       
        int result = Encryption.wordsCount("World");
        assertEquals(1,result);
       
    }
    @Test
    public void testAdd5(){
       
        int result = Encryption.wordsCount("Hot cheese");
        assertEquals(2,result);
    }
    @Test
   public void testAdd6(){
        
        String result = Encryption.movingRight("oz gever",2);
        assertEquals("gever oz",result);  
    }
    @Test
   public void testAdd7(){
        
        String result = Encryption.movingLeft("the king",2);
        assertEquals("king the",result);  
    }
    @Test
   public void testAdd8(){
        
        String result = Encryption.movingLeft("oz",1);
        assertEquals("oz",result);  
    }
    @Test
   public void testAdd9(){
        
        String result = Encryption.movingLeft("me the king",3);
        assertEquals("the king me",result);  
    }
    @Test
   public void testAdd10(){
        
        String result = Encryption.movingLeft("lebron james garoh",3);
        assertEquals("james garoh lebron",result);  
    }
    @Test
   public void testAdd11(){
        
        String result = Encryption.movingLeft("dvir gever",2);
        assertEquals("gever dvir",result);  
    } 
     @Test
   public void testAdd512(){
        
        String result = Encryption.movingLeft("dvir",1);
        assertEquals("dvir",result);  
    } 
     @Test
   public void testAdd13(){
        
        String result = Encryption.movingLeft("gever",1);
        assertEquals("gever",result);  
    } 
     @Test
   public void testAdd14(){
        
        String result = Encryption.movingLeft("dvir gever retsah",3);
        assertEquals("gever retsah dvir",result);  
    } 
     @Test
   public void testAdd15(){
        
        String result = Encryption.movingLeft("moshe ran baroh",3);
        assertEquals("ran baroh moshe",result);  
    } 
       // טסטים של דביר גוטסדינר 11 עד 15

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
   public void testAdd26(){
        
        String result = Encryption.replaceVowels("moishie the goat");
        assertEquals("m01sh1# th# g0@t",result);   
    }
    @Test
   public void testAdd27(){
        
        String result = Encryption.replaceVowels("moshe tzvi yosef");
        assertEquals("m0sh# tzv1 y0s#f",result);   
    }
     @Test
   public void testAdd28(){
        
        String result = Encryption.replaceVowels("nike alphafly");
        assertEquals("n1k# @lph@fly",result);   
    }
     @Test
   public void testAdd29(){
        
        String result = Encryption.replaceVowels("shabbat shalom");
        assertEquals("sh@bb@t sh@l0m",result);   
    }
     @Test
   public void testAdd30(){
        
        String result = Encryption.replaceVowels("rudy project");
        assertEquals("r&dy pr0j#ct",result);   
    }
     @Test
   public void testAdd31(){
        
        String result = Encryption.replaceSpecialCharacter("m01sh1# th# g0@t");
        assertEquals("moishie the goat",result);   
    }
     @Test
   public void testAdd32(){
        
        String result = Encryption.replaceSpecialCharacter("m0sh# tzv1 y0s#f");
        assertEquals("moshe tzvi yosef",result);   
    }
      @Test
   public void testAdd33(){
        
        String result = Encryption.replaceSpecialCharacter("n1k# @lph@fly");
        assertEquals("nike alphafly",result);   
    }
      @Test
   public void testAdd34(){
        
        String result = Encryption.replaceSpecialCharacter("sh@bb@t sh@l0m");
        assertEquals("shabbat shalom",result);   
    }
      @Test
   public void testAdd35(){
        
        String result = Encryption.replaceSpecialCharacter("r&dy pr0j#ct");
        assertEquals("rudy project",result);   
    }
}
