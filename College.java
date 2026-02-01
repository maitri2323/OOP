class College {

    String collegeName;

    College(String name) {
        collegeName = name;
    }

    class Admission {
        String studentName;
        String course;

        void acceptDetails(String sname, String c) {
            studentName = sname;
            course = c;
        }

        void displayDetails() {
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        System.out.println("Maitri Chauhan, 250393107003");

        College college = new College("Saffrony Institute of Technology");
        College.Admission admission = college.new Admission();

        admission.acceptDetails("Maitri Chauhan", "Computer Engineering");
        admission.displayDetails();
    }
}