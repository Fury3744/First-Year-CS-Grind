public class main {
    public static void main(String[] args){
        // 1. Primitive Numbers
        int age = 18;                    // Integer (whole numbers)
        double cgpaTarget = 9.5;         // Decimal / Floating-point number

        // 2. Character & Boolean
        char initial = 'A';              // Single character (uses single quotes)
        boolean isGrinding = true;       // true or false

        // 3. Text (Reference Type)
        String college ="SGGS";          // Text sequence (uses double quotes)

        // 4. Console Output & String Concatenation
        System.out.println("=== Day 01: Java Setup & Data Types ===");
        System.out.println("Target: " +cgpaTarget + " CGPA at " + college);
        System.out.println("Status: Grinding = " + isGrinding);

        // 5. Basic Arithmetic
        int semesterDays = 120;
        int remainingDays = semesterDays - 10;
        System.out.println("Days remaining in sprint: " + remainingDays);
    }
}