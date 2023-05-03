package com.arantes.register.controller.mapper;

import com.arantes.register.controller.request.UserRequest;
import com.arantes.register.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toUser(UserRequest request);

}
