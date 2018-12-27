package com.neusoft.srm.service.post.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.srm.mapper.post.PostMapper;
import com.neusoft.srm.model.post.Post;
import com.neusoft.srm.service.post.PostService;
import com.neusoft.srm.util.AutoProduceCode;

/**
 * @部门：上海软件研发中心
 * @功能：岗位管理模块的service接口
 * @描述          
 * @作成者：王高亮
 * @author:WGL
 * @作成时间：2018年12月20日
 */
@Service
public class PostServiceImpl implements PostService{
     @Autowired
     private PostMapper postMapper;
     /**
	  * @部门：上海软件研发中心
	  * @功能：查找所有岗位信息
	  * @描述  参数 岗位名称 postName  页码数pageNum  页码类型 pageSize 10条/页          
	  * @作成者：王高亮
	  * @author:WGL
	  * @作成时间：2018年12月20日
	  */
	@Override
	public PageInfo<Post> getListPost(String postName,int pageNum,int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Post> list = postMapper.findAllPost(postName);
		//获得分页数据
		PageInfo<Post> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}
	/**
	  * @部门：上海软件研发中心
	  * @功能：新增，修改岗位信息
	  * @描述  参数 post 岗位对象  loginCode  操作人代码      
	  * @作成者：王高亮
	  * @author:WGL
	  * @作成时间：2018年12月20日
	  */
	@Override
	public int savePost(Post post,String loginCode) {
		post.setCreateBy(loginCode);
		//判断postCode,为空新增，非空则修改操作
		if (null == post.getPostCode()) {
			//产生新的岗位Code
			AutoProduceCode produceCode = new AutoProduceCode();
			String code = produceCode.produceCode();
			post.setPostCode(code);
			int count = postMapper.insertPost(post);
			return count;
		}else {
			int count = postMapper.updatePost(post);
			return count;
		}
	}
}
