package com.entity.view;

import com.entity.DingdanfahuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 订单发货
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-06 19:35:43
 */
@TableName("dingdanfahuo")
public class DingdanfahuoView  extends DingdanfahuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdanfahuoView(){
	}
 
 	public DingdanfahuoView(DingdanfahuoEntity dingdanfahuoEntity){
 	try {
			BeanUtils.copyProperties(this, dingdanfahuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
