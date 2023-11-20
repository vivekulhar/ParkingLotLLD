package dev.vivek.practiceparkinglot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Gate extends BaseModel{
    private int number;
    private GateType gateType;
    private Operator operator;
    private GateStatus gateStatus;
}
