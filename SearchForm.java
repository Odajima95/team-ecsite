package jp.co.internous.wings.model.form;

import java.io.Serializable;

public class SearchForm implements Serializable {
		
	private static final long serialVersionUID = 1L;
	private String productName;
    private int categoryId;
    
    public void setProductName(String productName){
        this.productName=productName;
    }
    
    public String getProductName(){
        return productName;
    }

    public void setCategoryId(int categoryId){
        this.categoryId=categoryId;
    }

    public int getCategoryId(){
        return categoryId;
    }
}
