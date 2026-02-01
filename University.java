class University {

    static int totalStudents;
    static String universityName;

    static {
        universityName = "Global University";
        System.out.println("Static block executed");
    }

    {
        System.out.println("Instance block executed");
    }

    University() {
        totalStudents++;
        System.out.println("Student object created");
    }

    static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {
        System.out.println("Maitri Chauhan, 250393107003");

        University s1 = new University();
        University s2 = new University();
        University s3 = new University();

        System.out.println("University Name: " + universityName);
        System.out.println("Total Students: " + getTotalStudents());
    }
}