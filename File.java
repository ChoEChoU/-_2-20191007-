import java.io.*;
import java.util.*;
/**
 * 파일을 읽어들여서 파일에 있는 성적의 총점과 평균을 구해서 출력하는 File 클래스
 * 
 * @author (2018315017 임민택, 2017315056 이토아야카) 
 * @version (2019.10.07)
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
