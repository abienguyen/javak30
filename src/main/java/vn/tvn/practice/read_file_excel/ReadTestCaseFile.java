package vn.tvn.practice.read_file_excel;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import vn.tvn.practice.bt_5.FileResourceUtils;
import vn.tvn.practice.read_file_excel.object.TestCase;
import vn.tvn.practice.read_file_excel.object.TestStep;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class ReadTestCaseFile {
    //fai tạo Inputstrean trc (dùng class FileResourceUtils ở BT 5)
    //Dùng workbook để truyền file excel

    public Map<String, TestCase> readTestCase(String fileName) {
        try {
            InputStream fileTC = FileResourceUtils.getFileResource(fileName);
            Workbook workbook = new XSSFWorkbook(fileTC);
            Sheet testCase = workbook.getSheet("testcase");//đọc theo sheet của excel, nên dùng đọc theo tên

            //Khai báo map
            Map<String, TestCase> mapTestCase = new HashMap<>();
            List<TestStep> steps = new ArrayList<>();
            //same same list
            Iterator<Row> iterator = testCase.iterator();
            //duyệt qua từng Row
            while (iterator.hasNext()) {
                Row currentRow = iterator.next();
                if (currentRow.getRowNum() > 1) {
                    Cell firstCell = currentRow.getCell(0);
                    String id = getCellValue(firstCell, firstCell.getCellType());
                    Cell nameTCCell = currentRow.getCell(1);
                    Cell desTCCell = currentRow.getCell(2);
                    Cell actionCell = currentRow.getCell(3);
                    Cell locatorCell = currentRow.getCell(4);
                    Cell expectedCell = currentRow.getCell(5);

                    //điều kiện tách test case - id này ko đc blank

                            if (StringUtils.isNotBlank(id)) {
                                var tempTC = initTestCase(id, nameTCCell, desTCCell);
                                steps = new ArrayList<>();
                                tempTC.setTestSteps(steps);
                                mapTestCase.put(id, tempTC);
                            }
                            addTestStep2TestCase(actionCell, locatorCell, expectedCell, steps);
                        }
                    }
                    return mapTestCase;
                } catch(IOException e){
                    e.printStackTrace();
                    return null;
                }
            }

            private TestCase initTestCase (String id, Cell nameTCCell, Cell desTCCell){
                TestCase tempTC = new TestCase();
                tempTC.setId(id);
                tempTC.setName(getCellValue(nameTCCell, nameTCCell.getCellType()));
                tempTC.setDes(getCellValue(desTCCell, desTCCell.getCellType()));
                return tempTC;
            }

            private void addTestStep2TestCase (Cell actionCell, Cell locatorCell,
                    Cell expectedCell, List < TestStep > steps){
                TestStep testStep = new TestStep();
                testStep.setAction(getCellValue(actionCell, actionCell.getCellType()));
                testStep.setLocator(getCellValue(locatorCell, locatorCell.getCellType()));
                testStep.setExpected(getCellValue(expectedCell, expectedCell.getCellType()));
                steps.add(testStep);
            }

            private String getCellValue (Cell cell, CellType cellType){
                switch (cellType) {
                    case STRING:
                        return cell.getStringCellValue();
                    case NUMERIC:
                        return String.valueOf(cell.getNumericCellValue());
                    case BOOLEAN:
                        return String.valueOf(cell.getBooleanCellValue());
                    case FORMULA:
                        var resultType = cell.getCachedFormulaResultType();
                        return getCellValue(cell, resultType);
                    default:
                        return StringUtils.EMPTY;
                }

            }
        }