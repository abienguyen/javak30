package vn.tvn.practice.read_file_excel;

import vn.tvn.practice.read_file_excel.object.TestCase;

import java.util.ArrayList;

public class DemoRun {
    public static void main(String[] args) {
        //ReadTestCaseFile readTestCaseFile = new ReadTestCaseFile();
        ///readTestCaseFile.readTestCase("TestCases.xlsx");

        // demo builder
        TestCase testCase = new TestCase();
        TestCase allAgr = new TestCase("1", "test", "...","ie",
                new ArrayList<>());

        TestCase builderTC = TestCase.builder()
                .id("1")
                .name("Tesst login")
                .des(".....")
                .browser("IE")
                .testSteps(new ArrayList<>())
                .build();
    }
}
