package com.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseService {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public BaseService() {
    }
}
