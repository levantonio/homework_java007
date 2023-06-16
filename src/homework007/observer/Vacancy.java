package homework007.observer;

public class Vacancy {
    private String vacancyName;

    private double maxSalary;

    private boolean relevance = true;

    public String getVacancyName() {
        return vacancyName;
    }

    public void setVacancyName(String vacancyName) {
        this.vacancyName = vacancyName;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public boolean isRelevance() {
        return relevance;
    }

    public void setRelevance(boolean relevance) {
        this.relevance = relevance;
    }

    public Vacancy(String vacancyName, double maxSalary) {
        this.vacancyName = vacancyName;
        this.maxSalary = maxSalary;
    }

    public Vacancy(String vacancyName) {
        this.vacancyName = vacancyName;
    }
}
