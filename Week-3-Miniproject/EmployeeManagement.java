import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement
{
    static ArrayList<Employee> employees = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    // Add Employee
    static void addEmployee()
    {
        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Department:");
        String department = sc.nextLine();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();

        Employee employee = new Employee(id, name, department, salary);

        employees.add(employee);

        System.out.println("Employee added successfully.");
    }

    // Display Employees
    static void displayEmployees()
    {
        if(employees.isEmpty())
        {
            System.out.println("No employees found.");
            return;
        }

        System.out.println("\nEmployee Details:");

        for(Employee employee : employees)
        {
            employee.displayEmployee();
            System.out.println("--------------------");
        }
    }

    // Save Employees to File
    static void saveEmployees()
    {
        try
        {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("employees.txt"));

            for(Employee employee : employees)
            {
                writer.write(
                    employee.getEmployeeId() + "," +
                    employee.getName() + "," +
                    employee.getDepartment() + "," +
                    employee.getSalary()
                );

                writer.newLine();
            }

            writer.close();

            System.out.println("Employee data saved successfully.");
        }
        catch(IOException e)
        {
            System.out.println("Error while saving employee data.");
        }
    }

    // Load Employees from File
    static void loadEmployees()
    {
        try
        {
            BufferedReader reader = new BufferedReader(
                    new FileReader("employees.txt"));

            String line;

            while((line = reader.readLine()) != null)
            {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                Employee employee =
                        new Employee(id, name, department, salary);

                employees.add(employee);
            }

            reader.close();

            System.out.println("Employee data loaded successfully.");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Employee file not found.");
        }
        catch(IOException e)
        {
            System.out.println("Error while reading employee data.");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid data in employee file.");
        }
    }

    public static void main(String[] args)
    {
        int choice;

        do
        {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Save Employees");
            System.out.println("4. Load Employees");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployees();
                    break;

                case 3:
                    saveEmployees();
                    break;

                case 4:
                    loadEmployees();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 5);

        sc.close();
    }
}