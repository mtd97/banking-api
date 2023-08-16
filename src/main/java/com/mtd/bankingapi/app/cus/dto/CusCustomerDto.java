package com.mtd.bankingapi.app.cus.dto;

import lombok.Data;

@Data
public class CusCustomerDto {

    Long id;
    private String name;
    private String surname;
    private Long identityNo;
}

