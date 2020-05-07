package guru.springframework.sfgdi.services;

public class I18nGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "DE: Hallo Welt";
    }
}
