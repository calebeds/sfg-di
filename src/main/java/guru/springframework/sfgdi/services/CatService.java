package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"cat", "default"})
@Service
public class CatService implements PetService {

    @Override
    public String getPetType() {
        return "Cats are the best";
    }
}
