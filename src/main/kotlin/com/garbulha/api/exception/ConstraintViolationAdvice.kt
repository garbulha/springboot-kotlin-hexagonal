package com.garbulha.api.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus

@ControllerAdvice
class ConstraintViolationAdvice {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException::class)
    @ResponseBody
    fun handleMethodArgumentNotValidationException(ex: MethodArgumentNotValidException) : ConstraintViolationProblem{
        val violation = ex.fieldErrors.map{
            ConstraintViolation(field = it.field, message = it.defaultMessage)
        }

        return ConstraintViolationProblem(violation)
    }

    data class ConstraintViolationProblem(val violation : List<ConstraintViolation>)

    data class ConstraintViolation(val field: String, val message: String?)
}