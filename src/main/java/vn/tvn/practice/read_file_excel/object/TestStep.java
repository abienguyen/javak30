package vn.tvn.practice.read_file_excel.object;

import lombok.Builder;
import lombok.Data;

@Data
public class TestStep {
    private String action;
    private String locator;
    private String expected;
}
