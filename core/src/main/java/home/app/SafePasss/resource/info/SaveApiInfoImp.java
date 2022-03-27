package home.app.SafePasss.resource.info;

import home.app.SafePasss.v1.SaveApiInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaveApiInfoImp implements SaveApiInfo {

    @Value("${safe-pass.version}")
    private String buildVersion;

    @Override
    public String version() {
        return String.format("Version %s!", buildVersion);
    }
}
