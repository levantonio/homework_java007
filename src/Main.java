import homework007.adapter.AdapterTS5000Info;
import homework007.adapter.MS2000;
import homework007.adapter.MeteoStore;
import homework007.adapter.ST5000Info;
import homework007.bulder.MailMessage;
import homework007.bulder.MailMessageBuilder;
import homework007.observer.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
            MS2000 ms200 = new MS2000(55);
            ST5000Info st500Info = new ST5000Info(56);
            MeteoStore meteoStore = new MeteoStore();
            meteoStore.save(ms200);
            meteoStore.save(new AdapterTS5000Info(st500Info));


        MailMessage mailMessage = new MailMessageBuilder()
                .setFrom("from@gmail.com")
                .setSubject("object")
                .setParam2(12.12)
                .setTo("to@gmail.com")
                .build();

        StringBuilder stringBuilder = new StringBuilder("ABC");
        String str = stringBuilder.append("DEF")
                .append("GHI")
                .append("GKL")
                .toString();

        System.out.println(str);



        System.out.println("////////////////////////////////////////////////////////////////");
        System.out.println("****************************************************************");





        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("MailGroup", jobAgency);
        Company yandex = new Company("Neft", jobAgency);

        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Student sidorov = new Student("Sidorov");
        DepartmentHead oooMAXmin = new DepartmentHead("oooMAXmin");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(oooMAXmin);

        for (int i = 0; i < 3; i++){
            geekBrains.needEmployee("Тех Директор", randomSalary(70000, 100000));
            google.needEmployee("Python-backend-developer", randomSalary(150000, 200000));
            yandex.needEmployee("Системный администратор", randomSalary(30000, 50000));

        }
    }

    static double randomSalary(double min, double max){
        Random random = new Random();
        return random.nextDouble(min, max);
    }




}
