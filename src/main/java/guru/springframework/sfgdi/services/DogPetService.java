package guru.springframework.sfgdi.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"dog", "default"})
@Service("dog")
@Primary
public class DogPetService implements PetService{

    @Override
    public String getPetType(){
        return "Dogs are the best!";
    }
}
