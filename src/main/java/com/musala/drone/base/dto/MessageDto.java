package com.musala.drone.base.dto;

import com.musala.drone.base.model.LanguageEnum;
import com.musala.drone.base.model.MessageTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author Alber Rashad
 * @created 29/10/2022
 * @description
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class MessageDto extends BaseDto {
    private Long id;
    private String module;
    private String code;
    private String message;
    private LanguageEnum lang;
    private MessageTypeEnum type;
    private String iconUrl;
}
