package com.dao;

import com.entity.DingdanfahuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingdanfahuoVO;
import com.entity.view.DingdanfahuoView;


/**
 * 订单发货
 * 
 * @author 
 * @email 
 * @date 2021-04-06 19:35:43
 */
public interface DingdanfahuoDao extends BaseMapper<DingdanfahuoEntity> {
	
	List<DingdanfahuoVO> selectListVO(@Param("ew") Wrapper<DingdanfahuoEntity> wrapper);
	
	DingdanfahuoVO selectVO(@Param("ew") Wrapper<DingdanfahuoEntity> wrapper);
	
	List<DingdanfahuoView> selectListView(@Param("ew") Wrapper<DingdanfahuoEntity> wrapper);

	List<DingdanfahuoView> selectListView(Pagination page,@Param("ew") Wrapper<DingdanfahuoEntity> wrapper);
	
	DingdanfahuoView selectView(@Param("ew") Wrapper<DingdanfahuoEntity> wrapper);
	
}
