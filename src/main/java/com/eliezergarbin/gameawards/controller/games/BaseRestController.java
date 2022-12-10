package com.eliezergarbin.gameawards.controller.games;

import com.eliezergarbin.gameawards.service.exception.BusinessException;
import com.eliezergarbin.gameawards.service.exception.NoContentException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public class BaseRestController {

    @ExceptionHandler(NoContentException.class)
    public ResponseEntity<Void> handlerNoContent(NoContentException exception) {
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<Void> handlerBusinessException(BusinessException exception) {
        return ResponseEntity.noContent().build();
    }

}
