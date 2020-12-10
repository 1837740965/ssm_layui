package icu.taoy.service;

/**
 * @author javakiller宇
 */

import com.baomidou.mybatisplus.extension.service.IService;
import icu.taoy.entity.LayTableData;
import icu.taoy.entity.LayUser;

public interface LayUserService extends IService<LayUser> {

    LayTableData<LayUser> queryLayUsers(Integer page, Integer limit, String search);

    Integer saveLayUser(LayUser layUser);
}
