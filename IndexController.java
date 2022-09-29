package jp.co.internous.wings.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.wings.model.domain.MstCategory;
import jp.co.internous.wings.model.domain.MstProduct;
import jp.co.internous.wings.model.form.SearchForm;
import jp.co.internous.wings.model.mapper.MstCategoryMapper;
import jp.co.internous.wings.model.mapper.MstProductMapper;
import jp.co.internous.wings.model.session.LoginSession;

@Controller
@RequestMapping("/wings") 
public class IndexController {
	@Autowired 
	 private LoginSession loginSession; 
	
	@Autowired
	private MstProductMapper mstProductMapper;
	
	@Autowired
	private MstCategoryMapper mstCategoryMapper;
	
	//トップページ表示、未ログイン状態で仮ユーザーIDを発行するメソッド
	@RequestMapping("/")
	public String index(Model m) {
		if(loginSession.getUserId()==0 && loginSession.getTempUserId()==0) {
			Random rand=new Random();
			int tempUserId=rand.nextInt(100000000)-999999999; 
			loginSession.setTempUserId(tempUserId);
		}
			
		List<MstCategory> mstCategory=mstCategoryMapper.findAll();
		
		List<MstProduct> mstProduct=mstProductMapper.findAll();
		
		m.addAttribute("mstCategory",mstCategory);
		m.addAttribute("mstProduct",mstProduct);
		m.addAttribute("selected",0); 
		m.addAttribute("loginSession", loginSession);
			
		return "index";
	}
	
	//商品検索を実現するメソッド
	@RequestMapping("/searchItem")
	public String searchItem(SearchForm f,Model m) {
		
		List<MstProduct> mstProduct = null;
		
		int categoryId=f.getCategoryId();
		String productName=f.getProductName().replaceAll("　"," ").replaceAll("\\s{2,}"," ").trim();
		String[] productNames=productName.split(" "); 
		
		if(f.getProductName()==null && f.getCategoryId()==0 ){
			mstProduct=mstProductMapper.findAll();
		}else if (f.getProductName()==null && f.getCategoryId() !=0 ){
			mstProduct=mstProductMapper.findByCategoryId(categoryId);
		}else if (f.getProductName() !=null && f.getCategoryId()==0){
			mstProduct=mstProductMapper.findByProductName(productNames);
		}else {
			mstProduct=mstProductMapper.findByCategoryIdAndProductName(categoryId,productNames);
		} 
		
		List<MstCategory> mstCategory = mstCategoryMapper.findAll();
		
		m.addAttribute("productName", productName); 
		m.addAttribute("selected", categoryId); 
		m.addAttribute("mstCategory", mstCategory); 
		m.addAttribute("mstProduct", mstProduct);
		m.addAttribute("loginSession", loginSession);
		
		return "index";
	}	
}



