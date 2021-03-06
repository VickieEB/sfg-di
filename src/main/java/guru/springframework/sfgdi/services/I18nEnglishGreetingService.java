package guru.springframework.sfgdi.services;

public class I18nEnglishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "EN: Hello Spring-ers";
    }
}
