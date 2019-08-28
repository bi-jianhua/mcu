package pers.bjh.mcu.entity;

import lombok.*;

import java.io.Serializable;

/**
 * 人物   对应表 t_character
 */
@Data
public class Character implements Serializable {

    // 主键
    private String id;
    // 人物编号
    private String code;
    // 人物名
    private String name;
    // 外号
    private String nickname;
    // 性别
    private String sex;
    // 扮演者
    private String actor;

}
