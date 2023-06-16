package homework007.observer;

import java.util.Random;

public class Master implements Observer{
    private static Random random = new Random();

    private String name;

    private double minSalary;

    private boolean hasJob;

    public Master(String name) {
        this.name = name;
        minSalary = random.nextDouble(60000, 80000);
        hasJob = false;
    }

    @Override
    public void receiveOffer(String companyName, Vacancy vacancy) {
        double salary = vacancy.getMaxSalary();
        if (minSalary <= salary){
            System.out.printf("Рабочий %s (%.2f) >>> Мне нужна эта работа (%s)! [%s - %.2f]\n",
                    name, minSalary, vacancy.getVacancyName(), companyName, salary);
            hasJob = true;
        }
        else {
            System.out.printf("Рабочий %s >>> Я найду работу (%s) получше (%.2f)! [%s - %.2f]\n",
                    name, vacancy.getVacancyName(), minSalary, companyName, salary);
        }
    }

    @Override
    public boolean takeJob(Vacancy vacancy) {
        return hasJob;
    }
}
