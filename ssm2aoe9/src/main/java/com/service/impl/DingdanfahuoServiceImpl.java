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


import com.dao.DingdanfahuoDao;
import com.entity.DingdanfahuoEntity;
import com.service.DingdanfahuoService;
import com.entity.vo.DingdanfahuoVO;
import com.entity.view.DingdanfahuoView;

@Service("dingdanfahuoService")
public class DingdanfahuoServiceImpl extends ServiceImpl<DingdanfahuoDao, DingdanfahuoEntity> implements DingdanfahuoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdanfahuoEntity> page = this.selectPage(
                new Query<DingdanfahuoEntity>(params).getPage(),
                new EntityWrapper<DingdanfahuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdanfahuoEntity> wrapper) {
		  Page<DingdanfahuoView> page =new Query<DingdanfahuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingdanfahuoVO> selectListVO(Wrapper<DingdanfahuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdanfahuoVO selectVO(Wrapper<DingdanfahuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdanfahuoView> selectListView(Wrapper<DingdanfahuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdanfahuoView selectView(Wrapper<DingdanfahuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
