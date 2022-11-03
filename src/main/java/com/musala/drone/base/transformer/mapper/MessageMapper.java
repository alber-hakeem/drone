package com.musala.drone.base.transformer.mapper;

import com.musala.drone.base.dto.MessageDto;
import com.musala.drone.base.model.Message;
import com.musala.drone.base.transformer.MessageTransformer;
import org.mapstruct.*;

@Mapper(componentModel = "spring", uses = MessageTransformer.class, injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        config = MapStructCentralConfig.class)
public interface MessageMapper extends BaseMapper<Message, MessageDto> {
}
