package home.app.SafePasss.resource.crud;

import home.app.SafePasss.impl.crud.SaveImp;
import home.app.SafePasss.v1.SaveApi;
import home.app.SafePasss.v1.dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class SaveApiImp implements SaveApi {
    private final SaveImp saveImp;

    @Override
    public ResponseEntity<ResponseDto<Boolean>> newPass(String serviceName, String pass) {
        var resp = new ResponseDto<Boolean>();

        resp.setResponse(saveImp.savePass(serviceName, pass));
        resp.setStatus(HttpStatus.OK);
        return ResponseEntity.of(Optional.of(resp));
    }

    @Override
    public ResponseEntity<ResponseDto<String>> getActualPassByService(@RequestParam(value = "service") String service){
        var resp = new ResponseDto<String>();
        resp.setResponse(saveImp.getActualPassByService(service));
        resp.setStatus(HttpStatus.OK);
        return ResponseEntity.of(Optional.of(resp));
    }

    @Override
    public ResponseEntity<ResponseDto<String>> getActualOftenPass(){
        var resp = new ResponseDto<String>();
        resp.setResponse(saveImp.getActualOftenPass());
        resp.setStatus(HttpStatus.OK);
        return ResponseEntity.of(Optional.of(resp));
    }
}
