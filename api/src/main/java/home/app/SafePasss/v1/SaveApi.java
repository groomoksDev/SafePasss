package home.app.SafePasss.v1;

import home.app.SafePasss.v1.dto.ResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("safe-api")
public interface SaveApi {

    @Operation(description = "Set new password")
    @GetMapping("/new-pass")
    ResponseEntity<ResponseDto<Boolean>> newPass(@RequestParam(value = "pass") String serviceName,
                   @RequestParam(value = "pass") String pass);

    @Operation(description = "Get actual password for service")
    @GetMapping("/pass/{service}")
    ResponseEntity<ResponseDto<String>> getActualPassByService(@RequestParam(value = "service") String service);

    @Operation(description = "Get actual password for service")
    @GetMapping("/often-pass")
    ResponseEntity<ResponseDto<String>> getActualOftenPass();
}
