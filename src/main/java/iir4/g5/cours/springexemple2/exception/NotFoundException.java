package iir4.g5.cours.springexemple2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "No Project Found")
@ResponseBody()
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super();
    }
}
