import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Humanresource {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Staff> totalStaff = new ArrayList<Staff>();
    static ArrayList<Department> totalDepartment = new ArrayList<Department>();
    static int allFuntion = 0;

    public static void main(String[] args) {
        // tạo dữ liệu ban đầu cho nhân viên
        Department teamIT = new Department("IT", "Lap trinh vien", 4);
        Department teamTechnican = new Department("TE", "Ky thuat vien", 5);
        Department teamSale = new Department("SL", "Nhan vien ban hang", 5);
        Department teamMarketing = new Department("MK", "Nhan vien truyen thong", 3);
        totalDepartment.add(teamIT);
        totalDepartment.add(teamTechnican);
        totalDepartment.add(teamSale);
        totalDepartment.add(teamMarketing);

        Staff employee1 = new Employee("IT001", "Tran Hao Nam", 33, 2.2, "19/11/2020", teamIT.getDepartmentName(), 4,
                3);
        Staff employee2 = new Employee("IT002", "Ngoc Thi Huong", 27, 3.1, "22/10/2019", teamIT.getDepartmentName(), 0,
                3.3);
        Staff employee3 = new Employee("TE001", "Nguyen Van Thanh", 25, 2.1, "14/02/2021",
                teamTechnican.getDepartmentName(), 0, 4);
        Staff employee4 = new Employee("TE002", "Tran Van Chuong", 30, 2.5, "09/08/2018",
                teamTechnican.getDepartmentName(), 1, 12);
        Staff employee5 = new Employee("SL001", "Vu Ngoc Thi Thi", 27, 2.3, "01/02/2020", teamSale.getDepartmentName(),
                3, 4);
        Staff employee6 = new Employee("SL002", "Tran Vu Minh Ngoc", 31, 2, "22/08/2021", teamSale.getDepartmentName(),
                2, 3.3);
        Staff employee7 = new Employee("MK002", "Nguyen Thi Ha", 24, 2.1, "13/04/2021",
                teamMarketing.getDepartmentName(), 3, 4);
        Staff employee8 = new Employee("MK001", "Nguyen Van Thi", 25, 2.2, "18/09/2021",
                teamMarketing.getDepartmentName(), 1, 3);

        Staff manager1 = new Manager("IT003", "Nguyen Vu Hung", 33, 2.9, "11/03/2019", teamIT.getDepartmentName(), 3,
                "Bussiness Leader");
        Staff manager2 = new Manager("IT004", "Vy Hoang Ngoc", 29, 2.8, "16/01/2020", teamIT.getDepartmentName(), 1,
                "Project Leader");
        Staff manager3 = new Manager("IT005", "Tran Trung Ngoc", 28, 2.9, "25/05/2019", teamIT.getDepartmentName(), 1,
                "Technical Leader");
        Staff manager4 = new Manager("TE003", "Vo Tran Thanh Trung", 33, 3.0, "24/01/2020",
                teamTechnican.getDepartmentName(), 2, "Bussiness Leader");
        Staff manager5 = new Manager("TE004", "Nguyen Ngoc Bao", 31, 3, "11/02/2019", teamTechnican.getDepartmentName(),
                3, "Project Leader");
        Staff manager6 = new Manager("TE005", "Huynh Trung Truc", 33, 3.2, "21/06/2019",
                teamTechnican.getDepartmentName(), 5, "Technical Leader");
        Staff manager7 = new Manager("SL003", "Huynh Thanh Danh", 30, 3.2, "05/03/2020", teamSale.getDepartmentName(),
                3, "Bussiness Leader");
        Staff manager8 = new Manager("SL004", "Nguyen Vu Hong Minh", 34, 3.5, "04/02/2018",
                teamSale.getDepartmentName(), 5, "Project Leader");
        Staff manager9 = new Manager("SL005", "Nguyen Thi Cam Thi", 29, 3.0, "11/09/2020", teamSale.getDepartmentName(),
                3, "Technical Leader");
        Staff manager10 = new Manager("MK003", "Nguyen Thi Uyen Dinh", 31, 3.1, "20/12/2019",
                teamMarketing.getDepartmentName(), 5, "Bussiness Leader");
        Staff manager11 = new Manager("MK004", "Tran Uyen Thi", 28, 2.9, "18/08/2019",
                teamMarketing.getDepartmentName(), 8, "Project Leader");
        Staff manager12 = new Manager("MK005", "Huynh Huu Hieu", 27, 2.8, "23/04/2020",
                teamMarketing.getDepartmentName(), 3, "Technical Leader");
        totalStaff.add(employee1);
        totalStaff.add(employee2);
        totalStaff.add(employee3);
        totalStaff.add(employee4);
        totalStaff.add(employee5);
        totalStaff.add(employee6);
        totalStaff.add(employee7);
        totalStaff.add(employee8);
        totalStaff.add(manager1);
        totalStaff.add(manager2);
        totalStaff.add(manager3);
        totalStaff.add(manager4);
        totalStaff.add(manager5);
        totalStaff.add(manager6);
        totalStaff.add(manager7);
        totalStaff.add(manager8);
        totalStaff.add(manager9);
        totalStaff.add(manager10);
        totalStaff.add(manager11);
        totalStaff.add(manager12);

        // thong bao chuc nang

        // thuc hien cac chuc nang cua ung dung
        do {
            notification();
            System.out.println("Lua chon:");
            allFuntion = Integer.parseInt(sc.nextLine());
            while (allFuntion < 0 || allFuntion > 7) {
                System.out.println("Nhap lai lua chon");
                allFuntion = Integer.parseInt(sc.nextLine());
            }
            switch (allFuntion) {
                case 1:
                    displayInfoStaff(totalStaff);
                    break;
                case 2:
                    displayInfoDepartment(totalDepartment);
                    break;
                case 3:
                    displayInfoStaffOfDepartment(totalStaff, sc);
                    break;
                case 4:
                    addStaff(totalStaff, totalDepartment, teamIT, teamTechnican, teamSale, teamMarketing);
                    break;
                case 5:
                    findStaff(totalStaff, sc);
                    break;
                case 6:
                    displayInfoByDescendingSoftSalary(totalStaff);
                    break;
                case 7:
                    displayInfoByAscendingSoftSalary(totalStaff);
                    break;
                case 0:
                    System.out.println("End");
                    break;
                default:
                    break;
            }
        } while (allFuntion != 0);
        sc.close();

    }

    // Hiển thị thông báo menu
    public static void notification() {
        System.out.println();
        System.out.println("Menu chinh chuong trinh");
        System.out.println("1. Hien thi danh sach nhan vien hien co trong cong ty");
        System.out.println("2. Hien thi danh sach cac bo phan trong cong ty");
        System.out.println("3. Hien thi nhan vien theo tung bo phan");
        System.out.println("4. Them nhan-vien/ quan-ly moi vao cong ty");
        System.out.println("5. Tim kiem thong tin nhan vien theo ID hoac Ten");
        System.out.println("6. Hien thi bang luong cua toan bo nhan vien");
        System.out.println("7. Hien thi bang luong theo tu tu tang dan");
    }

    // hiển thị thông tin các bộ phận
    public static void displayInfoDepartment(ArrayList<Department> totalDepartment) {
        for (Department iterable_element : totalDepartment) {
            System.out.println(iterable_element.toString());
        }
    }

    // hiển thị danh sách nhân viên hiện có trong công ty
    public static void displayInfoStaff(ArrayList<Staff> totalStaff) {
        for (Staff iterable_element : totalStaff) {
            System.out.println(iterable_element.toString());
        }
    }

    // hiển thị nhân viên theo các bộ phận của công ty
    public static void displayInfoStaffOfDepartment(ArrayList<Staff> totalStaff, Scanner sc) {
        int allDepartment;

        do {
            System.out.println("");
            System.out.println("1. IT");
            System.out.println("2. Technican");
            System.out.println("3. Sale ");
            System.out.println("4. Marketing");
            System.out.println("0. Back to Menu");
            System.out.println("");
            allDepartment = Integer.parseInt(sc.nextLine());
            while (allDepartment < 0 || allDepartment > 4) {
                System.out.println("Nhap lai bo phan");
                allDepartment = Integer.parseInt(sc.nextLine());
            }
            switch (allDepartment) {
                case 1:
                    for (Staff iterable_element1 : totalStaff) {
                        if (iterable_element1.getStaffDepartment().equalsIgnoreCase("Lap trinh vien")) {
                            iterable_element1.toString();
                        }
                    }
                    break;
                case 2:
                    for (Staff iterable_element1 : totalStaff) {
                        if (iterable_element1.getStaffDepartment().equalsIgnoreCase("Ky thuat vien")) {
                            iterable_element1.toString();
                        }
                    }
                    break;
                case 3:
                    for (Staff iterable_element1 : totalStaff) {
                        if (iterable_element1.getStaffDepartment().equalsIgnoreCase("Nhan vien ban hang")) {
                            iterable_element1.toString();
                        }
                    }
                    break;
                case 4:
                    for (Staff iterable_element1 : totalStaff) {
                        if (iterable_element1.getStaffDepartment().equalsIgnoreCase("Nhan vien truyen thong")) {
                            iterable_element1.toString();
                        }
                    }
                    break;

                case 0:
                    break;
            }
        } while (allDepartment != 0);

    }

    public static void addStaff(ArrayList<Staff> totalStaff, ArrayList<Department> totaldDepartments, Department teamIT,
            Department teamTechnican, Department teamSale, Department teamMarketing) {
        int typeOfStaff = 0;
        do {
            System.out.println("1. Them nhan vien");
            System.out.println("2. Them quan ly");
            System.out.println("0. Back to menu");
            typeOfStaff = Integer.parseInt(sc.nextLine());
            while (typeOfStaff < 0 || typeOfStaff > 2) {
                System.out.println("Nhap Lai lua chon");
                typeOfStaff = sc.nextInt();
            }
            switch (typeOfStaff) {
                case 1:
                    System.out.println(" - Them nhan vien -");
                    System.out.println("Nhap ma so nhan vien: ");
                    String idEmployee = sc.nextLine();

                    // kiểm tra mã nhân viên đã có sẵn hay chưa
                    for (int i = 0; i < totalStaff.size(); i++) {
                        while (idEmployee.equalsIgnoreCase(totalStaff.get(i).getStaffId())) {
                            System.out.println("Ma nhan vien da ton tai");
                            System.out.print("Hay nhap lai");
                            idEmployee = sc.nextLine();
                            i = 0;
                        }
                    }
                    System.out.println("Nhap ten nhan vien: ");
                    String nameEmployee = sc.nextLine();
                    System.out.println("Nhap tuoi nhan vien: ");
                    int ageEmployee = Integer.parseInt(sc.nextLine());
                    while (ageEmployee < 0) {
                        System.out.println("Nhap lai tuoi: ");
                        ageEmployee = Integer.parseInt(sc.nextLine());
                    }
                    System.out.println("Nhap he so luong: ");
                    double coefOfSalary = Double.parseDouble(sc.nextLine());
                    ;
                    while (coefOfSalary < 0) {
                        System.out.println("Nhap lai he so luong: ");
                        coefOfSalary = Double.parseDouble(sc.nextLine());
                        ;
                    }
                    System.out.println("Nhap ngay vao lam: ");
                    String startDateWorkEmployee = sc.nextLine();

                    // chọn bộ phận cho nhân viên
                    int newDepartmentEmployee;
                    String departmentEmployee = "";
                    do {
                        System.out.println("Chon bo phan lam viec:");
                        System.out.println("1. Lap trinh vien");
                        System.out.println("2. Ky thuat vien");
                        System.out.println("3. Nhan vien ban hang");
                        System.out.println("4. Nhan vien truyen thong");
                        System.out.println("5. Them bo phan moi");
                        newDepartmentEmployee = Integer.parseInt(sc.nextLine());
                        switch (newDepartmentEmployee) {
                            case 1:
                                departmentEmployee = "Lap trinh vien";
                                break;
                            case 2:
                                departmentEmployee = "Ky thuat vien";
                                break;
                            case 3:
                                departmentEmployee = "Nhan vien ban hang";
                                break;
                            case 4:
                                departmentEmployee = "Nhan vien truyen thong";
                                break;
                            case 5:
                                System.out.println("Nhap ten bo phan moi:");
                                sc.nextLine();
                                departmentEmployee = sc.nextLine();
                                break;
                            default:
                                System.out.println("Lua chon khong phu hop");
                                break;
                        }
                    } while (newDepartmentEmployee < 1 || newDepartmentEmployee > 5);
                    System.out.println("Nhap so ngay nghi phep");
                    int leaveDayEmployee = Integer.parseInt(sc.nextLine());
                    while (leaveDayEmployee < 0) {
                        System.out.println("Nhap lai so ngay nghi phep");
                        leaveDayEmployee = Integer.parseInt(sc.nextLine());

                    }
                    System.out.println("Nhap so gio lam them:");
                    double ovEmployee = Double.parseDouble(sc.nextLine());
                    ;
                    while (ovEmployee < 0) {
                        System.out.println("Nhap lai so gio lam them:");
                        ovEmployee = Double.parseDouble(sc.nextLine());
                        ;
                    }
                    Staff newEmployee = new Employee(idEmployee, nameEmployee, ageEmployee, coefOfSalary,
                            startDateWorkEmployee, departmentEmployee, leaveDayEmployee, ovEmployee);
                    totalStaff.add(newEmployee);
                    if (departmentEmployee.equalsIgnoreCase("Lap trinh vien")) {
                        teamIT.setNumberOfStaff(teamIT.getNumberOfStaff() + 1);
                    } else if (departmentEmployee.equalsIgnoreCase("Ky thuat vien")) {
                        teamTechnican.setNumberOfStaff(teamTechnican.getNumberOfStaff() + 1);
                    } else if (departmentEmployee.equalsIgnoreCase("Nhan vien ban hang")) {
                        teamSale.setNumberOfStaff(teamSale.getNumberOfStaff() + 1);
                    } else if (departmentEmployee.equalsIgnoreCase("Nhan vien truyen thong")) {
                        teamMarketing.setDepartmentID(teamMarketing.getDepartmentID() + 1);
                    } else {
                        Department newDepartment1 = new Department("UnknowID", departmentEmployee, 1);
                        totaldDepartments.add(newDepartment1);
                    }

                    break;
                case 2:
                    System.out.println("Them vao nhan vien cap quan ly");
                    System.out.println("Nhap ma nhan vien:");
                    String idManager = sc.nextLine();
                    for (int i = 0; i < totalStaff.size(); i++) {
                        while (idManager.equalsIgnoreCase(totalStaff.get(i).getStaffId())) {
                            System.out.println("Ma nhan vien nay da ton tai");
                            System.out.println("Nhap lai ma nhan vien:");
                            ;
                            idManager = sc.nextLine();
                            i = 0;
                        }
                    }
                    System.out.println("Nhap ten nhan vien:");
                    String nameManager = sc.nextLine();
                    System.out.println("Nhap tuoi nhan vien:");
                    int ageManager = Integer.parseInt(sc.nextLine());
                    while (ageManager < 0) {
                        System.out.println("Nhap lai tuoi nhan vien:");
                        ageManager = Integer.parseInt(sc.nextLine());
                    }
                    System.out.println("Nhap vao he so luong:");
                    double coefOfManager = Integer.parseInt(sc.nextLine());
                    while (coefOfManager < 0) {
                        System.out.println("Nhap lai he so luong:");
                        coefOfManager = Integer.parseInt(sc.nextLine());
                    }
                    System.out.println("Nhap vao ngay lam:");
                    String startDateOfManger = sc.nextLine();

                    // chọn bộ phận cho quản lý
                    int newDepartmentManager;
                    String departmentManager = "";
                    do {
                        System.out.println("Chon bo phan lam viec:");
                        System.out.println("1. Lap trinh vien");
                        System.out.println("2. Ky thuat vien");
                        System.out.println("3. Nhan vien ban hang");
                        System.out.println("4. Nhan vien truyen thong");
                        System.out.println("5. Them bo phan moi");
                        newDepartmentManager = Integer.parseInt(sc.nextLine());
                        switch (newDepartmentManager) {
                            case 1:
                                departmentManager = "Lap trinh vien";
                                break;
                            case 2:
                                departmentManager = "Ky thuat vien";
                                break;
                            case 3:
                                departmentManager = "Nhan vien ban hang";
                                break;
                            case 4:
                                departmentManager = "Nhan vien truyen thong";
                                break;
                            case 5:
                                System.out.println("Nhap ten bo phan moi");
                                sc.nextLine();
                                departmentManager = sc.nextLine();
                                break;

                            default:
                                System.out.println("Lua chon khong phu hop");
                                break;
                        }
                    } while (newDepartmentManager < 1 || newDepartmentManager > 5);
                    System.out.println("Nhap so ngay nghi phep:");
                    int leaveDayManager = Integer.parseInt(sc.nextLine());
                    while (leaveDayManager < 0) {
                        System.out.println("Nhap lai ngay nghi phep:");
                        leaveDayManager = Integer.parseInt(sc.nextLine());
                    }
                    System.out.println("Nhap chuc vu:");
                    String positionManager = sc.nextLine();

                    Staff newManager = new Manager(idManager, nameManager, ageManager, coefOfManager, startDateOfManger,
                            departmentManager, leaveDayManager, positionManager);
                    totalStaff.add(newManager);
                    if (departmentManager.equalsIgnoreCase("Lap trinh vien")) {
                        teamIT.setNumberOfStaff(teamIT.getNumberOfStaff() + 1);
                    } else if (departmentManager.equalsIgnoreCase("Ky thuat vien")) {
                        teamTechnican.setNumberOfStaff(teamTechnican.getNumberOfStaff() + 1);
                    } else if (departmentManager.equalsIgnoreCase("Nhan vien ban hang")) {
                        teamSale.setNumberOfStaff(teamSale.getNumberOfStaff() + 1);
                    } else if (departmentManager.equalsIgnoreCase("Nhan vien truyen thong")) {
                        teamMarketing.setNumberOfStaff(teamMarketing.getNumberOfStaff() + 1);
                    } else {
                        Department newDepartment2 = new Department("UnknowID", departmentManager, 1);
                        totaldDepartments.add(newDepartment2);
                    }
                    break;
                case 0:
                    break;
            }
        } while (typeOfStaff != 0);
    }

    // tìm kiếm thông tin nhân viên
    public static void findStaff(ArrayList<Staff> totalStaffs, Scanner sc) {
        int infoTypeStaff = 0;
        String infoSearched = "";
        do {
            System.out.println("");
            System.out.println("1. Tim kiem theo ten nhan vien");
            System.out.println("2. Tim Kiem theo ma so nhan vien");
            System.out.println("0. Tro lai menu chinh");
            System.out.println("");
            infoTypeStaff = Integer.parseInt(sc.nextLine());
            while (infoTypeStaff < 0 || infoTypeStaff > 2) {
                System.out.println("Nhap lai lua chon cua ban:");
                infoTypeStaff = Integer.parseInt(sc.nextLine());
            }
            switch (infoTypeStaff) {
                case 1:
                    infoSearched = "";
                    System.out.println("Nhap thong tin tim kiem");
                    String yourSearch = sc.nextLine();
                    for (int i = 0; i < totalStaffs.size(); i++) {
                        if (yourSearch.equalsIgnoreCase(totalStaffs.get(i).getStaffName())) {
                            infoSearched += "ID nhan vien: " + totalStaffs.get(i).getStaffId() + "\n"
                                    + "Ten nhan vien:"
                                    + totalStaffs.get(i).getStaffName() + "\n" + "Tuoi nhan vien: "
                                    + totalStaffs.get(i).getStaffAge() + "\n" + "He so luong: "
                                    + totalStaffs.get(i).getCoefSalary() + "\n" + "Ngay vao lam: "
                                    + totalStaffs.get(i).getStartDate() + "\n" + "Bo phan lam viec: "
                                    + totalStaffs.get(i).getStaffDepartment() + "\n" + "So ngay nghi phep: "
                                    + totalStaffs.get(i).getLeaveDay();
                            if (totalStaffs.get(i) instanceof Employee) {
                                infoSearched += "So gio lam them: "
                                        + ((Employee) totalStaffs.get(i)).getLeaveDay()
                                        + "\n" + "Muc luong hien tai: "
                                        + ((Employee) totalStaffs.get(i)).calculateSalary()
                                        + "\n\n";
                            }
                            if (totalStaffs.get(i) instanceof Manager) {
                                infoSearched += "Vi tri: " + ((Manager) totalStaffs.get(i)).getStaffDepartment() + "\n"
                                        + "Muc luong hien tai: " + ((Manager) totalStaffs.get(i)).calculateSalary()
                                        + "\n\n";
                            }
                        } else {
                            infoSearched += "";
                        }
                    }
                    if (infoSearched == "") {
                        System.out.println("Khong tim thay nhan vien voi thong tin tren!");
                    } else {
                        System.out.println(infoSearched);
                    }
                    break;
                case 2:
                    infoSearched = "";
                    System.out.println("Nhap ma nhan vien can tim kiem");
                    String idFind = sc.nextLine();
                    for (int i = 0; i < totalStaffs.size(); i++) {
                        if (idFind.equalsIgnoreCase(totalStaffs.get(i).getStaffId())) {
                            infoSearched += "ID nhan vien: " + totalStaffs.get(i).getStaffId() + "\n"
                                    + "Ten nhan vien:"
                                    + totalStaffs.get(i).getStaffName() + "\n" + "Tuoi nhan vien: "
                                    + totalStaffs.get(i).getStaffAge() + "\n" + "He so luong: "
                                    + totalStaffs.get(i).getCoefSalary() + "\n" + "Ngay vao lam: "
                                    + totalStaffs.get(i).getStartDate() + "\n" + "Bo phan lam viec: "
                                    + totalStaffs.get(i).getStaffDepartment() + "\n" + "So ngay nghi phep: "
                                    + totalStaffs.get(i).getLeaveDay();
                            if (totalStaffs.get(i) instanceof Employee) {
                                infoSearched += "So gio lam them: "
                                        + ((Employee) totalStaffs.get(i)).getLeaveDay()
                                        + "\n" + "Muc luong hien tai: "
                                        + ((Employee) totalStaffs.get(i)).calculateSalary()
                                        + "\n\n";
                            }
                            if (totalStaffs.get(i) instanceof Manager) {
                                infoSearched += "Vi tri: " + ((Manager) totalStaffs.get(i)).getStaffDepartment() + "\n"
                                        + "Muc luong hien tai: " + ((Manager) totalStaffs.get(i)).calculateSalary()
                                        + "\n\n";
                            }
                        } else {
                            infoSearched += "";
                        }
                    }
                    if (infoSearched == "") {
                        System.out.println("Khong tim thay nhan vien voi thong tin tren");
                    } else {
                        System.out.println(infoSearched);
                    }

                    break;
                case 0:
                    break;
            }

        } while (infoTypeStaff != 0);

    }

    public static void displayInfoByAscendingSoftSalary(ArrayList<Staff> totalStaff) {
        Collections.sort(totalStaff, Staff.ascendingSalary);
        for (Staff iterable_element : totalStaff) {
            iterable_element.displaySalary();
        }
    }

    public static void displayInfoByDescendingSoftSalary(ArrayList<Staff> totalStaff) {
        Collections.sort(totalStaff, Staff.descendingSalary);
        for (Staff iterable_element : totalStaff) {
            iterable_element.displaySalary();
        }
    }

}
