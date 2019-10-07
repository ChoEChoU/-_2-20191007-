import java.io.*;
import java.util.*;
/**
 * 여기에 File 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class File
{
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("c:\\Temp\\inputData20191007.txt");
            Scanner scanner = new Scanner(reader);
            HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
            
            while (scanner.hasNext()){
                String word = scanner.nextLine();
                String key = word.substring(0,4);
                String temp = word.substring(5, word.length());
                Integer value = Integer.parseInt(temp);
                hashmap.put(key, value);
            }
            Set<String> keys = hashmap.keySet();
            Iterator <String> itr = keys.iterator();
            
            
            
        }
        catch(IOException e){
            System.out.println("경로 오류!");
        }
    }
}
