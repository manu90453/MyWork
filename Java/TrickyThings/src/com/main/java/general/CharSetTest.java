package com.main.java.general;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.nio.charset.Charset;



/*public class CharSetTest {

}*/


public class CharSetTest {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        System.out.println("Default Charset=" + Charset.defaultCharset());
        //System.setProperty("file.encoding", "Latin-1");
        System.setProperty("file.encoding", "ISO-8851-1");
        Field cs = Charset.class.getDeclaredField("defaultCharset");
        cs.setAccessible(true);
        cs.set(null, null);

        System.out.println("file.encoding=" + System.getProperty("file.encoding"));
        System.out.println("Default Charset=" + Charset.defaultCharset());
        System.out.println("Default Charset in Use=" + getDefaultCharSet());
    }

    private static String getDefaultCharSet() {
        OutputStreamWriter writer = new OutputStreamWriter(new ByteArrayOutputStream());
        String enc = writer.getEncoding();
        return enc;
    }
}