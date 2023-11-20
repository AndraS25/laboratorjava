package lab5;

public class Employee {
    private String name;
    private String email;
    private Integer hourRate;
    private Integer capacity;
    private Integer freeDays;
    private Integer calculateDailyIncome()
    {
        return hourRate*capacity;
    }
}
