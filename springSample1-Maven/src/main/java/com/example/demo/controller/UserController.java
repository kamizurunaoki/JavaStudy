package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
/**
* ユーザー情報 Controller
*/

public class UserController {

//先ほど作成したものを使用
/**
* ユーザー情報 Service
*/
	@Autowired
	  private UserService userService;
/**
* ユーザー情報一覧画面を表示
* @param model Model
* @return ユーザー情報一覧画面のHTML
*/
//先ほど作成したものを使用
	@RequestMapping("/user/list")
	public String displayList(Model model) {
		 List<UserEntity> userList = userService.searchAll();
	     model.addAttribute("userList", userList);
	     return "user/list";}
/**
* ユーザー新規登録画面を表示
* @param model Model
* @return ユーザー情報一覧画面
*/
@GetMapping("/user/add")
public String displayAdd(Model model) {
return "user/add";
}
/**
* ユーザー情報詳細画面を表示
* @param id 表示するユーザーID
* @param model Model
* @return ユーザー情報詳細画面
*/
@GetMapping("/user/{id}")
public String displayView(@PathVariable Integer id, Model model) {
return "user/view";

}
}