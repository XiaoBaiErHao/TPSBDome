package com.example.tpsb.myprimg;

public class PlateRecognizer {

    /**
     * JNI Functions
     */
    // 加载车牌识别库
    static {
        try {
            System.loadLibrary("EasyPR");
        } catch (UnsatisfiedLinkError ule) {
            System.err.println("WARNING: Could not load EasyPR library!");
        }
    }

    public static native String stringFromJNI();
    public static native long initPR(String svmpath, String annpath);
    public static native long uninitPR(long recognizerPtr);
    public static native byte[] plateRecognize(long recognizerPtr, String imgpath);
}
