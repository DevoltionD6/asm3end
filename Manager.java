public class Manager extends Staff implements ICalculator {

    private String staffDepartmentPosition;

    public Manager(String staffId, String staffName, int staffAge, double coefSalary, String startDate,
            String staffDepartment, int leaveDay, String staffDepartmentPosition) {
        super(staffId, staffName, staffAge, coefSalary, startDate, staffDepartment, leaveDay);
        this.staffDepartmentPosition = staffDepartmentPosition;
    }

    public String staffDepartmentPosition() {
        return this.staffDepartmentPosition;
    }

    public void staffDepartmentPosition(String staffDepartmentPosition) {
        this.staffDepartmentPosition = staffDepartmentPosition;
    }

    @Override
    public long calculateSalary() {
        long managerSalary = (long) (super.getCoefSalary() * 5000000);
        if (staffDepartmentPosition.equalsIgnoreCase("Business leader")) {
            managerSalary += 8000000;
        }
        if (staffDepartmentPosition.equalsIgnoreCase("Project leader")) {
            managerSalary += 8000000;
        }
        if (staffDepartmentPosition.equalsIgnoreCase("Technical leader")) {
            managerSalary += 8000000;
        }
        return managerSalary;
    }

    @Override
    public String toString() {
        return "Ten nhan vien: " + super.getStaffName() + " -- "
                + "Tuoi nhan vien: " + super.getStaffAge() + " -- "
                + "ID: " + super.getStaffId() + " -- "
                + "He so luong: " + super.getCoefSalary() + " -- "
                + "Ngay vao lam: " + super.getStartDate() + " -- "
                + "So ngay nghi phep: " + super.getLeaveDay() + " -- "
                + "Bo phan lam viec: " + super.getStaffDepartment() + " -- "
                + "Chuc vu: " + staffDepartmentPosition;
    }

    @Override
    public void displaySalary() {
        System.out.println("Ten nhan vien: " + super.getStaffName() + " -- "
                + "Tuoi nhan vien: " + super.getStaffAge() + " -- "
                + "ID: " + super.getStaffId() + " -- "
                + "He so luong: " + super.getCoefSalary() + " -- "
                + "Ngay vao lam: " + super.getStartDate() + " -- "
                + "So ngay nghi phep: " + super.getLeaveDay() + " -- "
                + "Bo phan lam viec: " + super.getStaffDepartment() + " -- "
                + "Chuc vu: " + staffDepartmentPosition + " -- "
                + "Luong: " + calculateSalary());
    }

}
