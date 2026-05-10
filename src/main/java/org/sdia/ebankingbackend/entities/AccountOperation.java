package org.sdia.ebankingbackend.entities;

import org.sdia.ebankingbackend.enums.OperationType;

import java.util.Date;

public class AccountOperation {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
}
