package icu.taoy.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import icu.taoy.entity.LayTableData;
import icu.taoy.entity.LayUser;
import icu.taoy.mapper.LayUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LayUserServiceImpl extends ServiceImpl<LayUserMapper, LayUser> implements LayUserService {

    @Autowired
    private LayUserMapper layUserMapper;

    @Override
    public LayTableData<LayUser> queryLayUsers(Integer page, Integer limit, String search) {
        IPage<LayUser> layUserIPage = layUserMapper.queryLayUsers(new Page<LayUser>(page, limit), search);
        return new LayTableData(0, "", (int) layUserIPage.getTotal(), layUserIPage.getRecords());
    }

    @Override
    public Integer saveLayUser(LayUser layUser) {
        return layUserMapper.saveLayUser(layUser);
    }
}
