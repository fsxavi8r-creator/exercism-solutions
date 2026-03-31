public class SalaryCalculator {

    private double baseSalary = 1000.00;
    private double multiplier = 1.0;
    private double daysPenalty = 0.85;
    private int baseProductMultiplier = 10;
    private int bonusProductMultiplier = 13;
        
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped <= 4 ? multiplier : daysPenalty;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold <= 19 ? baseProductMultiplier : bonusProductMultiplier;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double adjustedSalary = baseSalary * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return adjustedSalary = adjustedSalary >= 2000.00 ? 2000.00 : adjustedSalary;
    }

}
