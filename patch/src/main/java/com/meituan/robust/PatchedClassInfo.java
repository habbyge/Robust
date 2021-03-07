package com.meituan.robust;

/**
 * Created by hedex on 16/6/3.
 * a map record the class name before ProGuard and after ProGuard
 * todo: 用于解决patch时混淆问题的 ？？？？？？
 */
public class PatchedClassInfo {
    public String patchedClassName; //
    public String patchClassName;   //

    public PatchedClassInfo(String patchedClassName, String patchClassName) {
        this.patchedClassName = patchedClassName;
        this.patchClassName = patchClassName;
    }
}
