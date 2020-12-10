package icu.taoy.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author javakiller宇
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("lay_user")
public class LayUser implements Serializable {
    @TableId("id")
    private Integer id;
    @NotEmpty(message = "姓名不能为空")
    private String username;
    @NotEmpty(message = "性别不能为空")
    private String sex;
    @NotEmpty(message = "地址不能为空")
    private String city;
    @NotEmpty(message = "签名不能为空")
    @Size(max = 8, message = "签名最大字符为8位")
    private String sign;
    @DecimalMax(value = "99999999", message = "经验最大字符为8位")
    private Integer experience;
    private Integer logins;
    @DecimalMax(value = "99999999", message = "财富最大字符为8位")
    private Integer wealth;
    @NotEmpty(message = "职业不能为空")
    private String classify;
    @DecimalMax(value = "100", message = "分数最高为100分")
    @DecimalMin(value = "0", message = "分数最低为0分")
    private Integer score;
}
