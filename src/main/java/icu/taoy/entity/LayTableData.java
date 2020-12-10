package icu.taoy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author javakiller宇
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LayTableData<T> {
    private Integer code;
    private String msg;
    private Integer count;
    private List<T> data;
}