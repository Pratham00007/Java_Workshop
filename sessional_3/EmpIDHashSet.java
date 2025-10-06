import java.util.HashSet;

public class EmpIDHashSet {
    public static void main(String[] args) {
        HashSet<Integer> employeeIDs = new HashSet<>();

        employeeIDs.add(104);
        employeeIDs.add(101);
        employeeIDs.add(103);
        employeeIDs.add(102);
        employeeIDs.add(101); // duplicate
        employeeIDs.add(105);

        // Display contents 
        System.out.println("Employee IDs in ascending order:");
        for (int id : employeeIDs) {
            System.out.println(id);
        }

       }
}
