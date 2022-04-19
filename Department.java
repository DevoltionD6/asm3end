public class Department {
    private String departmentID;
    private String departmentName;
    private int numberOfStaff;

    public Department(String departmentID, String departmentName, int numberOfStaff) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.numberOfStaff = numberOfStaff;
    }

    public String getDepartmentID() {
        return this.departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getNumberOfStaff() {
        return this.numberOfStaff;
    }

    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    @Override
    public String toString() {
        return "ID bo phan: " + getDepartmentID() + " --- " +
                "Ten bo phan: " + getDepartmentName() + " --- " +
                "So luong nhan vien: " + getNumberOfStaff();
    }

}
