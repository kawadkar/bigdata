import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DeptAvgSal {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        String fileName;
        try {
            FileReader file = new FileReader("C:\\Users\\conted\\programs\\bigdata\\big_data_course\\lecture1\\emp_salary.dat");
            BufferedReader br = new BufferedReader(file);
            String record;
            String[] fields;
            while((record = br.readLine()) != null) {
                System.out.println(record);
                fields = record.split( "\\|");
                System.out.println("key: " + fields[0] + " , value: " + fields[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

