package br.gov.ro.pge.sei.api.config;

import br.gov.ro.pge.sei.api.domain.fault.FaultWS;
import br.gov.ro.pge.sei.api.domain.fault.SeiFaultException;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ControllerAdvice
public class GlobalDefaultExceptionHandler extends ResponseEntityExceptionHandler {

    private MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>() {{
        add("Content-Type", MediaType.APPLICATION_JSON_VALUE + ";charset=UTF-8");
    }};

    @ExceptionHandler(SeiFaultException.class)
    public final ResponseEntity<Object> handleAllExceptions(SeiFaultException ex, WebRequest request) {
        FaultWS error = ex.getFault();
        return new ResponseEntity(error, headers, HttpStatus.valueOf(error.getStatusCode()));
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
        FaultWS error = new FaultWS();
        error.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        error.setUserMessage("Operação inválida! Ocorreu um erro ao executar a operação.");
        error.setDeveloperMessage(ExceptionUtils.getStackTrace(ex));
        return new ResponseEntity(error, headers, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

        List<String> details = Optional.ofNullable(ex.getBindingResult().getFieldErrors())
                .orElseGet(Collections::emptyList)
                .stream()
                .map(ObjectError::getDefaultMessage)
                .collect(Collectors.toList());

        FaultWS error = new FaultWS();
        error.setStatusCode(HttpStatus.BAD_REQUEST.value());
        error.setUserMessage("Operação inválida! Existem campos obrigatórios não preenchidos.");
        error.setDeveloperMessage(ExceptionUtils.getStackTrace(ex));
        error.getDetails().addAll(details);

        return new ResponseEntity(error, this.headers, HttpStatus.BAD_REQUEST);
    }
}
