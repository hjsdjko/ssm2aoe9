package com.entity.view;

import com.entity.XiaoyuangonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-06 19:35:42
 */
@TableName("xiaoyuangonggao")
public class XiaoyuangonggaoView  extends XiaoyuangonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyuangonggaoView(){
	}
 
 	public XiaoyuangonggaoView(XiaoyuangonggaoEntity xiaoyuangonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyuangonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
