
/**
 *
 * @author Dr. Baharav
 */

public class BaseConverter {

    
    public static String Dec2Str(int num) {
        String str = "";
        
        while(num>0) {
            str = str + (num % 10);     // Operator %, modulus
            //str = (num % 10) + str;
            num = num/10;               // mention num /=  10;
        }
        return str;
    }

    
    public static String Dec2Bin(int num) {   
        String str = "";

        while ( num>0 )
        {
            int digit   = num % 2 ;
            str = digit + str ;
            num         = num / 2;
        }
        return str;
    }
    

    public static int Bin2Dec(String str) {
        int l = 0;
        int newNum = 0;
        while (l<str.length()) {
            newNum = 2*newNum + (str.charAt(l)-'0');
            l++;
        }
        return newNum;   
    }
    
    
    public static String Dec2Hex(int num) {
        String str = "";

        int baseValue = 16;
        
        while ( num>0 )
        {
            int digit = num % baseValue ;
            num = num / baseValue;

            String digitStr = "";
            if (digit<10)
                digitStr = "" + digit;
            if (digit>=10)
                digitStr = "" + (char)('A'+ (digit-10));

            str =  digitStr + str ;

        }
        return str;
    }
    
    
    
    // Homework

    // Do NOT use any special purpose functions (like Character.digit(), 
    // Integer.isInteger(),Integer.parseInt() etc. 
    
    /**
    * @param str input string describing a hex number. For example, A7
    * @return   the value in Decimal
    */

    public static int Hex2Dec(String str) {

        // TODO
        return 0;                
    }
    
    
    
    /**
    * @param num input number in decimal, for example 20
    * @return   the value in Octal as a string 24
    */
    public static String Dec2Oct(int num) {

        // TODO
        
        return "";                
    }

    /**
    * @param str input string describing an Octal number. For example, 24
    * @return   the value in Decimal, for example 24
    */
    public static int Oct2Dec(String str) {
        // TODO

        return 0;                
    }

    
    /**
    * @param str input string describing a Hex number. 
    * @return   string representing the number as Binary string.
    */
    public static String Hex2Bin(String str) {
        // TODO
        
        return "";                
    }

} 