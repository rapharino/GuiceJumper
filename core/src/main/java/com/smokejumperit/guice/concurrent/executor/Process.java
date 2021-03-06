package com.smokejumperit.guice.concurrent.executor;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ExecutorService;

import com.google.inject.BindingAnnotation;

/**
 * Denotes that a {@link ExecutorService} will be used for processing operations.
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@BindingAnnotation
public @interface Process {

}
