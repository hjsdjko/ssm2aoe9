package com.dao;

import com.entity.XiaoyuangonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyuangonggaoVO;
import com.entity.view.XiaoyuangonggaoView;


/**
 * 校园公告
 * 
 * @author 
 * @email 
 * @date 2021-04-06 19:35:42
 */
public interface XiaoyuangonggaoDao extends BaseMapper<XiaoyuangonggaoEntity> {
	
	List<XiaoyuangonggaoVO> selectListVO(@Param("ew") Wrapper<XiaoyuangonggaoEntity> wrapper);
	
	XiaoyuangonggaoVO selectVO(@Param("ew") Wrapper<XiaoyuangonggaoEntity> wrapper);
	
	List<XiaoyuangonggaoView> selectListView(@Param("ew") Wrapper<XiaoyuangonggaoEntity> wrapper);

	List<XiaoyuangonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyuangonggaoEntity> wrapper);
	
	XiaoyuangonggaoView selectView(@Param("ew") Wrapper<XiaoyuangonggaoEntity> wrapper);
	
}
