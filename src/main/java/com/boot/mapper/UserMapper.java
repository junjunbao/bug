package com.boot.mapper;

import com.boot.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author dongbenqiang
 * @FIXME: 2019/6/26
 */
@Component
@Mapper
public interface UserMapper {
    /**
     * 根据id查询
     *
     * @param userId
     * @return
     */
    User selectUserById(Integer userId);

}  
