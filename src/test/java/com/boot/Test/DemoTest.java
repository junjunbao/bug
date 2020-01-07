package com.boot.Test;

import com.boot.domain.SysUser;
import com.boot.mapper.SysUserMapper;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.boot.baseTest.SpringTestCase;
import com.boot.domain.User;
import com.boot.service.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dongbenqinag
 * @// FIXME: 2019/6/26
 * 测试类
 */
public class DemoTest extends SpringTestCase {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;
    @Autowired
    private SysUserMapper sysUserMapper;

    /**
     * 查询用户组
     */
    @Test
    public void selectUserList() {
        SysUser sysUser = new SysUser();
        sysUser.setUserName("小");
        List<SysUser> sysUsers = sysUserMapper.selectUserList(sysUser);
        logger.info("查找结果列表" + sysUsers);
        sysUser.setLoginName("admin");
        SysUser sysUser1 = sysUserMapper.selectUserByLoginName(sysUser);
        logger.info("查询结果" + sysUser1);

    }

    /**
     * 新增用户
     */
    @Test
    public void save() {
        SysUser sysUser = new SysUser();
        sysUser.setLoginName("xiaowangya");
        sysUser.setUserName("小王亚");
        int i = sysUserMapper.insertUser(sysUser);
        if (i > 0) {
            System.out.println(sysUser.getUserName() + ",用户插入成功");
        }
    }

    /**
     * 修改用户
     */
    @Test
    public void update() {
        SysUser sysUser = new SysUser();
        sysUser.setUserId(100L);
        sysUser.setLoginName("xiaowangya");
        sysUser.setUserName("王亚");
        int i = sysUserMapper.updateUser(sysUser);
        if (i > 0) {
            System.out.println(sysUser.getUserName() + ",用户修改成功");
        }
    }

    /**
     * 批量删除
     */
    @Test
    public void delete() {
        //int i = sysUserMapper.deleteUserByIds(new Long[]{6L, 7L});
        int i = sysUserMapper.deleteUserByIds(new ArrayList<Long>() {{
            add(6L);
            add(7L);
        }});
        if (i > 0) {
            System.out.println("删除成功！");
            List<SysUser> sysUsers = sysUserMapper.selectUserByIds(new ArrayList<Long>() {{
                add(6L);
                add(7L);
            }});
            logger.info("查询已删除用户信息->>" + sysUsers);
        }
    }

    @Test
    public void selectUserById() {
        User user = userService.selectUserById(10);
        logger.info("查找结果" + user);
    }
}
