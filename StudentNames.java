public class StudentNames {
    public static void main(String[] args) {
        // Get the number of arguments
        int numberOfArguments = args.length;
        
        // Print the number of arguments
        System.out.println("Number of arguments = " + numberOfArguments);
        
        // Loop through each argument and print the corresponding student name
        for (int i = 0; i < numberOfArguments; i++) {
            // Determine the order of the student (First, Second, Third, etc.)
            String studentOrder = "";
            switch (i) {
                case 0: studentOrder = "First"; break;
                case 1: studentOrder = "Second"; break;
                case 2: studentOrder = "Third"; break;
                default: studentOrder = (i + 1) + "th"; break;  // For other numbers, append 'th'
            }
            
            // Print the student's name with the corresponding order
            System.out.println(studentOrder + " Student Name is = " + args[i]);
        }
    }
}
