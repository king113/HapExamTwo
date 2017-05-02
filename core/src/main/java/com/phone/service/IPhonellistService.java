package com.phone.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.annotation.StdWho;
import com.hand.hap.system.service.IBaseService;
import com.phone.dto.Phonellist;

import java.util.List;
/**
 * Created by 凯哥 on 2017/5/2.
 * 联系人管理Service层
 */
public interface IPhonellistService extends IBaseService<Phonellist>, ProxySelf<IPhonellistService>{
    List<Phonellist> selectByid(IRequest requestContext, Phonellist demo, int page, int
            pagesize);

    List<Phonellist> batchUpdate(IRequest requestContext, @StdWho List<Phonellist>
            demos);

}