package com.mtd.bankingapi.app.gen.exeptions;

import com.mtd.bankingapi.app.gen.enums.BaseErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class IllegalFieldException extends GenBusinessException {

    public IllegalFieldException(BaseErrorMessage message) {
        super(message);
    }
}
