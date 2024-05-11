package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdanfahuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdanfahuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdanfahuoView;


/**
 * 订单发货
 *
 * @author 
 * @email 
 * @date 2021-04-06 19:35:43
 */
public interface DingdanfahuoService extends IService<DingdanfahuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdanfahuoVO> selectListVO(Wrapper<DingdanfahuoEntity> wrapper);
   	
   	DingdanfahuoVO selectVO(@Param("ew") Wrapper<DingdanfahuoEntity> wrapper);
   	
   	List<DingdanfahuoView> selectListView(Wrapper<DingdanfahuoEntity> wrapper);
   	
   	DingdanfahuoView selectView(@Param("ew") Wrapper<DingdanfahuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdanfahuoEntity> wrapper);
   	
}

