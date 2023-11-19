package com.poianitibaldizhou.trackme.apigateway.advice;

import com.poianitibaldizhou.trackme.apigateway.util.ExceptionResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Advice for managing errors about user wrong credentials
 */
@ControllerAdvice
public class UsernameNotFoundAdvice {

    /**
     * An advice signaled into the body of the response that activates
     * only when the exception UsernameNotFoundException is thrown.
     * The issue is an HTTP 401.
     * The body of the advice contains the message of the exception
     *
     * @param e the error which triggers the advice
     * @return an http 401 response that contains the message of the exception
     */
    @ExceptionHandler(UsernameNotFoundException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public @ResponseBody
    ExceptionResponseBody usernameNotFoundHandler(UsernameNotFoundException e) {
        return new ExceptionResponseBody(
                Timestamp.valueOf(LocalDateTime.now()),
                HttpStatus.UNAUTHORIZED.value(),
                HttpStatus.UNAUTHORIZED.toString(),
                e.getMessage());

    }
}
