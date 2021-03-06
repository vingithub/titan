package com.thinkaurelius.titan.diskstorage.locking;

import com.thinkaurelius.titan.diskstorage.PermanentStorageException;

/**
 * This exception signifies a permanent exception while attempting to acquire a lock
 * in the titan storage backend, such as another lock taking presedence.
 * <p/>
 * (c) Matthias Broecheler (me@matthiasb.com)
 */

public class PermanentLockingException extends PermanentStorageException implements LockingException {

    private static final long serialVersionUID = 482890657293484420L;

    /**
     * @param msg Exception message
     */
    public PermanentLockingException(String msg) {
        super(msg);
    }

    /**
     * @param msg   Exception message
     * @param cause Cause of the exception
     */
    public PermanentLockingException(String msg, Throwable cause) {
        super(msg, cause);
    }

    /**
     * Constructs an exception with a generic message
     *
     * @param cause Cause of the exception
     */
    public PermanentLockingException(Throwable cause) {
        this("Permanent locking failure", cause);
    }


}
