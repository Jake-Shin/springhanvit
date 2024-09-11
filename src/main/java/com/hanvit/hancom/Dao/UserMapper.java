package com.hanvit.hancom.Dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.hanvit.hancom.Dto.User;

@Mapper
@Repository
public interface UserMapper {
    List<User> getUserList();

    Integer insertUserTime(User input);

	Integer selectCompletionCountByUser(User user);

	Integer selectCheckName(User user);
}
