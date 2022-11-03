package com.musala.drone.base.dao;

import com.musala.drone.base.dao.repo.MessageRepo;
import com.musala.drone.base.model.LanguageEnum;
import com.musala.drone.base.model.Message;
import com.musala.drone.base.model.MessageTypeEnum;
import java.util.List;
import java.util.Optional;

/**
 * @author Alber Rashad
 * @created 02/11/2022
 * @description
 */
public interface MessageDao extends BaseDao<Message, MessageRepo> {
    Optional<Message> findByCodeAndLang(String code, LanguageEnum lang);
    Optional<Message> findByModuleAndCodeAndLang(String module, String code, LanguageEnum lang);
    List<Message> findByModuleAndTypeAndLang(String module, MessageTypeEnum type, LanguageEnum lang);
    List<Message> findByModuleAndType(String module, MessageTypeEnum type);
}
