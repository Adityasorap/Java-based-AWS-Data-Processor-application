import java.util.Scanner;

public class AwsDataProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data to be processed in AWS:");
        String inputData = scanner.nextLine();
        
        String processedData = processData(inputData);
        
        System.out.println("Processed Data: " + processedData);
        
        scanner.close();
    }
    
    public static String processData(String data) {
        return "AWS_Processed_" + data.toUpperCase();
    }
}
