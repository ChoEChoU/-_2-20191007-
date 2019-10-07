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
            
            System.out.println(reader.getEncoding());
            while (scanner.hasNext()){
                String word = scanner.nextLine();
                String key = word.substring(0,3);
                String temp = word.substring(4, word.length());
                int value = Integer.parseInt(temp);
                hashmap.put(key, value);
            }
            Set<String> keys = hashmap.keySet();
            Iterator <String> itr = keys.iterator();
            
            int add = 0;
            double average = 0.0;
            int count = 0;
            
            while (itr.hasNext()){
                String key = itr.next();
                int value = hashmap.get(key);
                add += value;
                count += 1;
            }
            average = add / count;
            
            System.out.println("------ 계산 결과 ------");
            System.out.println("총점 : " + add);
            System.out.println("평균 : " + average);
        }
        catch(IOException e){
            System.out.println("경로 오류!");
        }
    }
}
