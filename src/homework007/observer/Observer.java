package homework007.observer;

public interface Observer {
    void receiveOffer(String companyName, Vacancy vacancy);

    boolean takeJob (Vacancy vacancy);
}
