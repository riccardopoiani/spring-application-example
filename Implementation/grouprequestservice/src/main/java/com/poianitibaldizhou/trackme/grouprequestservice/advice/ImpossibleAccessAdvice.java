package com.poianitibaldizhou.trackme.grouprequestservice.advice;

import com.poianitibaldizhou.trackme.grouprequestservice.exception.BadOperatorRequestTypeException;
import com.poianitibaldizhou.trackme.grouprequestservice.exception.ImpossibleAccessException;
import com.poianitibaldizhou.trackme.grouprequestservice.util.ExceptionResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Advice for managing error wrong access to controller methods
 */
@ControllerAdvice
public class ImpossibleAccessAdvice {

    /**
     * An advice signaled into the body of the response that activates
     * only when the exception ImpossibleAccessException is thrown.
     * The issue is an HTTP 401.
     * The body of the advice contains the message of the exception
     *
     * @param e error that triggers the advice
     * @return http 401 that contains the message of the exception
     */
    @ExceptionHandler(ImpossibleAccessException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public @ResponseBody
    ExceptionResponseBody impossibleAccessHandler(ImpossibleAccessException e) {
        return new ExceptionResponseBody(
                Timestamp.valueOf(LocalDateTime.now()),
                HttpStatus.UNAUTHORIZED.value(),
                HttpStatus.UNAUTHORIZED.toString(),
                e.getMessage());
    }
}
