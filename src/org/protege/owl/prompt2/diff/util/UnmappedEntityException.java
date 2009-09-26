package org.protege.owl.prompt2.diff.util;

public class UnmappedEntityException extends RuntimeException {
    public UnmappedEntityException() {
    }
    
    public UnmappedEntityException(String message) {
        super(message);
    }
    
    public UnmappedEntityException(Throwable t) {
        super(t);
    }

    public UnmappedEntityException(String  message, Throwable t) {
        super(message, t);
    }
}