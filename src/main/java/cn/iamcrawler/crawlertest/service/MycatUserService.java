package cn.iamcrawler.crawlertest.service;

import cn.iamcrawler.crawlertest.entity.MycatUser;
import cn.iamcrawler.crawlertest.mapper.MycatUserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by liuliang
 * on 2019-07-30  17:16
 */
@Service
public class MycatUserService extends ServiceImpl<MycatUserMapper, MycatUser> {

    public List<MycatUser> getUsers(){
        List<MycatUser> list = this.list(new QueryWrapper<>());
        return list;
    }

}
