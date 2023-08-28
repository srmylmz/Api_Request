package test_data;

import java.util.HashMap;
import java.util.Map;

public class PetStoreData {
    public static Map<String,Object> petStoreDataMapper(String username,String firstname,String lastName,
                                                  String email,String password,String phone,
                                                  Integer userStatus) {

        Map<String, Object> petData= new HashMap<>();
        if (username != null) {
            petData.put("username",username);
        }
        if (firstname != null) {
            petData.put("firstName",firstname);
        }
        if (lastName != null) {
            petData.put("lastName", lastName);
        }
        if (email !=null) {
            petData.put("email", email);
        }
        if (password!=null) {
            petData.put("password", password);
        }
        if (phone!=null) {
            petData.put("phone", phone);
        }
        if (userStatus!=null) {
            petData.put("userStatus", userStatus);
        }

        return petData;
    }

}
