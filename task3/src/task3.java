import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
        readFiles(args[0]);
        Max();
    }

    public static void readFiles(String path) throws Exception{

        File files = new File(path);
        for (File item:
                files.listFiles()) {
            if(item.toString().contains("Cash") && item.toString().contains(".txt"))
            {
                try {
                    Scanner scanner = new Scanner( new FileReader(item.getAbsolutePath()));
                    double[] str = new double[0];
                    while (scanner.hasNextLine()) {
                        str = Arrays.copyOf(str, str.length + 1);
                        str[str.length - 1] = Double.parseDouble(scanner.nextLine().replaceAll(",","").trim());
                    }
                    IntervalWrite(str);
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void Max(){
        int max = 0;

        for (int i =0; i< interval.length;i++){
            if(interval[i] > interval[max]){
                max = i;
            }
        }
        System.out.println(max+1);
    }

    public static double[] interval = new double[16];
    public static void IntervalWrite(double[] queue){
        int i = 0;
        for (double item:
                queue) {
            interval[i]+= item;
            i++;
        }
    }
}