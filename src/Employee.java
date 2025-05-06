public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private Double lastPunchInTime = null;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public double getTotalPay() {
        return getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5;
    }

    public void punchTimeCard(double time) {
        if (lastPunchInTime == null) {
            lastPunchInTime = time;
            System.out.println(name + " punched in at " + time);
        } else {
            double worked = time - lastPunchInTime;
            if (worked > 0) {
                hoursWorked += worked;
                System.out.println(name + " punched out at " + time + ". Worked " + worked + " hours.");
            } else {
                System.out.println("Invalid punch-out time.");
            }
            lastPunchInTime = null;
        }
    }

}
