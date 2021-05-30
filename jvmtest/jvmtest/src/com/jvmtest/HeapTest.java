package com.jvmtest;

import java.util.ArrayList;

/**
 * @author Shen Tianyu
 * @version 1.0
 * @date 2020-04-06 21:31
 */
public class HeapTest {

    byte[] a = new byte[1024*100];

    public static void main(String[] args) throws InterruptedException {
        ArrayList<HeapTest> heapTests = new ArrayList<HeapTest>();
        while(true){
            heapTests.add(new HeapTest());
            Thread.sleep(10);
        }
    }
}
