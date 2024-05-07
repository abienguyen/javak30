package vn.tvn.practice.read_file_excel.object;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TestCase {
    private String id;
    private String name;
    private String des;
    private String browser;
    private List<TestStep> testSteps;
}
