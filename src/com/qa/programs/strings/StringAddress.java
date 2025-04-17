
package com.qa.programs.strings;

public class StringAddress {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        String str5 = "Hello1";

        System.out.println("Hash Code of str1: " + System.identityHashCode(str1));
        System.out.println("Hash Code of str2: " + System.identityHashCode(str2));
        System.out.println("Hash Code of str3: " + System.identityHashCode(str3));
        System.out.println("Hash Code of str4: " + System.identityHashCode(str4));
        System.out.println("Hash Code of str5: " + System.identityHashCode(str5));
        
        System.out.println(str1==str2);
        System.out.println(str3==str4);
    }
}