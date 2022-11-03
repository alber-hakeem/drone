package com.musala.drone.base.transformer;

import com.musala.drone.base.dto.MessageDto;
import com.musala.drone.base.model.Message;
import com.musala.drone.base.transformer.mapper.MessageMapper;
import org.springframework.stereotype.Component;

/**
 * @author Samuel Tadros
 * @created 12/2/2020
 * @description
 */
@Component
public class MessageTransformer implements BaseTransformer<Message, MessageDto, MessageMapper> {
    private final MessageMapper messageMapper;

    public MessageTransformer(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    @Override
    public MessageMapper getMapper() {
        return messageMapper;
    }
}
