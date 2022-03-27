package home.app.SafePasss.v1;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("safe-api-info")
public interface SaveApiInfo {

    @Operation(description = "Версия приложения")
    @GetMapping("/version")
    String version();
}
