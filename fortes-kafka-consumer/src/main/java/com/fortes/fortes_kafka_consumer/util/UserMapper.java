package com.fortes.fortes_kafka_consumer.util;

import com.fortes.fortes_kafka_consumer.dto.UserDTO;
import com.fortes.fortes_kafka_consumer.entity.User;

public class UserMapper {

	public static User getUserFromUserDTO(UserDTO userDTO){
		User user = new User();
		user.setId(userDTO.getId());
		return user;
	}
}
