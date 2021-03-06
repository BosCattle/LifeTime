package org.jiangtao.sql;

import android.content.Context;

import org.jiangtao.bean.User;
import org.jiangtao.utils.LogUtils;

import java.util.List;

/**
 * Created by mr-jiang on 15-11-28.
 * 服务类
 */
public class UserBusinessImpl implements UserBusiness {
    private UserDaoImpl userDao;
    private static final String TAG = UserBusinessImpl.class.getSimpleName();

    public UserBusinessImpl(Context context) {
        userDao = new UserDaoImpl(context);
    }

    @Override
    public void insertUser(User user) throws Exception {
        if (user.getUser_headpicture() == null) {
            /**
             * 保存照片，并且返回特定位置
             */
            LogUtils.d(TAG, "1");

        } else {
            userDao.insetUser(user);
            LogUtils.d(TAG, "2");
        }
    }

    @Override
    public void updateUser(User user) throws Exception {
        userDao.updateUser(user);
    }

    @Override
    public User selectUser(String user_email) throws Exception {
        return userDao.selectUser(user_email);
    }

    @Override
    public List<User> selectAllUser() throws Exception {
        return userDao.selectAllUser();
    }

    @Override
    public void deleteTable() throws Exception {
        userDao.deleteTable();
    }
}
