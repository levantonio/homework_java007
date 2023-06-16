package homework007.observer;

import java.util.Random;

public class DepartmentHead implements Observer {


    private static Random random = new Random();

    private String name;

    private double minSalary;

    private boolean hasJob;

    public DepartmentHead(String name) {
        this.name = name;
        minSalary = random.nextDouble(100000, 120000);
        hasJob = false;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        double salary = vacancy.getMaxSalary();
        if (minSalary <= salary) {
            System.out.printf("Руководитель %s (%.2f) >>> Мне нужна эта работа (%s)! [%s - %.2f]\n",
                    name, minSalary, vacancy.getVacancyName(), companyName, salary);
            hasJob = true;
        } else {
            System.out.printf("Руководитель %s >>> Я найду работу (%s) получше (%.2f)! [%s - %.2f]\n",
                    name, vacancy.getVacancyName(), minSalary, companyName, salary);
        }
    }

    @Override
    public boolean takeJob(Vacancy vacancy) {
        return hasJob;
    }
}
