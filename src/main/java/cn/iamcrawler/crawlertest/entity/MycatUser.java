package cn.iamcrawler.crawlertest.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * create by liuliang
 * on 2019-07-30  17:14
 */
@TableName("user")
@Data
public class MycatUser {

    private Long id;

    private String name;
}
