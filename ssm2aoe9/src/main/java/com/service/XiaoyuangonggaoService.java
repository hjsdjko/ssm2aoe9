package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuangonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuangonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuangonggaoView;


/**
 * 校园公告
 *
 * @author 
 * @email 
 * @date 2021-04-06 19:35:42
 */
public interface XiaoyuangonggaoService extends IService<XiaoyuangonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuangonggaoVO> selectListVO(Wrapper<XiaoyuangonggaoEntity> wrapper);
   	
   	XiaoyuangonggaoVO selectVO(@Param("ew") Wrapper<XiaoyuangonggaoEntity> wrapper);
   	
   	List<XiaoyuangonggaoView> selectListView(Wrapper<XiaoyuangonggaoEntity> wrapper);
   	
   	XiaoyuangonggaoView selectView(@Param("ew") Wrapper<XiaoyuangonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuangonggaoEntity> wrapper);
   	
}

