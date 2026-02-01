class Employee {
    String name;
    String department;

    Employee(String n, String d) {
        name = n;
        department = d;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    Manager(String n, String d, int t, String p) {
        super(n, d);
        teamSize = t;
        projectName = p;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("Maitri Chauhan, 250393107003");

        Employee e = new Employee("JOJO", "HR");
        Employee m = new Manager("Maitri Chauhan", "CE", 8, "AI System");

        e.displayDetails();
        System.out.println();
        m.displayDetails();
    }
}