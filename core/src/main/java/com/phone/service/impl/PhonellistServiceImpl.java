package com.phone.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import com.phone.mapper.PhonellistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.phone.dto.Phonellist;
import com.phone.service.IPhonellistService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * Created by 凯哥 on 2017/5/2.
 * 联系人管理Service接口
 */
@Service
@Transactional
public class PhonellistServiceImpl extends BaseServiceImpl<Phonellist> implements IPhonellistService{
    @Autowired
    private PhonellistMapper demoMapper;

    @Transactional(propagation = Propagation.SUPPORTS, rollbackFor =
            Exception.class)
    public List<Phonellist> selectByid(IRequest requestContext, Phonellist phonellist, int
            page, int pagesize) {
        PageHelper.startPage(page, pagesize);
        return demoMapper.selectByid(phonellist);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Phonellist> batchUpdate(IRequest requestContext, List<Phonellist> demos){
        for (Phonellist demo : demos) {
            if (demo.get__status() != null) {
                switch (demo.get__status()) {
                    case DTOStatus.ADD:
                        demoMapper.insertDemo(demo);
                        break;
                    case DTOStatus.UPDATE:
                        demoMapper.updateDemo(demo);
                        break;
                    default:
                        break;
                }
            }
        }
        return demos;
    }
}
