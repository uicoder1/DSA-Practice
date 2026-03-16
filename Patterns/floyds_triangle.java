public class floyds_triangle {
    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) { // Loop through rows
            for (int j = 1; j <= i; j++) { // Loop through columns in each row
                System.out.print(counter + " "); // Print the current number
                counter++; // Increment the number for the next position
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void main(String args[]){
        floyds_triangle(5);
    }
    
}