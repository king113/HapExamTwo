package com.phone.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.phone.dto.Phonellist;
import java.util.List;
/**
 * Created by 凯哥 on 2017/5/2.
 * 联系人管理Mapper
 */
public interface PhonellistMapper extends Mapper<Phonellist>{
    List<Phonellist> selectByid(Phonellist phonellist);
    int insertDemo(Phonellist phonellist);
    int updateDemo(Phonellist phonellist);
    int deleteDemo(Phonellist phonellist);

}