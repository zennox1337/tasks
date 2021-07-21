import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
        String[] quadranglesPoints = readFile(args[0]);
        String[] points = readFile(args[1]);

        List<Points> pointsList = new ArrayList<Points>();
        for (String item:
                quadranglesPoints) {
            var temp = item.split(" ");
            pointsList.add(new Points(Double.parseDouble(temp[0]), Double.parseDouble(temp[1])));
        }
    }
 
    public static String[] readFile(String fileName) throws Exception{
        String[] str = new String[0];
        if(!fileName.contains(".txt"))
            fileName+=".txt";
        try {
            Scanner scan = new Scanner( new FileReader(fileName));
            while (scan.hasNextLine()) {
                str = Arrays.copyOf(str, str.length+1);
                str[str.length-1] = scan.nextLine();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return str;
    }
}