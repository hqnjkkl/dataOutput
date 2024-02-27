package com.output;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestReplace {


    @Test
    public void test1RemoveStage() {
        DataConvertStrategy dataConvertStrategy = DataConvertFactory.getDataConvertStrategy(2);
        String test1 = "aabcccbbad";
        List<String> testResult1 =  dataConvertStrategy.convert(test1,0);
        assertEquals("aabbbbad", testResult1.get(0));
        assertEquals("aaaad", testResult1.get(1));
        assertEquals("Zd", testResult1.get(2));
    }

    @Test
    public void test2RemoveStage() {
        DataConvertStrategy dataConvertStrategy = DataConvertFactory.getDataConvertStrategy(2);
        String test2 = "aaaaaaaa";
        List<String> testResult2 = dataConvertStrategy.convert(test2,0);
        assertEquals("Z", testResult2.get(0));
    }

    @Test
    public void test3RemoveStage() {
        DataConvertStrategy dataConvertStrategy = DataConvertFactory.getDataConvertStrategy(2);
        String test3 = "aaabbbcccddd";
        List<String> testResult2 = dataConvertStrategy.convert(test3,0);
        assertEquals("Zabc", testResult2.get(0));
    }

    @Test
    public void test4RemoveStage() {
        DataConvertStrategy dataConvertStrategy = DataConvertFactory.getDataConvertStrategy(2);
        String test4 = "ddccbbaaabcd";
        List<String> testResult2 = dataConvertStrategy.convert(test4,0);
        assertEquals("ddccbbZbcd", testResult2.get(0));
    }

    @Test
    public void test5RemoveStage() {
        DataConvertStrategy dataConvertStrategy = DataConvertFactory.getDataConvertStrategy(2);
        String test2 = "aabbccddee";
        List<String> testResult2 = dataConvertStrategy.convert(test2,0);
        assertEquals("aabbccddee", testResult2.get(0));
    }

    @Test
    public void test6RemoveStage() {
        DataConvertStrategy dataConvertStrategy = DataConvertFactory.getDataConvertStrategy(2);
        String test4 = "abcd";
        List<String> testResult4 =  dataConvertStrategy.convert(test4,0);
        assertEquals("abcd", testResult4.get(0));
    }

    @Test
    public void test7RemoveStage() {
        DataConvertStrategy dataConvertStrategy = DataConvertFactory.getDataConvertStrategy(2);
        String test4 = "";
        List<String> testResult4 =  dataConvertStrategy.convert(test4,0);
        assertEquals("", testResult4.get(0));
    }

    @Test
    public void test8RemoveStage() {
        DataConvertStrategy dataConvertStrategy = DataConvertFactory.getDataConvertStrategy(2);
        String test8 = "ccc";
        List<String> testResult8 =  dataConvertStrategy.convert(test8,0);
        assertEquals("b", testResult8.get(0));
    }

    @Test
    public void test9RemoveStage() {
        DataConvertStrategy dataConvertStrategy = DataConvertFactory.getDataConvertStrategy(2);
        String test9 = "bbb";
        List<String> testResult9 =  dataConvertStrategy.convert(test9,0);
        assertEquals("a", testResult9.get(0));
    }

    @Test
    public void test10RemoveStage() {
        DataConvertStrategy dataConvertStrategy = DataConvertFactory.getDataConvertStrategy(2);
        String test10 = "abcccbad";
        List<String> testResult10 =  dataConvertStrategy.convert(test10,0);
        assertEquals("abbbad", testResult10.get(0));
        assertEquals("aaad", testResult10.get(1));
        assertEquals("Zd", testResult10.get(2));
    }


}
