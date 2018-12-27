package com.neusoft.srm.service.post;

import com.github.pagehelper.PageInfo;
import com.neusoft.srm.model.post.Post;
/**
 * @部门：上海软件研发中心
 * @功能：岗位管理模块的service接口
 * @描述          
 * @作成者：王高亮
 * @author:WGL
 * @作成时间：2018年12月20日
 */
public interface PostService {
	/**
	  * @部门：上海软件研发中心
	  * @功能：查找所有岗位信息
	  * @描述  参数 岗位名称 postName  页码数pageNum  页码类型 pageSize 10条/页          
	  * @作成者：王高亮
	  * @author:WGL
	  * @作成时间：2018年12月20日
	  */
	PageInfo<Post> getListPost(String postName,int pageNum,int pageSize);
	/**
	  * @部门：上海软件研发中心
	  * @功能：新增，修改岗位信息
	  * @描述  参数 post 岗位对象  loginCode  操作人代码      
	  * @作成者：王高亮
	  * @author:WGL
	  * @作成时间：2018年12月20日
	  */
	int savePost(Post post,String loginCode);
}
