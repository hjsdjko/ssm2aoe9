package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiaoyuangonggaoDao;
import com.entity.XiaoyuangonggaoEntity;
import com.service.XiaoyuangonggaoService;
import com.entity.vo.XiaoyuangonggaoVO;
import com.entity.view.XiaoyuangonggaoView;

@Service("xiaoyuangonggaoService")
public class XiaoyuangonggaoServiceImpl extends ServiceImpl<XiaoyuangonggaoDao, XiaoyuangonggaoEntity> implements XiaoyuangonggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuangonggaoEntity> page = this.selectPage(
                new Query<XiaoyuangonggaoEntity>(params).getPage(),
                new EntityWrapper<XiaoyuangonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuangonggaoEntity> wrapper) {
		  Page<XiaoyuangonggaoView> page =new Query<XiaoyuangonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuangonggaoVO> selectListVO(Wrapper<XiaoyuangonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuangonggaoVO selectVO(Wrapper<XiaoyuangonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuangonggaoView> selectListView(Wrapper<XiaoyuangonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuangonggaoView selectView(Wrapper<XiaoyuangonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
