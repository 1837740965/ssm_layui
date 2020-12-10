package icu.taoy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import icu.taoy.entity.LayUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LayUserMapper extends BaseMapper<LayUser> {

    /**
     * @author: jingjing
     * @Date: 2020/12/2 9:40
     * @Description: 分页条件查询
     **/
    IPage<LayUser> queryLayUsers(Page<LayUser> page, @Param("search") String search);

    Integer saveLayUser(LayUser layUser);
}
