package com.hanvit.hancom.Service;

import java.util.List;
import com.hanvit.hancom.Dto.User;

public interface UserService {
    public List<User> getUserList();

    public Integer insertUserTime(User input);
}
