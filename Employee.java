public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    public static void main(String[] args) {
        Employee first = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee second = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee third = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", name, idNumber, department, position);
    }
}
