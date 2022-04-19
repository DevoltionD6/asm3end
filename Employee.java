public class Employee extends Staff implements ICalculator {

    private double overTime;

    public Employee(String staffId, String staffName, int staffAge, double coefSalary, String startDate,
            String staffDepartment, int leaveDay, double overTime) {
        super(staffId, staffName, staffAge, coefSalary, startDate, staffDepartment, leaveDay);
        this.overTime = overTime;
    }

    public double getOverTime() {
        return this.overTime;
    }

    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }

    @Override
    public long calculateSalary() {
        long employeeSalary = (long) (super.getCoefSalary() * 3000000 + overTime);
        return employeeSalary;
    }

    @Override
    public String toString() {
        return "Ten nhan vien: " + super.getStaffName() + " -- "
                + "Tuoi: " + super.getStaffAge() + " -- "
                + "He so luong: " + super.getCoefSalary() + " -- "
                + "Ngay Vao Lam: " + super.getStartDate() + " -- "
                + "Bo phan lam viec: " + super.getStaffDepartment() + " -- "
                + "So ngay nghi phep: " + super.getLeaveDay() + " -- "
                + "So gio lam them: " + overTime;
    }

    @Override
    public void displaySalary() {
        System.out.println(
                "Ten nhan vien: " + super.getStaffName() + " -- "
                        + "Tuoi: " + super.getStaffAge() + " -- "
                        + "He so luong: " + super.getCoefSalary() + " -- "
                        + "Ngay Vao Lam: " + super.getStartDate() + " -- "
                        + "Bo phan lam viec: " + super.getStaffDepartment() + " -- "
                        + "So ngay nghi phep: " + super.getLeaveDay() + " -- "
                        + "So gio lam them: " + overTime + " -- "
                        + "Luong: " + calculateSalary()

        );

    }

}
