package home.app.SafePasss.impl.crud;

import org.springframework.stereotype.Service;

@Service
public class SaveImp {

    public boolean savePass(String serviceName, String pass) {
        //TODO add saving pass
        return true;
    }

    public String getActualPassByService(String serviceName) {
        //TODO add getting pass
        return "passFor" + serviceName;
    }

    public String getActualOftenPass() {
        //TODO add getting ofter pass
        return "oftenPass";
    }
}
