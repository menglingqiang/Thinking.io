package main.java.com.seckill.dao;


import main.java.com.seckill.entity.Seckill;
import main.java.com.seckill.entity.SuccessKilled;

import org.apache.ibatis.annotations.Param;

//秒杀商品成功表的数据库操作
public interface SuccessKilledDao {
    /**
     * 插入购买明细，可以过滤重复秒杀
     * @param seckillId 秒杀商品Id
     * @param userPhone 用户的手机号
     * @return 插入的行数，如果>=1,表示插入成功；否则表示插入失败；
     */
    int insertSuccessKilled(@Param("seckillId")long seckillId,@Param("userPhone")long userPhone);

    /**
     * 根据秒杀商品的Id和用户的手机号，查询SuccessKilled，并且携带秒杀商品对象实体
     * @param seckillId
     * @param userPhone
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId")long seckillId,@Param("userPhone")long userPhone);
}
