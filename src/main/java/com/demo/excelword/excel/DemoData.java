package com.demo.excelword.excel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @Author: 曾睿
 * @Date: 2021/3/11 16:09
 */
@Data
public class DemoData {
    // 如果不使用ExcelProperty则会按照顺序自动设置
    @ExcelProperty("a")
    private String a;

    @ExcelProperty("b")
    private String b;

    @ExcelProperty("c")
    private String c;
}
