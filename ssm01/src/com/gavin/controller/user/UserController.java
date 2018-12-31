package com.gavin.controller.user;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.annotation.Resources;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gavin.entity.User;
import com.gavin.service.user.UserService;
import com.gavin.util.IdUtil;
import com.gavin.util.TimeUtil;

@Controller
public class UserController {
	private UserService userService;
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	/**
	 * 
	 * ��ʾ���ݿ�������user.jsp
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/showUserList")
	public ModelAndView showUserList(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		List<User> list = userService.queryList();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("user");
		return mv;
	}

	//��ѯ�����û�
	@RequestMapping(value="/queryList")
	public String queryList() throws Exception {
		return "redirect:showUserList.action";
	}

	//ֱ����ת��insertuser.jspҳ��
	@RequestMapping(value="/insertuser")
	public ModelAndView insertuser(HttpServletRequest request, 
						HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("insertuser");
		return mv;
	}

	//����user�������ݿ�
	@RequestMapping(value="/insertOneUser")
	public String insertOneUser(User user) throws Exception {
		user.setId(IdUtil.getIdUtil());
		user.setCreateTime(TimeUtil.theNowTime());
		userService.insertOneUser(user);
		return "redirect:showUserList.action";
	}
	
	//��ת������userҳ��
	@RequestMapping(value="/updateUserIntoPage")
	public ModelAndView updateUserIntoPage(HttpServletRequest request,
			HttpServletResponse response) {
		String id = request.getParameter("id");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("updateuser");
		mav.addObject("id", id);
		return mav;
	}
	
	//���µ���user����
	@RequestMapping(value="/updateTheUser")
	public String updateTheUser(User user) throws Exception{
		user.setUpdateTime(TimeUtil.theNowTime());
		System.out.println(user);
		userService.updateTheUser(user);
		return "redirect:showUserList.action";
	}
	
	//ɾ��ȷ����user
	@RequestMapping(value="/deleteTheUser")
	public String deleteTheUser(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		userService.deleteTheUser(id);
		return "redirect:showUserList.action";
	}
}