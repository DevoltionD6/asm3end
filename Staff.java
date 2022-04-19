import java.util.Comparator;

public abstract class Staff {
    private String staffId;
    private String staffName;
    private int staffAge;
    private double coefSalary; // hê số lương
    private String startDate;
    private String staffDepartment;
    private int leaveDay;

    public Staff(String staffId, String staffName, int staffAge, double coefSalary, String startDate,
            String staffDepartment, int leaveDay) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffAge = staffAge;
        this.coefSalary = coefSalary;
        this.startDate = startDate;
        this.staffDepartment = staffDepartment;
        this.leaveDay = leaveDay;
    }

    public String getStaffId() {
        return this.staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return this.staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getStaffAge() {
        return this.staffAge;
    }

    public void setStaffAge(int staffAge) {
        this.staffAge = staffAge;
    }

    public double getCoefSalary() {
        return this.coefSalary;
    }

    public void setCoefSalary(double coefSalary) {
        this.coefSalary = coefSalary;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStaffDepartment() {
        return this.staffDepartment;
    }

    public void setStaffDepartment(String staffDepartment) {
        this.staffDepartment = staffDepartment;
    }

    public int getLeaveDay() {
        return this.leaveDay;
    }

    public abstract void displaySalary();

    public abstract long calculateSalary();

    public void setLeaveDay(int leaveDay) {
        this.leaveDay = leaveDay;
    }

    public static Comparator<Staff> ascendingSalary = new Comparator<Staff>() {
        public int compare(Staff staff1, Staff staff2) {
            long salary1 = staff1.calculateSalary();
            long salary2 = staff2.calculateSalary();
            return (int) (salary1 - salary2);
        }
    };
    public static Comparator<Staff> descendingSalary = new Comparator<Staff>() {
        public int compare(Staff staff1, Staff staff2) {
            long salary1 = staff1.calculateSalary();
            long salary2 = staff2.calculateSalary();
            return (int) (salary2 - salary1);
        }
    };

    @Override
    public String toString() {
        return "ID nhan vien: " + getStaffId() + " -- " +
                "Ten nhan vien: " + getStaffName() + " -- " +
                "Tuoi nhan vien: " + getStaffAge() + " -- " +
                "He so luong: " + getCoefSalary() + " -- " +
                "Ngay vao lam: " + getStartDate() + " -- " +
                "Bo phan lam viec: " + getStaffDepartment() + " -- " +
                "So ngay nghi phep: " + getLeaveDay() + " -- ";
    }

}
