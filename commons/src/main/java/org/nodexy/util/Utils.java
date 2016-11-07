package org.nodexy.util;

import java.util.List;

/**
 * Created by phoenix on 11/1/16.
 */
public class Utils {
    public static String presentList(List<String> list, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); ++i) {
            sb.append(String.format("'%s'%s", list.get(i), (i+1==list.size()?"":sep+"")));
        }
        return sb.toString();
    }
    public static void put(Object ... args) {
        java.util.Arrays.asList(args).forEach(System.out::print);
        System.out.println();
    }
}
