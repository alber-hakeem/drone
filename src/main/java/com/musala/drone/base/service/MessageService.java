package com.musala.drone.base.service;

import com.musala.drone.base.dto.MessageDto;
import com.musala.drone.base.model.LanguageEnum;
import com.musala.drone.base.dao.MessageDao;
import com.musala.drone.base.model.Message;
import com.musala.drone.base.model.MessageTypeEnum;
import com.musala.drone.base.transformer.MessageTransformer;
import org.springframework.context.MessageSourceAware;

import java.util.List;
import java.util.Map;


public interface MessageService extends BaseService<Message, MessageDto, MessageTransformer,MessageDao>, MessageSourceAware {
    Message findByCodeAndLang(String code, LanguageEnum lang);
    String findMessageByCodeAndLang(String code, LanguageEnum lang);
    String findMessageByCodeAndLang(String code);
    Message findByModuleAndCodeAndLang(String module,String code, LanguageEnum lang);
    String findMessageByModuleAndCodeAndLang(String module,String code, LanguageEnum lang);
    String findMessageByModuleAndCodeAndLang(String module,String code);
    List<Message> findByModuleAndTypeAndLang(String module, MessageTypeEnum type, LanguageEnum lang);
    List<Message> findByModuleAndType(String module, MessageTypeEnum type);
    Map<String, Map<String, MessageDto>>findByModuleAndTypeGroupBy(String module, MessageTypeEnum type);
    List<Message> findResourceBundleMessages(LanguageEnum lang);
}
