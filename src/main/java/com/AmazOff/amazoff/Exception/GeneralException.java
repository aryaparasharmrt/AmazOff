package com.AmazOff.amazoff.Exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneralException extends Exception {
    private String type;
    private String message;

    public GeneralException(String message) {
        super(message);
        this.message = message;
    }

    public GeneralException(String type, String message) {
        this.type = type;
        this.message = message;
    }
}
