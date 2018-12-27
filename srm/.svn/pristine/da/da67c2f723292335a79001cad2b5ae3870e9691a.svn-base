package com.neusoft.srm.mapper.post;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.neusoft.srm.model.post.Post;

/**
 * @部门：上海软件研发中心
 * @功能：岗位管理模块的功能操作
 * @描述  岗位的查询，新增，修改          
 * @作成者：王高亮
 * @author:WGL
 * @作成时间：2018年12月20日
 */
@Mapper
	public interface PostMapper {
	/**
	  * @部门：上海软件研发中心
	  * @功能：查找所有岗位信息
	  * @描述  参数 岗位名称 postName            
	  * @作成者：王高亮
	  * @author:WGL
	  * @作成时间：2018年12月20日
	  */
     List<Post> findAllPost(@Param("postName")String postName);
     /**
	  * @部门：上海软件研发中心
	  * @功能：新增岗位
	  * @描述  参数 岗位对象信息           
	  * @作成者：王高亮
	  * @author:WGL
	  * @作成时间：2018年12月20日
	  */
     int insertPost(@Param("posts")Post post);
     /**
	  * @部门：上海软件研发中心
	  * @功能：修改岗位信息
	  * @描述  参数 岗位对象信息           
	  * @作成者：王高亮
	  * @author:WGL
	  * @作成时间：2018年12月20日
	  */
     int updatePost(@Param("posts")Post post);
}
