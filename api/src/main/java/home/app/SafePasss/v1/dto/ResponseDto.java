package home.app.SafePasss.v1.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
public class ResponseDto<T> {
    T response;
    HttpStatus status;
}
