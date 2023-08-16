package com.mtd.bankingapi.app.sec.dto;

import lombok.Data;

@Data
public class SecLoginRequestDto {

    private Long identityNo;
    private String password;
}
