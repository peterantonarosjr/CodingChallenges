import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romans = new HashMap<Character, Integer>();
        romans.put('I',1);
        romans.put('V',5);
        romans.put('X',10);
        romans.put('L',50);
        romans.put('C',100);
        romans.put('D',500);
        romans.put('M',1000);
        int number =0;
        int stringSize = s.length();
        for(int i=0; i<stringSize-1; i++){
            char curChar = s.charAt(i);
            int curInt = romans.get(curChar);

            if(romans.get(s.charAt(i))>=romans.get(s.charAt(i+1))){
                number+=romans.get(s.charAt(i));
            }else{
                number-=romans.get(s.charAt(i));
            }
        }
        number+=romans.get(s.charAt(stringSize-1));
        return number;
    }
}
