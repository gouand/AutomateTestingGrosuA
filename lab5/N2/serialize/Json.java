package serialize;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Pet;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Json {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        Pet obj = mapper.readValue(new URL("https://petstore.swagger.io/v2/pet/1"), Pet.class);
        mapper.writeValue(new File("staff.json"), obj);
        System.out.println(obj.toString());

    }
}
