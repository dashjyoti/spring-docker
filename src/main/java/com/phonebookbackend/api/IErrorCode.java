package com.phonebookbackend.api;

import org.apache.kafka.common.protocol.types.Field;

public interface IErrorCode {
    long getCode();
    String getMessage();
}
