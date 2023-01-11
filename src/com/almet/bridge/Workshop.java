package com.almet.bridge;

public abstract class Workshop {
    Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    void startFiltering(String message) {
        operation.operate(message);
    }
}
