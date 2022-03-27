package home.app.SafePasss.v1;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("safe-api-info")
public class SafeApiInfo {

    @Value("${safe-pass.version}")
    private String buildVersion;

    @Operation(description = "Версия приложения")
    @GetMapping("/version")
    public String version() {
        return String.format("Version %s!", buildVersion);
    }
}
