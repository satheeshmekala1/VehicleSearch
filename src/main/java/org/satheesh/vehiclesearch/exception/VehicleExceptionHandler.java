package org.satheesh.vehiclesearch.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class VehicleExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(VehicleNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody  String vehicleNotFoundException(final VehicleNotFoundException exception,
                                    final HttpServletRequest request){

        return exception.getMessage();
    }
    @ExceptionHandler(RuntimeException.class)
    public @ResponseBody  String handleRuntimeException(final RuntimeException exception,
                                                final HttpServletRequest request){
        return exception.getMessage();
    }
    @ExceptionHandler(Exception.class)
    public @ResponseBody  String otherException(final Exception exception,
                                                          final HttpServletRequest request){
        return exception.getMessage();
    }

}
