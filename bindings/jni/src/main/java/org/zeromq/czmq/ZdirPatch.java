/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/
package org.zeromq.czmq;

public class ZdirPatch implements AutoCloseable{
    static {
        try {
            System.loadLibrary ("czmqjni");
        }
        catch (Exception e) {
            System.exit (-1);
        }
    }
    long self;
    /*
    Create new patch
    */
    native static long __new (String path, long file, int op, String alias);
    public ZdirPatch (String path, long file, int op, String alias) {
        /*  TODO: if __new fails, self is null...  */
        self = __new (path, file, op, alias);
    }
    public ZdirPatch () {
        self = 0;
    }
    /*
    Destroy a patch
    */
    native static void __destroy (long self);
    @Override
    public void close () {
        __destroy (self);
        self = 0;
    }
    /*
    Create copy of a patch. If the patch is null, or memory was exhausted,
    returns null.                                                         
    */
    native static long __dup (long self);
    public long dup () {
        return __dup (self);
    }
    /*
    Return patch file directory path
    */
    native static String __path (long self);
    public String path () {
        return __path (self);
    }
    /*
    Return patch file item
    */
    native static long __file (long self);
    public long file () {
        return __file (self);
    }
    /*
    Return operation
    */
    native static int __op (long self);
    public int op () {
        return __op (self);
    }
    /*
    Return patch virtual file path
    */
    native static String __vpath (long self);
    public String vpath () {
        return __vpath (self);
    }
    /*
    Calculate hash digest for file (create only)
    */
    native static void __digestSet (long self);
    public void digestSet () {
        __digestSet (self);
    }
    /*
    Return hash digest for patch file
    */
    native static String __digest (long self);
    public String digest () {
        return __digest (self);
    }
    /*
    Self test of this class.
    */
    native static void __test (boolean verbose);
    public void test (boolean verbose) {
        __test (verbose);
    }
}