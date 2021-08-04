//package com.deepocean.coverage;
//
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//
//public class CalculatorTest {
//
//    private Calculator instance = new Calculator();
//
//    @Test
//    public void testAdd() {
//        int a = 10;
//        int b = 20;
//        int expected = 30;
//        Assert.assertEquals(expected, instance.add(a, b));
//    }
//
//    @Test
//    public void testSub() {
//        int a = 10;
//        int b = 20;
//        int expected = -10;
//        Assert.assertEquals(expected, instance.sub(a, b));
//    }
//
//    @Test
//    public void testRex() {
//        String origin = "href=\"123";
//        String target = origin.replaceAll("href=\"", "href=\"/api/");
//        System.out.println(target);
//    }
//
//    @Test
//    public void testPattern() {
//        String origin = "<tr>\n" +
//                "        <td id=\"a3\"><a href=\"com.deepocean.sort/index.html\" class=\"el_package\">com.deepocean.sort</a></td>\n" +
//                "        <td class=\"bar\" id=\"b1\"><img src=\"jacoco-resources/redbar.gif\" width=\"21\" height=\"10\" title=\"99\" alt=\"99\"/></td>\n" +
//                "        <td class=\"ctr2\" id=\"c3\">0%</td>\n" +
//                "        <td class=\"bar\" id=\"d1\"><img src=\"jacoco-resources/redbar.gif\" width=\"43\" height=\"10\" title=\"8\" alt=\"8\"/></td>\n" +
//                "        <td class=\"ctr2\" id=\"e1\">0%</td>\n" +
//                "        <td class=\"ctr1\" id=\"f1\">8</td>\n" +
//                "        <td class=\"ctr2\" id=\"g1\">8</td>\n" +
//                "        <td class=\"ctr1\" id=\"h1\">17</td>\n" +
//                "        <td class=\"ctr2\" id=\"i1\">17</td>\n" +
//                "        <td class=\"ctr1\" id=\"j2\">4</td>\n" +
//                "        <td class=\"ctr2\" id=\"k2\">4</td>\n" +
//                "        <td class=\"ctr1\" id=\"l2\">1</td>\n" +
//                "        <td class=\"ctr2\" id=\"m2\">1</td>\n" +
//                "    </tr>";
//        int head = origin.indexOf("<tr>");
//        int foot = origin.indexOf("</tr>");
//        origin = origin.substring(0, head) + origin.substring(head, foot)
//                .replaceAll("href=\"", "@click=\"checkReport(")
//                .replaceAll("html", "html" + ")") + origin.substring(foot);
//        System.out.println(origin);
//    }
//
//
//}
//
