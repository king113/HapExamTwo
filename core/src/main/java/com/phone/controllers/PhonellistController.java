package com.phone.controllers;
/**
 * Created by 凯哥 on 2017/5/2.
 * 联系人管理控制器
 *
 */
import org.springframework.stereotype.Controller;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.ResponseData;
import com.phone.dto.Phonellist;
import com.phone.service.IPhonellistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

    @Controller
    public class PhonellistController extends BaseController{

    @Autowired
    private IPhonellistService service;


    @RequestMapping(value = "/phonelist/query")
    @ResponseBody
    public ResponseData query(Phonellist dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
        @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext,dto,page,pageSize));
    }

    @RequestMapping(value = "/phonelist/submit")
    @ResponseBody
    public ResponseData update(HttpServletRequest request,@RequestBody List<Phonellist> dto){
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/phonelist/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<Phonellist> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }
    }