package com.neusoft.srm.service.role;


import java.util.List;

import com.github.pagehelper.PageInfo;
import com.neusoft.srm.model.common.Tree;
import com.neusoft.srm.model.menu.Menu;
import com.neusoft.srm.model.menu.MenuButton;
import com.neusoft.srm.model.post.Post;
import com.neusoft.srm.model.role.Role;

public interface RoleService {
	/**
	 * @部门：上海软件研发中心
	 * @功能：查询所有角色信息，同时查询角色名称对应的角色信息
	 * @描述：参数 roleName 角色名称
	 * @作成者：王高亮
	 * @author WGL
	 * @返回值：
	 * @作成时间：2018/12/16
	 */
      PageInfo<Role> getListRole(String roleName,int pageNum,int pageSize);
      
    /**
  	 * @部门：上海软件研发中心
  	 * @功能：新增，修改角色信息
  	 * @描述：参数  角色对象 role  操作人代码 loginCode
  	 * @作成者：王高亮
  	 * @author WGL
  	 * @返回值：
  	 * @作成时间：2018/12/16
  	 */
      int saveRole(Role role,String loginCode);
    /**
  	 * @部门：上海软件研发中心
  	 * @功能：删除角色信息
  	 * @描述：参数 角色代码 roleCode  操作人代码  loginCode
  	 * @作成者：王高亮
  	 * @author WGL
  	 * @返回值：
  	 * @作成时间：2018/12/16
  	 */
      int removeRole(String roleCode,String loginCode);
    /**
  	 * @部门：上海软件研发中心
  	 * @功能：查询所有岗位信息
  	 * @描述：参数 pageNum 页码数  pageSize 页数类型 (10条/页)
  	 * @作成者：王高亮
  	 * @author WGL
  	 * @返回值：
  	 * @作成时间：2018/12/16
  	 */
      PageInfo<Post> getListPost(int pageNum,int pageSize);
    /**
  	 * @部门：上海软件研发中心
  	 * @功能：查询角色对应的岗位信息
  	 * @描述：参数  角色代码  roleCode
  	 * @作成者：王高亮
  	 * @author WGL
  	 * @返回值：
  	 * @作成时间：2018/12/16
  	 */
      List<Post> getPostByRoleCode(String roleCode);
    /**
  	 * @部门：上海软件研发中心
  	 * @功能：角色岗位授权
  	 * @描述：参数 loginCode 操作人代码  roleCode 角色代码   postCode 岗位代码
  	 * @作成者：王高亮
  	 * @author WGL
  	 * @返回值：
  	 * @作成时间：2018/12/16
  	 */
      int changeRolePost(String loginCode,String roleCode,String postCode);
    /**
  	 * @部门：上海软件研发中心
  	 * @功能：角色菜单授权，获取树结构菜单
  	 * @描述：参数 菜单子节点 menuRoot  角色代码  roleCode
  	 * @作成者：王高亮
  	 * @author WGL
  	 * @返回值：
  	 * @作成时间：2018/12/16
  	 */
      Tree getAllMenu(String menuRoot,String roleCode);   
}
